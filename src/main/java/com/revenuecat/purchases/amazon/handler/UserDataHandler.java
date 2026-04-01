package com.revenuecat.purchases.amazon.handler;

import android.os.Handler;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.DefaultTimestampProvider;
import com.revenuecat.purchases.utils.TimestampProvider;
import e6.i0;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class UserDataHandler implements UserDataResponseListener {
    private static final long CACHE_EXPIRATION_TIME_MILLIS = 300000;
    public static final Companion Companion = new Companion(null);
    private static final long GET_USER_DATA_TIMEOUT_MILLIS = 10000;
    private Long lastUserDataRequestTimestamp;
    private final Handler mainHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map<RequestId, Request> requests;
    private final TimestampProvider timestampProvider;
    private UserData userDataCache;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    private static final class Request {
        private final l<PurchasesError, i0> onError;
        private final l<UserData, i0> onReceive;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(l<? super UserData, i0> onReceive, l<? super PurchasesError, i0> onError) {
            q.f(onReceive, "onReceive");
            q.f(onError, "onError");
            this.onReceive = onReceive;
            this.onError = onError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, l lVar, l lVar2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                lVar = request.onReceive;
            }
            if ((i8 & 2) != 0) {
                lVar2 = request.onError;
            }
            return request.copy(lVar, lVar2);
        }

        public final l<UserData, i0> component1() {
            return this.onReceive;
        }

        public final l<PurchasesError, i0> component2() {
            return this.onError;
        }

        public final Request copy(l<? super UserData, i0> onReceive, l<? super PurchasesError, i0> onError) {
            q.f(onReceive, "onReceive");
            q.f(onError, "onError");
            return new Request(onReceive, onError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return q.b(this.onReceive, request.onReceive) && q.b(this.onError, request.onError);
        }

        public final l<PurchasesError, i0> getOnError() {
            return this.onError;
        }

        public final l<UserData, i0> getOnReceive() {
            return this.onReceive;
        }

        public int hashCode() {
            return (this.onReceive.hashCode() * 31) + this.onError.hashCode();
        }

        public String toString() {
            return "Request(onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserDataResponse.RequestStatus.values().length];
            try {
                iArr[UserDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserDataResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler mainHandler, TimestampProvider timestampProvider) {
        q.f(purchasingServiceProvider, "purchasingServiceProvider");
        q.f(mainHandler, "mainHandler");
        q.f(timestampProvider, "timestampProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.mainHandler = mainHandler;
        this.timestampProvider = timestampProvider;
        this.requests = new LinkedHashMap();
    }

    public /* synthetic */ UserDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler handler, TimestampProvider timestampProvider, int i8, j jVar) {
        this(purchasingServiceProvider, handler, (i8 & 4) != 0 ? new DefaultTimestampProvider() : timestampProvider);
    }

    private final void addTimeoutToUserDataRequest(final RequestId requestId) {
        this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.amazon.handler.b
            @Override // java.lang.Runnable
            public final void run() {
                UserDataHandler.addTimeoutToUserDataRequest$lambda$5(this.f20875a, requestId);
            }
        }, GET_USER_DATA_TIMEOUT_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addTimeoutToUserDataRequest$lambda$5(UserDataHandler this$0, RequestId requestId) {
        q.f(this$0, "this$0");
        q.f(requestId, "$requestId");
        Request request = this$0.getRequest(requestId);
        if (request == null) {
            return;
        }
        request.getOnError().invoke(new PurchasesError(PurchasesErrorCode.UnknownError, AmazonStrings.ERROR_TIMEOUT_GETTING_USER_DATA));
    }

    private final synchronized UserData getCachedUserDataIfAvailable() {
        Long l8;
        UserData userData = this.userDataCache;
        if (userData != null && (l8 = this.lastUserDataRequestTimestamp) != null) {
            if (this.timestampProvider.getCurrentTimeMillis() - l8.longValue() < CACHE_EXPIRATION_TIME_MILLIS) {
                return userData;
            }
        }
        return null;
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return this.requests.remove(requestId);
    }

    private final void invokeWithStoreProblem(l<? super PurchasesError, i0> lVar, String str) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(l<? super UserData, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        UserData cachedUserDataIfAvailable = getCachedUserDataIfAvailable();
        if (cachedUserDataIfAvailable != null) {
            LogWrapperKt.log(LogIntent.DEBUG, AmazonStrings.USER_DATA_REQUEST_FROM_CACHE);
            onSuccess.invoke(cachedUserDataIfAvailable);
            return;
        }
        RequestId userData = this.purchasingServiceProvider.getUserData();
        Request request = new Request(onSuccess, onError);
        synchronized (this) {
            this.requests.put(userData, request);
            addTimeoutToUserDataRequest(userData);
            i0 i0Var = i0.f21430a;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        UserDataResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        UserDataResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        UserDataResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse response) throws Exception {
        l<PurchasesError, i0> onError;
        String str;
        q.f(response, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            String str2 = String.format(AmazonStrings.USER_DATA_REQUEST_FINISHED, Arrays.copyOf(new Object[]{response.getRequestStatus().name()}, 1));
            q.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
            RequestId requestId = response.getRequestId();
            q.e(requestId, "response.requestId");
            Request request = getRequest(requestId);
            if (request == null) {
                return;
            }
            UserDataResponse.RequestStatus requestStatus = response.getRequestStatus();
            int i8 = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
            if (i8 == 1) {
                synchronized (this) {
                    this.lastUserDataRequestTimestamp = Long.valueOf(this.timestampProvider.getCurrentTimeMillis());
                    this.userDataCache = response.getUserData();
                    i0 i0Var = i0.f21430a;
                }
                l<UserData, i0> onReceive = request.getOnReceive();
                UserData userData = response.getUserData();
                q.e(userData, "response.userData");
                onReceive.invoke(userData);
                return;
            }
            if (i8 == 2) {
                onError = request.getOnError();
                str = AmazonStrings.ERROR_FAILED_USER_DATA;
            } else if (i8 != 3) {
                onError = request.getOnError();
                str = AmazonStrings.ERROR_USER_DATA_STORE_PROBLEM;
            } else {
                onError = request.getOnError();
                str = AmazonStrings.ERROR_UNSUPPORTED_USER_DATA;
            }
            invokeWithStoreProblem(onError, str);
        } catch (Exception e8) {
            LogUtilsKt.errorLog("Exception in onUserDataResponse", e8);
            throw e8;
        }
    }
}

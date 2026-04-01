package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import e6.i0;
import e6.r;
import e6.x;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseUpdatesHandler implements PurchaseUpdatesResponseListener {
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map<RequestId, r<p<List<Receipt>, UserData, i0>, l<PurchasesError, i0>>> requests;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseUpdatesResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseUpdatesResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseUpdatesHandler(PurchasingServiceProvider purchasingServiceProvider) {
        q.f(purchasingServiceProvider, "purchasingServiceProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.requests = new LinkedHashMap();
    }

    private final void invokeWithStoreProblem(l<? super PurchasesError, i0> lVar, String str) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response) throws Exception {
        r<p<List<Receipt>, UserData, i0>, l<PurchasesError, i0>> rVarRemove;
        String str;
        q.f(response, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            String str2 = String.format(AmazonStrings.RETRIEVED_PRODUCT_DATA, Arrays.copyOf(new Object[]{response}, 1));
            q.e(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
            RequestId requestId = response.getRequestId();
            synchronized (this) {
                rVarRemove = this.requests.remove(requestId);
            }
            if (rVarRemove != null) {
                p<List<Receipt>, UserData, i0> pVarA = rVarRemove.a();
                l<PurchasesError, i0> lVarB = rVarRemove.b();
                PurchaseUpdatesResponse.RequestStatus requestStatus = response.getRequestStatus();
                int i8 = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                if (i8 == -1) {
                    str = AmazonStrings.ERROR_PURCHASES_UPDATES_STORE_PROBLEM;
                } else {
                    if (i8 == 1) {
                        List<Receipt> receipts = response.getReceipts();
                        q.e(receipts, "response.receipts");
                        UserData userData = response.getUserData();
                        q.e(userData, "response.userData");
                        pVarA.invoke(receipts, userData);
                        return;
                    }
                    if (i8 == 2) {
                        str = AmazonStrings.ERROR_FAILED_PURCHASES_UPDATES;
                    } else if (i8 != 3) {
                        return;
                    } else {
                        str = AmazonStrings.ERROR_UNSUPPORTED_PURCHASES_UPDATES;
                    }
                }
                invokeWithStoreProblem(lVarB, str);
            }
        } catch (Exception e8) {
            LogUtilsKt.errorLog("Exception in onPurchaseUpdatesResponse", e8);
            throw e8;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        PurchaseUpdatesResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(p<? super List<Receipt>, ? super UserData, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        RequestId purchaseUpdates = this.purchasingServiceProvider.getPurchaseUpdates(true);
        synchronized (this) {
            this.requests.put(purchaseUpdates, x.a(onSuccess, onError));
            i0 i0Var = i0.f21430a;
        }
    }
}

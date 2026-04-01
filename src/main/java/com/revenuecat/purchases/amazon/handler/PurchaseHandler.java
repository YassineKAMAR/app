package com.revenuecat.purchases.amazon.handler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.PurchaseStrings;
import e6.i0;
import e6.r;
import e6.x;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHandler implements PurchaseResponseListener {
    private final Context applicationContext;
    private final Map<String, String> presentedOfferingsByProductIdentifier;
    private final Map<String, ProductType> productTypes;
    private final Map<RequestId, r<p<Receipt, UserData, i0>, l<PurchasesError, i0>>> purchaseCallbacks;
    private final PurchasingServiceProvider purchasingServiceProvider;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseResponse.RequestStatus.values().length];
            try {
                iArr[PurchaseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseHandler(PurchasingServiceProvider purchasingServiceProvider, Context applicationContext) {
        q.f(purchasingServiceProvider, "purchasingServiceProvider");
        q.f(applicationContext, "applicationContext");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.applicationContext = applicationContext;
        this.productTypes = new LinkedHashMap();
        this.presentedOfferingsByProductIdentifier = new LinkedHashMap();
        this.purchaseCallbacks = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.revenuecat.purchases.amazon.handler.PurchaseHandler$createRequestIdResultReceiver$1] */
    private final AnonymousClass1 createRequestIdResultReceiver(Handler handler, final StoreProduct storeProduct, final String str, final p<? super Receipt, ? super UserData, i0> pVar, final l<? super PurchasesError, i0> lVar) {
        return new ResultReceiver(handler) { // from class: com.revenuecat.purchases.amazon.handler.PurchaseHandler.createRequestIdResultReceiver.1
            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i8, Bundle bundle) {
                Object obj;
                PurchaseHandler purchaseHandler = this;
                p<Receipt, UserData, i0> pVar2 = pVar;
                l<PurchasesError, i0> lVar2 = lVar;
                StoreProduct storeProduct2 = storeProduct;
                String str2 = str;
                synchronized (purchaseHandler) {
                    if (bundle != null) {
                        try {
                            obj = bundle.get(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        obj = null;
                    }
                    RequestId requestId = obj instanceof RequestId ? (RequestId) obj : null;
                    if (requestId != null) {
                        purchaseHandler.purchaseCallbacks.put(requestId, x.a(pVar2, lVar2));
                        purchaseHandler.productTypes.put(storeProduct2.getId(), storeProduct2.getType());
                        purchaseHandler.presentedOfferingsByProductIdentifier.put(storeProduct2.getId(), str2);
                    } else {
                        LogUtilsKt.errorLog$default("No RequestId coming from ProxyAmazonBillingActivity", null, 2, null);
                    }
                    i0 i0Var = i0.f21430a;
                }
            }
        };
    }

    private final void onAlreadyPurchased(l<? super PurchasesError, i0> lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.ProductAlreadyPurchasedError, AmazonStrings.ERROR_PURCHASE_ALREADY_OWNED));
    }

    private final void onFailed(l<? super PurchasesError, i0> lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.PurchaseCancelledError, AmazonStrings.ERROR_PURCHASE_FAILED));
    }

    private final void onInvalidSku(l<? super PurchasesError, i0> lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, AmazonStrings.ERROR_PURCHASE_INVALID_SKU));
    }

    private final void onNotSupported(l<? super PurchasesError, i0> lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_NOT_SUPPORTED));
    }

    private final void onSuccessfulPurchase(Receipt receipt, UserData userData, p<? super Receipt, ? super UserData, i0> pVar) {
        pVar.invoke(receipt, userData);
    }

    private final void onUnknownError(l<? super PurchasesError, i0> lVar) {
        lVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_PURCHASE_UNKNOWN));
    }

    private final void startProxyActivity(Handler handler, Activity activity, StoreProduct storeProduct, String str, p<? super Receipt, ? super UserData, i0> pVar, l<? super PurchasesError, i0> lVar) {
        activity.startActivity(ProxyAmazonBillingActivity.Companion.newStartIntent(activity, createRequestIdResultReceiver(handler, storeProduct, str, pVar, lVar), storeProduct.getId(), this.purchasingServiceProvider));
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        PurchaseResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse response) throws Exception {
        r<p<Receipt, UserData, i0>, l<PurchasesError, i0>> rVarRemove;
        q.f(response, "response");
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(AmazonStrings.PURCHASE_REQUEST_FINISHED, Arrays.copyOf(new Object[]{response.toJSON().toString(1)}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            ProxyAmazonBillingActivityBroadcastReceiver.Companion companion = ProxyAmazonBillingActivityBroadcastReceiver.Companion;
            String packageName = this.applicationContext.getPackageName();
            q.e(packageName, "applicationContext.packageName");
            this.applicationContext.sendBroadcast(companion.newPurchaseFinishedIntent(packageName));
            RequestId requestId = response.getRequestId();
            synchronized (this) {
                rVarRemove = this.purchaseCallbacks.remove(requestId);
            }
            if (rVarRemove != null) {
                p<Receipt, UserData, i0> pVarA = rVarRemove.a();
                l<PurchasesError, i0> lVarB = rVarRemove.b();
                PurchaseResponse.RequestStatus requestStatus = response.getRequestStatus();
                int i8 = requestStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                if (i8 == 1) {
                    Receipt receipt = response.getReceipt();
                    q.e(receipt, "response.receipt");
                    UserData userData = response.getUserData();
                    q.e(userData, "response.userData");
                    onSuccessfulPurchase(receipt, userData, pVarA);
                    return;
                }
                if (i8 == 2) {
                    onFailed(lVarB);
                    return;
                }
                if (i8 == 3) {
                    onInvalidSku(lVarB);
                    return;
                }
                if (i8 == 4) {
                    onAlreadyPurchased(lVarB);
                } else if (i8 != 5) {
                    onUnknownError(lVarB);
                } else {
                    onNotSupported(lVarB);
                }
            }
        } catch (Exception e8) {
            LogUtilsKt.errorLog("Exception in onPurchaseResponse", e8);
            throw e8;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        PurchaseResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        PurchaseResponseListener.DefaultImpls.onUserDataResponse(this, userDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, String str, p<? super Receipt, ? super UserData, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(mainHandler, "mainHandler");
        q.f(activity, "activity");
        q.f(appUserID, "appUserID");
        q.f(storeProduct, "storeProduct");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str2 = String.format(PurchaseStrings.PURCHASING_PRODUCT, Arrays.copyOf(new Object[]{storeProduct.getId()}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        startProxyActivity(mainHandler, activity, storeProduct, str, onSuccess, onError);
    }
}

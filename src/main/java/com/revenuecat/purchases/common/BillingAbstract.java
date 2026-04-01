package com.revenuecat.purchases.common;

import android.app.Activity;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class BillingAbstract {
    private final PurchasesStateProvider purchasesStateProvider;
    private volatile PurchasesUpdatedListener purchasesUpdatedListener;
    private volatile StateListener stateListener;

    public interface PurchasesUpdatedListener {
        void onPurchasesFailedToUpdate(PurchasesError purchasesError);

        void onPurchasesUpdated(List<StoreTransaction> list);
    }

    public interface StateListener {
        void onConnected();
    }

    public BillingAbstract(PurchasesStateProvider purchasesStateProvider) {
        q.f(purchasesStateProvider, "purchasesStateProvider");
        this.purchasesStateProvider = purchasesStateProvider;
    }

    public static /* synthetic */ void makePurchaseAsync$default(BillingAbstract billingAbstract, Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str2, Boolean bool, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePurchaseAsync");
        }
        if ((i8 & 32) != 0) {
            bool = null;
        }
        billingAbstract.makePurchaseAsync(activity, str, purchasingData, replaceProductInfo, str2, bool);
    }

    public static /* synthetic */ void startConnectionOnMainThread$default(BillingAbstract billingAbstract, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConnectionOnMainThread");
        }
        if ((i8 & 1) != 0) {
            j8 = 0;
        }
        billingAbstract.startConnectionOnMainThread(j8);
    }

    public final void close() {
        this.purchasesUpdatedListener = null;
        endConnection();
    }

    public abstract void consumeAndSave(boolean z7, StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource);

    protected abstract void endConnection();

    public abstract void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, l<? super StoreTransaction, i0> lVar, l<? super PurchasesError, i0> lVar2);

    protected final PurchasesStateProvider getPurchasesStateProvider() {
        return this.purchasesStateProvider;
    }

    public final synchronized PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return this.purchasesUpdatedListener;
    }

    public final synchronized StateListener getStateListener() {
        return this.stateListener;
    }

    public abstract void getStorefront(l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public abstract boolean isConnected();

    public abstract void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str2, Boolean bool);

    public void normalizePurchaseData(String productID, String purchaseToken, String storeUserID, l<? super String, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(productID, "productID");
        q.f(purchaseToken, "purchaseToken");
        q.f(storeUserID, "storeUserID");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        onSuccess.invoke(productID);
    }

    public abstract void queryAllPurchases(String str, l<? super List<StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public abstract void queryProductDetailsAsync(ProductType productType, Set<String> set, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public abstract void queryPurchases(String str, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2);

    public final void setPurchasesUpdatedListener(PurchasesUpdatedListener purchasesUpdatedListener) {
        this.purchasesUpdatedListener = purchasesUpdatedListener;
    }

    public final synchronized void setStateListener(StateListener stateListener) {
        this.stateListener = stateListener;
    }

    public abstract void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, p6.a<i0> aVar);

    public abstract void startConnection();

    public abstract void startConnectionOnMainThread(long j8);
}

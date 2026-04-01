package com.revenuecat.purchases.amazon;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPurchasingServiceProvider implements PurchasingServiceProvider {
    public static final Parcelable.Creator<DefaultPurchasingServiceProvider> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DefaultPurchasingServiceProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPurchasingServiceProvider createFromParcel(Parcel parcel) {
            q.f(parcel, "parcel");
            parcel.readInt();
            return new DefaultPurchasingServiceProvider();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultPurchasingServiceProvider[] newArray(int i8) {
            return new DefaultPurchasingServiceProvider[i8];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getProductData(Set<String> skus) {
        q.f(skus, "skus");
        RequestId productData = PurchasingService.getProductData(skus);
        q.e(productData, "getProductData(skus)");
        return productData;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getPurchaseUpdates(boolean z7) {
        RequestId purchaseUpdates = PurchasingService.getPurchaseUpdates(z7);
        q.e(purchaseUpdates, "getPurchaseUpdates(reset)");
        return purchaseUpdates;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId getUserData() {
        RequestId userData = PurchasingService.getUserData();
        q.e(userData, "getUserData()");
        return userData;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public void notifyFulfillment(String receiptId, FulfillmentResult fulfillmentResult) {
        q.f(receiptId, "receiptId");
        q.f(fulfillmentResult, "fulfillmentResult");
        PurchasingService.notifyFulfillment(receiptId, fulfillmentResult);
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public RequestId purchase(String sku) {
        q.f(sku, "sku");
        RequestId requestIdPurchase = PurchasingService.purchase(sku);
        q.e(requestIdPurchase, "purchase(sku)");
        return requestIdPurchase;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public void registerListener(Context context, PurchasingListener listener) {
        q.f(context, "context");
        q.f(listener, "listener");
        PurchasingService.registerListener(context, listener);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        q.f(out, "out");
        out.writeInt(1);
    }
}

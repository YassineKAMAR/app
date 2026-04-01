package com.revenuecat.purchases;

import android.app.Activity;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.TestStoreProduct;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseParams {
    private final Activity activity;
    private final Builder builder;
    private final GoogleReplacementMode googleReplacementMode;
    private final Boolean isPersonalizedPrice;
    private final String oldProductId;
    private final String presentedOfferingIdentifier;
    private final PurchasingData purchasingData;

    public static class Builder {
        private final Activity activity;
        private GoogleReplacementMode googleReplacementMode;
        private Boolean isPersonalizedPrice;
        private String oldProductId;
        private final String presentedOfferingIdentifier;
        private final StoreProduct product;
        private final PurchasingData purchasingData;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, Package packageToPurchase) {
            this(activity, packageToPurchase.getProduct().getPurchasingData(), packageToPurchase.getOffering(), packageToPurchase.getProduct());
            q.f(activity, "activity");
            q.f(packageToPurchase, "packageToPurchase");
        }

        private Builder(Activity activity, PurchasingData purchasingData, String str, StoreProduct storeProduct) {
            this.activity = activity;
            this.purchasingData = purchasingData;
            this.presentedOfferingIdentifier = str;
            this.product = storeProduct;
            this.googleReplacementMode = GoogleReplacementMode.WITHOUT_PRORATION;
        }

        /* synthetic */ Builder(Activity activity, PurchasingData purchasingData, String str, StoreProduct storeProduct, int i8, j jVar) {
            this(activity, purchasingData, (i8 & 4) != 0 ? null : str, storeProduct);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, StoreProduct storeProduct) {
            this(activity, storeProduct.getPurchasingData(), storeProduct.getPresentedOfferingIdentifier(), storeProduct);
            q.f(activity, "activity");
            q.f(storeProduct, "storeProduct");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, SubscriptionOption subscriptionOption) {
            this(activity, subscriptionOption.getPurchasingData(), subscriptionOption.getPresentedOfferingIdentifier(), null);
            q.f(activity, "activity");
            q.f(subscriptionOption, "subscriptionOption");
        }

        private final void ensureNoTestProduct(StoreProduct storeProduct) throws PurchasesException {
            if (storeProduct instanceof TestStoreProduct) {
                throw new PurchasesException(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Cannot purchase " + storeProduct));
            }
        }

        public PurchaseParams build() throws PurchasesException {
            StoreProduct storeProduct = this.product;
            if (storeProduct != null) {
                ensureNoTestProduct(storeProduct);
            }
            return new PurchaseParams(this);
        }

        public final /* synthetic */ Activity getActivity$purchases_defaultsRelease() {
            return this.activity;
        }

        public final /* synthetic */ GoogleReplacementMode getGoogleReplacementMode$purchases_defaultsRelease() {
            return this.googleReplacementMode;
        }

        public final /* synthetic */ String getOldProductId$purchases_defaultsRelease() {
            return this.oldProductId;
        }

        public final /* synthetic */ String getPresentedOfferingIdentifier$purchases_defaultsRelease() {
            return this.presentedOfferingIdentifier;
        }

        public final /* synthetic */ StoreProduct getProduct$purchases_defaultsRelease() {
            return this.product;
        }

        public final /* synthetic */ PurchasingData getPurchasingData$purchases_defaultsRelease() {
            return this.purchasingData;
        }

        public final Builder googleProrationMode(GoogleProrationMode googleProrationMode) {
            q.f(googleProrationMode, "googleProrationMode");
            this.googleReplacementMode = googleProrationMode.getAsGoogleReplacementMode$purchases_defaultsRelease();
            return this;
        }

        public final Builder googleReplacementMode(GoogleReplacementMode googleReplacementMode) {
            q.f(googleReplacementMode, "googleReplacementMode");
            this.googleReplacementMode = googleReplacementMode;
            return this;
        }

        public final Builder isPersonalizedPrice(boolean z7) {
            this.isPersonalizedPrice = Boolean.valueOf(z7);
            return this;
        }

        public final /* synthetic */ Boolean isPersonalizedPrice$purchases_defaultsRelease() {
            return this.isPersonalizedPrice;
        }

        public final Builder oldProductId(String oldProductId) {
            q.f(oldProductId, "oldProductId");
            this.oldProductId = oldProductId;
            return this;
        }

        public final /* synthetic */ void setGoogleReplacementMode$purchases_defaultsRelease(GoogleReplacementMode googleReplacementMode) {
            q.f(googleReplacementMode, "<set-?>");
            this.googleReplacementMode = googleReplacementMode;
        }

        public final /* synthetic */ void setOldProductId$purchases_defaultsRelease(String str) {
            this.oldProductId = str;
        }

        public final /* synthetic */ void setPersonalizedPrice$purchases_defaultsRelease(Boolean bool) {
            this.isPersonalizedPrice = bool;
        }
    }

    public PurchaseParams(Builder builder) {
        q.f(builder, "builder");
        this.builder = builder;
        this.isPersonalizedPrice = builder.isPersonalizedPrice$purchases_defaultsRelease();
        this.oldProductId = builder.getOldProductId$purchases_defaultsRelease();
        this.googleReplacementMode = builder.getGoogleReplacementMode$purchases_defaultsRelease();
        this.purchasingData = builder.getPurchasingData$purchases_defaultsRelease();
        this.activity = builder.getActivity$purchases_defaultsRelease();
        this.presentedOfferingIdentifier = builder.getPresentedOfferingIdentifier$purchases_defaultsRelease();
    }

    public static /* synthetic */ PurchaseParams copy$default(PurchaseParams purchaseParams, Builder builder, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            builder = purchaseParams.builder;
        }
        return purchaseParams.copy(builder);
    }

    public final Builder component1() {
        return this.builder;
    }

    public final PurchaseParams copy(Builder builder) {
        q.f(builder, "builder");
        return new PurchaseParams(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseParams) && q.b(this.builder, ((PurchaseParams) obj).builder);
    }

    public final /* synthetic */ Activity getActivity$purchases_defaultsRelease() {
        return this.activity;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public final GoogleReplacementMode getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final /* synthetic */ String getPresentedOfferingIdentifier$purchases_defaultsRelease() {
        return this.presentedOfferingIdentifier;
    }

    public final /* synthetic */ PurchasingData getPurchasingData$purchases_defaultsRelease() {
        return this.purchasingData;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }

    public final Boolean isPersonalizedPrice() {
        return this.isPersonalizedPrice;
    }

    public String toString() {
        return "PurchaseParams(builder=" + this.builder + ')';
    }
}

package com.revenuecat.purchases.models;

import com.android.billingclient.api.h;
import com.revenuecat.purchases.ProductType;
import e6.p;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class GooglePurchasingData implements PurchasingData {

    public static final class InAppProduct extends GooglePurchasingData {
        private final h productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String productId, h productDetails) {
            super(null);
            q.f(productId, "productId");
            q.f(productDetails, "productDetails");
            this.productId = productId;
            this.productDetails = productDetails;
        }

        public static /* synthetic */ InAppProduct copy$default(InAppProduct inAppProduct, String str, h hVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = inAppProduct.getProductId();
            }
            if ((i8 & 2) != 0) {
                hVar = inAppProduct.productDetails;
            }
            return inAppProduct.copy(str, hVar);
        }

        public final String component1() {
            return getProductId();
        }

        public final h component2() {
            return this.productDetails;
        }

        public final InAppProduct copy(String productId, h productDetails) {
            q.f(productId, "productId");
            q.f(productDetails, "productDetails");
            return new InAppProduct(productId, productDetails);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return q.b(getProductId(), inAppProduct.getProductId()) && q.b(this.productDetails, inAppProduct.productDetails);
        }

        public final h getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return (getProductId().hashCode() * 31) + this.productDetails.hashCode();
        }

        public String toString() {
            return "InAppProduct(productId=" + getProductId() + ", productDetails=" + this.productDetails + ')';
        }
    }

    public static final class Subscription extends GooglePurchasingData {
        private final String optionId;
        private final h productDetails;
        private final String productId;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String productId, String optionId, h productDetails, String token) {
            super(null);
            q.f(productId, "productId");
            q.f(optionId, "optionId");
            q.f(productDetails, "productDetails");
            q.f(token, "token");
            this.productId = productId;
            this.optionId = optionId;
            this.productDetails = productDetails;
            this.token = token;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, h hVar, String str3, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = subscription.getProductId();
            }
            if ((i8 & 2) != 0) {
                str2 = subscription.optionId;
            }
            if ((i8 & 4) != 0) {
                hVar = subscription.productDetails;
            }
            if ((i8 & 8) != 0) {
                str3 = subscription.token;
            }
            return subscription.copy(str, str2, hVar, str3);
        }

        public final String component1() {
            return getProductId();
        }

        public final String component2() {
            return this.optionId;
        }

        public final h component3() {
            return this.productDetails;
        }

        public final String component4() {
            return this.token;
        }

        public final Subscription copy(String productId, String optionId, h productDetails, String token) {
            q.f(productId, "productId");
            q.f(optionId, "optionId");
            q.f(productDetails, "productDetails");
            q.f(token, "token");
            return new Subscription(productId, optionId, productDetails, token);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return q.b(getProductId(), subscription.getProductId()) && q.b(this.optionId, subscription.optionId) && q.b(this.productDetails, subscription.productDetails) && q.b(this.token, subscription.token);
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final h getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return (((((getProductId().hashCode() * 31) + this.optionId.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.token.hashCode();
        }

        public String toString() {
            return "Subscription(productId=" + getProductId() + ", optionId=" + this.optionId + ", productDetails=" + this.productDetails + ", token=" + this.token + ')';
        }
    }

    private GooglePurchasingData() {
    }

    public /* synthetic */ GooglePurchasingData(j jVar) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new p();
    }
}

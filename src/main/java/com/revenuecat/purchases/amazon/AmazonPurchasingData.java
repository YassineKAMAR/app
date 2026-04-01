package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.PurchasingData;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmazonPurchasingData implements PurchasingData {

    public static final class Product extends AmazonPurchasingData {
        private final AmazonStoreProduct storeProduct;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(AmazonStoreProduct storeProduct) {
            super(null);
            q.f(storeProduct, "storeProduct");
            this.storeProduct = storeProduct;
        }

        public static /* synthetic */ Product copy$default(Product product, AmazonStoreProduct amazonStoreProduct, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                amazonStoreProduct = product.storeProduct;
            }
            return product.copy(amazonStoreProduct);
        }

        public final AmazonStoreProduct component1() {
            return this.storeProduct;
        }

        public final Product copy(AmazonStoreProduct storeProduct) {
            q.f(storeProduct, "storeProduct");
            return new Product(storeProduct);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Product) && q.b(this.storeProduct, ((Product) obj).storeProduct);
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.storeProduct.getId();
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public ProductType getProductType() {
            return this.storeProduct.getType();
        }

        public final AmazonStoreProduct getStoreProduct() {
            return this.storeProduct;
        }

        public int hashCode() {
            return this.storeProduct.hashCode();
        }

        public String toString() {
            return "Product(storeProduct=" + this.storeProduct + ')';
        }
    }

    private AmazonPurchasingData() {
    }

    public /* synthetic */ AmazonPurchasingData(j jVar) {
        this();
    }
}

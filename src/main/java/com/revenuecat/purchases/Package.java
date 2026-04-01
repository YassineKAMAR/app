package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class Package {
    private final String identifier;
    private final String offering;
    private final PackageType packageType;
    private final StoreProduct product;

    public Package(String identifier, PackageType packageType, StoreProduct product, String offering) {
        q.f(identifier, "identifier");
        q.f(packageType, "packageType");
        q.f(product, "product");
        q.f(offering, "offering");
        this.identifier = identifier;
        this.packageType = packageType;
        this.product = product;
        this.offering = offering;
    }

    public static /* synthetic */ Package copy$default(Package r02, String str, PackageType packageType, StoreProduct storeProduct, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = r02.identifier;
        }
        if ((i8 & 2) != 0) {
            packageType = r02.packageType;
        }
        if ((i8 & 4) != 0) {
            storeProduct = r02.product;
        }
        if ((i8 & 8) != 0) {
            str2 = r02.offering;
        }
        return r02.copy(str, packageType, storeProduct, str2);
    }

    public final String component1() {
        return this.identifier;
    }

    public final PackageType component2() {
        return this.packageType;
    }

    public final StoreProduct component3() {
        return this.product;
    }

    public final String component4() {
        return this.offering;
    }

    public final Package copy(String identifier, PackageType packageType, StoreProduct product, String offering) {
        q.f(identifier, "identifier");
        q.f(packageType, "packageType");
        q.f(product, "product");
        q.f(offering, "offering");
        return new Package(identifier, packageType, product, offering);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package r52 = (Package) obj;
        return q.b(this.identifier, r52.identifier) && this.packageType == r52.packageType && q.b(this.product, r52.product) && q.b(this.offering, r52.offering);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        return this.offering;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return (((((this.identifier.hashCode() * 31) + this.packageType.hashCode()) * 31) + this.product.hashCode()) * 31) + this.offering.hashCode();
    }

    public String toString() {
        return "Package(identifier=" + this.identifier + ", packageType=" + this.packageType + ", product=" + this.product + ", offering=" + this.offering + ')';
    }
}

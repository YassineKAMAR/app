package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ProrationMode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class StoreTransaction implements Parcelable {
    public static final Parcelable.Creator<StoreTransaction> CREATOR = new Creator();
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final JSONObject originalJson;
    private final String presentedOfferingIdentifier;
    private final List<String> productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final ReplacementMode replacementMode;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final ProductType type;

    public static final class Creator implements Parcelable.Creator<StoreTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreTransaction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            q.f(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ProductType productTypeValueOf = ProductType.valueOf(parcel.readString());
            long j8 = parcel.readLong();
            String string2 = parcel.readString();
            PurchaseState purchaseStateValueOf = PurchaseState.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoreTransaction(string, arrayListCreateStringArrayList, productTypeValueOf, j8, string2, purchaseStateValueOf, boolValueOf, parcel.readString(), JSONObjectParceler.INSTANCE.create(parcel), parcel.readString(), parcel.readString(), PurchaseType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (ReplacementMode) parcel.readParcelable(StoreTransaction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreTransaction[] newArray(int i8) {
            return new StoreTransaction[i8];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StoreTransaction(String str, List<String> productIds, ProductType type, long j8, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, JSONObject originalJson, String str3, String str4, PurchaseType purchaseType, String str5, String str6, ProrationMode prorationMode) {
        q.f(productIds, "productIds");
        q.f(type, "type");
        q.f(purchaseToken, "purchaseToken");
        q.f(purchaseState, "purchaseState");
        q.f(originalJson, "originalJson");
        q.f(purchaseType, "purchaseType");
        GoogleProrationMode googleProrationMode = prorationMode instanceof GoogleProrationMode ? (GoogleProrationMode) prorationMode : null;
        this(str, productIds, type, j8, purchaseToken, purchaseState, bool, str2, originalJson, str3, str4, purchaseType, str5, str6, googleProrationMode != null ? googleProrationMode.getAsGoogleReplacementMode$purchases_defaultsRelease() : null);
    }

    public StoreTransaction(String str, List<String> productIds, ProductType type, long j8, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, JSONObject originalJson, String str3, String str4, PurchaseType purchaseType, String str5, String str6, ReplacementMode replacementMode) {
        q.f(productIds, "productIds");
        q.f(type, "type");
        q.f(purchaseToken, "purchaseToken");
        q.f(purchaseState, "purchaseState");
        q.f(originalJson, "originalJson");
        q.f(purchaseType, "purchaseType");
        this.orderId = str;
        this.productIds = productIds;
        this.type = type;
        this.purchaseTime = j8;
        this.purchaseToken = purchaseToken;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str2;
        this.originalJson = originalJson;
        this.presentedOfferingIdentifier = str3;
        this.storeUserID = str4;
        this.purchaseType = purchaseType;
        this.marketplace = str5;
        this.subscriptionOptionId = str6;
        this.replacementMode = replacementMode;
    }

    public static /* synthetic */ void getProrationMode$annotations() {
    }

    public static /* synthetic */ void getSkus$annotations() {
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component10() {
        return this.presentedOfferingIdentifier;
    }

    public final String component11() {
        return this.storeUserID;
    }

    public final PurchaseType component12() {
        return this.purchaseType;
    }

    public final String component13() {
        return this.marketplace;
    }

    public final String component14() {
        return this.subscriptionOptionId;
    }

    public final ReplacementMode component15() {
        return this.replacementMode;
    }

    public final List<String> component2() {
        return this.productIds;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final String component5() {
        return this.purchaseToken;
    }

    public final PurchaseState component6() {
        return this.purchaseState;
    }

    public final Boolean component7() {
        return this.isAutoRenewing;
    }

    public final String component8() {
        return this.signature;
    }

    public final JSONObject component9() {
        return this.originalJson;
    }

    public final StoreTransaction copy(String str, List<String> productIds, ProductType type, long j8, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, JSONObject originalJson, String str3, String str4, PurchaseType purchaseType, String str5, String str6, ReplacementMode replacementMode) {
        q.f(productIds, "productIds");
        q.f(type, "type");
        q.f(purchaseToken, "purchaseToken");
        q.f(purchaseState, "purchaseState");
        q.f(originalJson, "originalJson");
        q.f(purchaseType, "purchaseType");
        return new StoreTransaction(str, productIds, type, j8, purchaseToken, purchaseState, bool, str2, originalJson, str3, str4, purchaseType, str5, str6, replacementMode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof StoreTransaction) && q.b(new ComparableData(this), new ComparableData((StoreTransaction) obj));
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final JSONObject getOriginalJson() {
        return this.originalJson;
    }

    public final String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final ProrationMode getProrationMode() {
        ReplacementMode replacementMode = this.replacementMode;
        GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
        if (googleReplacementMode != null) {
            return googleReplacementMode.getAsGoogleProrationMode$purchases_defaultsRelease();
        }
        return null;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final List<String> getSkus() {
        return this.productIds;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "StoreTransaction(orderId=" + this.orderId + ", productIds=" + this.productIds + ", type=" + this.type + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", signature=" + this.signature + ", originalJson=" + this.originalJson + ", presentedOfferingIdentifier=" + this.presentedOfferingIdentifier + ", storeUserID=" + this.storeUserID + ", purchaseType=" + this.purchaseType + ", marketplace=" + this.marketplace + ", subscriptionOptionId=" + this.subscriptionOptionId + ", replacementMode=" + this.replacementMode + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        ?? BooleanValue;
        q.f(out, "out");
        out.writeString(this.orderId);
        out.writeStringList(this.productIds);
        out.writeString(this.type.name());
        out.writeLong(this.purchaseTime);
        out.writeString(this.purchaseToken);
        out.writeString(this.purchaseState.name());
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            out.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        out.writeInt(BooleanValue);
        out.writeString(this.signature);
        JSONObjectParceler.INSTANCE.write(this.originalJson, (Parcel) out, i8);
        out.writeString(this.presentedOfferingIdentifier);
        out.writeString(this.storeUserID);
        out.writeString(this.purchaseType.name());
        out.writeString(this.marketplace);
        out.writeString(this.subscriptionOptionId);
        out.writeParcelable(this.replacementMode, i8);
    }
}

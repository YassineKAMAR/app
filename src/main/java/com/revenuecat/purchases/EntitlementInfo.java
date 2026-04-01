package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.Date;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class EntitlementInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<EntitlementInfo> CREATOR = new Creator();
    private final Date billingIssueDetectedAt;
    private final Date expirationDate;
    private final String identifier;
    private final boolean isActive;
    private final boolean isSandbox;
    private final JSONObject jsonObject;
    private final Date latestPurchaseDate;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final String productIdentifier;
    private final String productPlanIdentifier;
    private final Store store;
    private final Date unsubscribeDetectedAt;
    private final VerificationResult verification;
    private final boolean willRenew;

    public static final class Creator implements Parcelable.Creator<EntitlementInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfo createFromParcel(Parcel parcel) {
            q.f(parcel, "parcel");
            return new EntitlementInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, PeriodType.valueOf(parcel.readString()), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), OwnershipType.valueOf(parcel.readString()), JSONObjectParceler.INSTANCE.create(parcel), VerificationResult.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfo[] newArray(int i8) {
            return new EntitlementInfo[i8];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitlementInfo(String identifier, boolean z7, boolean z8, PeriodType periodType, Date latestPurchaseDate, Date originalPurchaseDate, Date date, Store store, String productIdentifier, String str, boolean z9, Date date2, Date date3, OwnershipType ownershipType, JSONObject jsonObject) {
        this(identifier, z7, z8, periodType, latestPurchaseDate, originalPurchaseDate, date, store, productIdentifier, str, z9, date2, date3, ownershipType, jsonObject, VerificationResult.NOT_REQUESTED);
        q.f(identifier, "identifier");
        q.f(periodType, "periodType");
        q.f(latestPurchaseDate, "latestPurchaseDate");
        q.f(originalPurchaseDate, "originalPurchaseDate");
        q.f(store, "store");
        q.f(productIdentifier, "productIdentifier");
        q.f(ownershipType, "ownershipType");
        q.f(jsonObject, "jsonObject");
    }

    public EntitlementInfo(String identifier, boolean z7, boolean z8, PeriodType periodType, Date latestPurchaseDate, Date originalPurchaseDate, Date date, Store store, String productIdentifier, String str, boolean z9, Date date2, Date date3, OwnershipType ownershipType, JSONObject jsonObject, VerificationResult verification) {
        q.f(identifier, "identifier");
        q.f(periodType, "periodType");
        q.f(latestPurchaseDate, "latestPurchaseDate");
        q.f(originalPurchaseDate, "originalPurchaseDate");
        q.f(store, "store");
        q.f(productIdentifier, "productIdentifier");
        q.f(ownershipType, "ownershipType");
        q.f(jsonObject, "jsonObject");
        q.f(verification, "verification");
        this.identifier = identifier;
        this.isActive = z7;
        this.willRenew = z8;
        this.periodType = periodType;
        this.latestPurchaseDate = latestPurchaseDate;
        this.originalPurchaseDate = originalPurchaseDate;
        this.expirationDate = date;
        this.store = store;
        this.productIdentifier = productIdentifier;
        this.productPlanIdentifier = str;
        this.isSandbox = z9;
        this.unsubscribeDetectedAt = date2;
        this.billingIssueDetectedAt = date3;
        this.ownershipType = ownershipType;
        this.jsonObject = jsonObject;
        this.verification = verification;
    }

    public /* synthetic */ EntitlementInfo(String str, boolean z7, boolean z8, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z9, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject, VerificationResult verificationResult, int i8, j jVar) {
        this(str, z7, z8, periodType, date, date2, date3, store, str2, str3, z9, date4, date5, ownershipType, jSONObject, (i8 & 32768) != 0 ? VerificationResult.NOT_REQUESTED : verificationResult);
    }

    private final JSONObject component15() {
        return this.jsonObject;
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component10() {
        return this.productPlanIdentifier;
    }

    public final boolean component11() {
        return this.isSandbox;
    }

    public final Date component12() {
        return this.unsubscribeDetectedAt;
    }

    public final Date component13() {
        return this.billingIssueDetectedAt;
    }

    public final OwnershipType component14() {
        return this.ownershipType;
    }

    public final VerificationResult component16() {
        return this.verification;
    }

    public final boolean component2() {
        return this.isActive;
    }

    public final boolean component3() {
        return this.willRenew;
    }

    public final PeriodType component4() {
        return this.periodType;
    }

    public final Date component5() {
        return this.latestPurchaseDate;
    }

    public final Date component6() {
        return this.originalPurchaseDate;
    }

    public final Date component7() {
        return this.expirationDate;
    }

    public final Store component8() {
        return this.store;
    }

    public final String component9() {
        return this.productIdentifier;
    }

    public final EntitlementInfo copy(String identifier, boolean z7, boolean z8, PeriodType periodType, Date latestPurchaseDate, Date originalPurchaseDate, Date date, Store store, String productIdentifier, String str, boolean z9, Date date2, Date date3, OwnershipType ownershipType, JSONObject jsonObject, VerificationResult verification) {
        q.f(identifier, "identifier");
        q.f(periodType, "periodType");
        q.f(latestPurchaseDate, "latestPurchaseDate");
        q.f(originalPurchaseDate, "originalPurchaseDate");
        q.f(store, "store");
        q.f(productIdentifier, "productIdentifier");
        q.f(ownershipType, "ownershipType");
        q.f(jsonObject, "jsonObject");
        q.f(verification, "verification");
        return new EntitlementInfo(identifier, z7, z8, periodType, latestPurchaseDate, originalPurchaseDate, date, store, productIdentifier, str, z9, date2, date3, ownershipType, jsonObject, verification);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q.b(EntitlementInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        q.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfo");
        EntitlementInfo entitlementInfo = (EntitlementInfo) obj;
        return q.b(this.identifier, entitlementInfo.identifier) && this.isActive == entitlementInfo.isActive && this.willRenew == entitlementInfo.willRenew && this.periodType == entitlementInfo.periodType && q.b(this.latestPurchaseDate, entitlementInfo.latestPurchaseDate) && q.b(this.originalPurchaseDate, entitlementInfo.originalPurchaseDate) && q.b(this.expirationDate, entitlementInfo.expirationDate) && this.store == entitlementInfo.store && q.b(this.productIdentifier, entitlementInfo.productIdentifier) && q.b(this.productPlanIdentifier, entitlementInfo.productPlanIdentifier) && this.isSandbox == entitlementInfo.isSandbox && q.b(this.unsubscribeDetectedAt, entitlementInfo.unsubscribeDetectedAt) && q.b(this.billingIssueDetectedAt, entitlementInfo.billingIssueDetectedAt) && this.ownershipType == entitlementInfo.ownershipType && this.verification == entitlementInfo.verification;
    }

    public final Date getBillingIssueDetectedAt() {
        return this.billingIssueDetectedAt;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Date getLatestPurchaseDate() {
        return this.latestPurchaseDate;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    public JSONObject getRawData() {
        return this.jsonObject;
    }

    public final Store getStore() {
        return this.store;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.identifier.hashCode() * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.isActive)) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.willRenew)) * 31) + this.periodType.hashCode()) * 31) + this.latestPurchaseDate.hashCode()) * 31) + this.originalPurchaseDate.hashCode()) * 31;
        Date date = this.expirationDate;
        int iHashCode2 = (((((iHashCode + (date != null ? date.hashCode() : 0)) * 31) + this.store.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31;
        String str = this.productPlanIdentifier;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.isSandbox)) * 31;
        Date date2 = this.unsubscribeDetectedAt;
        int iHashCode4 = (iHashCode3 + (date2 != null ? date2.hashCode() : 0)) * 31;
        Date date3 = this.billingIssueDetectedAt;
        return ((iHashCode4 + (date3 != null ? date3.hashCode() : 0)) * 31) + this.ownershipType.hashCode();
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "EntitlementInfo(identifier='" + this.identifier + "', isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", periodType=" + this.periodType + ", latestPurchaseDate=" + this.latestPurchaseDate + ", originalPurchaseDate=" + this.originalPurchaseDate + ", expirationDate=" + this.expirationDate + ", store=" + this.store + ", productIdentifier='" + this.productIdentifier + "', productPlanIdentifier='" + this.productPlanIdentifier + "', isSandbox=" + this.isSandbox + ", unsubscribeDetectedAt=" + this.unsubscribeDetectedAt + ", billingIssueDetectedAt=" + this.billingIssueDetectedAt + ", ownershipType=" + this.ownershipType + ", verification=" + this.verification + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        q.f(out, "out");
        out.writeString(this.identifier);
        out.writeInt(this.isActive ? 1 : 0);
        out.writeInt(this.willRenew ? 1 : 0);
        out.writeString(this.periodType.name());
        out.writeSerializable(this.latestPurchaseDate);
        out.writeSerializable(this.originalPurchaseDate);
        out.writeSerializable(this.expirationDate);
        out.writeString(this.store.name());
        out.writeString(this.productIdentifier);
        out.writeString(this.productPlanIdentifier);
        out.writeInt(this.isSandbox ? 1 : 0);
        out.writeSerializable(this.unsubscribeDetectedAt);
        out.writeSerializable(this.billingIssueDetectedAt);
        out.writeString(this.ownershipType.name());
        JSONObjectParceler.INSTANCE.write(this.jsonObject, out, i8);
        out.writeString(this.verification.name());
    }
}

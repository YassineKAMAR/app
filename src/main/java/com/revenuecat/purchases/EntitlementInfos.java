package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class EntitlementInfos implements Parcelable {
    public static final Parcelable.Creator<EntitlementInfos> CREATOR = new Creator();
    private final Map<String, EntitlementInfo> active;
    private final Map<String, EntitlementInfo> all;
    private final VerificationResult verification;

    public static final class Creator implements Parcelable.Creator<EntitlementInfos> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfos createFromParcel(Parcel parcel) {
            q.f(parcel, "parcel");
            int i8 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                linkedHashMap.put(parcel.readString(), EntitlementInfo.CREATOR.createFromParcel(parcel));
            }
            return new EntitlementInfos(linkedHashMap, VerificationResult.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfos[] newArray(int i8) {
            return new EntitlementInfos[i8];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitlementInfos(Map<String, EntitlementInfo> all) {
        this(all, VerificationResult.NOT_REQUESTED);
        q.f(all, "all");
    }

    public EntitlementInfos(Map<String, EntitlementInfo> all, VerificationResult verification) {
        q.f(all, "all");
        q.f(verification, "verification");
        this.all = all;
        this.verification = verification;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, EntitlementInfo> entry : all.entrySet()) {
            if (entry.getValue().isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.active = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q.b(EntitlementInfos.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        q.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfos");
        EntitlementInfos entitlementInfos = (EntitlementInfos) obj;
        return q.b(this.all, entitlementInfos.all) && q.b(this.active, entitlementInfos.active) && this.verification == entitlementInfos.verification;
    }

    public final EntitlementInfo get(String s8) {
        q.f(s8, "s");
        return this.all.get(s8);
    }

    public final Map<String, EntitlementInfo> getActive() {
        return this.active;
    }

    public final Map<String, EntitlementInfo> getAll() {
        return this.all;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public int hashCode() {
        return (this.all.hashCode() * 31) + this.active.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        q.f(out, "out");
        Map<String, EntitlementInfo> map = this.all;
        out.writeInt(map.size());
        for (Map.Entry<String, EntitlementInfo> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            entry.getValue().writeToParcel(out, i8);
        }
        out.writeString(this.verification.name());
    }
}

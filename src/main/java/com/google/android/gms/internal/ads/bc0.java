package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 extends b3.a {
    public static final Parcelable.Creator<bc0> CREATOR = new cc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5709b;

    public bc0(String str, int i8) {
        this.f5708a = str;
        this.f5709b = i8;
    }

    public static bc0 g(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new bc0(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bc0)) {
            bc0 bc0Var = (bc0) obj;
            if (a3.n.a(this.f5708a, bc0Var.f5708a)) {
                if (a3.n.a(Integer.valueOf(this.f5709b), Integer.valueOf(bc0Var.f5709b))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return a3.n.b(this.f5708a, Integer.valueOf(this.f5709b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f5708a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, str, false);
        b3.c.k(parcel, 3, this.f5709b);
        b3.c.b(parcel, iA);
    }
}

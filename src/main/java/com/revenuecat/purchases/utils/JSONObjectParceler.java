package com.revenuecat.purchases.utils;

import android.os.Parcel;
import h7.a;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class JSONObjectParceler implements h7.a<JSONObject> {
    public static final JSONObjectParceler INSTANCE = new JSONObjectParceler();

    private JSONObjectParceler() {
    }

    public JSONObject create(Parcel parcel) {
        q.f(parcel, "parcel");
        return new JSONObject(parcel.readString());
    }

    public JSONObject[] newArray(int i8) {
        return (JSONObject[]) a.C0120a.a(this, i8);
    }

    public void write(JSONObject jSONObject, Parcel parcel, int i8) {
        q.f(jSONObject, "<this>");
        q.f(parcel, "parcel");
        parcel.writeString(jSONObject.toString());
    }
}

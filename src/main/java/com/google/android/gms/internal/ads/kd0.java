package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class kd0 extends b3.a {
    public static final Parcelable.Creator<kd0> CREATOR = new ld0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f10034h;

    public kd0(String str, String str2, boolean z7, boolean z8, List list, boolean z9, boolean z10, List list2) {
        this.f10027a = str;
        this.f10028b = str2;
        this.f10029c = z7;
        this.f10030d = z8;
        this.f10031e = list;
        this.f10032f = z9;
        this.f10033g = z10;
        this.f10034h = list2 == null ? new ArrayList() : list2;
    }

    public static kd0 g(JSONObject jSONObject) {
        return new kd0(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), j2.y0.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), j2.y0.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f10027a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, str, false);
        b3.c.q(parcel, 3, this.f10028b, false);
        b3.c.c(parcel, 4, this.f10029c);
        b3.c.c(parcel, 5, this.f10030d);
        b3.c.s(parcel, 6, this.f10031e, false);
        b3.c.c(parcel, 7, this.f10032f);
        b3.c.c(parcel, 8, this.f10033g);
        b3.c.s(parcel, 9, this.f10034h, false);
        b3.c.b(parcel, iA);
    }
}

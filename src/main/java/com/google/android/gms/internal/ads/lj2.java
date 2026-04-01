package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import d2.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lj2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.C0100a f10742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f53 f10744c;

    public lj2(a.C0100a c0100a, String str, f53 f53Var) {
        this.f10742a = c0100a;
        this.f10743b = str;
        this.f10744c = f53Var;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectF = j2.y0.f((JSONObject) obj, "pii");
            a.C0100a c0100a = this.f10742a;
            if (c0100a == null || TextUtils.isEmpty(c0100a.a())) {
                String str = this.f10743b;
                if (str != null) {
                    jSONObjectF.put("pdid", str);
                    jSONObjectF.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectF.put("rdid", this.f10742a.a());
            jSONObjectF.put("is_lat", this.f10742a.b());
            jSONObjectF.put("idtype", "adid");
            f53 f53Var = this.f10744c;
            if (f53Var.c()) {
                jSONObjectF.put("paidv1_id_android_3p", f53Var.b());
                jSONObjectF.put("paidv1_creation_time_android_3p", this.f10744c.a());
            }
        } catch (JSONException e8) {
            j2.v1.l("Failed putting Ad ID.", e8);
        }
    }
}

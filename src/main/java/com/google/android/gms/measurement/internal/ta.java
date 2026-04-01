package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.kg;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends ra {
    ta(va vaVar) {
        super(vaVar);
    }

    private final String v(String str) {
        String strQ = o().Q(str);
        if (TextUtils.isEmpty(strQ)) {
            return e0.f19959s.a(null);
        }
        Uri uri = Uri.parse(e0.f19959s.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strQ + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ pb m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ m n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ i5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ y9 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta r() {
        return super.r();
    }

    public final wa s(String str) {
        if (kg.a() && a().q(e0.A0)) {
            t().K().a("sgtm feature flag enabled.");
            r5 r5VarD0 = n().D0(str);
            if (r5VarD0 == null) {
                return new wa(v(str));
            }
            wa waVar = null;
            if (r5VarD0.t()) {
                t().K().a("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.j4 j4VarL = o().L(r5VarD0.t0());
                if (j4VarL != null) {
                    String strR = j4VarL.R();
                    if (!TextUtils.isEmpty(strR)) {
                        String strQ = j4VarL.Q();
                        t().K().c("sgtm configured with upload_url, server_info", strR, TextUtils.isEmpty(strQ) ? "Y" : "N");
                        if (TextUtils.isEmpty(strQ)) {
                            waVar = new wa(strR);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-google-sgtm-server-info", strQ);
                            waVar = new wa(strR, map);
                        }
                    }
                }
            }
            if (waVar != null) {
                return waVar;
            }
        }
        return new wa(v(str));
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }
}

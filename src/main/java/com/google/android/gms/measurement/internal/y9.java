package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import d2.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y9 extends ua {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, x9> f20733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d5 f20734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d5 f20735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d5 f20736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d5 f20737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d5 f20738i;

    y9(va vaVar) {
        super(vaVar);
        this.f20733d = new HashMap();
        y4 y4VarE = e();
        y4VarE.getClass();
        this.f20734e = new d5(y4VarE, "last_delete_stale", 0L);
        y4 y4VarE2 = e();
        y4VarE2.getClass();
        this.f20735f = new d5(y4VarE2, "backoff", 0L);
        y4 y4VarE3 = e();
        y4VarE3.getClass();
        this.f20736g = new d5(y4VarE3, "last_upload", 0L);
        y4 y4VarE4 = e();
        y4VarE4.getClass();
        this.f20737h = new d5(y4VarE4, "last_upload_attempt", 0L);
        y4 y4VarE5 = e();
        y4VarE5.getClass();
        this.f20738i = new d5(y4VarE5, "midnight_offset", 0L);
    }

    @Deprecated
    private final Pair<String, Boolean> y(String str) {
        x9 x9Var;
        i();
        long jB = k().b();
        x9 x9Var2 = this.f20733d.get(str);
        if (x9Var2 != null && jB < x9Var2.f20684c) {
            return new Pair<>(x9Var2.f20682a, Boolean.valueOf(x9Var2.f20683b));
        }
        d2.a.d(true);
        long jC = a().C(str) + jB;
        a.C0100a c0100aA = null;
        try {
            long jX = a().x(str, e0.f19929d);
            if (jX > 0) {
                try {
                    c0100aA = d2.a.a(j());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (x9Var2 != null && jB < x9Var2.f20684c + jX) {
                        return new Pair<>(x9Var2.f20682a, Boolean.valueOf(x9Var2.f20683b));
                    }
                }
            } else {
                c0100aA = d2.a.a(j());
            }
        } catch (Exception e8) {
            t().F().b("Unable to get advertising id", e8);
            x9Var = new x9("", false, jC);
        }
        if (c0100aA == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strA = c0100aA.a();
        x9Var = strA != null ? new x9(strA, c0100aA.b(), jC) : new x9("", c0100aA.b(), jC);
        this.f20733d.put(str, x9Var);
        d2.a.d(false);
        return new Pair<>(x9Var.f20682a, Boolean.valueOf(x9Var.f20683b));
    }

    @Deprecated
    final String A(String str, boolean z7) {
        i();
        String str2 = z7 ? (String) y(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestT0 = ib.T0();
        if (messageDigestT0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestT0.digest(str2.getBytes())));
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

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean x() {
        return false;
    }

    final Pair<String, Boolean> z(String str, y6 y6Var) {
        return y6Var.x() ? y(str) : new Pair<>("", Boolean.FALSE);
    }
}

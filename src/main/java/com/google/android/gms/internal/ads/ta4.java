package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ta4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f15024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    vv1 f15025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c93 f15026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    c93 f15027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    c93 f15028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c93 f15029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    c93 f15030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    z73 f15031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Looper f15032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    zb4 f15033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f15034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f15035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    wd4 f15036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f15037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f15038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f15039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f15040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ea4 f15041r;

    public ta4(final Context context, ol0 ol0Var) {
        ma4 ma4Var = new ma4(ol0Var);
        na4 na4Var = new na4(context);
        c93 c93Var = new c93() { // from class: com.google.android.gms.internal.ads.oa4
            @Override // com.google.android.gms.internal.ads.c93
            public final Object j() {
                return new gq4(context);
            }
        };
        pa4 pa4Var = new c93() { // from class: com.google.android.gms.internal.ads.pa4
            @Override // com.google.android.gms.internal.ads.c93
            public final Object j() {
                return new fa4();
            }
        };
        qa4 qa4Var = new qa4(context);
        ra4 ra4Var = new z73() { // from class: com.google.android.gms.internal.ads.ra4
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return new gg4((vv1) obj);
            }
        };
        context.getClass();
        this.f15024a = context;
        this.f15026c = ma4Var;
        this.f15027d = na4Var;
        this.f15028e = c93Var;
        this.f15029f = pa4Var;
        this.f15030g = qa4Var;
        this.f15031h = ra4Var;
        this.f15032i = nz2.I();
        this.f15033j = zb4.f18139c;
        this.f15034k = 1;
        this.f15035l = true;
        this.f15036m = wd4.f16699g;
        this.f15041r = new ea4(0.97f, 1.03f, 1000L, 1.0E-7f, nz2.C(20L), nz2.C(500L), 0.999f, null);
        this.f15025b = vv1.f16482a;
        this.f15037n = 500L;
        this.f15038o = 2000L;
        this.f15039p = true;
    }

    static /* synthetic */ sm4 a(Context context) {
        return new gm4(context, new k0());
    }
}

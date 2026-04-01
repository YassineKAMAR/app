package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class j31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bx2 f9455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wg0 f9456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ApplicationInfo f9457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f9459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PackageInfo f9460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c84 f9461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ri2 f9463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j2.x1 f9464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ts2 f9465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v91 f9466l;

    public j31(bx2 bx2Var, wg0 wg0Var, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, c84 c84Var, j2.x1 x1Var, String str2, ri2 ri2Var, ts2 ts2Var, v91 v91Var) {
        this.f9455a = bx2Var;
        this.f9456b = wg0Var;
        this.f9457c = applicationInfo;
        this.f9458d = str;
        this.f9459e = list;
        this.f9460f = packageInfo;
        this.f9461g = c84Var;
        this.f9462h = str2;
        this.f9463i = ri2Var;
        this.f9464j = x1Var;
        this.f9465k = ts2Var;
        this.f9466l = v91Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ya0 a(x3.d dVar) {
        Bundle bundle = (Bundle) dVar.get();
        String str = (String) ((x3.d) this.f9461g.k()).get();
        boolean z7 = ((Boolean) h2.y.c().b(ns.f12065e7)).booleanValue() && this.f9464j.F0();
        String str2 = this.f9462h;
        PackageInfo packageInfo = this.f9460f;
        List list = this.f9459e;
        return new ya0(bundle, this.f9456b, this.f9457c, this.f9458d, list, packageInfo, str, str2, null, null, z7, this.f9465k.b());
    }

    public final x3.d b() {
        this.f9466l.j();
        return lw2.c(this.f9463i.a(new Bundle()), vw2.SIGNALS, this.f9455a).a();
    }

    public final x3.d c() {
        final x3.d dVarB = b();
        return this.f9455a.a(vw2.REQUEST_PARCEL, dVarB, (x3.d) this.f9461g.k()).a(new Callable() { // from class: com.google.android.gms.internal.ads.i31
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9059a.a(dVarB);
            }
        }).a();
    }
}

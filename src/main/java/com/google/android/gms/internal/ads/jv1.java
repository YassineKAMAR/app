package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
final class jv1 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ kv1 f9821a;

    jv1(kv1 kv1Var) {
        this.f9821a = kv1Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue()) {
            Matcher matcher = kv1.f10364h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f9821a.f10369e.i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ks2 ks2Var = (ks2) obj;
        if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue()) {
            this.f9821a.f10369e.i(ks2Var.f10323b.f9793b.f5465e);
            this.f9821a.f10369e.j(ks2Var.f10323b.f9793b.f5466f);
        }
    }
}

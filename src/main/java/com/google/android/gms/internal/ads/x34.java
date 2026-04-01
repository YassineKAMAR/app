package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class x34 extends v34 {
    x34() {
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* synthetic */ int a(Object obj) {
        return ((w34) obj).a();
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* synthetic */ int b(Object obj) {
        return ((w34) obj).b();
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        z04 z04Var = (z04) obj;
        w34 w34Var = z04Var.zzc;
        if (w34Var != w34.c()) {
            return w34Var;
        }
        w34 w34VarF = w34.f();
        z04Var.zzc = w34VarF;
        return w34VarF;
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* synthetic */ Object d(Object obj) {
        return ((z04) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (w34.c().equals(obj2)) {
            return obj;
        }
        w34 w34Var = (w34) obj2;
        if (w34.c().equals(obj)) {
            return w34.e((w34) obj, w34Var);
        }
        ((w34) obj).d(w34Var);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* synthetic */ Object f() {
        return w34.f();
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* synthetic */ Object g(Object obj) {
        ((w34) obj).h();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* bridge */ /* synthetic */ void h(Object obj, int i8, int i9) {
        ((w34) obj).j((i8 << 3) | 5, Integer.valueOf(i9));
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* bridge */ /* synthetic */ void i(Object obj, int i8, long j8) {
        ((w34) obj).j((i8 << 3) | 1, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* bridge */ /* synthetic */ void j(Object obj, int i8, Object obj2) {
        ((w34) obj).j((i8 << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* bridge */ /* synthetic */ void k(Object obj, int i8, rz3 rz3Var) {
        ((w34) obj).j((i8 << 3) | 2, rz3Var);
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* bridge */ /* synthetic */ void l(Object obj, int i8, long j8) {
        ((w34) obj).j(i8 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.v34
    final void m(Object obj) {
        ((z04) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* synthetic */ void n(Object obj, Object obj2) {
        ((z04) obj).zzc = (w34) obj2;
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* synthetic */ void o(Object obj, Object obj2) {
        ((z04) obj).zzc = (w34) obj2;
    }

    @Override // com.google.android.gms.internal.ads.v34
    final boolean q(v24 v24Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.v34
    final /* synthetic */ void r(Object obj, i04 i04Var) {
        ((w34) obj).k(i04Var);
    }
}

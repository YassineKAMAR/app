package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class k02 implements v51, j41 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f9857c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9858d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2.x1 f9859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u02 f9860b;

    public k02(u02 u02Var, j2.x1 x1Var) {
        this.f9860b = u02Var;
        this.f9859a = x1Var;
    }

    private final void a(boolean z7) {
        int i8;
        int iIntValue;
        if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue() && !this.f9859a.F0()) {
            Object obj = f9857c;
            synchronized (obj) {
                i8 = f9858d;
                iIntValue = ((Integer) h2.y.c().b(ns.f12082g6)).intValue();
            }
            if (i8 >= iIntValue) {
                return;
            }
            this.f9860b.e(z7);
            synchronized (obj) {
                f9858d++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(h2.z2 z2Var) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        a(true);
    }
}

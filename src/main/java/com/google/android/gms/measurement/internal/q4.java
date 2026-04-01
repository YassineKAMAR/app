package com.google.android.gms.measurement.internal;

import com.revenuecat.purchases.common.Constants;

/* JADX INFO: loaded from: classes.dex */
final class q4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f20391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Object f20392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Object f20393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ n4 f20394f;

    q4(n4 n4Var, int i8, String str, Object obj, Object obj2, Object obj3) {
        this.f20394f = n4Var;
        this.f20389a = i8;
        this.f20390b = str;
        this.f20391c = obj;
        this.f20392d = obj2;
        this.f20393e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n4 n4Var;
        char c8;
        y4 y4VarF = this.f20394f.f20556a.F();
        if (!y4VarF.o()) {
            this.f20394f.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f20394f.f20279c == 0) {
            if (this.f20394f.a().T()) {
                n4Var = this.f20394f;
                c8 = 'C';
            } else {
                n4Var = this.f20394f;
                c8 = 'c';
            }
            n4Var.f20279c = c8;
        }
        if (this.f20394f.f20280d < 0) {
            this.f20394f.f20280d = 82001L;
        }
        String strSubstring = "2" + "01VDIWEA?".charAt(this.f20389a) + this.f20394f.f20279c + this.f20394f.f20280d + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + n4.x(true, this.f20390b, this.f20391c, this.f20392d, this.f20393e);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f20390b.substring(0, 1024);
        }
        c5 c5Var = y4VarF.f20698d;
        if (c5Var != null) {
            c5Var.b(strSubstring, 1L);
        }
    }
}

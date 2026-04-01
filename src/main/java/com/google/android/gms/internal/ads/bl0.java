package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bl0 implements oc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xq4 f5860a = new xq4(true, 65536);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5861b = 15000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5862c = 30000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5863d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5864e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5866g;

    bl0() {
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final /* synthetic */ void a(s11 s11Var, tm4 tm4Var, sd4[] sd4VarArr, to4 to4Var, iq4[] iq4VarArr) {
        int i8 = 0;
        this.f5865f = 0;
        while (true) {
            int length = sd4VarArr.length;
            if (i8 >= 2) {
                this.f5860a.f(this.f5865f);
                return;
            } else {
                if (iq4VarArr[i8] != null) {
                    this.f5865f += sd4VarArr[i8].k() != 1 ? 131072000 : 13107200;
                }
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean b(long j8, long j9, float f8) {
        boolean z7 = true;
        char c8 = j9 > this.f5862c ? (char) 0 : j9 < this.f5861b ? (char) 2 : (char) 1;
        int iA = this.f5860a.a();
        int i8 = this.f5865f;
        if (c8 != 2 && (c8 != 1 || !this.f5866g || iA >= i8)) {
            z7 = false;
        }
        this.f5866g = z7;
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final /* synthetic */ boolean c(s11 s11Var, tm4 tm4Var, long j8, float f8, boolean z7, long j9) {
        long j10 = z7 ? this.f5864e : this.f5863d;
        return j10 <= 0 || j8 >= j10;
    }

    final void d(boolean z7) {
        this.f5865f = 0;
        this.f5866g = false;
        if (z7) {
            this.f5860a.e();
        }
    }

    public final synchronized void e(int i8) {
        this.f5863d = ((long) i8) * 1000;
    }

    public final synchronized void f(int i8) {
        this.f5864e = ((long) i8) * 1000;
    }

    public final synchronized void g(int i8) {
        this.f5862c = ((long) i8) * 1000;
    }

    public final synchronized void h(int i8) {
        this.f5861b = ((long) i8) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final long j() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void k() {
        d(false);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void l() {
        d(true);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void p() {
        d(true);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final xq4 r() {
        return this.f5860a;
    }
}

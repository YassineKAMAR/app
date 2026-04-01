package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fa4 implements oc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xq4 f7692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f7695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f7696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f7697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7699h;

    public fa4() {
        xq4 xq4Var = new xq4(true, 65536);
        d(2500, 0, "bufferForPlaybackMs", "0");
        d(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        d(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        d(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        d(50000, 50000, "maxBufferMs", "minBufferMs");
        d(0, 0, "backBufferDurationMs", "0");
        this.f7692a = xq4Var;
        this.f7693b = nz2.C(50000L);
        this.f7694c = nz2.C(50000L);
        this.f7695d = nz2.C(2500L);
        this.f7696e = nz2.C(5000L);
        this.f7698g = 13107200;
        this.f7697f = nz2.C(0L);
    }

    private static void d(int i8, int i9, String str, String str2) {
        uu1.e(i8 >= i9, str + " cannot be less than " + str2);
    }

    private final void e(boolean z7) {
        this.f7698g = 13107200;
        this.f7699h = false;
        if (z7) {
            this.f7692a.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void a(s11 s11Var, tm4 tm4Var, sd4[] sd4VarArr, to4 to4Var, iq4[] iq4VarArr) {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int length = sd4VarArr.length;
            if (i8 >= 2) {
                int iMax = Math.max(13107200, i9);
                this.f7698g = iMax;
                this.f7692a.f(iMax);
                return;
            } else {
                if (iq4VarArr[i8] != null) {
                    i9 += sd4VarArr[i8].k() != 1 ? 131072000 : 13107200;
                }
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean b(long j8, long j9, float f8) {
        int iA = this.f7692a.a();
        int i8 = this.f7698g;
        long jMin = this.f7693b;
        if (f8 > 1.0f) {
            jMin = Math.min(nz2.A(jMin, f8), this.f7694c);
        }
        if (j9 < Math.max(jMin, 500000L)) {
            boolean z7 = iA < i8;
            this.f7699h = z7;
            if (!z7 && j9 < 500000) {
                pf2.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= this.f7694c || iA >= i8) {
            this.f7699h = false;
        }
        return this.f7699h;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(s11 s11Var, tm4 tm4Var, long j8, float f8, boolean z7, long j9) {
        long jB = nz2.B(j8, f8);
        long jMin = z7 ? this.f7696e : this.f7695d;
        if (j9 != -9223372036854775807L) {
            jMin = Math.min(j9 / 2, jMin);
        }
        return jMin <= 0 || jB >= jMin || this.f7692a.a() >= this.f7698g;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final long j() {
        return this.f7697f;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void k() {
        e(false);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void l() {
        e(true);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void p() {
        e(true);
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final xq4 r() {
        return this.f7692a;
    }
}

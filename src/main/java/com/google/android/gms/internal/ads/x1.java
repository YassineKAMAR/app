package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f17005a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17011g;

    public final void a(w1 w1Var, v1 v1Var) {
        if (this.f17007c > 0) {
            w1Var.a(this.f17008d, this.f17009e, this.f17010f, this.f17011g, v1Var);
            this.f17007c = 0;
        }
    }

    public final void b() {
        this.f17006b = false;
        this.f17007c = 0;
    }

    public final void c(w1 w1Var, long j8, int i8, int i9, int i10, v1 v1Var) {
        if (this.f17011g > i9 + i10) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f17006b) {
            int i11 = this.f17007c;
            int i12 = i11 + 1;
            this.f17007c = i12;
            if (i11 == 0) {
                this.f17008d = j8;
                this.f17009e = i8;
                this.f17010f = 0;
            }
            this.f17010f += i9;
            this.f17011g = i10;
            if (i12 >= 16) {
                a(w1Var, v1Var);
            }
        }
    }

    public final void d(q0 q0Var) {
        if (this.f17006b) {
            return;
        }
        q0Var.N(this.f17005a, 0, 10);
        q0Var.t();
        byte[] bArr = this.f17005a;
        int i8 = p.f12685g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f17006b = true;
        }
    }
}

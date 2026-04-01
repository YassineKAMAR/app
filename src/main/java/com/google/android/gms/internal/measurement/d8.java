package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class d8 extends e8 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f18644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f18648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f18650k;

    private d8(byte[] bArr, int i8, int i9, boolean z7) {
        super();
        this.f18650k = Integer.MAX_VALUE;
        this.f18644e = bArr;
        this.f18646g = i9 + i8;
        this.f18648i = i8;
        this.f18649j = i8;
        this.f18645f = z7;
    }

    private final void f() {
        int i8 = this.f18646g + this.f18647h;
        this.f18646g = i8;
        int i9 = i8 - this.f18649j;
        int i10 = this.f18650k;
        if (i9 <= i10) {
            this.f18647h = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f18647h = i11;
        this.f18646g = i8 - i11;
    }

    @Override // com.google.android.gms.internal.measurement.e8
    public final int a(int i8) throws k9 {
        if (i8 < 0) {
            throw k9.d();
        }
        int iD = i8 + d();
        if (iD < 0) {
            throw k9.e();
        }
        int i9 = this.f18650k;
        if (iD > i9) {
            throw k9.f();
        }
        this.f18650k = iD;
        f();
        return i9;
    }

    @Override // com.google.android.gms.internal.measurement.e8
    public final int d() {
        return this.f18648i - this.f18649j;
    }
}

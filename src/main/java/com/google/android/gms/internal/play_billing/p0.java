package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class p0 extends r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f19652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19655e;

    /* synthetic */ p0(byte[] bArr, int i8, int i9, boolean z7, o0 o0Var) {
        super(null);
        this.f19655e = Integer.MAX_VALUE;
        this.f19652b = bArr;
        this.f19653c = 0;
    }

    public final int c(int i8) {
        int i9 = this.f19655e;
        this.f19655e = 0;
        int i10 = this.f19653c + this.f19654d;
        this.f19653c = i10;
        if (i10 > 0) {
            this.f19654d = i10;
            this.f19653c = i10 - i10;
        } else {
            this.f19654d = 0;
        }
        return i9;
    }
}

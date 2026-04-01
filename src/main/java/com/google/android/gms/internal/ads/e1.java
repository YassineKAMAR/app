package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public class e1 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0 f7088a;

    public e1(q0 q0Var) {
        this.f7088a = q0Var;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void F(int i8) throws EOFException, InterruptedIOException {
        ((f0) this.f7088a).c(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final int G(int i8) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) {
        return this.f7088a.H(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void I(int i8) throws EOFException, InterruptedIOException {
        ((f0) this.f7088a).d(i8, false);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final boolean J(byte[] bArr, int i8, int i9, boolean z7) {
        return this.f7088a.J(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final int K(byte[] bArr, int i8, int i9) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final boolean L(byte[] bArr, int i8, int i9, boolean z7) {
        return this.f7088a.L(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void M(byte[] bArr, int i8, int i9) throws EOFException, InterruptedIOException {
        ((f0) this.f7088a).J(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void N(byte[] bArr, int i8, int i9) {
        ((f0) this.f7088a).L(bArr, i8, i9, false);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public long m() {
        return this.f7088a.m();
    }

    @Override // com.google.android.gms.internal.ads.q0
    public long n() {
        return this.f7088a.n();
    }

    @Override // com.google.android.gms.internal.ads.q0
    public long p() {
        return this.f7088a.p();
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final void t() {
        this.f7088a.t();
    }
}

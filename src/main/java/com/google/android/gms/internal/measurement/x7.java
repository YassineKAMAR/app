package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h8 f19381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f19382b;

    private x7(int i8) {
        byte[] bArr = new byte[i8];
        this.f19382b = bArr;
        this.f19381a = h8.H(bArr);
    }

    public final o7 a() {
        this.f19381a.I();
        return new y7(this.f19382b);
    }

    public final h8 b() {
        return this.f19381a;
    }
}

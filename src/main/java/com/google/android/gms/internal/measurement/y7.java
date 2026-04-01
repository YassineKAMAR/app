package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class y7 extends z7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final byte[] f19401e;

    y7(byte[] bArr) {
        bArr.getClass();
        this.f19401e = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final boolean C() {
        int iE = E();
        return kc.f(this.f19401e, iE, y() + iE);
    }

    @Override // com.google.android.gms.internal.measurement.z7
    final boolean D(o7 o7Var, int i8, int i9) {
        if (i9 > o7Var.y()) {
            throw new IllegalArgumentException("Length too large: " + i9 + y());
        }
        if (i9 > o7Var.y()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i9 + ", " + o7Var.y());
        }
        if (!(o7Var instanceof y7)) {
            return o7Var.n(0, i9).equals(n(0, i9));
        }
        y7 y7Var = (y7) o7Var;
        byte[] bArr = this.f19401e;
        byte[] bArr2 = y7Var.f19401e;
        int iE = E() + i9;
        int iE2 = E();
        int iE3 = y7Var.E();
        while (iE2 < iE) {
            if (bArr[iE2] != bArr2[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    protected int E() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public byte a(int i8) {
        return this.f19401e[i8];
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o7) || y() != ((o7) obj).y()) {
            return false;
        }
        if (y() == 0) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return obj.equals(this);
        }
        y7 y7Var = (y7) obj;
        int iE = e();
        int iE2 = y7Var.e();
        if (iE == 0 || iE2 == 0 || iE == iE2) {
            return D(y7Var, 0, y());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final o7 n(int i8, int i9) {
        int i10 = o7.i(0, i9, y());
        return i10 == 0 ? o7.f19004b : new s7(this.f19401e, E(), i10);
    }

    @Override // com.google.android.gms.internal.measurement.o7
    protected final String v(Charset charset) {
        return new String(this.f19401e, E(), y(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.o7
    final void w(p7 p7Var) {
        p7Var.a(this.f19401e, E(), y());
    }

    @Override // com.google.android.gms.internal.measurement.o7
    byte x(int i8) {
        return this.f19401e[i8];
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public int y() {
        return this.f19401e.length;
    }

    @Override // com.google.android.gms.internal.measurement.o7
    protected final int z(int i8, int i9, int i10) {
        return a9.a(i8, this.f19401e, E(), i10);
    }
}

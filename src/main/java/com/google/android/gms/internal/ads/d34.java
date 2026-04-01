package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class d34 extends rz3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int[] f6558j = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rz3 f6560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rz3 f6561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f6562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f6563i;

    private d34(rz3 rz3Var, rz3 rz3Var2) {
        this.f6560f = rz3Var;
        this.f6561g = rz3Var2;
        int iN = rz3Var.n();
        this.f6562h = iN;
        this.f6559e = iN + rz3Var2.n();
        this.f6563i = Math.max(rz3Var.u(), rz3Var2.u()) + 1;
    }

    static rz3 R(rz3 rz3Var, rz3 rz3Var2) {
        if (rz3Var2.n() == 0) {
            return rz3Var;
        }
        if (rz3Var.n() == 0) {
            return rz3Var2;
        }
        int iN = rz3Var.n() + rz3Var2.n();
        if (iN < 128) {
            return T(rz3Var, rz3Var2);
        }
        if (rz3Var instanceof d34) {
            d34 d34Var = (d34) rz3Var;
            if (d34Var.f6561g.n() + rz3Var2.n() < 128) {
                return new d34(d34Var.f6560f, T(d34Var.f6561g, rz3Var2));
            }
            if (d34Var.f6560f.u() > d34Var.f6561g.u() && d34Var.f6563i > rz3Var2.u()) {
                return new d34(d34Var.f6560f, new d34(d34Var.f6561g, rz3Var2));
            }
        }
        return iN >= U(Math.max(rz3Var.u(), rz3Var2.u()) + 1) ? new d34(rz3Var, rz3Var2) : y24.a(new y24(null), rz3Var, rz3Var2);
    }

    private static rz3 T(rz3 rz3Var, rz3 rz3Var2) {
        int iN = rz3Var.n();
        int iN2 = rz3Var2.n();
        byte[] bArr = new byte[iN + iN2];
        rz3Var.P(bArr, 0, 0, iN);
        rz3Var2.P(bArr, 0, iN, iN2);
        return new nz3(bArr);
    }

    static int U(int i8) {
        int[] iArr = f6558j;
        int length = iArr.length;
        if (i8 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i8];
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final String A(Charset charset) {
        return new String(a(), charset);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    final void C(gz3 gz3Var) {
        this.f6560f.C(gz3Var);
        this.f6561g.C(gz3Var);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final boolean D() {
        rz3 rz3Var = this.f6560f;
        rz3 rz3Var2 = this.f6561g;
        return rz3Var2.x(rz3Var.x(0, 0, this.f6562h), 0, rz3Var2.n()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.rz3
    /* JADX INFO: renamed from: I */
    public final lz3 iterator() {
        return new w24(this);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final byte e(int i8) {
        rz3.O(i8, this.f6559e);
        return g(i8);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rz3)) {
            return false;
        }
        rz3 rz3Var = (rz3) obj;
        if (this.f6559e != rz3Var.n()) {
            return false;
        }
        if (this.f6559e == 0) {
            return true;
        }
        int iH = H();
        int iH2 = rz3Var.H();
        if (iH != 0 && iH2 != 0 && iH != iH2) {
            return false;
        }
        z24 z24Var = null;
        a34 a34Var = new a34(this, z24Var);
        mz3 mz3VarA = a34Var.next();
        a34 a34Var2 = new a34(rz3Var, z24Var);
        mz3 mz3VarA2 = a34Var2.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int iN = mz3VarA.n() - i8;
            int iN2 = mz3VarA2.n() - i9;
            int iMin = Math.min(iN, iN2);
            if (!(i8 == 0 ? mz3VarA.Q(mz3VarA2, i9, iMin) : mz3VarA2.Q(mz3VarA, i8, iMin))) {
                return false;
            }
            i10 += iMin;
            int i11 = this.f6559e;
            if (i10 >= i11) {
                if (i10 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iN) {
                mz3VarA = a34Var.next();
                i8 = 0;
            } else {
                i8 += iMin;
                mz3VarA = mz3VarA;
            }
            if (iMin == iN2) {
                mz3VarA2 = a34Var2.next();
                i9 = 0;
            } else {
                i9 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rz3
    final byte g(int i8) {
        int i9 = this.f6562h;
        return i8 < i9 ? this.f6560f.g(i8) : this.f6561g.g(i8 - i9);
    }

    @Override // com.google.android.gms.internal.ads.rz3, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new w24(this);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final int n() {
        return this.f6559e;
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final void p(byte[] bArr, int i8, int i9, int i10) {
        int i11 = i8 + i10;
        int i12 = this.f6562h;
        if (i11 <= i12) {
            this.f6560f.p(bArr, i8, i9, i10);
        } else {
            if (i8 >= i12) {
                this.f6561g.p(bArr, i8 - i12, i9, i10);
                return;
            }
            int i13 = i12 - i8;
            this.f6560f.p(bArr, i8, i9, i13);
            this.f6561g.p(bArr, 0, i9 + i13, i10 - i13);
        }
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final int u() {
        return this.f6563i;
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final boolean v() {
        return this.f6559e >= U(this.f6563i);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final int w(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f6562h;
        if (i11 <= i12) {
            return this.f6560f.w(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f6561g.w(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f6561g.w(this.f6560f.w(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    protected final int x(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f6562h;
        if (i11 <= i12) {
            return this.f6560f.x(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f6561g.x(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f6561g.x(this.f6560f.x(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final rz3 y(int i8, int i9) {
        int iE = rz3.E(i8, i9, this.f6559e);
        if (iE == 0) {
            return rz3.f14393b;
        }
        if (iE == this.f6559e) {
            return this;
        }
        int i10 = this.f6562h;
        if (i9 <= i10) {
            return this.f6560f.y(i8, i9);
        }
        if (i8 >= i10) {
            return this.f6561g.y(i8 - i10, i9 - i10);
        }
        rz3 rz3Var = this.f6560f;
        return new d34(rz3Var.y(i8, rz3Var.n()), this.f6561g.y(0, i9 - this.f6562h));
    }

    @Override // com.google.android.gms.internal.ads.rz3
    public final zz3 z() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte b8 = 0;
        a34 a34Var = new a34(this, null);
        while (a34Var.hasNext()) {
            arrayList.add(a34Var.next().B());
        }
        int i8 = zz3.f18529e;
        int i9 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i9 = byteBuffer.hasArray() ? i9 | 1 : byteBuffer.isDirect() ? i9 | 2 : i9 | 4;
        }
        return i9 == 2 ? new vz3(arrayList, iRemaining, true, b8 == true ? 1 : 0) : zz3.g(new n14(arrayList), 4096);
    }
}

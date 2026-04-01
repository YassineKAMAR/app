package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class rz3 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rz3 f14393b = new nz3(k14.f9887d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator f14394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final qz3 f14395d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14396a = 0;

    static {
        int i8 = cz3.f6517a;
        f14395d = new qz3(null);
        f14394c = new iz3();
    }

    rz3() {
    }

    static int E(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
        }
        throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
    }

    public static oz3 J() {
        return new oz3(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rz3 K(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f14393b : i(iterable.iterator(), size);
    }

    public static rz3 L(byte[] bArr, int i8, int i9) {
        E(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new nz3(bArr2);
    }

    public static rz3 M(String str) {
        return new nz3(str.getBytes(k14.f9885b));
    }

    static void O(int i8, int i9) {
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
    }

    private static rz3 i(Iterator it, int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i8)));
        }
        if (i8 == 1) {
            return (rz3) it.next();
        }
        int i9 = i8 >>> 1;
        rz3 rz3VarI = i(it, i9);
        rz3 rz3VarI2 = i(it, i8 - i9);
        if (Integer.MAX_VALUE - rz3VarI.n() >= rz3VarI2.n()) {
            return d34.R(rz3VarI, rz3VarI2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + rz3VarI.n() + "+" + rz3VarI2.n());
    }

    protected abstract String A(Charset charset);

    public abstract ByteBuffer B();

    abstract void C(gz3 gz3Var);

    public abstract boolean D();

    protected final int H() {
        return this.f14396a;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public lz3 iterator() {
        return new hz3(this);
    }

    public final String N(Charset charset) {
        return n() == 0 ? "" : A(charset);
    }

    @Deprecated
    public final void P(byte[] bArr, int i8, int i9, int i10) {
        E(0, i10, n());
        E(i9, i9 + i10, bArr.length);
        if (i10 > 0) {
            p(bArr, 0, i9, i10);
        }
    }

    public final byte[] a() {
        int iN = n();
        if (iN == 0) {
            return k14.f9887d;
        }
        byte[] bArr = new byte[iN];
        p(bArr, 0, 0, iN);
        return bArr;
    }

    public abstract byte e(int i8);

    public abstract boolean equals(Object obj);

    abstract byte g(int i8);

    public final int hashCode() {
        int iW = this.f14396a;
        if (iW == 0) {
            int iN = n();
            iW = w(iN, 0, iN);
            if (iW == 0) {
                iW = 1;
            }
            this.f14396a = iW;
        }
        return iW;
    }

    public abstract int n();

    protected abstract void p(byte[] bArr, int i8, int i9, int i10);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(n());
        objArr[2] = n() <= 50 ? t34.a(this) : t34.a(y(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    protected abstract int u();

    protected abstract boolean v();

    protected abstract int w(int i8, int i9, int i10);

    protected abstract int x(int i8, int i9, int i10);

    public abstract rz3 y(int i8, int i9);

    public abstract zz3 z();
}

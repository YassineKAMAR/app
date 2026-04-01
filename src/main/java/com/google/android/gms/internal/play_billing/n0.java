package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f19633b = new k0(s1.f19671d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator f19634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m0 f19635d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19636a = 0;

    static {
        int i8 = z.f19745a;
        f19635d = new m0(null);
        f19634c = new f0();
    }

    n0() {
    }

    static int w(int i8, int i9, int i10) {
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

    public static n0 y(byte[] bArr, int i8, int i9) {
        w(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new k0(bArr2);
    }

    public abstract byte a(int i8);

    abstract byte e(int i8);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public final int hashCode() {
        int i8 = this.f19636a;
        if (i8 == 0) {
            int iG = g();
            i8 = i(iG, 0, iG);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f19636a = i8;
        }
        return i8;
    }

    protected abstract int i(int i8, int i9, int i10);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new e0(this);
    }

    public abstract n0 n(int i8, int i9);

    protected abstract String p(Charset charset);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(g());
        objArr[2] = g() <= 50 ? r3.a(this) : r3.a(n(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    abstract void u(d0 d0Var);

    public abstract boolean v();

    protected final int x() {
        return this.f19636a;
    }

    public final String z(Charset charset) {
        return g() == 0 ? "" : p(charset);
    }
}

package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class o7 implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7 f19004b = new y7(a9.f18548d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v7 f19005c = new b8();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<o7> f19006d = new q7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19007a = 0;

    o7() {
    }

    static x7 A(int i8) {
        return new x7(i8);
    }

    static /* synthetic */ int g(byte b8) {
        return b8 & 255;
    }

    static int i(int i8, int i9, int i10) {
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

    public static o7 p(String str) {
        return new y7(str.getBytes(a9.f18546b));
    }

    public static o7 u(byte[] bArr, int i8, int i9) {
        i(i8, i8 + i9, bArr.length);
        return new y7(f19005c.H(bArr, i8, i9));
    }

    public final String B() {
        return y() == 0 ? "" : v(a9.f18546b);
    }

    public abstract boolean C();

    public abstract byte a(int i8);

    protected final int e() {
        return this.f19007a;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZ = this.f19007a;
        if (iZ == 0) {
            int iY = y();
            iZ = z(iY, 0, iY);
            if (iZ == 0) {
                iZ = 1;
            }
            this.f19007a = iZ;
        }
        return iZ;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new r7(this);
    }

    public abstract o7 n(int i8, int i9);

    public final String toString() {
        String strA;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(y());
        if (y() <= 50) {
            strA = yb.a(this);
        } else {
            strA = yb.a(n(0, 47)) + "...";
        }
        objArr[2] = strA;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    protected abstract String v(Charset charset);

    abstract void w(p7 p7Var);

    abstract byte x(int i8);

    public abstract int y();

    protected abstract int z(int i8, int i9, int i10);
}

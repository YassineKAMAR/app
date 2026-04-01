package e6;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {
    public static final int a(int i8, int i9) {
        return kotlin.jvm.internal.q.g(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j8, long j9) {
        return kotlin.jvm.internal.q.h(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
    }

    public static final String c(long j8) {
        return d(j8, 10);
    }

    public static final String d(long j8, int i8) {
        if (j8 >= 0) {
            String string = Long.toString(j8, w6.b.a(i8));
            kotlin.jvm.internal.q.e(string, "toString(this, checkRadix(radix))");
            return string;
        }
        long j9 = i8;
        long j10 = ((j8 >>> 1) / j9) << 1;
        long j11 = j8 - (j10 * j9);
        if (j11 >= j9) {
            j11 -= j9;
            j10++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j10, w6.b.a(i8));
        kotlin.jvm.internal.q.e(string2, "toString(this, checkRadix(radix))");
        sb.append(string2);
        String string3 = Long.toString(j11, w6.b.a(i8));
        kotlin.jvm.internal.q.e(string3, "toString(this, checkRadix(radix))");
        sb.append(string3);
        return sb.toString();
    }
}

package k6;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final int a(int i8, int i9, int i10) {
        return e(e(i8, i10) - e(i9, i10), i10);
    }

    private static final long b(long j8, long j9, long j10) {
        return f(f(j8, j10) - f(j9, j10), j10);
    }

    public static final int c(int i8, int i9, int i10) {
        if (i10 > 0) {
            return i8 >= i9 ? i9 : i9 - a(i9, i8, i10);
        }
        if (i10 < 0) {
            return i8 <= i9 ? i9 : i9 + a(i8, i9, -i10);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long d(long j8, long j9, long j10) {
        if (j10 > 0) {
            return j8 >= j9 ? j9 : j9 - b(j9, j8, j10);
        }
        if (j10 < 0) {
            return j8 <= j9 ? j9 : j9 + b(j8, j9, -j10);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int e(int i8, int i9) {
        int i10 = i8 % i9;
        return i10 >= 0 ? i10 : i10 + i9;
    }

    private static final long f(long j8, long j9) {
        long j10 = j8 % j9;
        return j10 >= 0 ? j10 : j10 + j9;
    }
}

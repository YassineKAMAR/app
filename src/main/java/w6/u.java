package w6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class u extends t {
    public static final Void h(String input) {
        kotlin.jvm.internal.q.f(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static Integer i(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        return j(str, 10);
    }

    public static final Integer j(String str, int i8) {
        boolean z7;
        int i9;
        kotlin.jvm.internal.q.f(str, "<this>");
        b.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        int i11 = -2147483647;
        int i12 = 1;
        if (kotlin.jvm.internal.q.g(cCharAt, 48) >= 0) {
            z7 = false;
            i12 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i11 = Integer.MIN_VALUE;
                z7 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z7 = false;
            }
        }
        int i13 = -59652323;
        while (i12 < length) {
            int iB = b.b(str.charAt(i12), i8);
            if (iB < 0) {
                return null;
            }
            if ((i10 < i13 && (i13 != -59652323 || i10 < (i13 = i11 / i8))) || (i9 = i10 * i8) < i11 + iB) {
                return null;
            }
            i10 = i9 - iB;
            i12++;
        }
        return z7 ? Integer.valueOf(i10) : Integer.valueOf(-i10);
    }

    public static Long k(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        return l(str, 10);
    }

    public static final Long l(String str, int i8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        b.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        long j8 = -9223372036854775807L;
        boolean z7 = true;
        if (kotlin.jvm.internal.q.g(cCharAt, 48) >= 0) {
            z7 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j8 = Long.MIN_VALUE;
                i9 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i9 = 1;
                z7 = false;
            }
        }
        long j9 = -256204778801521550L;
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i9 < length) {
            int iB = b.b(str.charAt(i9), i8);
            if (iB < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 == j9) {
                    j11 = j8 / ((long) i8);
                    if (j10 < j11) {
                    }
                }
                return null;
            }
            long j12 = j10 * ((long) i8);
            long j13 = iB;
            if (j12 < j8 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i9++;
            j9 = -256204778801521550L;
        }
        return z7 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }
}

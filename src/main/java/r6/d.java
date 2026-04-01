package r6;

import kotlin.jvm.internal.q;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final String a(Object from, Object until) {
        q.f(from, "from");
        q.f(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(long j8, long j9) {
        if (!(j9 > j8)) {
            throw new IllegalArgumentException(a(Long.valueOf(j8), Long.valueOf(j9)).toString());
        }
    }

    public static final int c(int i8) {
        return 31 - Integer.numberOfLeadingZeros(i8);
    }

    public static final long d(c cVar, i range) {
        q.f(cVar, "<this>");
        q.f(range, "range");
        if (!range.isEmpty()) {
            long jE = range.e();
            long jA = range.a();
            return jE < Long.MAX_VALUE ? cVar.e(jA, range.e() + 1) : jA > Long.MIN_VALUE ? cVar.e(range.a() - 1, range.e()) + 1 : cVar.d();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int e(int i8, int i9) {
        return (i8 >>> (32 - i9)) & ((-i9) >> 31);
    }
}

package t6;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.q;
import t6.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class l extends k {
    public static int b(int i8, int i9) {
        return i8 < i9 ? i9 : i8;
    }

    public static long c(long j8, long j9) {
        return j8 < j9 ? j9 : j8;
    }

    public static int d(int i8, int i9) {
        return i8 > i9 ? i9 : i8;
    }

    public static long e(long j8, long j9) {
        return j8 > j9 ? j9 : j8;
    }

    public static int f(int i8, int i9, int i10) {
        if (i9 <= i10) {
            return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i10 + " is less than minimum " + i9 + '.');
    }

    public static long g(long j8, long j9, long j10) {
        if (j9 <= j10) {
            return j8 < j9 ? j9 : j8 > j10 ? j10 : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j9 + '.');
    }

    public static d h(int i8, int i9) {
        return d.f26520d.a(i8, i9, -1);
    }

    public static long i(i iVar, r6.c random) {
        q.f(iVar, "<this>");
        q.f(random, "random");
        try {
            return r6.d.d(random, iVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static d j(d dVar, int i8) {
        q.f(dVar, "<this>");
        k.a(i8 > 0, Integer.valueOf(i8));
        d.a aVar = d.f26520d;
        int iA = dVar.a();
        int iE = dVar.e();
        if (dVar.g() <= 0) {
            i8 = -i8;
        }
        return aVar.a(iA, iE, i8);
    }

    public static f k(int i8, int i9) {
        return i9 <= Integer.MIN_VALUE ? f.f26528e.a() : new f(i8, i9 - 1);
    }
}

package f6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class j extends i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends kotlin.jvm.internal.r implements p6.a<Iterator<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ T[] f21807a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T[] tArr) {
            super(0);
            this.f21807a = tArr;
        }

        @Override // p6.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke() {
            return kotlin.jvm.internal.b.a(this.f21807a);
        }
    }

    public static <T> T A(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T, C extends Collection<? super T>> C B(T[] tArr, C destination) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        kotlin.jvm.internal.q.f(destination, "destination");
        for (T t7 : tArr) {
            destination.add(t7);
        }
        return destination;
    }

    public static <T> List<T> C(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? D(tArr) : n.b(tArr[0]) : o.d();
    }

    public static final <T> List<T> D(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        return new ArrayList(o.c(tArr));
    }

    public static final <T> Set<T> E(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) B(tArr, new LinkedHashSet(j0.b(tArr.length))) : o0.a(tArr[0]) : p0.b();
    }

    public static <T> Iterable<b0<T>> F(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        return new c0(new a(tArr));
    }

    public static boolean k(byte[] bArr, byte b8) {
        kotlin.jvm.internal.q.f(bArr, "<this>");
        return u(bArr, b8) >= 0;
    }

    public static boolean l(int[] iArr, int i8) {
        kotlin.jvm.internal.q.f(iArr, "<this>");
        return v(iArr, i8) >= 0;
    }

    public static boolean m(long[] jArr, long j8) {
        kotlin.jvm.internal.q.f(jArr, "<this>");
        return w(jArr, j8) >= 0;
    }

    public static final <T> boolean n(T[] tArr, T t7) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        return x(tArr, t7) >= 0;
    }

    public static boolean o(short[] sArr, short s8) {
        kotlin.jvm.internal.q.f(sArr, "<this>");
        return y(sArr, s8) >= 0;
    }

    public static final <T> List<T> p(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        return (List) q(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C q(T[] tArr, C destination) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        kotlin.jvm.internal.q.f(destination, "destination");
        for (T t7 : tArr) {
            if (t7 != null) {
                destination.add(t7);
            }
        }
        return destination;
    }

    public static int r(long[] jArr) {
        kotlin.jvm.internal.q.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final <T> int s(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T t(T[] tArr, int i8) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        if (i8 < 0 || i8 > s(tArr)) {
            return null;
        }
        return tArr[i8];
    }

    public static final int u(byte[] bArr, byte b8) {
        kotlin.jvm.internal.q.f(bArr, "<this>");
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (b8 == bArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static final int v(int[] iArr, int i8) {
        kotlin.jvm.internal.q.f(iArr, "<this>");
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (i8 == iArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public static final int w(long[] jArr, long j8) {
        kotlin.jvm.internal.q.f(jArr, "<this>");
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (j8 == jArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static <T> int x(T[] tArr, T t7) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        int i8 = 0;
        if (t7 == null) {
            int length = tArr.length;
            while (i8 < length) {
                if (tArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i8 < length2) {
            if (kotlin.jvm.internal.q.b(t7, tArr[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final int y(short[] sArr, short s8) {
        kotlin.jvm.internal.q.f(sArr, "<this>");
        int length = sArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (s8 == sArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static char z(char[] cArr) {
        kotlin.jvm.internal.q.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}

package d7;

import d7.o0;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class n0<T extends o0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f21042b = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f21043a;

    private final T[] f() {
        T[] tArr = this.f21043a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new o0[4];
            this.f21043a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, c() * 2);
        kotlin.jvm.internal.q.e(objArrCopyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((o0[]) objArrCopyOf);
        this.f21043a = tArr3;
        return tArr3;
    }

    private final void j(int i8) {
        f21042b.set(this, i8);
    }

    private final void k(int i8) {
        while (true) {
            int i9 = (i8 * 2) + 1;
            if (i9 >= c()) {
                return;
            }
            T[] tArr = this.f21043a;
            kotlin.jvm.internal.q.c(tArr);
            int i10 = i9 + 1;
            if (i10 < c()) {
                T t7 = tArr[i10];
                kotlin.jvm.internal.q.c(t7);
                T t8 = tArr[i9];
                kotlin.jvm.internal.q.c(t8);
                if (((Comparable) t7).compareTo(t8) < 0) {
                    i9 = i10;
                }
            }
            T t9 = tArr[i8];
            kotlin.jvm.internal.q.c(t9);
            T t10 = tArr[i9];
            kotlin.jvm.internal.q.c(t10);
            if (((Comparable) t9).compareTo(t10) <= 0) {
                return;
            }
            m(i8, i9);
            i8 = i9;
        }
    }

    private final void l(int i8) {
        while (i8 > 0) {
            T[] tArr = this.f21043a;
            kotlin.jvm.internal.q.c(tArr);
            int i9 = (i8 - 1) / 2;
            T t7 = tArr[i9];
            kotlin.jvm.internal.q.c(t7);
            T t8 = tArr[i8];
            kotlin.jvm.internal.q.c(t8);
            if (((Comparable) t7).compareTo(t8) <= 0) {
                return;
            }
            m(i8, i9);
            i8 = i9;
        }
    }

    private final void m(int i8, int i9) {
        T[] tArr = this.f21043a;
        kotlin.jvm.internal.q.c(tArr);
        T t7 = tArr[i9];
        kotlin.jvm.internal.q.c(t7);
        T t8 = tArr[i8];
        kotlin.jvm.internal.q.c(t8);
        tArr[i8] = t7;
        tArr[i9] = t8;
        t7.setIndex(i8);
        t8.setIndex(i9);
    }

    public final void a(T t7) {
        t7.e(this);
        o0[] o0VarArrF = f();
        int iC = c();
        j(iC + 1);
        o0VarArrF[iC] = t7;
        t7.setIndex(iC);
        l(iC);
    }

    public final T b() {
        T[] tArr = this.f21043a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f21042b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T t7;
        synchronized (this) {
            t7 = (T) b();
        }
        return t7;
    }

    public final boolean g(T t7) {
        boolean z7;
        synchronized (this) {
            if (t7.c() == null) {
                z7 = false;
            } else {
                h(t7.getIndex());
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T h(int r6) {
        /*
            r5 = this;
            T extends d7.o0 & java.lang.Comparable<? super T>[] r0 = r5.f21043a
            kotlin.jvm.internal.q.c(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.j(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.m(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.q.c(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.q.c(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m(r6, r1)
            r5.l(r1)
            goto L3d
        L3a:
            r5.k(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.q.c(r6)
            r1 = 0
            r6.e(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.n0.h(int):d7.o0");
    }

    public final T i() {
        T t7;
        synchronized (this) {
            t7 = c() > 0 ? (T) h(0) : null;
        }
        return t7;
    }
}

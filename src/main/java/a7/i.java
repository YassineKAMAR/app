package a7;

import d7.e0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class i<E> extends e0<i<E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b<E> f290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReferenceArray f291f;

    public i(long j8, i<E> iVar, b<E> bVar, int i8) {
        super(j8, iVar, i8);
        this.f290e = bVar;
        this.f291f = new AtomicReferenceArray(c.f264b * 2);
    }

    private final void z(int i8, Object obj) {
        this.f291f.lazySet(i8 * 2, obj);
    }

    public final void A(int i8, Object obj) {
        this.f291f.set((i8 * 2) + 1, obj);
    }

    public final void B(int i8, E e8) {
        z(i8, e8);
    }

    @Override // d7.e0
    public int n() {
        return c.f264b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = u().f252c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        d7.z.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // d7.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, h6.g r6) {
        /*
            r3 = this;
            int r5 = a7.c.f264b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof y6.f2
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof a7.p
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            d7.h0 r2 = a7.c.h()
            if (r1 == r2) goto L63
            d7.h0 r2 = a7.c.g()
            if (r1 != r2) goto L28
            goto L63
        L28:
            d7.h0 r2 = a7.c.n()
            if (r1 == r2) goto Le
            d7.h0 r2 = a7.c.o()
            if (r1 != r2) goto L35
            goto Le
        L35:
            d7.h0 r4 = a7.c.d()
            if (r1 == r4) goto L62
            d7.h0 r4 = a7.c.f266d
            if (r1 != r4) goto L40
            goto L62
        L40:
            d7.h0 r4 = a7.c.x()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            a7.b r4 = r3.u()
            p6.l<E, e6.i0> r4 = r4.f252c
            if (r4 == 0) goto L73
            d7.z.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            d7.h0 r2 = a7.c.h()
            goto L7f
        L7b:
            d7.h0 r2 = a7.c.g()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            a7.b r4 = r3.u()
            p6.l<E, e6.i0> r4 = r4.f252c
            if (r4 == 0) goto L9a
            d7.z.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.i.o(int, java.lang.Throwable, h6.g):void");
    }

    public final boolean r(int i8, Object obj, Object obj2) {
        return h.a(this.f291f, (i8 * 2) + 1, obj, obj2);
    }

    public final void s(int i8) {
        z(i8, null);
    }

    public final Object t(int i8, Object obj) {
        return this.f291f.getAndSet((i8 * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f290e;
        q.c(bVar);
        return bVar;
    }

    public final E v(int i8) {
        return (E) this.f291f.get(i8 * 2);
    }

    public final Object w(int i8) {
        return this.f291f.get((i8 * 2) + 1);
    }

    public final void x(int i8, boolean z7) {
        if (z7) {
            u().k0((this.f21017c * ((long) c.f264b)) + ((long) i8));
        }
        p();
    }

    public final E y(int i8) {
        E eV = v(i8);
        s(i8);
        return eV;
    }
}

package d7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21057a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21058b = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21059c = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends d7.b<s> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f21060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s f21061c;

        public a(s sVar) {
            this.f21060b = sVar;
        }

        @Override // d7.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(s sVar, Object obj) {
            boolean z7 = obj == null;
            s sVar2 = z7 ? this.f21060b : this.f21061c;
            if (sVar2 != null && androidx.concurrent.futures.b.a(s.f21057a, sVar, this, sVar2) && z7) {
                s sVar3 = this.f21060b;
                s sVar4 = this.f21061c;
                kotlin.jvm.internal.q.c(sVar4);
                sVar3.j(sVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((d7.b0) r5).f21010a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final d7.s h(d7.a0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = d7.s.f21058b
            java.lang.Object r0 = r0.get(r8)
            d7.s r0 = (d7.s) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = d7.s.f21057a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = d7.s.f21058b
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.n()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof d7.a0
            if (r6 == 0) goto L34
            d7.a0 r5 = (d7.a0) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof d7.b0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            d7.b0 r5 = (d7.b0) r5
            d7.s r5 = r5.f21010a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = d7.s.f21058b
            java.lang.Object r2 = r4.get(r2)
            d7.s r2 = (d7.s) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.q.d(r5, r3)
            r3 = r5
            d7.s r3 = (d7.s) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.s.h(d7.a0):d7.s");
    }

    private final s i(s sVar) {
        while (sVar.n()) {
            sVar = (s) f21058b.get(sVar);
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(s sVar) {
        s sVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21058b;
        do {
            sVar2 = (s) atomicReferenceFieldUpdater.get(sVar);
            if (k() != sVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f21058b, sVar, sVar2, this));
        if (n()) {
            sVar.h(null);
        }
    }

    private final b0 q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21059c;
        b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this);
        atomicReferenceFieldUpdater.lazySet(this, b0Var2);
        return b0Var2;
    }

    public final boolean g(s sVar) {
        f21058b.lazySet(sVar, this);
        f21057a.lazySet(sVar, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f21057a, this, this, sVar)) {
                sVar.j(this);
                return true;
            }
        }
        return false;
    }

    public final Object k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21057a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof a0)) {
                return obj;
            }
            ((a0) obj).a(this);
        }
    }

    public final s l() {
        return r.b(k());
    }

    public final s m() {
        s sVarH = h(null);
        return sVarH == null ? i((s) f21058b.get(this)) : sVarH;
    }

    public boolean n() {
        return k() instanceof b0;
    }

    public boolean o() {
        return p() == null;
    }

    public final s p() {
        Object objK;
        s sVar;
        do {
            objK = k();
            if (objK instanceof b0) {
                return ((b0) objK).f21010a;
            }
            if (objK == this) {
                return (s) objK;
            }
            kotlin.jvm.internal.q.d(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            sVar = (s) objK;
        } while (!androidx.concurrent.futures.b.a(f21057a, this, objK, sVar.q()));
        sVar.h(null);
        return null;
    }

    public final int r(s sVar, s sVar2, a aVar) {
        f21058b.lazySet(sVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21057a;
        atomicReferenceFieldUpdater.lazySet(sVar, sVar2);
        aVar.f21061c = sVar2;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, sVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new kotlin.jvm.internal.v(this) { // from class: d7.s.b
            @Override // u6.g
            public Object get() {
                return y6.i0.a(this.receiver);
            }
        } + '@' + y6.i0.b(this);
    }
}

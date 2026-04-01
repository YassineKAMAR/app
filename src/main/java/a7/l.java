package a7;

import d7.q0;
import e6.i0;
import kotlin.jvm.internal.z;
import y6.f2;

/* JADX INFO: loaded from: classes2.dex */
public class l<E> extends b<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f293o;

    public l(int i8, a aVar, p6.l<? super E, i0> lVar) {
        super(i8, lVar);
        this.f292n = i8;
        this.f293o = aVar;
        if (!(aVar != a.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + z.b(b.class).b() + " instead").toString());
        }
        if (i8 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i8 + " was specified").toString());
    }

    private final Object l0(E e8, boolean z7) {
        p6.l<E, i0> lVar;
        q0 q0VarD;
        Object objA = super.a(e8);
        if (g.g(objA) || g.f(objA)) {
            return objA;
        }
        if (!z7 || (lVar = this.f252c) == null || (q0VarD = d7.z.d(lVar, e8, null, 2, null)) == null) {
            return g.f286b.c(i0.f21430a);
        }
        throw q0VarD;
    }

    private final Object m0(E e8) {
        i iVar;
        Object obj = c.f266d;
        i iVar2 = (i) b.f246i.get(this);
        while (true) {
            long andIncrement = b.f242e.getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean zM = M(andIncrement);
            int i8 = c.f264b;
            long j9 = j8 / ((long) i8);
            int i9 = (int) (j8 % ((long) i8));
            if (iVar2.f21017c != j9) {
                i iVarX = x(j9, iVar2);
                if (iVarX != null) {
                    iVar = iVarX;
                } else if (zM) {
                    return g.f286b.a(C());
                }
            } else {
                iVar = iVar2;
            }
            int iG0 = g0(iVar, i9, e8, j8, obj, zM);
            if (iG0 == 0) {
                iVar.b();
                return g.f286b.c(i0.f21430a);
            }
            if (iG0 == 1) {
                return g.f286b.c(i0.f21430a);
            }
            if (iG0 == 2) {
                if (zM) {
                    iVar.p();
                    return g.f286b.a(C());
                }
                f2 f2Var = obj instanceof f2 ? (f2) obj : null;
                if (f2Var != null) {
                    U(f2Var, iVar, i9);
                }
                t((iVar.f21017c * ((long) i8)) + ((long) i9));
                return g.f286b.c(i0.f21430a);
            }
            if (iG0 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iG0 == 4) {
                if (j8 < B()) {
                    iVar.b();
                }
                return g.f286b.a(C());
            }
            if (iG0 == 5) {
                iVar.b();
            }
            iVar2 = iVar;
        }
    }

    private final Object n0(E e8, boolean z7) {
        return this.f293o == a.DROP_LATEST ? l0(e8, z7) : m0(e8);
    }

    @Override // a7.b
    protected boolean N() {
        return this.f293o == a.DROP_OLDEST;
    }

    @Override // a7.b, a7.o
    public Object a(E e8) {
        return n0(e8, false);
    }
}

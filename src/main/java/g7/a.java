package g7;

import d7.e0;
import e6.i0;
import f6.n;
import f6.w;
import h6.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.l;
import p6.q;
import y6.f2;
import y6.h;
import y6.j;
import y6.t0;

/* JADX INFO: loaded from: classes2.dex */
public class a<R> extends h implements b, f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f22054f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f22055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<a<R>.C0113a> f22056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f22057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f22059e;
    private volatile Object state;

    /* JADX INFO: renamed from: g7.a$a, reason: collision with other inner class name */
    public final class C0113a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f22060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f22061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<b<?>, Object, Object, l<Throwable, i0>> f22062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f22063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<R> f22065f;

        public final l<Throwable, i0> a(b<?> bVar, Object obj) {
            q<b<?>, Object, Object, l<Throwable, i0>> qVar = this.f22062c;
            if (qVar != null) {
                return qVar.invoke(bVar, this.f22061b, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f22063d;
            a<R> aVar = this.f22065f;
            if (obj instanceof e0) {
                ((e0) obj).o(this.f22064e, null, aVar.getContext());
                return;
            }
            t0 t0Var = obj instanceof t0 ? (t0) obj : null;
            if (t0Var != null) {
                t0Var.a();
            }
        }
    }

    private final a<R>.C0113a d(Object obj) {
        List<a<R>.C0113a> list = this.f22056b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C0113a) next).f22060a == obj) {
                obj2 = next;
                break;
            }
        }
        a<R>.C0113a c0113a = (C0113a) obj2;
        if (c0113a != null) {
            return c0113a;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int f(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22054f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof j) {
                a<R>.C0113a c0113aD = d(obj);
                if (c0113aD == null) {
                    continue;
                } else {
                    l<Throwable, i0> lVarA = c0113aD.a(this, obj2);
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, c0113aD)) {
                        this.f22059e = obj2;
                        if (c.h((j) obj3, lVarA)) {
                            return 0;
                        }
                        this.f22059e = null;
                        return 2;
                    }
                }
            } else {
                if (kotlin.jvm.internal.q.b(obj3, c.f22068c) ? true : obj3 instanceof C0113a) {
                    return 3;
                }
                if (kotlin.jvm.internal.q.b(obj3, c.f22069d)) {
                    return 2;
                }
                if (kotlin.jvm.internal.q.b(obj3, c.f22067b)) {
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, n.b(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, w.L((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // g7.b
    public boolean a(Object obj, Object obj2) {
        return f(obj, obj2) == 0;
    }

    @Override // y6.i
    public void b(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22054f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == c.f22068c) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, c.f22069d));
        List<a<R>.C0113a> list = this.f22056b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C0113a) it.next()).b();
        }
        this.f22059e = c.f22070e;
        this.f22056b = null;
    }

    @Override // y6.f2
    public void c(e0<?> e0Var, int i8) {
        this.f22057c = e0Var;
        this.f22058d = i8;
    }

    public final d e(Object obj, Object obj2) {
        return c.a(f(obj, obj2));
    }

    @Override // g7.b
    public g getContext() {
        return this.f22055a;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
        b(th);
        return i0.f21430a;
    }
}

package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f2659j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m.a<h, b> f2661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d.b f2662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference<i> f2663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<d.b> f2667i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final d.b a(d.b state1, d.b bVar) {
            kotlin.jvm.internal.q.f(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d.b f2668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f2669b;

        public b(h hVar, d.b initialState) {
            kotlin.jvm.internal.q.f(initialState, "initialState");
            kotlin.jvm.internal.q.c(hVar);
            this.f2669b = m.f(hVar);
            this.f2668a = initialState;
        }

        public final void a(i iVar, d.a event) {
            kotlin.jvm.internal.q.f(event, "event");
            d.b bVarC = event.c();
            this.f2668a = j.f2659j.a(this.f2668a, bVarC);
            g gVar = this.f2669b;
            kotlin.jvm.internal.q.c(iVar);
            gVar.a(iVar, event);
            this.f2668a = bVarC;
        }

        public final d.b b() {
            return this.f2668a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(i provider) {
        this(provider, true);
        kotlin.jvm.internal.q.f(provider, "provider");
    }

    private j(i iVar, boolean z7) {
        this.f2660b = z7;
        this.f2661c = new m.a<>();
        this.f2662d = d.b.INITIALIZED;
        this.f2667i = new ArrayList<>();
        this.f2663e = new WeakReference<>(iVar);
    }

    private final void d(i iVar) {
        Iterator<Map.Entry<h, b>> itDescendingIterator = this.f2661c.descendingIterator();
        kotlin.jvm.internal.q.e(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f2666h) {
            Map.Entry<h, b> next = itDescendingIterator.next();
            kotlin.jvm.internal.q.e(next, "next()");
            h key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.f2662d) > 0 && !this.f2666h && this.f2661c.contains(key)) {
                d.a aVarA = d.a.Companion.a(value.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.b());
                }
                m(aVarA.c());
                value.a(iVar, aVarA);
                l();
            }
        }
    }

    private final d.b e(h hVar) {
        b value;
        Map.Entry<h, b> entryV = this.f2661c.v(hVar);
        d.b bVar = null;
        d.b bVarB = (entryV == null || (value = entryV.getValue()) == null) ? null : value.b();
        if (!this.f2667i.isEmpty()) {
            bVar = this.f2667i.get(r0.size() - 1);
        }
        a aVar = f2659j;
        return aVar.a(aVar.a(this.f2662d, bVarB), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    private final void f(String str) {
        if (!this.f2660b || l.c.g().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(i iVar) {
        m.b<h, b>.d dVarG = this.f2661c.g();
        kotlin.jvm.internal.q.e(dVarG, "observerMap.iteratorWithAdditions()");
        while (dVarG.hasNext() && !this.f2666h) {
            Map.Entry next = dVarG.next();
            h hVar = (h) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f2662d) < 0 && !this.f2666h && this.f2661c.contains(hVar)) {
                m(bVar.b());
                d.a aVarB = d.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(iVar, aVarB);
                l();
            }
        }
    }

    private final boolean i() {
        if (this.f2661c.size() == 0) {
            return true;
        }
        Map.Entry<h, b> entryA = this.f2661c.a();
        kotlin.jvm.internal.q.c(entryA);
        d.b bVarB = entryA.getValue().b();
        Map.Entry<h, b> entryI = this.f2661c.i();
        kotlin.jvm.internal.q.c(entryI);
        d.b bVarB2 = entryI.getValue().b();
        return bVarB == bVarB2 && this.f2662d == bVarB2;
    }

    private final void k(d.b bVar) {
        d.b bVar2 = this.f2662d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == d.b.INITIALIZED && bVar == d.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f2662d + " in component " + this.f2663e.get()).toString());
        }
        this.f2662d = bVar;
        if (this.f2665g || this.f2664f != 0) {
            this.f2666h = true;
            return;
        }
        this.f2665g = true;
        o();
        this.f2665g = false;
        if (this.f2662d == d.b.DESTROYED) {
            this.f2661c = new m.a<>();
        }
    }

    private final void l() {
        this.f2667i.remove(r0.size() - 1);
    }

    private final void m(d.b bVar) {
        this.f2667i.add(bVar);
    }

    private final void o() {
        i iVar = this.f2663e.get();
        if (iVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.f2666h = false;
            if (zI) {
                return;
            }
            d.b bVar = this.f2662d;
            Map.Entry<h, b> entryA = this.f2661c.a();
            kotlin.jvm.internal.q.c(entryA);
            if (bVar.compareTo(entryA.getValue().b()) < 0) {
                d(iVar);
            }
            Map.Entry<h, b> entryI = this.f2661c.i();
            if (!this.f2666h && entryI != null && this.f2662d.compareTo(entryI.getValue().b()) > 0) {
                g(iVar);
            }
        }
    }

    @Override // androidx.lifecycle.d
    public void a(h observer) {
        i iVar;
        kotlin.jvm.internal.q.f(observer, "observer");
        f("addObserver");
        d.b bVar = this.f2662d;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.f2661c.p(observer, bVar3) == null && (iVar = this.f2663e.get()) != null) {
            boolean z7 = this.f2664f != 0 || this.f2665g;
            d.b bVarE = e(observer);
            this.f2664f++;
            while (bVar3.b().compareTo(bVarE) < 0 && this.f2661c.contains(observer)) {
                m(bVar3.b());
                d.a aVarB = d.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(iVar, aVarB);
                l();
                bVarE = e(observer);
            }
            if (!z7) {
                o();
            }
            this.f2664f--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.b b() {
        return this.f2662d;
    }

    @Override // androidx.lifecycle.d
    public void c(h observer) {
        kotlin.jvm.internal.q.f(observer, "observer");
        f("removeObserver");
        this.f2661c.u(observer);
    }

    public void h(d.a event) {
        kotlin.jvm.internal.q.f(event, "event");
        f("handleLifecycleEvent");
        k(event.c());
    }

    public void j(d.b state) {
        kotlin.jvm.internal.q.f(state, "state");
        f("markState");
        n(state);
    }

    public void n(d.b state) {
        kotlin.jvm.internal.q.f(state, "state");
        f("setCurrentState");
        k(state);
    }
}

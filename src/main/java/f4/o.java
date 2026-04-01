package f4;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import f4.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class o implements e, h4.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final o4.b<Set<Object>> f21749i = new o4.b() { // from class: f4.l
        @Override // o4.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<c<?>, o4.b<?>> f21750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<e0<?>, o4.b<?>> f21751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<e0<?>, y<?>> f21752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<o4.b<ComponentRegistrar>> f21753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f21754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f21755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<Boolean> f21756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f21757h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f21758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<o4.b<ComponentRegistrar>> f21759b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<c<?>> f21760c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j f21761d = j.f21742a;

        b(Executor executor) {
            this.f21758a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f21760c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f21759b.add(new o4.b() { // from class: f4.p
                @Override // o4.b
                public final Object get() {
                    return o.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection<o4.b<ComponentRegistrar>> collection) {
            this.f21759b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f21758a, this.f21759b, this.f21760c, this.f21761d);
        }

        public b g(j jVar) {
            this.f21761d = jVar;
            return this;
        }
    }

    private o(Executor executor, Iterable<o4.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, j jVar) {
        this.f21750a = new HashMap();
        this.f21751b = new HashMap();
        this.f21752c = new HashMap();
        this.f21754e = new HashSet();
        this.f21756g = new AtomicReference<>();
        v vVar = new v(executor);
        this.f21755f = vVar;
        this.f21757h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(vVar, v.class, m4.d.class, m4.c.class));
        arrayList.add(c.s(this, h4.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f21753d = o(iterable);
        l(arrayList);
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<o4.b<ComponentRegistrar>> it = this.f21753d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f21757h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        Object obj = array[i8];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f21754e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f21754e.add(obj.toString());
                        }
                        i8++;
                    }
                }
            }
            if (this.f21750a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f21750a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f21750a.put(cVar, new x(new o4.b() { // from class: f4.k
                    @Override // o4.b
                    public final Object get() {
                        return this.f21743a.p(cVar);
                    }
                }));
            }
            arrayList.addAll(u(list));
            arrayList.addAll(v());
            t();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        s();
    }

    private void m(Map<c<?>, o4.b<?>> map, boolean z7) {
        for (Map.Entry<c<?>, o4.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            o4.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z7)) {
                value.get();
            }
        }
        this.f21755f.d();
    }

    private static <T> List<T> o(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(c cVar) {
        return cVar.h().a(new f0(cVar, this));
    }

    private void s() {
        Boolean bool = this.f21756g.get();
        if (bool != null) {
            m(this.f21750a, bool.booleanValue());
        }
    }

    private void t() {
        Map map;
        e0<?> e0VarB;
        o4.b bVarC;
        for (c<?> cVar : this.f21750a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.f() && !this.f21752c.containsKey(rVar.b())) {
                    map = this.f21752c;
                    e0VarB = rVar.b();
                    bVarC = y.b(Collections.emptySet());
                } else if (this.f21751b.containsKey(rVar.b())) {
                    continue;
                } else {
                    if (rVar.e()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", cVar, rVar.b()));
                    }
                    if (!rVar.f()) {
                        map = this.f21751b;
                        e0VarB = rVar.b();
                        bVarC = c0.c();
                    }
                }
                map.put(e0VarB, bVarC);
            }
        }
    }

    private List<Runnable> u(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final o4.b<?> bVar = this.f21750a.get(cVar);
                for (e0<? super Object> e0Var : cVar.j()) {
                    if (this.f21751b.containsKey(e0Var)) {
                        final c0 c0Var = (c0) this.f21751b.get(e0Var);
                        arrayList.add(new Runnable() { // from class: f4.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0Var.f(bVar);
                            }
                        });
                    } else {
                        this.f21751b.put(e0Var, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> v() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<c<?>, o4.b<?>> entry : this.f21750a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                o4.b<?> value = entry.getValue();
                for (e0<? super Object> e0Var : key.j()) {
                    if (!map.containsKey(e0Var)) {
                        map.put(e0Var, new HashSet());
                    }
                    ((Set) map.get(e0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f21752c.containsKey(entry2.getKey())) {
                final y<?> yVar = this.f21752c.get(entry2.getKey());
                for (final o4.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: f4.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            yVar.a(bVar);
                        }
                    });
                }
            } else {
                this.f21752c.put((e0) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // f4.e
    public /* synthetic */ Object a(Class cls) {
        return d.b(this, cls);
    }

    @Override // f4.e
    public synchronized <T> o4.b<T> b(e0<T> e0Var) {
        d0.c(e0Var, "Null interface requested.");
        return (o4.b) this.f21751b.get(e0Var);
    }

    @Override // f4.e
    public /* synthetic */ o4.b c(Class cls) {
        return d.c(this, cls);
    }

    @Override // f4.e
    public /* synthetic */ Set d(Class cls) {
        return d.e(this, cls);
    }

    @Override // f4.e
    public synchronized <T> o4.b<Set<T>> e(e0<T> e0Var) {
        y<?> yVar = this.f21752c.get(e0Var);
        if (yVar != null) {
            return yVar;
        }
        return (o4.b<Set<T>>) f21749i;
    }

    @Override // f4.e
    public /* synthetic */ Object f(e0 e0Var) {
        return d.a(this, e0Var);
    }

    @Override // f4.e
    public /* synthetic */ Set g(e0 e0Var) {
        return d.d(this, e0Var);
    }

    public void n(boolean z7) {
        HashMap map;
        if (com.amazon.a.a.l.d.a(this.f21756g, null, Boolean.valueOf(z7))) {
            synchronized (this) {
                map = new HashMap(this.f21750a);
            }
            m(map, z7);
        }
    }
}

package f4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<e0<?>> f21730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<e0<?>> f21731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<e0<?>> f21732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<e0<?>> f21733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<e0<?>> f21734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f21735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f21736g;

    private static class a implements m4.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f21737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m4.c f21738b;

        public a(Set<Class<?>> set, m4.c cVar) {
            this.f21737a = set;
            this.f21738b = cVar;
        }

        @Override // m4.c
        public void a(m4.a<?> aVar) {
            if (!this.f21737a.contains(aVar.b())) {
                throw new t(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f21738b.a(aVar);
        }
    }

    f0(c<?> cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.g()) {
            if (rVar.d()) {
                boolean zF = rVar.f();
                e0<?> e0VarB = rVar.b();
                if (zF) {
                    hashSet4.add(e0VarB);
                } else {
                    hashSet.add(e0VarB);
                }
            } else if (rVar.c()) {
                hashSet3.add(rVar.b());
            } else {
                boolean zF2 = rVar.f();
                e0<?> e0VarB2 = rVar.b();
                if (zF2) {
                    hashSet5.add(e0VarB2);
                } else {
                    hashSet2.add(e0VarB2);
                }
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(e0.b(m4.c.class));
        }
        this.f21730a = Collections.unmodifiableSet(hashSet);
        this.f21731b = Collections.unmodifiableSet(hashSet2);
        this.f21732c = Collections.unmodifiableSet(hashSet3);
        this.f21733d = Collections.unmodifiableSet(hashSet4);
        this.f21734e = Collections.unmodifiableSet(hashSet5);
        this.f21735f = cVar.k();
        this.f21736g = eVar;
    }

    @Override // f4.e
    public <T> T a(Class<T> cls) {
        if (!this.f21730a.contains(e0.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t7 = (T) this.f21736g.a(cls);
        return !cls.equals(m4.c.class) ? t7 : (T) new a(this.f21735f, (m4.c) t7);
    }

    @Override // f4.e
    public <T> o4.b<T> b(e0<T> e0Var) {
        if (this.f21731b.contains(e0Var)) {
            return this.f21736g.b(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", e0Var));
    }

    @Override // f4.e
    public <T> o4.b<T> c(Class<T> cls) {
        return b(e0.b(cls));
    }

    @Override // f4.e
    public /* synthetic */ Set d(Class cls) {
        return d.e(this, cls);
    }

    @Override // f4.e
    public <T> o4.b<Set<T>> e(e0<T> e0Var) {
        if (this.f21734e.contains(e0Var)) {
            return this.f21736g.e(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e0Var));
    }

    @Override // f4.e
    public <T> T f(e0<T> e0Var) {
        if (this.f21730a.contains(e0Var)) {
            return (T) this.f21736g.f(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", e0Var));
    }

    @Override // f4.e
    public <T> Set<T> g(e0<T> e0Var) {
        if (this.f21733d.contains(e0Var)) {
            return this.f21736g.g(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", e0Var));
    }
}

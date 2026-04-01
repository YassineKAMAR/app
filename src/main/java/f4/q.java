package f4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class q {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f4.c<?> f21763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<b> f21764b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<b> f21765c = new HashSet();

        b(f4.c<?> cVar) {
            this.f21763a = cVar;
        }

        void a(b bVar) {
            this.f21764b.add(bVar);
        }

        void b(b bVar) {
            this.f21765c.add(bVar);
        }

        f4.c<?> c() {
            return this.f21763a;
        }

        Set<b> d() {
            return this.f21764b;
        }

        boolean e() {
            return this.f21764b.isEmpty();
        }

        boolean f() {
            return this.f21765c.isEmpty();
        }

        void g(b bVar) {
            this.f21765c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0<?> f21766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21767b;

        private c(e0<?> e0Var, boolean z7) {
            this.f21766a = e0Var;
            this.f21767b = z7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f21766a.equals(this.f21766a) && cVar.f21767b == this.f21767b;
        }

        public int hashCode() {
            return ((this.f21766a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f21767b).hashCode();
        }
    }

    static void a(List<f4.c<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i8 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i8++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i8 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new s(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<f4.c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<f4.c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.d() && (set = (Set) map.get(new c(rVar.b(), rVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            f4.c<?> next = it.next();
            b bVar3 = new b(next);
            for (e0<? super Object> e0Var : next.j()) {
                c cVar = new c(e0Var, !next.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f21767b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", e0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}

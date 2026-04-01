package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class l extends w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final y.a f2499j = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2503g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<Fragment> f2500d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, l> f2501e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, z> f2502f = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2504h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2505i = false;

    static class a implements y.a {
        a() {
        }

        @Override // androidx.lifecycle.y.a
        public <T extends w> T a(Class<T> cls) {
            return new l(true);
        }

        @Override // androidx.lifecycle.y.a
        public /* synthetic */ w b(Class cls, f0.a aVar) {
            return x.a(this, cls, aVar);
        }
    }

    l(boolean z7) {
        this.f2503g = z7;
    }

    static l h(z zVar) {
        return (l) new y(zVar, f2499j).a(l.class);
    }

    @Override // androidx.lifecycle.w
    protected void d() {
        if (j.H) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2504h = true;
    }

    boolean e(Fragment fragment) {
        return this.f2500d.add(fragment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f2500d.equals(lVar.f2500d) && this.f2501e.equals(lVar.f2501e) && this.f2502f.equals(lVar.f2502f);
    }

    void f(Fragment fragment) {
        if (j.H) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f2501e.get(fragment.f2340e);
        if (lVar != null) {
            lVar.d();
            this.f2501e.remove(fragment.f2340e);
        }
        z zVar = this.f2502f.get(fragment.f2340e);
        if (zVar != null) {
            zVar.a();
            this.f2502f.remove(fragment.f2340e);
        }
    }

    l g(Fragment fragment) {
        l lVar = this.f2501e.get(fragment.f2340e);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.f2503g);
        this.f2501e.put(fragment.f2340e, lVar2);
        return lVar2;
    }

    public int hashCode() {
        return (((this.f2500d.hashCode() * 31) + this.f2501e.hashCode()) * 31) + this.f2502f.hashCode();
    }

    Collection<Fragment> i() {
        return this.f2500d;
    }

    z j(Fragment fragment) {
        z zVar = this.f2502f.get(fragment.f2340e);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        this.f2502f.put(fragment.f2340e, zVar2);
        return zVar2;
    }

    boolean k() {
        return this.f2504h;
    }

    boolean l(Fragment fragment) {
        return this.f2500d.remove(fragment);
    }

    boolean m(Fragment fragment) {
        if (this.f2500d.contains(fragment)) {
            return this.f2503g ? this.f2504h : !this.f2505i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2500d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2501e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2502f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

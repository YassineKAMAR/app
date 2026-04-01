package y0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x0.m;
import x0.r;
import x0.u;

/* JADX INFO: loaded from: classes.dex */
public class g extends r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f27360j = x0.j.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f27361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0.d f27363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<? extends u> f27364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f27365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f27366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<g> f27367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m f27369i;

    public g(i iVar, String str, x0.d dVar, List<? extends u> list, List<g> list2) {
        this.f27361a = iVar;
        this.f27362b = str;
        this.f27363c = dVar;
        this.f27364d = list;
        this.f27367g = list2;
        this.f27365e = new ArrayList(list.size());
        this.f27366f = new ArrayList();
        if (list2 != null) {
            Iterator<g> it = list2.iterator();
            while (it.hasNext()) {
                this.f27366f.addAll(it.next().f27366f);
            }
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            String strA = list.get(i8).a();
            this.f27365e.add(strA);
            this.f27366f.add(strA);
        }
    }

    public g(i iVar, List<? extends u> list) {
        this(iVar, null, x0.d.KEEP, list, null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> setL = l(gVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains(it.next())) {
                return true;
            }
        }
        List<g> listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator<g> it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator<g> it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().c());
            }
        }
        return hashSet;
    }

    public m a() {
        if (this.f27368h) {
            x0.j.c().h(f27360j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f27365e)), new Throwable[0]);
        } else {
            g1.b bVar = new g1.b(this);
            this.f27361a.p().b(bVar);
            this.f27369i = bVar.d();
        }
        return this.f27369i;
    }

    public x0.d b() {
        return this.f27363c;
    }

    public List<String> c() {
        return this.f27365e;
    }

    public String d() {
        return this.f27362b;
    }

    public List<g> e() {
        return this.f27367g;
    }

    public List<? extends u> f() {
        return this.f27364d;
    }

    public i g() {
        return this.f27361a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f27368h;
    }

    public void k() {
        this.f27368h = true;
    }
}

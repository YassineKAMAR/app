package b1;

import android.content.Context;
import c1.c;
import c1.e;
import c1.f;
import c1.g;
import c1.h;
import f1.p;
import java.util.ArrayList;
import java.util.List;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public class d implements c.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3272d = j.f("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f3273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1.c<?>[] f3274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3275c;

    public d(Context context, h1.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3273a = cVar;
        this.f3274b = new c1.c[]{new c1.a(applicationContext, aVar), new c1.b(applicationContext, aVar), new h(applicationContext, aVar), new c1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f3275c = new Object();
    }

    @Override // c1.c.a
    public void a(List<String> list) {
        synchronized (this.f3275c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    j.c().a(f3272d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f3273a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    @Override // c1.c.a
    public void b(List<String> list) {
        synchronized (this.f3275c) {
            c cVar = this.f3273a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f3275c) {
            for (c1.c<?> cVar : this.f3274b) {
                if (cVar.d(str)) {
                    j.c().a(f3272d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f3275c) {
            for (c1.c<?> cVar : this.f3274b) {
                cVar.g(null);
            }
            for (c1.c<?> cVar2 : this.f3274b) {
                cVar2.e(iterable);
            }
            for (c1.c<?> cVar3 : this.f3274b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f3275c) {
            for (c1.c<?> cVar : this.f3274b) {
                cVar.f();
            }
        }
    }
}

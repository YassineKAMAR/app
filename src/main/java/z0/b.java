package z0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import b1.c;
import b1.d;
import com.amazon.a.a.o.b.f;
import f1.p;
import g1.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x0.j;
import x0.s;
import y0.e;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
public class b implements e, c, y0.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f27587i = j.f("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f27589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f27590c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f27592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27593f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Boolean f27595h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<p> f27591d = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f27594g = new Object();

    public b(Context context, androidx.work.a aVar, h1.a aVar2, i iVar) {
        this.f27588a = context;
        this.f27589b = iVar;
        this.f27590c = new d(context, aVar2, this);
        this.f27592e = new a(this, aVar.k());
    }

    private void g() {
        this.f27595h = Boolean.valueOf(h.b(this.f27588a, this.f27589b.i()));
    }

    private void h() {
        if (this.f27593f) {
            return;
        }
        this.f27589b.m().c(this);
        this.f27593f = true;
    }

    private void i(String str) {
        synchronized (this.f27594g) {
            Iterator<p> it = this.f27591d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f21651a.equals(str)) {
                    j.c().a(f27587i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f27591d.remove(next);
                    this.f27590c.d(this.f27591d);
                    break;
                }
            }
        }
    }

    @Override // y0.e
    public boolean a() {
        return false;
    }

    @Override // b1.c
    public void b(List<String> list) {
        for (String str : list) {
            j.c().a(f27587i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f27589b.x(str);
        }
    }

    @Override // y0.e
    public void c(p... pVarArr) {
        if (this.f27595h == null) {
            g();
        }
        if (!this.f27595h.booleanValue()) {
            j.c().d(f27587i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long jA = pVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (pVar.f21652b == s.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f27592e;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 23 && pVar.f21660j.h()) {
                        j.c().a(f27587i, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i8 < 24 || !pVar.f21660j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f21651a);
                    } else {
                        j.c().a(f27587i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    }
                } else {
                    j.c().a(f27587i, String.format("Starting work for %s", pVar.f21651a), new Throwable[0]);
                    this.f27589b.u(pVar.f21651a);
                }
            }
        }
        synchronized (this.f27594g) {
            if (!hashSet.isEmpty()) {
                j.c().a(f27587i, String.format("Starting tracking for [%s]", TextUtils.join(f.f3942a, hashSet2)), new Throwable[0]);
                this.f27591d.addAll(hashSet);
                this.f27590c.d(this.f27591d);
            }
        }
    }

    @Override // y0.b
    public void d(String str, boolean z7) {
        i(str);
    }

    @Override // y0.e
    public void e(String str) {
        if (this.f27595h == null) {
            g();
        }
        if (!this.f27595h.booleanValue()) {
            j.c().d(f27587i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        j.c().a(f27587i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f27592e;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f27589b.x(str);
    }

    @Override // b1.c
    public void f(List<String> list) {
        for (String str : list) {
            j.c().a(f27587i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f27589b.u(str);
        }
    }
}

package y0;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import g1.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import y0.j;

/* JADX INFO: loaded from: classes.dex */
public class d implements b, e1.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f27344l = x0.j.f("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.a f27347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h1.a f27348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkDatabase f27349e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<e> f27352h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, j> f27351g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, j> f27350f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f27353i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<b> f27354j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f27345a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f27355k = new Object();

    private static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f27356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private x3.d<Boolean> f27358c;

        a(b bVar, String str, x3.d<Boolean> dVar) {
            this.f27356a = bVar;
            this.f27357b = str;
            this.f27358c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f27358c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f27356a.d(this.f27357b, zBooleanValue);
        }
    }

    public d(Context context, androidx.work.a aVar, h1.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.f27346b = context;
        this.f27347c = aVar;
        this.f27348d = aVar2;
        this.f27349e = workDatabase;
        this.f27352h = list;
    }

    private static boolean e(String str, j jVar) {
        if (jVar == null) {
            x0.j.c().a(f27344l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        jVar.d();
        x0.j.c().a(f27344l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void m() {
        synchronized (this.f27355k) {
            if (!(!this.f27350f.isEmpty())) {
                try {
                    this.f27346b.startService(androidx.work.impl.foreground.a.e(this.f27346b));
                } catch (Throwable th) {
                    x0.j.c().b(f27344l, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f27345a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f27345a = null;
                }
            }
        }
    }

    @Override // e1.a
    public void a(String str) {
        synchronized (this.f27355k) {
            this.f27350f.remove(str);
            m();
        }
    }

    @Override // e1.a
    public void b(String str, x0.e eVar) {
        synchronized (this.f27355k) {
            x0.j.c().d(f27344l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            j jVarRemove = this.f27351g.remove(str);
            if (jVarRemove != null) {
                if (this.f27345a == null) {
                    PowerManager.WakeLock wakeLockB = l.b(this.f27346b, "ProcessorForegroundLck");
                    this.f27345a = wakeLockB;
                    wakeLockB.acquire();
                }
                this.f27350f.put(str, jVarRemove);
                androidx.core.content.a.n(this.f27346b, androidx.work.impl.foreground.a.c(this.f27346b, str, eVar));
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f27355k) {
            this.f27354j.add(bVar);
        }
    }

    @Override // y0.b
    public void d(String str, boolean z7) {
        synchronized (this.f27355k) {
            this.f27351g.remove(str);
            x0.j.c().a(f27344l, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z7)), new Throwable[0]);
            Iterator<b> it = this.f27354j.iterator();
            while (it.hasNext()) {
                it.next().d(str, z7);
            }
        }
    }

    public boolean f(String str) {
        boolean zContains;
        synchronized (this.f27355k) {
            zContains = this.f27353i.contains(str);
        }
        return zContains;
    }

    public boolean g(String str) {
        boolean z7;
        synchronized (this.f27355k) {
            z7 = this.f27351g.containsKey(str) || this.f27350f.containsKey(str);
        }
        return z7;
    }

    public boolean h(String str) {
        boolean zContainsKey;
        synchronized (this.f27355k) {
            zContainsKey = this.f27350f.containsKey(str);
        }
        return zContainsKey;
    }

    public void i(b bVar) {
        synchronized (this.f27355k) {
            this.f27354j.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f27355k) {
            if (g(str)) {
                x0.j.c().a(f27344l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j jVarA = new j.c(this.f27346b, this.f27347c, this.f27348d, this, this.f27349e, str).c(this.f27352h).b(aVar).a();
            x3.d<Boolean> dVarB = jVarA.b();
            dVarB.c(new a(this, str, dVarB), this.f27348d.a());
            this.f27351g.put(str, jVarA);
            this.f27348d.c().execute(jVarA);
            x0.j.c().a(f27344l, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean zE;
        synchronized (this.f27355k) {
            boolean z7 = true;
            x0.j.c().a(f27344l, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f27353i.add(str);
            j jVarRemove = this.f27350f.remove(str);
            if (jVarRemove == null) {
                z7 = false;
            }
            if (jVarRemove == null) {
                jVarRemove = this.f27351g.remove(str);
            }
            zE = e(str, jVarRemove);
            if (z7) {
                m();
            }
        }
        return zE;
    }

    public boolean n(String str) {
        boolean zE;
        synchronized (this.f27355k) {
            x0.j.c().a(f27344l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zE = e(str, this.f27350f.remove(str));
        }
        return zE;
    }

    public boolean o(String str) {
        boolean zE;
        synchronized (this.f27355k) {
            x0.j.c().a(f27344l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zE = e(str, this.f27351g.remove(str));
        }
        return zE;
    }
}

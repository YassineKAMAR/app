package z0;

import f1.p;
import java.util.HashMap;
import java.util.Map;
import x0.j;
import x0.q;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f27581d = j.f("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f27582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f27583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Runnable> f27584c = new HashMap();

    /* JADX INFO: renamed from: z0.a$a, reason: collision with other inner class name */
    class RunnableC0198a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f27585a;

        RunnableC0198a(p pVar) {
            this.f27585a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.c().a(a.f27581d, String.format("Scheduling work %s", this.f27585a.f21651a), new Throwable[0]);
            a.this.f27582a.c(this.f27585a);
        }
    }

    public a(b bVar, q qVar) {
        this.f27582a = bVar;
        this.f27583b = qVar;
    }

    public void a(p pVar) {
        Runnable runnableRemove = this.f27584c.remove(pVar.f21651a);
        if (runnableRemove != null) {
            this.f27583b.b(runnableRemove);
        }
        RunnableC0198a runnableC0198a = new RunnableC0198a(pVar);
        this.f27584c.put(pVar.f21651a, runnableC0198a);
        this.f27583b.a(pVar.a() - System.currentTimeMillis(), runnableC0198a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f27584c.remove(str);
        if (runnableRemove != null) {
            this.f27583b.b(runnableRemove);
        }
    }
}

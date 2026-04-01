package g1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;

/* JADX INFO: loaded from: classes.dex */
public class m implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f21902g = x0.j.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f21903a = androidx.work.impl.utils.futures.c.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f21904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f1.p f21905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ListenableWorker f21906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final x0.f f21907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h1.a f21908f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f21909a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f21909a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21909a.r(m.this.f21906d.getForegroundInfoAsync());
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f21911a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f21911a = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                x0.e eVar = (x0.e) this.f21911a.get();
                if (eVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", m.this.f21905c.f21653c));
                }
                x0.j.c().a(m.f21902g, String.format("Updating notification for %s", m.this.f21905c.f21653c), new Throwable[0]);
                m.this.f21906d.setRunInForeground(true);
                m mVar = m.this;
                mVar.f21903a.r(mVar.f21907e.a(mVar.f21904b, mVar.f21906d.getId(), eVar));
            } catch (Throwable th) {
                m.this.f21903a.q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public m(Context context, f1.p pVar, ListenableWorker listenableWorker, x0.f fVar, h1.a aVar) {
        this.f21904b = context;
        this.f21905c = pVar;
        this.f21906d = listenableWorker;
        this.f21907e = fVar;
        this.f21908f = aVar;
    }

    public x3.d<Void> a() {
        return this.f21903a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f21905c.f21667q || androidx.core.os.a.c()) {
            this.f21903a.p(null);
            return;
        }
        androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        this.f21908f.a().execute(new a(cVarT));
        cVarT.c(new b(cVarT), this.f21908f.a());
    }
}

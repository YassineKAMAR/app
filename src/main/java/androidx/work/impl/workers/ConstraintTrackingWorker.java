package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import b1.c;
import f1.p;
import java.util.Collections;
import java.util.List;
import x0.j;
import x3.d;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f3243k = j.f("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WorkerParameters f3244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Object f3245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile boolean f3246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f3247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ListenableWorker f3248j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f3250a;

        b(d dVar) {
            this.f3250a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f3245g) {
                if (ConstraintTrackingWorker.this.f3246h) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f3247i.r(this.f3250a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3244f = workerParameters;
        this.f3245g = new Object();
        this.f3246h = false;
        this.f3247i = androidx.work.impl.utils.futures.c.t();
    }

    public WorkDatabase a() {
        return i.k(getApplicationContext()).o();
    }

    @Override // b1.c
    public void b(List<String> list) {
        j.c().a(f3243k, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f3245g) {
            this.f3246h = true;
        }
    }

    void c() {
        this.f3247i.p(ListenableWorker.a.a());
    }

    void d() {
        this.f3247i.p(ListenableWorker.a.b());
    }

    void e() {
        String strI = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strI)) {
            j.c().b(f3243k, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker listenableWorkerB = getWorkerFactory().b(getApplicationContext(), strI, this.f3244f);
            this.f3248j = listenableWorkerB;
            if (listenableWorkerB != null) {
                p pVarM = a().B().m(getId().toString());
                if (pVarM == null) {
                    c();
                    return;
                }
                b1.d dVar = new b1.d(getApplicationContext(), getTaskExecutor(), this);
                dVar.d(Collections.singletonList(pVarM));
                if (!dVar.c(getId().toString())) {
                    j.c().a(f3243k, String.format("Constraints not met for delegate %s. Requesting retry.", strI), new Throwable[0]);
                    d();
                    return;
                }
                j.c().a(f3243k, String.format("Constraints met for delegate %s", strI), new Throwable[0]);
                try {
                    d<ListenableWorker.a> dVarStartWork = this.f3248j.startWork();
                    dVarStartWork.c(new b(dVarStartWork), getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    j jVarC = j.c();
                    String str = f3243k;
                    jVarC.a(str, String.format("Delegated worker %s threw exception in startWork.", strI), th);
                    synchronized (this.f3245g) {
                        if (this.f3246h) {
                            j.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            d();
                        } else {
                            c();
                        }
                        return;
                    }
                }
            }
            j.c().a(f3243k, "No worker to delegate to.", new Throwable[0]);
        }
        c();
    }

    @Override // b1.c
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public h1.a getTaskExecutor() {
        return i.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f3248j;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f3248j;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f3248j.stop();
    }

    @Override // androidx.work.ListenableWorker
    public d<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f3247i;
    }
}

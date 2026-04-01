package y0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f1.p;
import f1.q;
import f1.t;
import g1.m;
import g1.n;
import g1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import x0.s;

/* JADX INFO: loaded from: classes.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f27385t = x0.j.f("WorkerWrapper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f27386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<e> f27388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f27389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    p f27390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ListenableWorker f27391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    h1.a f27392g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.work.a f27394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e1.a f27395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkDatabase f27396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f27397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f1.b f27398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t f27399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<String> f27400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f27401p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f27404s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ListenableWorker.a f27393h = ListenableWorker.a.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    androidx.work.impl.utils.futures.c<Boolean> f27402q = androidx.work.impl.utils.futures.c.t();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    x3.d<ListenableWorker.a> f27403r = null;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x3.d f27405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f27406b;

        a(x3.d dVar, androidx.work.impl.utils.futures.c cVar) {
            this.f27405a = dVar;
            this.f27406b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f27405a.get();
                x0.j.c().a(j.f27385t, String.format("Starting work for %s", j.this.f27390e.f21653c), new Throwable[0]);
                j jVar = j.this;
                jVar.f27403r = jVar.f27391f.startWork();
                this.f27406b.r(j.this.f27403r);
            } catch (Throwable th) {
                this.f27406b.q(th);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f27408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27409b;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f27408a = cVar;
            this.f27409b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f27408a.get();
                    if (aVar == null) {
                        x0.j.c().b(j.f27385t, String.format("%s returned a null result. Treating it as a failure.", j.this.f27390e.f21653c), new Throwable[0]);
                    } else {
                        x0.j.c().a(j.f27385t, String.format("%s returned a %s result.", j.this.f27390e.f21653c, aVar), new Throwable[0]);
                        j.this.f27393h = aVar;
                    }
                } catch (InterruptedException e8) {
                    e = e8;
                    x0.j.c().b(j.f27385t, String.format("%s failed because it threw an exception/error", this.f27409b), e);
                } catch (CancellationException e9) {
                    x0.j.c().d(j.f27385t, String.format("%s was cancelled", this.f27409b), e9);
                } catch (ExecutionException e10) {
                    e = e10;
                    x0.j.c().b(j.f27385t, String.format("%s failed because it threw an exception/error", this.f27409b), e);
                }
            } finally {
                j.this.f();
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f27411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ListenableWorker f27412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e1.a f27413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        h1.a f27414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.work.a f27415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        WorkDatabase f27416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f27417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List<e> f27418h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        WorkerParameters.a f27419i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, h1.a aVar2, e1.a aVar3, WorkDatabase workDatabase, String str) {
            this.f27411a = context.getApplicationContext();
            this.f27414d = aVar2;
            this.f27413c = aVar3;
            this.f27415e = aVar;
            this.f27416f = workDatabase;
            this.f27417g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f27419i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f27418h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f27386a = cVar.f27411a;
        this.f27392g = cVar.f27414d;
        this.f27395j = cVar.f27413c;
        this.f27387b = cVar.f27417g;
        this.f27388c = cVar.f27418h;
        this.f27389d = cVar.f27419i;
        this.f27391f = cVar.f27412b;
        this.f27394i = cVar.f27415e;
        WorkDatabase workDatabase = cVar.f27416f;
        this.f27396k = workDatabase;
        this.f27397l = workDatabase.B();
        this.f27398m = this.f27396k.t();
        this.f27399n = this.f27396k.C();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f27387b);
        sb.append(", tags={ ");
        boolean z7 = true;
        for (String str : list) {
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            x0.j.c().d(f27385t, String.format("Worker result SUCCESS for %s", this.f27401p), new Throwable[0]);
            if (!this.f27390e.d()) {
                m();
                return;
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            x0.j.c().d(f27385t, String.format("Worker result RETRY for %s", this.f27401p), new Throwable[0]);
            g();
            return;
        } else {
            x0.j.c().d(f27385t, String.format("Worker result FAILURE for %s", this.f27401p), new Throwable[0]);
            if (!this.f27390e.d()) {
                l();
                return;
            }
        }
        h();
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f27397l.l(str2) != s.CANCELLED) {
                this.f27397l.k(s.FAILED, str2);
            }
            linkedList.addAll(this.f27398m.a(str2));
        }
    }

    private void g() {
        this.f27396k.c();
        try {
            this.f27397l.k(s.ENQUEUED, this.f27387b);
            this.f27397l.s(this.f27387b, System.currentTimeMillis());
            this.f27397l.b(this.f27387b, -1L);
            this.f27396k.r();
        } finally {
            this.f27396k.g();
            i(true);
        }
    }

    private void h() {
        this.f27396k.c();
        try {
            this.f27397l.s(this.f27387b, System.currentTimeMillis());
            this.f27397l.k(s.ENQUEUED, this.f27387b);
            this.f27397l.n(this.f27387b);
            this.f27397l.b(this.f27387b, -1L);
            this.f27396k.r();
        } finally {
            this.f27396k.g();
            i(false);
        }
    }

    private void i(boolean z7) {
        ListenableWorker listenableWorker;
        this.f27396k.c();
        try {
            if (!this.f27396k.B().i()) {
                g1.e.a(this.f27386a, RescheduleReceiver.class, false);
            }
            if (z7) {
                this.f27397l.k(s.ENQUEUED, this.f27387b);
                this.f27397l.b(this.f27387b, -1L);
            }
            if (this.f27390e != null && (listenableWorker = this.f27391f) != null && listenableWorker.isRunInForeground()) {
                this.f27395j.a(this.f27387b);
            }
            this.f27396k.r();
            this.f27396k.g();
            this.f27402q.p(Boolean.valueOf(z7));
        } catch (Throwable th) {
            this.f27396k.g();
            throw th;
        }
    }

    private void j() {
        s sVarL = this.f27397l.l(this.f27387b);
        if (sVarL == s.RUNNING) {
            x0.j.c().a(f27385t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f27387b), new Throwable[0]);
            i(true);
        } else {
            x0.j.c().a(f27385t, String.format("Status for %s is %s; not doing any work", this.f27387b, sVarL), new Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.b bVarB;
        if (n()) {
            return;
        }
        this.f27396k.c();
        try {
            p pVarM = this.f27397l.m(this.f27387b);
            this.f27390e = pVarM;
            if (pVarM == null) {
                x0.j.c().b(f27385t, String.format("Didn't find WorkSpec for id %s", this.f27387b), new Throwable[0]);
                i(false);
                this.f27396k.r();
                return;
            }
            if (pVarM.f21652b != s.ENQUEUED) {
                j();
                this.f27396k.r();
                x0.j.c().a(f27385t, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f27390e.f21653c), new Throwable[0]);
                return;
            }
            if (pVarM.d() || this.f27390e.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                p pVar = this.f27390e;
                if (!(pVar.f21664n == 0) && jCurrentTimeMillis < pVar.a()) {
                    x0.j.c().a(f27385t, String.format("Delaying execution for %s because it is being executed before schedule.", this.f27390e.f21653c), new Throwable[0]);
                    i(true);
                    this.f27396k.r();
                    return;
                }
            }
            this.f27396k.r();
            this.f27396k.g();
            if (this.f27390e.d()) {
                bVarB = this.f27390e.f21655e;
            } else {
                x0.h hVarB = this.f27394i.f().b(this.f27390e.f21654d);
                if (hVarB == null) {
                    x0.j.c().b(f27385t, String.format("Could not create Input Merger %s", this.f27390e.f21654d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f27390e.f21655e);
                    arrayList.addAll(this.f27397l.q(this.f27387b));
                    bVarB = hVarB.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f27387b), bVarB, this.f27400o, this.f27389d, this.f27390e.f21661k, this.f27394i.e(), this.f27392g, this.f27394i.m(), new o(this.f27396k, this.f27392g), new n(this.f27396k, this.f27395j, this.f27392g));
            if (this.f27391f == null) {
                this.f27391f = this.f27394i.m().b(this.f27386a, this.f27390e.f21653c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f27391f;
            if (listenableWorker == null) {
                x0.j.c().b(f27385t, String.format("Could not create Worker %s", this.f27390e.f21653c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                x0.j.c().b(f27385t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f27390e.f21653c), new Throwable[0]);
                l();
                return;
            }
            this.f27391f.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
            m mVar = new m(this.f27386a, this.f27390e, this.f27391f, workerParameters.b(), this.f27392g);
            this.f27392g.a().execute(mVar);
            x3.d<Void> dVarA = mVar.a();
            dVarA.c(new a(dVarA, cVarT), this.f27392g.a());
            cVarT.c(new b(cVarT, this.f27401p), this.f27392g.c());
        } finally {
            this.f27396k.g();
        }
    }

    private void m() {
        this.f27396k.c();
        try {
            this.f27397l.k(s.SUCCEEDED, this.f27387b);
            this.f27397l.g(this.f27387b, ((ListenableWorker.a.c) this.f27393h).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f27398m.a(this.f27387b)) {
                if (this.f27397l.l(str) == s.BLOCKED && this.f27398m.b(str)) {
                    x0.j.c().d(f27385t, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f27397l.k(s.ENQUEUED, str);
                    this.f27397l.s(str, jCurrentTimeMillis);
                }
            }
            this.f27396k.r();
        } finally {
            this.f27396k.g();
            i(false);
        }
    }

    private boolean n() {
        if (!this.f27404s) {
            return false;
        }
        x0.j.c().a(f27385t, String.format("Work interrupted for %s", this.f27401p), new Throwable[0]);
        if (this.f27397l.l(this.f27387b) == null) {
            i(false);
        } else {
            i(!r0.a());
        }
        return true;
    }

    private boolean o() {
        this.f27396k.c();
        try {
            boolean z7 = true;
            if (this.f27397l.l(this.f27387b) == s.ENQUEUED) {
                this.f27397l.k(s.RUNNING, this.f27387b);
                this.f27397l.r(this.f27387b);
            } else {
                z7 = false;
            }
            this.f27396k.r();
            return z7;
        } finally {
            this.f27396k.g();
        }
    }

    public x3.d<Boolean> b() {
        return this.f27402q;
    }

    public void d() {
        boolean zIsDone;
        this.f27404s = true;
        n();
        x3.d<ListenableWorker.a> dVar = this.f27403r;
        if (dVar != null) {
            zIsDone = dVar.isDone();
            this.f27403r.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f27391f;
        if (listenableWorker == null || zIsDone) {
            x0.j.c().a(f27385t, String.format("WorkSpec %s is already done. Not interrupting.", this.f27390e), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    void f() {
        if (!n()) {
            this.f27396k.c();
            try {
                s sVarL = this.f27397l.l(this.f27387b);
                this.f27396k.A().a(this.f27387b);
                if (sVarL == null) {
                    i(false);
                } else if (sVarL == s.RUNNING) {
                    c(this.f27393h);
                } else if (!sVarL.a()) {
                    g();
                }
                this.f27396k.r();
            } finally {
                this.f27396k.g();
            }
        }
        List<e> list = this.f27388c;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().e(this.f27387b);
            }
            f.b(this.f27394i, this.f27396k, this.f27388c);
        }
    }

    void l() {
        this.f27396k.c();
        try {
            e(this.f27387b);
            this.f27397l.g(this.f27387b, ((ListenableWorker.a.C0045a) this.f27393h).e());
            this.f27396k.r();
        } finally {
            this.f27396k.g();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> listA = this.f27399n.a(this.f27387b);
        this.f27400o = listA;
        this.f27401p = a(listA);
        k();
    }
}

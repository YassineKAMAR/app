package g1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import x0.s;

/* JADX INFO: loaded from: classes.dex */
public class o implements x0.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f21922c = x0.j.f("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WorkDatabase f21923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h1.a f21924b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f21925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.b f21926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f21927c;

        a(UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.c cVar) {
            this.f21925a = uuid;
            this.f21926b = bVar;
            this.f21927c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.p pVarM;
            String string = this.f21925a.toString();
            x0.j jVarC = x0.j.c();
            String str = o.f21922c;
            jVarC.a(str, String.format("Updating progress for %s (%s)", this.f21925a, this.f21926b), new Throwable[0]);
            o.this.f21923a.c();
            try {
                pVarM = o.this.f21923a.B().m(string);
            } finally {
                try {
                } finally {
                }
            }
            if (pVarM == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (pVarM.f21652b == s.RUNNING) {
                o.this.f21923a.A().b(new f1.m(string, this.f21926b));
            } else {
                x0.j.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            this.f21927c.p(null);
            o.this.f21923a.r();
        }
    }

    public o(WorkDatabase workDatabase, h1.a aVar) {
        this.f21923a = workDatabase;
        this.f21924b = aVar;
    }

    @Override // x0.o
    public x3.d<Void> a(Context context, UUID uuid, androidx.work.b bVar) {
        androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        this.f21924b.b(new a(uuid, bVar, cVarT));
        return cVarT;
    }
}

package g1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f1.q;
import java.util.UUID;
import x0.s;

/* JADX INFO: loaded from: classes.dex */
public class n implements x0.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21913d = x0.j.f("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1.a f21914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final e1.a f21915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final q f21916c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f21917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f21918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x0.e f21919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f21920d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, x0.e eVar, Context context) {
            this.f21917a = cVar;
            this.f21918b = uuid;
            this.f21919c = eVar;
            this.f21920d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f21917a.isCancelled()) {
                    String string = this.f21918b.toString();
                    s sVarL = n.this.f21916c.l(string);
                    if (sVarL == null || sVarL.a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    n.this.f21915b.b(string, this.f21919c);
                    this.f21920d.startService(androidx.work.impl.foreground.a.a(this.f21920d, string, this.f21919c));
                }
                this.f21917a.p(null);
            } catch (Throwable th) {
                this.f21917a.q(th);
            }
        }
    }

    public n(WorkDatabase workDatabase, e1.a aVar, h1.a aVar2) {
        this.f21915b = aVar;
        this.f21914a = aVar2;
        this.f21916c = workDatabase.B();
    }

    @Override // x0.f
    public x3.d<Void> a(Context context, UUID uuid, x0.e eVar) {
        androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        this.f21914a.b(new a(cVarT, uuid, eVar, context));
        return cVarT;
    }
}

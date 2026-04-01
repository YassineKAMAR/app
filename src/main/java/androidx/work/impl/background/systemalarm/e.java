package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import g1.l;
import g1.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x0.j;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
public class e implements y0.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f3157k = j.f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f3158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h1.a f3159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f3160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y0.d f3161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f3162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f3163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f3164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final List<Intent> f3165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Intent f3166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f3167j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f3165h) {
                e eVar2 = e.this;
                eVar2.f3166i = eVar2.f3165h.get(0);
            }
            Intent intent = e.this.f3166i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f3166i.getIntExtra("KEY_START_ID", 0);
                j jVarC = j.c();
                String str = e.f3157k;
                jVarC.a(str, String.format("Processing command %s, %s", e.this.f3166i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockB = l.b(e.this.f3158a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    j.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.acquire();
                    e eVar3 = e.this;
                    eVar3.f3163f.p(eVar3.f3166i, intExtra, eVar3);
                    j.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        j jVarC2 = j.c();
                        String str2 = e.f3157k;
                        jVarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        j.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        j.c().a(e.f3157k, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f3169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f3170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3171c;

        b(e eVar, Intent intent, int i8) {
            this.f3169a = eVar;
            this.f3170b = intent;
            this.f3171c = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3169a.a(this.f3170b, this.f3171c);
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f3172a;

        d(e eVar) {
            this.f3172a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3172a.c();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    e(Context context, y0.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3158a = applicationContext;
        this.f3163f = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f3160c = new p();
        iVar = iVar == null ? i.k(context) : iVar;
        this.f3162e = iVar;
        dVar = dVar == null ? iVar.m() : dVar;
        this.f3161d = dVar;
        this.f3159b = iVar.p();
        dVar.c(this);
        this.f3165h = new ArrayList();
        this.f3166i = null;
        this.f3164g = new Handler(Looper.getMainLooper());
    }

    private void b() {
        if (this.f3164g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f3165h) {
            Iterator<Intent> it = this.f3165h.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock wakeLockB = l.b(this.f3158a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f3162e.p().b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i8) {
        j jVarC = j.c();
        String str = f3157k;
        jVarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i8)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i8);
        synchronized (this.f3165h) {
            boolean z7 = this.f3165h.isEmpty() ? false : true;
            this.f3165h.add(intent);
            if (!z7) {
                l();
            }
        }
        return true;
    }

    void c() {
        j jVarC = j.c();
        String str = f3157k;
        jVarC.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f3165h) {
            if (this.f3166i != null) {
                j.c().a(str, String.format("Removing command %s", this.f3166i), new Throwable[0]);
                if (!this.f3165h.remove(0).equals(this.f3166i)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f3166i = null;
            }
            g1.i iVarC = this.f3159b.c();
            if (!this.f3163f.o() && this.f3165h.isEmpty() && !iVarC.a()) {
                j.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f3167j;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f3165h.isEmpty()) {
                l();
            }
        }
    }

    @Override // y0.b
    public void d(String str, boolean z7) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f3158a, str, z7), 0));
    }

    y0.d e() {
        return this.f3161d;
    }

    h1.a f() {
        return this.f3159b;
    }

    i g() {
        return this.f3162e;
    }

    p h() {
        return this.f3160c;
    }

    void j() {
        j.c().a(f3157k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f3161d.i(this);
        this.f3160c.a();
        this.f3167j = null;
    }

    void k(Runnable runnable) {
        this.f3164g.post(runnable);
    }

    void m(c cVar) {
        if (this.f3167j != null) {
            j.c().b(f3157k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f3167j = cVar;
        }
    }
}

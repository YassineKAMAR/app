package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.c.f;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class c implements com.amazon.a.a.k.d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3724a = new com.amazon.a.a.o.c("ActivityResultManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f3725b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f3726c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f3727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f3728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f3729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AtomicReference<a> f3730g = new AtomicReference<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BlockingQueue<com.amazon.a.a.l.a> f3731h = new LinkedBlockingQueue();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f3735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Activity f3737c;

        public a(Intent intent, int i8) {
            this.f3735a = intent;
            this.f3736b = i8;
        }

        public int a() {
            return this.f3736b;
        }

        public void a(Activity activity) {
            c.f3724a.a("Calling startActivityForResult from: " + activity);
            activity.startActivityForResult(this.f3735a, this.f3736b);
            this.f3737c = activity;
        }

        public void b(Activity activity) {
            c.f3724a.b("Context changed while awaiting result!");
            if (this.f3737c != null) {
                c.f3724a.b("Finishing activity from old context: " + this.f3737c);
                this.f3737c.finishActivity(this.f3736b);
            }
            a(activity);
        }
    }

    private int b() {
        return f3725b.nextInt(f3726c) + 1;
    }

    @Override // com.amazon.a.a.l.b
    public com.amazon.a.a.l.a a(Intent intent) {
        final a aVar = new a(intent, b());
        if (!d.a(this.f3730g, null, aVar)) {
            f3724a.b("StartActivityForResult called while ActivityResultManager is already awaiting a result");
            return null;
        }
        com.amazon.a.a.o.c cVar = f3724a;
        cVar.a("Starting activity for result: " + intent + ", " + intent.getFlags() + ", requestId: " + aVar.a());
        this.f3727d.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.l.c.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                Activity activityB = c.this.f3728e.b();
                if (activityB == null) {
                    c.f3724a.a("No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible");
                } else {
                    aVar.a(activityB);
                }
            }
        });
        try {
            try {
                cVar.a("Blocking for request: " + aVar.a());
                com.amazon.a.a.l.a aVarTake = this.f3731h.take();
                cVar.a("Received Response: " + aVar.a());
                this.f3730g.set(null);
                return aVarTake;
            } catch (InterruptedException unused) {
                com.amazon.a.a.o.c cVar2 = f3724a;
                cVar2.a("Interrupted while awaiting for request, returning null");
                cVar2.a("Received Response: " + aVar.a());
                this.f3730g.set(null);
                return null;
            }
        } catch (Throwable th) {
            f3724a.a("Received Response: " + aVar.a());
            this.f3730g.set(null);
            throw th;
        }
    }

    @Override // com.amazon.a.a.l.b
    public boolean a(com.amazon.a.a.l.a aVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3724a.a("Recieved ActivityResult: " + aVar);
        }
        a aVar2 = this.f3730g.get();
        if (aVar2 == null) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3724a.a("We don't have a current open request, returning");
            }
            return false;
        }
        if (aVar2.a() != aVar.b()) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3724a.a("We don't have a request with code: " + aVar.b() + ", returning");
            }
            return false;
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f3724a.a("Signaling thread waiting for request: " + aVar.b());
        }
        this.f3731h.add(aVar);
        return true;
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f3729f.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.l.c.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                a aVar2 = (a) c.this.f3730g.get();
                if (aVar2 != null) {
                    aVar2.b(aVar.b());
                }
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }
}

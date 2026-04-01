package com.amazon.a.a.n.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3862a = new com.amazon.a.a.o.c("SimpleTaskPipeline");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f3863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Runnable> f3864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3865d;

    private b(HandlerThread handlerThread) {
        this.f3864c = Collections.synchronizedSet(new HashSet());
        this.f3865d = handlerThread.getName();
        handlerThread.start();
        this.f3863b = new Handler(handlerThread.getLooper());
    }

    private b(String str) {
        this.f3864c = Collections.synchronizedSet(new HashSet());
        this.f3865d = str;
        this.f3863b = new Handler();
    }

    private long a(Date date) {
        return SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
    }

    public static b a(String str) {
        return new b(new HandlerThread("KIWI_" + str));
    }

    public static b b(String str) {
        return new b(str);
    }

    private Runnable c(final com.amazon.a.a.n.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.amazon.a.a.n.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                com.amazon.a.a.o.c cVar;
                StringBuilder sb;
                b.this.f3864c.remove(this);
                try {
                    if (com.amazon.a.a.o.c.f3947a) {
                        b.f3862a.a(b.this.f3865d + ": Executing Task: " + aVar + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
                    }
                    aVar.a();
                } catch (Throwable th) {
                    try {
                        if (com.amazon.a.a.o.c.f3948b) {
                            b.f3862a.b("Task Failed with unhandled exception: " + th, th);
                        }
                        if (!com.amazon.a.a.o.c.f3947a) {
                            return;
                        }
                        cVar = b.f3862a;
                        sb = new StringBuilder();
                    } catch (Throwable th2) {
                        if (com.amazon.a.a.o.c.f3947a) {
                            b.f3862a.a(b.this.f3865d + ": Task finished executing: " + aVar);
                        }
                        throw th2;
                    }
                }
                if (com.amazon.a.a.o.c.f3947a) {
                    cVar = b.f3862a;
                    sb = new StringBuilder();
                    sb.append(b.this.f3865d);
                    sb.append(": Task finished executing: ");
                    sb.append(aVar);
                    cVar.a(sb.toString());
                }
            }

            public String toString() {
                return aVar.toString();
            }
        };
        this.f3864c.add(runnable);
        return runnable;
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        for (Runnable runnable : this.f3864c) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3862a.a(this.f3865d + ": Removing callback: " + runnable);
            }
            this.f3863b.removeCallbacks(runnable);
        }
        this.f3864c.clear();
        if (this.f3863b.getLooper() == Looper.getMainLooper() || !this.f3863b.getLooper().getThread().isAlive()) {
            return;
        }
        com.amazon.a.a.o.c cVar = f3862a;
        cVar.a("Interrupting looper thread!");
        this.f3863b.getLooper().getThread().interrupt();
        cVar.a("Quitting looper: " + this.f3863b.getLooper().getThread() + ", " + this.f3863b.getLooper().getThread().isAlive());
        this.f3863b.getLooper().quit();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3862a.a("Scheduling task: " + aVar);
        }
        this.f3863b.post(c(aVar));
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j8) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3862a.a(this.f3865d + ": Scheduling task: " + aVar + ", with delay: " + j8);
        }
        this.f3863b.postDelayed(c(aVar), j8);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        long jA = a(date);
        if (com.amazon.a.a.o.c.f3947a) {
            f3862a.a(this.f3865d + ": Scheduling task: " + aVar + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + jA);
        }
        this.f3863b.postAtTime(c(aVar), jA);
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3862a.a(this.f3865d + ": Scheduling task immediately: " + aVar);
        }
        this.f3863b.postAtFrontOfQueue(c(aVar));
    }
}

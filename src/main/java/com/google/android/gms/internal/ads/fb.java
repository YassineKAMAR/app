package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends Thread {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f7700g = gc.f8287b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f7701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f7702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final db f7703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f7704d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final hc f7705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kb f7706f;

    public fb(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, db dbVar, kb kbVar) {
        this.f7701a = blockingQueue;
        this.f7702b = blockingQueue2;
        this.f7703c = dbVar;
        this.f7706f = kbVar;
        this.f7705e = new hc(this, blockingQueue2, kbVar);
    }

    private void c() {
        kb kbVar;
        ub ubVar = (ub) this.f7701a.take();
        ubVar.s("cache-queue-take");
        ubVar.z(1);
        try {
            ubVar.C();
            cb cbVarA = this.f7703c.a(ubVar.o());
            if (cbVarA == null) {
                ubVar.s("cache-miss");
                if (!this.f7705e.c(ubVar)) {
                    this.f7702b.put(ubVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (cbVarA.a(jCurrentTimeMillis)) {
                ubVar.s("cache-hit-expired");
                ubVar.e(cbVarA);
                if (!this.f7705e.c(ubVar)) {
                    this.f7702b.put(ubVar);
                }
                return;
            }
            ubVar.s("cache-hit");
            ac acVarI = ubVar.i(new qb(cbVarA.f6263a, cbVarA.f6269g));
            ubVar.s("cache-hit-parsed");
            if (!acVarI.c()) {
                ubVar.s("cache-parsing-failed");
                this.f7703c.c(ubVar.o(), true);
                ubVar.e(null);
                if (!this.f7705e.c(ubVar)) {
                    this.f7702b.put(ubVar);
                }
                return;
            }
            if (cbVarA.f6268f < jCurrentTimeMillis) {
                ubVar.s("cache-hit-refresh-needed");
                ubVar.e(cbVarA);
                acVarI.f5193d = true;
                if (!this.f7705e.c(ubVar)) {
                    this.f7706f.b(ubVar, acVarI, new eb(this, ubVar));
                }
                kbVar = this.f7706f;
            } else {
                kbVar = this.f7706f;
            }
            kbVar.b(ubVar, acVarI, null);
        } finally {
            ubVar.z(2);
        }
    }

    public final void b() {
        this.f7704d = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f7700g) {
            gc.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f7703c.k();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f7704d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                gc.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

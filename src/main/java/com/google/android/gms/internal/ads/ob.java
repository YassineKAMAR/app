package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class ob extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f12433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mb f12434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final db f12435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f12436d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kb f12437e;

    public ob(BlockingQueue blockingQueue, mb mbVar, db dbVar, kb kbVar) {
        this.f12433a = blockingQueue;
        this.f12434b = mbVar;
        this.f12435c = dbVar;
        this.f12437e = kbVar;
    }

    private void b() {
        ub ubVar = (ub) this.f12433a.take();
        SystemClock.elapsedRealtime();
        ubVar.z(3);
        try {
            ubVar.s("network-queue-take");
            ubVar.C();
            TrafficStats.setThreadStatsTag(ubVar.c());
            qb qbVarA = this.f12434b.a(ubVar);
            ubVar.s("network-http-complete");
            if (qbVarA.f13388e && ubVar.B()) {
                ubVar.v("not-modified");
                ubVar.x();
                return;
            }
            ac acVarI = ubVar.i(qbVarA);
            ubVar.s("network-parse-complete");
            if (acVarI.f5191b != null) {
                this.f12435c.b(ubVar.o(), acVarI.f5191b);
                ubVar.s("network-cache-written");
            }
            ubVar.w();
            this.f12437e.b(ubVar, acVarI, null);
            ubVar.y(acVarI);
        } catch (dc e8) {
            SystemClock.elapsedRealtime();
            this.f12437e.a(ubVar, e8);
            ubVar.x();
        } catch (Exception e9) {
            gc.c(e9, "Unhandled exception %s", e9.toString());
            dc dcVar = new dc(e9);
            SystemClock.elapsedRealtime();
            this.f12437e.a(ubVar, dcVar);
            ubVar.x();
        } finally {
            ubVar.z(4);
        }
    }

    public final void a() {
        this.f12436d = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f12436d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                gc.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

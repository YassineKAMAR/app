package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class px2 implements mx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mx2 f13178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f13179b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13180c = ((Integer) h2.y.c().b(ns.u8)).intValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f13181d = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ox2] */
    public px2(mx2 mx2Var, ScheduledExecutorService scheduledExecutorService) {
        this.f13178a = mx2Var;
        long jIntValue = ((Integer) h2.y.c().b(ns.t8)).intValue();
        if (((Boolean) h2.y.c().b(ns.Oa)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.ads.ox2
                @Override // java.lang.Runnable
                public final void run() {
                    px2.c(this.f12658a);
                }
            }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.ox2
                @Override // java.lang.Runnable
                public final void run() {
                    px2.c(this.f12658a);
                }
            }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void c(px2 px2Var) {
        while (!px2Var.f13179b.isEmpty()) {
            px2Var.f13178a.a((lx2) px2Var.f13179b.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.mx2
    public final void a(lx2 lx2Var) {
        if (this.f13179b.size() < this.f13180c) {
            this.f13179b.offer(lx2Var);
            return;
        }
        if (this.f13181d.getAndSet(true)) {
            return;
        }
        Queue queue = this.f13179b;
        lx2 lx2VarB = lx2.b("dropped_event");
        Map mapJ = lx2Var.j();
        if (mapJ.containsKey("action")) {
            lx2VarB.a("dropped_action", (String) mapJ.get("action"));
        }
        queue.offer(lx2VarB);
    }

    @Override // com.google.android.gms.internal.ads.mx2
    public final String b(lx2 lx2Var) {
        return this.f13178a.b(lx2Var);
    }
}

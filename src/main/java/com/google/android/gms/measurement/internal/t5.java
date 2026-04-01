package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
final class t5 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue<u5<?>> f20500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20501c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ q5 f20502d;

    public t5(q5 q5Var, String str, BlockingQueue<u5<?>> blockingQueue) {
        this.f20502d = q5Var;
        a3.o.j(str);
        a3.o.j(blockingQueue);
        this.f20499a = new Object();
        this.f20500b = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f20502d.t().L().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f20502d.f20402i) {
            if (!this.f20501c) {
                this.f20502d.f20403j.release();
                this.f20502d.f20402i.notifyAll();
                if (this == this.f20502d.f20396c) {
                    this.f20502d.f20396c = null;
                } else if (this == this.f20502d.f20397d) {
                    this.f20502d.f20397d = null;
                } else {
                    this.f20502d.t().G().a("Current scheduler thread is neither worker nor network");
                }
                this.f20501c = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f20499a) {
            this.f20499a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z7 = false;
        while (!z7) {
            try {
                this.f20502d.f20403j.acquire();
                z7 = true;
            } catch (InterruptedException e8) {
                b(e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                u5<?> u5VarPoll = this.f20500b.poll();
                if (u5VarPoll != null) {
                    Process.setThreadPriority(u5VarPoll.f20526b ? threadPriority : 10);
                    u5VarPoll.run();
                } else {
                    synchronized (this.f20499a) {
                        if (this.f20500b.peek() == null && !this.f20502d.f20404k) {
                            try {
                                this.f20499a.wait(30000L);
                            } catch (InterruptedException e9) {
                                b(e9);
                            }
                        }
                    }
                    synchronized (this.f20502d.f20402i) {
                        if (this.f20500b.peek() == null) {
                            c();
                            return;
                        }
                    }
                }
            }
        } finally {
            c();
        }
    }
}

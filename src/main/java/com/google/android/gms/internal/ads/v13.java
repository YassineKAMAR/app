package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class v13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f15962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f15963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f15964c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u13 f15965d = null;

    public v13() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f15962a = linkedBlockingQueue;
        this.f15963b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        u13 u13Var = (u13) this.f15964c.poll();
        this.f15965d = u13Var;
        if (u13Var != null) {
            u13Var.executeOnExecutor(this.f15963b, new Object[0]);
        }
    }

    public final void a(u13 u13Var) {
        this.f15965d = null;
        c();
    }

    public final void b(u13 u13Var) {
        u13Var.b(this);
        this.f15964c.add(u13Var);
        if (this.f15965d == null) {
            c();
        }
    }
}

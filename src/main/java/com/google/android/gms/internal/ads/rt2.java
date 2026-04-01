package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public final class rt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f14337a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable f14338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lg3 f14339c;

    public rt2(Callable callable, lg3 lg3Var) {
        this.f14338b = callable;
        this.f14339c = lg3Var;
    }

    public final synchronized x3.d a() {
        c(1);
        return (x3.d) this.f14337a.poll();
    }

    public final synchronized void b(x3.d dVar) {
        this.f14337a.addFirst(dVar);
    }

    public final synchronized void c(int i8) {
        int size = i8 - this.f14337a.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f14337a.add(this.f14339c.Z(this.f14338b));
        }
    }
}

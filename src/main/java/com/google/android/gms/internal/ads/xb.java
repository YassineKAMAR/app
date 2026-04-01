package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f17149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f17150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue f17151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue f17152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final db f17153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mb f17154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ob[] f17155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private fb f17156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f17157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f17158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kb f17159k;

    public xb(db dbVar, mb mbVar, int i8) {
        kb kbVar = new kb(new Handler(Looper.getMainLooper()));
        this.f17149a = new AtomicInteger();
        this.f17150b = new HashSet();
        this.f17151c = new PriorityBlockingQueue();
        this.f17152d = new PriorityBlockingQueue();
        this.f17157i = new ArrayList();
        this.f17158j = new ArrayList();
        this.f17153e = dbVar;
        this.f17154f = mbVar;
        this.f17155g = new ob[4];
        this.f17159k = kbVar;
    }

    public final ub a(ub ubVar) {
        ubVar.g(this);
        synchronized (this.f17150b) {
            this.f17150b.add(ubVar);
        }
        ubVar.h(this.f17149a.incrementAndGet());
        ubVar.s("add-to-queue");
        c(ubVar, 0);
        this.f17151c.add(ubVar);
        return ubVar;
    }

    final void b(ub ubVar) {
        synchronized (this.f17150b) {
            this.f17150b.remove(ubVar);
        }
        synchronized (this.f17157i) {
            Iterator it = this.f17157i.iterator();
            while (it.hasNext()) {
                ((wb) it.next()).j();
            }
        }
        c(ubVar, 5);
    }

    final void c(ub ubVar, int i8) {
        synchronized (this.f17158j) {
            Iterator it = this.f17158j.iterator();
            while (it.hasNext()) {
                ((vb) it.next()).j();
            }
        }
    }

    public final void d() {
        fb fbVar = this.f17156h;
        if (fbVar != null) {
            fbVar.b();
        }
        ob[] obVarArr = this.f17155g;
        for (int i8 = 0; i8 < 4; i8++) {
            ob obVar = obVarArr[i8];
            if (obVar != null) {
                obVar.a();
            }
        }
        fb fbVar2 = new fb(this.f17151c, this.f17152d, this.f17153e, this.f17159k);
        this.f17156h = fbVar2;
        fbVar2.start();
        for (int i9 = 0; i9 < 4; i9++) {
            ob obVar2 = new ob(this.f17152d, this.f17154f, this.f17153e, this.f17159k);
            this.f17155g[i9] = obVar2;
            obVar2.start();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class mc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vv1 f11229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g62 f11230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ka2 f11231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f11232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f11233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f11234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f11235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11237i;

    public mc2(Looper looper, vv1 vv1Var, ka2 ka2Var) {
        this(new CopyOnWriteArraySet(), looper, vv1Var, ka2Var, true);
    }

    private mc2(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, vv1 vv1Var, ka2 ka2Var, boolean z7) {
        this.f11229a = vv1Var;
        this.f11232d = copyOnWriteArraySet;
        this.f11231c = ka2Var;
        this.f11235g = new Object();
        this.f11233e = new ArrayDeque();
        this.f11234f = new ArrayDeque();
        this.f11230b = vv1Var.a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.h72
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                mc2.g(this.f8665a, message);
                return true;
            }
        });
        this.f11237i = z7;
    }

    public static /* synthetic */ boolean g(mc2 mc2Var, Message message) {
        Iterator it = mc2Var.f11232d.iterator();
        while (it.hasNext()) {
            ((lb2) it.next()).b(mc2Var.f11231c);
            if (mc2Var.f11230b.F(0)) {
                return true;
            }
        }
        return true;
    }

    private final void h() {
        if (this.f11237i) {
            uu1.f(Thread.currentThread() == this.f11230b.j().getThread());
        }
    }

    public final mc2 a(Looper looper, ka2 ka2Var) {
        return new mc2(this.f11232d, looper, this.f11229a, ka2Var, this.f11237i);
    }

    public final void b(Object obj) {
        synchronized (this.f11235g) {
            if (this.f11236h) {
                return;
            }
            this.f11232d.add(new lb2(obj));
        }
    }

    public final void c() {
        h();
        if (this.f11234f.isEmpty()) {
            return;
        }
        if (!this.f11230b.F(0)) {
            g62 g62Var = this.f11230b;
            g62Var.k(g62Var.d(0));
        }
        boolean z7 = !this.f11233e.isEmpty();
        this.f11233e.addAll(this.f11234f);
        this.f11234f.clear();
        if (z7) {
            return;
        }
        while (!this.f11233e.isEmpty()) {
            ((Runnable) this.f11233e.peekFirst()).run();
            this.f11233e.removeFirst();
        }
    }

    public final void d(final int i8, final j92 j92Var) {
        h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f11232d);
        this.f11234f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.i82
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    j92 j92Var2 = j92Var;
                    ((lb2) it.next()).a(i8, j92Var2);
                }
            }
        });
    }

    public final void e() {
        h();
        synchronized (this.f11235g) {
            this.f11236h = true;
        }
        Iterator it = this.f11232d.iterator();
        while (it.hasNext()) {
            ((lb2) it.next()).c(this.f11231c);
        }
        this.f11232d.clear();
    }

    public final void f(Object obj) {
        h();
        for (lb2 lb2Var : this.f11232d) {
            if (lb2Var.f10570a.equals(obj)) {
                lb2Var.c(this.f11231c);
                this.f11232d.remove(lb2Var);
            }
        }
    }
}

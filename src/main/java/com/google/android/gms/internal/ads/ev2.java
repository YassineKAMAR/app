package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class ev2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iu2 f7510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cv2 f7511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final du2 f7512c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lv2 f7514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7515f = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque f7513d = new ArrayDeque();

    public ev2(iu2 iu2Var, du2 du2Var, cv2 cv2Var) {
        this.f7510a = iu2Var;
        this.f7512c = du2Var;
        this.f7511b = cv2Var;
        du2Var.b(new zu2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        if (((Boolean) h2.y.c().b(ns.f12127l6)).booleanValue() && !g2.t.q().h().o().h()) {
            this.f7513d.clear();
            return;
        }
        if (i()) {
            while (!this.f7513d.isEmpty()) {
                dv2 dv2Var = (dv2) this.f7513d.pollFirst();
                if (dv2Var == null || (dv2Var.j() != null && this.f7510a.a(dv2Var.j()))) {
                    lv2 lv2Var = new lv2(this.f7510a, this.f7511b, dv2Var);
                    this.f7514e = lv2Var;
                    lv2Var.d(new av2(this, dv2Var));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.f7514e == null;
    }

    public final synchronized x3.d a(dv2 dv2Var) {
        this.f7515f = 2;
        if (i()) {
            return null;
        }
        return this.f7514e.a(dv2Var);
    }

    public final synchronized void e(dv2 dv2Var) {
        this.f7513d.add(dv2Var);
    }

    final /* synthetic */ void f() {
        synchronized (this) {
            this.f7515f = 1;
            h();
        }
    }
}

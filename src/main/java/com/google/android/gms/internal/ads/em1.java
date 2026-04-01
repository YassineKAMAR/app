package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import z1.y;

/* JADX INFO: loaded from: classes.dex */
public final class em1 extends y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qg1 f7427a;

    public em1(qg1 qg1Var) {
        this.f7427a = qg1Var;
    }

    private static h2.s2 f(qg1 qg1Var) {
        h2.p2 p2VarW = qg1Var.W();
        if (p2VarW == null) {
            return null;
        }
        try {
            return p2VarW.r();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // z1.y.a
    public final void a() {
        h2.s2 s2VarF = f(this.f7427a);
        if (s2VarF == null) {
            return;
        }
        try {
            s2VarF.m();
        } catch (RemoteException e8) {
            qg0.h("Unable to call onVideoEnd()", e8);
        }
    }

    @Override // z1.y.a
    public final void c() {
        h2.s2 s2VarF = f(this.f7427a);
        if (s2VarF == null) {
            return;
        }
        try {
            s2VarF.q();
        } catch (RemoteException e8) {
            qg0.h("Unable to call onVideoEnd()", e8);
        }
    }

    @Override // z1.y.a
    public final void e() {
        h2.s2 s2VarF = f(this.f7427a);
        if (s2VarF == null) {
            return;
        }
        try {
            s2VarF.r();
        } catch (RemoteException e8) {
            qg0.h("Unable to call onVideoEnd()", e8);
        }
    }
}

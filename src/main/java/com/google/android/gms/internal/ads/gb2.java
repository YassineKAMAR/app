package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class gb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mb2 f8282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h2.m2 f8284c;

    public gb2(mb2 mb2Var, String str) {
        this.f8282a = mb2Var;
        this.f8283b = str;
    }

    public final synchronized String a() {
        h2.m2 m2Var;
        try {
            m2Var = this.f8284c;
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            return null;
        }
        return m2Var != null ? m2Var.q() : null;
    }

    public final synchronized String b() {
        h2.m2 m2Var;
        try {
            m2Var = this.f8284c;
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            return null;
        }
        return m2Var != null ? m2Var.q() : null;
    }

    public final synchronized void d(h2.r4 r4Var, int i8) {
        this.f8284c = null;
        nb2 nb2Var = new nb2(i8);
        fb2 fb2Var = new fb2(this);
        this.f8282a.a(r4Var, this.f8283b, nb2Var, fb2Var);
    }

    public final synchronized boolean e() {
        return this.f8282a.j();
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 extends h2.o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12863a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.p2 f12864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p50 f12865c;

    public pg1(h2.p2 p2Var, p50 p50Var) {
        this.f12864b = p2Var;
        this.f12865c = p50Var;
    }

    @Override // h2.p2
    public final float m() throws RemoteException {
        throw new RemoteException();
    }

    @Override // h2.p2
    public final float n() {
        p50 p50Var = this.f12865c;
        if (p50Var != null) {
            return p50Var.q();
        }
        return 0.0f;
    }

    @Override // h2.p2
    public final void n0(boolean z7) throws RemoteException {
        throw new RemoteException();
    }

    @Override // h2.p2
    public final int o() throws RemoteException {
        throw new RemoteException();
    }

    @Override // h2.p2
    public final float q() {
        p50 p50Var = this.f12865c;
        if (p50Var != null) {
            return p50Var.o();
        }
        return 0.0f;
    }

    @Override // h2.p2
    public final h2.s2 r() {
        synchronized (this.f12863a) {
            h2.p2 p2Var = this.f12864b;
            if (p2Var == null) {
                return null;
            }
            return p2Var.r();
        }
    }

    @Override // h2.p2
    public final void s() throws RemoteException {
        throw new RemoteException();
    }

    @Override // h2.p2
    public final void u() throws RemoteException {
        throw new RemoteException();
    }

    @Override // h2.p2
    public final void v() throws RemoteException {
        throw new RemoteException();
    }

    @Override // h2.p2
    public final boolean w() throws RemoteException {
        throw new RemoteException();
    }

    @Override // h2.p2
    public final void x4(h2.s2 s2Var) {
        synchronized (this.f12863a) {
            h2.p2 p2Var = this.f12864b;
            if (p2Var != null) {
                p2Var.x4(s2Var);
            }
        }
    }

    @Override // h2.p2
    public final boolean y() throws RemoteException {
        throw new RemoteException();
    }

    @Override // h2.p2
    public final boolean z() throws RemoteException {
        throw new RemoteException();
    }
}

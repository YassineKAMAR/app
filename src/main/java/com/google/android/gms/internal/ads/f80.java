package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f80 extends com.google.android.gms.ads.nativead.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sx f7661a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e80 f7663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a.AbstractC0073a f7664d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7662b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f7665e = new ArrayList();

    public f80(sx sxVar) {
        wv wvVarS;
        this.f7661a = sxVar;
        d80 d80Var = null;
        try {
            List listE = sxVar.E();
            if (listE != null) {
                for (Object obj : listE) {
                    wv wvVarO5 = obj instanceof IBinder ? vv.O5((IBinder) obj) : null;
                    if (wvVarO5 != null) {
                        this.f7662b.add(new e80(wvVarO5));
                    }
                }
            }
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
        try {
            List listA = this.f7661a.A();
            if (listA != null) {
                for (Object obj2 : listA) {
                    h2.u1 u1VarO5 = obj2 instanceof IBinder ? h2.t1.O5((IBinder) obj2) : null;
                    if (u1VarO5 != null) {
                        this.f7665e.add(new h2.v1(u1VarO5));
                    }
                }
            }
        } catch (RemoteException e9) {
            qg0.e("", e9);
        }
        try {
            wvVarS = this.f7661a.s();
        } catch (RemoteException e10) {
            qg0.e("", e10);
        }
        e80 e80Var = wvVarS != null ? new e80(wvVarS) : null;
        this.f7663c = e80Var;
        try {
            if (this.f7661a.r() != null) {
                d80Var = new d80(this.f7661a.r());
            }
        } catch (RemoteException e11) {
            qg0.e("", e11);
        }
        this.f7664d = d80Var;
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final void a() {
        try {
            this.f7661a.D();
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final String b() {
        try {
            return this.f7661a.v();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final String c() {
        try {
            return this.f7661a.w();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final String d() {
        try {
            return this.f7661a.y();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final String e() {
        try {
            return this.f7661a.z();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final a.b f() {
        return this.f7663c;
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final z1.w g() {
        h2.m2 m2VarQ;
        try {
            m2VarQ = this.f7661a.q();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            m2VarQ = null;
        }
        return z1.w.f(m2VarQ);
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final Double h() {
        try {
            double dM = this.f7661a.m();
            if (dM == -1.0d) {
                return null;
            }
            return Double.valueOf(dM);
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final String i() {
        try {
            return this.f7661a.G();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.a
    public final void j(z1.q qVar) {
        try {
            this.f7661a.y2(new h2.e4(qVar));
        } catch (RemoteException e8) {
            qg0.e("Failed to setOnPaidEventListener", e8);
        }
    }

    @Override // com.google.android.gms.ads.nativead.a
    protected final /* bridge */ /* synthetic */ Object k() {
        try {
            return this.f7661a.x();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }
}

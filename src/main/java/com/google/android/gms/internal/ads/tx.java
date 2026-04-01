package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tx extends c2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sx f15359a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xv f15361c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c2.c f15363e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f15360b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z1.y f15362d = new z1.y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f15364f = new ArrayList();

    public tx(sx sxVar) {
        wv wvVarS;
        wv uvVar;
        IBinder iBinder;
        this.f15359a = sxVar;
        qv qvVar = null;
        try {
            List listE = sxVar.E();
            if (listE != null) {
                for (Object obj : listE) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        uvVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        uvVar = iInterfaceQueryLocalInterface instanceof wv ? (wv) iInterfaceQueryLocalInterface : new uv(iBinder);
                    }
                    if (uvVar != null) {
                        this.f15360b.add(new xv(uvVar));
                    }
                }
            }
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
        try {
            List listA = this.f15359a.A();
            if (listA != null) {
                for (Object obj2 : listA) {
                    h2.u1 u1VarO5 = obj2 instanceof IBinder ? h2.t1.O5((IBinder) obj2) : null;
                    if (u1VarO5 != null) {
                        this.f15364f.add(new h2.v1(u1VarO5));
                    }
                }
            }
        } catch (RemoteException e9) {
            qg0.e("", e9);
        }
        try {
            wvVarS = this.f15359a.s();
        } catch (RemoteException e10) {
            qg0.e("", e10);
        }
        xv xvVar = wvVarS != null ? new xv(wvVarS) : null;
        this.f15361c = xvVar;
        try {
            if (this.f15359a.r() != null) {
                qvVar = new qv(this.f15359a.r());
            }
        } catch (RemoteException e11) {
            qg0.e("", e11);
        }
        this.f15363e = qvVar;
    }

    @Override // c2.h
    public final String a() {
        try {
            return this.f15359a.v();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // c2.h
    public final String b() {
        try {
            return this.f15359a.w();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // c2.h
    public final String c() {
        try {
            return this.f15359a.y();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // c2.h
    public final String d() {
        try {
            return this.f15359a.z();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // c2.h
    public final c2.d e() {
        return this.f15361c;
    }

    @Override // c2.h
    public final List<c2.d> f() {
        return this.f15360b;
    }

    @Override // c2.h
    public final String g() {
        try {
            return this.f15359a.C();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // c2.h
    public final Double h() {
        try {
            double dM = this.f15359a.m();
            if (dM == -1.0d) {
                return null;
            }
            return Double.valueOf(dM);
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // c2.h
    public final String i() {
        try {
            return this.f15359a.G();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    @Override // c2.h
    public final z1.y j() {
        try {
            if (this.f15359a.o() != null) {
                this.f15362d.c(this.f15359a.o());
            }
        } catch (RemoteException e8) {
            qg0.e("Exception occurred while getting video controller", e8);
        }
        return this.f15362d;
    }

    @Override // c2.h
    public final Object k() {
        try {
            g3.a aVarU = this.f15359a.u();
            if (aVarU != null) {
                return g3.b.H0(aVarU);
            }
            return null;
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }
}

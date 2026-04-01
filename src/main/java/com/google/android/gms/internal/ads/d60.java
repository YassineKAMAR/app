package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class d60 implements l2.k, l2.p, l2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g50 f6593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l2.x f6594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c2.f f6595c;

    public d60(g50 g50Var) {
        this.f6593a = g50Var;
    }

    @Override // l2.k
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdClosed.");
        try {
            this.f6593a.n();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.r
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdOpened.");
        try {
            this.f6593a.y();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.p
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter, int i8) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdFailedToLoad with error " + i8 + ".");
        try {
            this.f6593a.F(i8);
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.r
    public final void d(MediationNativeAdapter mediationNativeAdapter, l2.x xVar) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdLoaded.");
        this.f6594b = xVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            z1.y yVar = new z1.y();
            yVar.c(new q50());
            if (xVar != null && xVar.r()) {
                xVar.K(yVar);
            }
        }
        try {
            this.f6593a.w();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.p
    public final void e(MediationInterstitialAdapter mediationInterstitialAdapter, z1.a aVar) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f6593a.O2(aVar.d());
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.k
    public final void f(MediationBannerAdapter mediationBannerAdapter, z1.a aVar) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f6593a.O2(aVar.d());
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.k
    public final void g(MediationBannerAdapter mediationBannerAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdClicked.");
        try {
            this.f6593a.m();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.r
    public final void h(MediationNativeAdapter mediationNativeAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdClosed.");
        try {
            this.f6593a.n();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.k
    public final void i(MediationBannerAdapter mediationBannerAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdLoaded.");
        try {
            this.f6593a.w();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.r
    public final void j(MediationNativeAdapter mediationNativeAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        l2.x xVar = this.f6594b;
        if (this.f6595c == null) {
            if (xVar == null) {
                qg0.i("#007 Could not call remote method.", null);
                return;
            } else if (!xVar.l()) {
                qg0.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        qg0.b("Adapter called onAdClicked.");
        try {
            this.f6593a.m();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.r
    public final void k(MediationNativeAdapter mediationNativeAdapter, c2.f fVar) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(fVar.a())));
        this.f6595c = fVar;
        try {
            this.f6593a.w();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.p
    public final void l(MediationInterstitialAdapter mediationInterstitialAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdLoaded.");
        try {
            this.f6593a.w();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.r
    public final void m(MediationNativeAdapter mediationNativeAdapter, c2.f fVar, String str) {
        if (!(fVar instanceof qw)) {
            qg0.g("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.f6593a.v5(((qw) fVar).b(), str);
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.k
    public final void n(MediationBannerAdapter mediationBannerAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdOpened.");
        try {
            this.f6593a.y();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.p
    public final void o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdClosed.");
        try {
            this.f6593a.n();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.r
    public final void p(MediationNativeAdapter mediationNativeAdapter, z1.a aVar) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f6593a.O2(aVar.d());
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.k
    public final void q(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAppEvent.");
        try {
            this.f6593a.w4(str, str2);
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.r
    public final void r(MediationNativeAdapter mediationNativeAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        l2.x xVar = this.f6594b;
        if (this.f6595c == null) {
            if (xVar == null) {
                qg0.i("#007 Could not call remote method.", null);
                return;
            } else if (!xVar.m()) {
                qg0.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        qg0.b("Adapter called onAdImpression.");
        try {
            this.f6593a.x();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // l2.p
    public final void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        a3.o.e("#008 Must be called on the main UI thread.");
        qg0.b("Adapter called onAdOpened.");
        try {
            this.f6593a.y();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final c2.f t() {
        return this.f6595c;
    }

    public final l2.x u() {
        return this.f6594b;
    }
}

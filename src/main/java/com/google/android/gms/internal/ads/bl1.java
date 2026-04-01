package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bl1 extends ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg1 f5868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rh1 f5869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private lg1 f5870d;

    public bl1(Context context, qg1 qg1Var, rh1 rh1Var, lg1 lg1Var) {
        this.f5867a = context;
        this.f5868b = qg1Var;
        this.f5869c = rh1Var;
        this.f5870d = lg1Var;
    }

    private final kv Q5(String str) {
        return new al1(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final boolean G() {
        qz2 qz2VarH0 = this.f5868b.h0();
        if (qz2VarH0 == null) {
            qg0.g("Trying to start OMID session before creation.");
            return false;
        }
        g2.t.a().b(qz2VarH0);
        if (this.f5868b.e0() == null) {
            return true;
        }
        this.f5868b.e0().U("onSdkLoaded", new p.a());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final String S4(String str) {
        return (String) this.f5868b.V().get(str);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void X3(g3.a aVar) {
        lg1 lg1Var;
        Object objH0 = g3.b.H0(aVar);
        if (!(objH0 instanceof View) || this.f5868b.h0() == null || (lg1Var = this.f5870d) == null) {
            return;
        }
        lg1Var.o((View) objH0);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void Z(String str) {
        lg1 lg1Var = this.f5870d;
        if (lg1Var != null) {
            lg1Var.k(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final boolean a0(g3.a aVar) {
        rh1 rh1Var;
        Object objH0 = g3.b.H0(aVar);
        if (!(objH0 instanceof ViewGroup) || (rh1Var = this.f5869c) == null || !rh1Var.f((ViewGroup) objH0)) {
            return false;
        }
        this.f5868b.d0().M0(Q5("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final wv g0(String str) {
        return (wv) this.f5868b.U().get(str);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final h2.p2 m() {
        return this.f5868b.W();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final tv n() {
        try {
            return this.f5870d.M().a();
        } catch (NullPointerException e8) {
            g2.t.q().u(e8, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final g3.a o() {
        return g3.b.k3(this.f5867a);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final String r() {
        return this.f5868b.a();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final List s() {
        try {
            p.h hVarU = this.f5868b.U();
            p.h hVarV = this.f5868b.V();
            String[] strArr = new String[hVarU.size() + hVarV.size()];
            int i8 = 0;
            for (int i9 = 0; i9 < hVarU.size(); i9++) {
                strArr[i8] = (String) hVarU.j(i9);
                i8++;
            }
            for (int i10 = 0; i10 < hVarV.size(); i10++) {
                strArr[i8] = (String) hVarV.j(i10);
                i8++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e8) {
            g2.t.q().u(e8, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final boolean t0(g3.a aVar) {
        rh1 rh1Var;
        Object objH0 = g3.b.H0(aVar);
        if (!(objH0 instanceof ViewGroup) || (rh1Var = this.f5869c) == null || !rh1Var.g((ViewGroup) objH0)) {
            return false;
        }
        this.f5868b.f0().M0(Q5("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void u() {
        lg1 lg1Var = this.f5870d;
        if (lg1Var != null) {
            lg1Var.a();
        }
        this.f5870d = null;
        this.f5869c = null;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void w() {
        lg1 lg1Var = this.f5870d;
        if (lg1Var != null) {
            lg1Var.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final void x() {
        try {
            String strC = this.f5868b.c();
            if (strC != "Google" && (strC == null || !strC.equals("Google"))) {
                if (TextUtils.isEmpty(strC)) {
                    qg0.g("Not starting OMID session. OM partner name has not been configured.");
                    return;
                }
                lg1 lg1Var = this.f5870d;
                if (lg1Var != null) {
                    lg1Var.P(strC, false);
                    return;
                }
                return;
            }
            qg0.g("Illegal argument specified for omid partner name.");
        } catch (NullPointerException e8) {
            g2.t.q().u(e8, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final boolean z() {
        lg1 lg1Var = this.f5870d;
        return (lg1Var == null || lg1Var.B()) && this.f5868b.e0() != null && this.f5868b.f0() == null;
    }
}

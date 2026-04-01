package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.fo2;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.ic0;
import com.google.android.gms.internal.ads.j80;
import com.google.android.gms.internal.ads.lh1;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.ads.nh1;
import com.google.android.gms.internal.ads.nm2;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.or1;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.pr2;
import com.google.android.gms.internal.ads.q80;
import com.google.android.gms.internal.ads.rb0;
import com.google.android.gms.internal.ads.wg0;
import com.google.android.gms.internal.ads.x92;
import com.google.android.gms.internal.ads.z40;
import com.google.android.gms.internal.ads.zp2;
import g2.s;
import g3.a;
import g3.b;
import h2.c1;
import h2.i2;
import h2.n1;
import h2.o0;
import h2.s0;
import h2.w3;
import h2.w4;
import h2.y;
import i2.d;
import i2.e0;
import i2.f;
import i2.g;
import i2.z;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends c1 {
    @Override // h2.d1
    public final j80 F3(a aVar, z40 z40Var, int i8) {
        return bo0.g((Context) b.H0(aVar), z40Var, i8).r();
    }

    @Override // h2.d1
    public final o0 H2(a aVar, String str, z40 z40Var, int i8) {
        Context context = (Context) b.H0(aVar);
        return new x92(bo0.g(context, z40Var, i8), context, str);
    }

    @Override // h2.d1
    public final s0 O0(a aVar, w4 w4Var, String str, z40 z40Var, int i8) {
        Context context = (Context) b.H0(aVar);
        fo2 fo2VarX = bo0.g(context, z40Var, i8).x();
        fo2VarX.b(context);
        fo2VarX.a(w4Var);
        fo2VarX.c(str);
        return fo2VarX.p().j();
    }

    @Override // h2.d1
    public final i2 Q0(a aVar, z40 z40Var, int i8) {
        return bo0.g((Context) b.H0(aVar), z40Var, i8).q();
    }

    @Override // h2.d1
    public final s0 R2(a aVar, w4 w4Var, String str, z40 z40Var, int i8) {
        Context context = (Context) b.H0(aVar);
        nm2 nm2VarW = bo0.g(context, z40Var, i8).w();
        nm2VarW.a(str);
        nm2VarW.b(context);
        return i8 >= ((Integer) y.c().b(ns.f12063e5)).intValue() ? nm2VarW.l().j() : new w3();
    }

    @Override // h2.d1
    public final rb0 W4(a aVar, z40 z40Var, int i8) {
        Context context = (Context) b.H0(aVar);
        pr2 pr2VarZ = bo0.g(context, z40Var, i8).z();
        pr2VarZ.b(context);
        return pr2VarZ.l().k();
    }

    @Override // h2.d1
    public final s0 c1(a aVar, w4 w4Var, String str, int i8) {
        return new s((Context) b.H0(aVar), w4Var, str, new wg0(233702000, i8, true, false));
    }

    @Override // h2.d1
    public final p00 e2(a aVar, z40 z40Var, int i8, n00 n00Var) {
        Context context = (Context) b.H0(aVar);
        or1 or1VarO = bo0.g(context, z40Var, i8).o();
        or1VarO.b(context);
        or1VarO.c(n00Var);
        return or1VarO.l().p();
    }

    @Override // h2.d1
    public final ff0 f1(a aVar, z40 z40Var, int i8) {
        return bo0.g((Context) b.H0(aVar), z40Var, i8).u();
    }

    @Override // h2.d1
    public final ic0 g1(a aVar, String str, z40 z40Var, int i8) {
        Context context = (Context) b.H0(aVar);
        pr2 pr2VarZ = bo0.g(context, z40Var, i8).z();
        pr2VarZ.b(context);
        pr2VarZ.a(str);
        return pr2VarZ.l().j();
    }

    @Override // h2.d1
    public final q80 j0(a aVar) {
        Activity activity = (Activity) b.H0(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelG = AdOverlayInfoParcel.g(activity.getIntent());
        if (adOverlayInfoParcelG == null) {
            return new z(activity);
        }
        int i8 = adOverlayInfoParcelG.f4734k;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? new z(activity) : new d(activity) : new e0(activity, adOverlayInfoParcelG) : new g(activity) : new f(activity) : new i2.y(activity);
    }

    @Override // h2.d1
    public final s0 n1(a aVar, w4 w4Var, String str, z40 z40Var, int i8) {
        Context context = (Context) b.H0(aVar);
        zp2 zp2VarY = bo0.g(context, z40Var, i8).y();
        zp2VarY.b(context);
        zp2VarY.a(w4Var);
        zp2VarY.c(str);
        return zp2VarY.p().j();
    }

    @Override // h2.d1
    public final aw n3(a aVar, a aVar2) {
        return new nh1((FrameLayout) b.H0(aVar), (FrameLayout) b.H0(aVar2), 233702000);
    }

    @Override // h2.d1
    public final n1 s0(a aVar, int i8) {
        return bo0.g((Context) b.H0(aVar), null, i8).h();
    }

    @Override // h2.d1
    public final fw z5(a aVar, a aVar2, a aVar3) {
        return new lh1((View) b.H0(aVar), (HashMap) b.H0(aVar2), (HashMap) b.H0(aVar3));
    }
}

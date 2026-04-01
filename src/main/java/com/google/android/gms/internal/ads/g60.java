package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g60 extends o50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.x f8225a;

    public g60(l2.x xVar) {
        this.f8225a = xVar;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final List A() {
        List<c2.d> listJ = this.f8225a.j();
        ArrayList arrayList = new ArrayList();
        if (listJ != null) {
            for (c2.d dVar : listJ) {
                arrayList.add(new jv(dVar.a(), dVar.c(), dVar.b(), dVar.e(), dVar.d()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final void A5(g3.a aVar) {
        this.f8225a.q((View) g3.b.H0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String B() {
        return this.f8225a.d();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String C() {
        return this.f8225a.h();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final void D() {
        this.f8225a.s();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String E() {
        return this.f8225a.p();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String G() {
        return this.f8225a.n();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final void I3(g3.a aVar) {
        this.f8225a.F((View) g3.b.H0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final void Q1(g3.a aVar, g3.a aVar2, g3.a aVar3) {
        HashMap map = (HashMap) g3.b.H0(aVar2);
        HashMap map2 = (HashMap) g3.b.H0(aVar3);
        this.f8225a.E((View) g3.b.H0(aVar), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final boolean R() {
        return this.f8225a.l();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final boolean f0() {
        return this.f8225a.m();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final double m() {
        if (this.f8225a.o() != null) {
            return this.f8225a.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final float n() {
        return this.f8225a.k();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final float o() {
        return this.f8225a.f();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final float q() {
        return this.f8225a.e();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final Bundle r() {
        return this.f8225a.g();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final pv s() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final h2.p2 t() {
        if (this.f8225a.H() != null) {
            return this.f8225a.H().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final wv u() {
        c2.d dVarI = this.f8225a.i();
        if (dVarI != null) {
            return new jv(dVarI.a(), dVarI.c(), dVarI.b(), dVarI.e(), dVarI.d());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final g3.a v() {
        View viewG = this.f8225a.G();
        if (viewG == null) {
            return null;
        }
        return g3.b.k3(viewG);
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final g3.a w() {
        Object objI = this.f8225a.I();
        if (objI == null) {
            return null;
        }
        return g3.b.k3(objI);
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final g3.a x() {
        View viewA = this.f8225a.a();
        if (viewA == null) {
            return null;
        }
        return g3.b.k3(viewA);
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String y() {
        return this.f8225a.b();
    }

    @Override // com.google.android.gms.internal.ads.p50
    public final String z() {
        return this.f8225a.c();
    }
}

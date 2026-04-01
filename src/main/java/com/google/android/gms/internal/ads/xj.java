package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class xj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f17271i;

    public xj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, View view) {
        super(iiVar, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", ceVar, i8, 57);
        this.f17271i = view;
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        if (this.f17271i != null) {
            Boolean bool = (Boolean) h2.y.c().b(ns.f12088h3);
            Boolean bool2 = (Boolean) h2.y.c().b(ns.aa);
            mi miVar = new mi((String) this.f5297f.invoke(null, this.f17271i, this.f5293b.b().getResources().getDisplayMetrics(), bool, bool2));
            xe xeVarM = ye.M();
            xeVarM.v(miVar.f11309b.longValue());
            xeVarM.x(miVar.f11310c.longValue());
            xeVarM.y(miVar.f11311d.longValue());
            if (bool2.booleanValue()) {
                xeVarM.w(miVar.f11313f.longValue());
            }
            if (bool.booleanValue()) {
                xeVarM.u(miVar.f11312e.longValue());
            }
            this.f5296e.S((ye) xeVarM.q());
        }
    }
}

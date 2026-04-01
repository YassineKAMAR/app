package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class go1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f8439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f8440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f8441e;

    public go1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5) {
        this.f8437a = w84Var;
        this.f8438b = w84Var2;
        this.f8439c = w84Var3;
        this.f8440d = w84Var4;
        this.f8441e = w84Var5;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Context contextA = ((io0) this.f8437a).a();
        final String strK = ((yu1) this.f8438b).k();
        wg0 wg0VarA = ((uo0) this.f8439c).a();
        final fo foVar = (fo) this.f8440d.k();
        final String str = (String) this.f8441e.k();
        vn vnVar = new vn(new bo(contextA));
        xq xqVarM = yq.M();
        xqVarM.u(wg0VarA.f16724b);
        xqVarM.w(wg0VarA.f16725c);
        xqVarM.v(true != wg0VarA.f16726d ? 2 : 0);
        final yq yqVar = (yq) xqVarM.q();
        vnVar.b(new un() { // from class: com.google.android.gms.internal.ads.fo1
            @Override // com.google.android.gms.internal.ads.un
            public final void a(lp lpVar) {
                go goVar = (go) lpVar.u().m();
                goVar.u(foVar);
                lpVar.y(goVar);
                dp dpVar = (dp) lpVar.v().m();
                dpVar.u(strK);
                dpVar.v(yqVar);
                lpVar.A(dpVar);
                lpVar.B(str);
            }
        });
        return vnVar;
    }
}

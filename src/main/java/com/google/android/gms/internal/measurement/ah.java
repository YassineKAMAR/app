package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ah extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f18578c;

    public ah(b bVar) {
        super("internal.registerCallback");
        this.f18578c = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        a6.g(this.f18934a, 3, list);
        String strN = b7Var.b(list.get(0)).n();
        r rVarB = b7Var.b(list.get(1));
        if (!(rVarB instanceof s)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        r rVarB2 = b7Var.b(list.get(2));
        if (!(rVarB2 instanceof q)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        q qVar = (q) rVarB2;
        if (!qVar.e("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f18578c.c(strN, qVar.e("priority") ? a6.i(qVar.a("priority").m().doubleValue()) : 1000, (s) rVarB, qVar.a("type").n());
        return r.L;
    }
}

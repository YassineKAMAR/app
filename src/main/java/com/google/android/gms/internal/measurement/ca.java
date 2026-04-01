package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ca extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f18624c;

    public ca(d dVar) {
        super("internal.eventLogger");
        this.f18624c = dVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        a6.g(this.f18934a, 3, list);
        String strN = b7Var.b(list.get(0)).n();
        long jA = (long) a6.a(b7Var.b(list.get(1)).m().doubleValue());
        r rVarB = b7Var.b(list.get(2));
        this.f18624c.c(strN, jA, rVarB instanceof q ? a6.e((q) rVarB) : new HashMap<>());
        return r.L;
    }
}

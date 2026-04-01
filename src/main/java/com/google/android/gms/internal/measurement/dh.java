package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dh extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cb f18657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, m> f18658d;

    public dh(cb cbVar) {
        super("require");
        this.f18658d = new HashMap();
        this.f18657c = cbVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        a6.g("require", 1, list);
        String strN = b7Var.b(list.get(0)).n();
        if (this.f18658d.containsKey(strN)) {
            return this.f18658d.get(strN);
        }
        r rVarA = this.f18657c.a(strN);
        if (rVarA instanceof m) {
            this.f18658d.put(strN, (m) rVarA);
        }
        return rVarA;
    }
}

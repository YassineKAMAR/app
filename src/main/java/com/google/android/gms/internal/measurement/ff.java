package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ff extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ee f18702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ff(cc ccVar, String str, ee eeVar) {
        super(str);
        this.f18702c = eeVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        a6.g("getValue", 2, list);
        r rVarB = b7Var.b(list.get(0));
        r rVarB2 = b7Var.b(list.get(1));
        String strA = this.f18702c.a(rVarB.n());
        return strA != null ? new t(strA) : rVarB2;
    }
}

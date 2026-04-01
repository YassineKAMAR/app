package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cc extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ee f18626c;

    public cc(String str, ee eeVar) {
        super(str);
        this.f18626c = eeVar;
        this.f18935b.put("getValue", new ff(this, "getValue", eeVar));
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        return r.L;
    }
}

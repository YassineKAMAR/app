package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class bh extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable<Object> f18610c;

    public bh(String str, Callable<Object> callable) {
        super(str);
        this.f18610c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        try {
            return b9.b(this.f18610c.call());
        } catch (Exception unused) {
            return r.L;
        }
    }
}

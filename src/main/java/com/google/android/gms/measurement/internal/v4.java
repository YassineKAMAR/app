package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class v4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t4 f20549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f20551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f20552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, List<String>> f20554f;

    private v4(String str, t4 t4Var, int i8, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        a3.o.j(t4Var);
        this.f20549a = t4Var;
        this.f20550b = i8;
        this.f20551c = th;
        this.f20552d = bArr;
        this.f20553e = str;
        this.f20554f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20549a.a(this.f20553e, this.f20550b, this.f20551c, this.f20552d, this.f20554f);
    }
}

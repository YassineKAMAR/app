package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ke2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f10051a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e3.e f10052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oi2 f10053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f10054d;

    public ke2(oi2 oi2Var, long j8, e3.e eVar) {
        this.f10052b = eVar;
        this.f10053c = oi2Var;
        this.f10054d = j8;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        je2 je2Var = (je2) this.f10051a.get();
        if (je2Var == null || je2Var.a()) {
            oi2 oi2Var = this.f10053c;
            je2 je2Var2 = new je2(oi2Var.k(), this.f10054d, this.f10052b);
            this.f10051a.set(je2Var2);
            je2Var = je2Var2;
        }
        return je2Var.f9579a;
    }
}

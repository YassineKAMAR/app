package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ql2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f13559c;

    public ql2(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f13557a = w84Var;
        this.f13558b = w84Var2;
        this.f13559c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        return new ol2(new u80(), (ScheduledExecutorService) this.f13558b.k(), ((io0) this.f13559c).a());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class xh2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f17232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f17233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f17234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f17235f;

    public xh2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5, w84 w84Var6) {
        this.f17230a = w84Var;
        this.f17231b = w84Var2;
        this.f17232c = w84Var3;
        this.f17233d = w84Var4;
        this.f17234e = w84Var5;
        this.f17235f = w84Var6;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new vh2(lg3Var, (ScheduledExecutorService) this.f17231b.k(), (String) this.f17232c.k(), (Context) this.f17233d.k(), ((x31) this.f17234e).a(), (bo0) this.f17235f.k());
    }
}

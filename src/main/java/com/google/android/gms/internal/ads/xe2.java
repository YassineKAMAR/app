package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class xe2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17195b;

    public xe2(w84 w84Var, w84 w84Var2) {
        this.f17194a = w84Var;
        this.f17195b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        ob3 ob3VarA;
        me2 me2VarA = pe2.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f17195b.k();
        if (((Boolean) h2.y.c().b(ns.R3)).booleanValue()) {
            ob3VarA = ob3.B(new vg2(me2VarA, ((Integer) h2.y.c().b(ns.S3)).intValue(), scheduledExecutorService));
        } else {
            ob3VarA = ob3.A();
        }
        r84.b(ob3VarA);
        return ob3VarA;
    }
}

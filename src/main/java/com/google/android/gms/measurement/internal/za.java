package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class za implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ va f20761b;

    za(va vaVar, lb lbVar) {
        this.f20761b = vaVar;
        this.f20760a = lbVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        p4 p4VarK;
        String str;
        if (this.f20761b.Q((String) a3.o.j(this.f20760a.f20210a)).y() && y6.e(this.f20760a.f20231v).y()) {
            r5 r5VarD = this.f20761b.d(this.f20760a);
            if (r5VarD != null) {
                return r5VarD.u0();
            }
            p4VarK = this.f20761b.t().L();
            str = "App info was null when attempting to get app instance id";
        } else {
            p4VarK = this.f20761b.t().K();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        p4VarK.a(str);
        return null;
    }
}

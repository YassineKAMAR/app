package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class pu1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f13138c;

    public pu1(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f13136a = w84Var;
        this.f13137b = w84Var2;
        this.f13138c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        final gh ghVar = (gh) this.f13136a.k();
        final Context contextA = ((io0) this.f13137b).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        x3.d dVarZ = lg3Var.Z(new Callable() { // from class: com.google.android.gms.internal.ads.mu1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ghVar.c().c(contextA);
            }
        });
        r84.b(dVarZ);
        return dVarZ;
    }
}

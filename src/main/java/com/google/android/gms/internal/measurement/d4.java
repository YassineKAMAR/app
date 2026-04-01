package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f18639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b7 f18640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b7 f18641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cb f18642d;

    public d4() {
        d0 d0Var = new d0();
        this.f18639a = d0Var;
        b7 b7Var = new b7(null, d0Var);
        this.f18641c = b7Var;
        this.f18640b = b7Var.d();
        cb cbVar = new cb();
        this.f18642d = cbVar;
        b7Var.h("require", new dh(cbVar));
        cbVar.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.b3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ch();
            }
        });
        b7Var.h("runtime.counter", new j(Double.valueOf(0.0d)));
    }

    public final r a(b7 b7Var, p5... p5VarArr) {
        r rVarA = r.L;
        for (p5 p5Var : p5VarArr) {
            rVarA = b9.a(p5Var);
            a6.b(this.f18641c);
            if ((rVarA instanceof u) || (rVarA instanceof s)) {
                rVarA = this.f18639a.a(b7Var, rVarA);
            }
        }
        return rVarA;
    }

    public final void b(String str, Callable<? extends m> callable) {
        this.f18642d.b(str, callable);
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f18581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b7 f18582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f18583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f18584d;

    public b0() {
        this(new d4());
    }

    private b0(d4 d4Var) {
        this.f18581a = d4Var;
        this.f18582b = d4Var.f18640b.d();
        this.f18583c = new d();
        this.f18584d = new b();
        d4Var.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18536a.e();
            }
        });
        d4Var.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ca(this.f18538a.f18583c);
            }
        });
    }

    public final d a() {
        return this.f18583c;
    }

    public final void b(o5 o5Var) throws b1 {
        m mVar;
        try {
            this.f18582b = this.f18581a.f18640b.d();
            if (this.f18581a.a(this.f18582b, (p5[]) o5Var.H().toArray(new p5[0])) instanceof k) {
                throw new IllegalStateException("Program loading failed");
            }
            for (n5 n5Var : o5Var.F().H()) {
                List<p5> listH = n5Var.H();
                String strG = n5Var.G();
                Iterator<p5> it = listH.iterator();
                while (it.hasNext()) {
                    r rVarA = this.f18581a.a(this.f18582b, it.next());
                    if (!(rVarA instanceof q)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    b7 b7Var = this.f18582b;
                    if (b7Var.g(strG)) {
                        r rVarC = b7Var.c(strG);
                        if (!(rVarC instanceof m)) {
                            throw new IllegalStateException("Invalid function name: " + strG);
                        }
                        mVar = (m) rVarC;
                    } else {
                        mVar = null;
                    }
                    if (mVar == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strG);
                    }
                    mVar.b(this.f18582b, Collections.singletonList(rVarA));
                }
            }
        } catch (Throwable th) {
            throw new b1(th);
        }
    }

    public final void c(String str, Callable<? extends m> callable) {
        this.f18581a.b(str, callable);
    }

    public final boolean d(e eVar) {
        try {
            this.f18583c.b(eVar);
            this.f18581a.f18641c.h("runtime.counter", new j(Double.valueOf(0.0d)));
            this.f18584d.b(this.f18582b.d(), this.f18583c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new b1(th);
        }
    }

    final /* synthetic */ m e() {
        return new ah(this.f18584d);
    }

    public final boolean f() {
        return !this.f18583c.f().isEmpty();
    }

    public final boolean g() {
        return !this.f18583c.d().equals(this.f18583c.a());
    }
}

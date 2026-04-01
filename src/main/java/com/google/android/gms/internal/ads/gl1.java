package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class gl1 implements h2.a, ey, i2.u, hy, i2.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h2.a f8383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ey f8384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i2.u f8385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private hy f8386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i2.f0 f8387e;

    @Override // com.google.android.gms.internal.ads.ey
    public final synchronized void G(String str, Bundle bundle) {
        ey eyVar = this.f8384b;
        if (eyVar != null) {
            eyVar.G(str, bundle);
        }
    }

    @Override // i2.u
    public final synchronized void G5() {
        i2.u uVar = this.f8385c;
        if (uVar != null) {
            uVar.G5();
        }
    }

    @Override // h2.a
    public final synchronized void Z() {
        h2.a aVar = this.f8383a;
        if (aVar != null) {
            aVar.Z();
        }
    }

    protected final synchronized void a(h2.a aVar, ey eyVar, i2.u uVar, hy hyVar, i2.f0 f0Var) {
        this.f8383a = aVar;
        this.f8384b = eyVar;
        this.f8385c = uVar;
        this.f8386d = hyVar;
        this.f8387e = f0Var;
    }

    @Override // com.google.android.gms.internal.ads.hy
    public final synchronized void b(String str, String str2) {
        hy hyVar = this.f8386d;
        if (hyVar != null) {
            hyVar.b(str, str2);
        }
    }

    @Override // i2.u
    public final synchronized void h5() {
        i2.u uVar = this.f8385c;
        if (uVar != null) {
            uVar.h5();
        }
    }

    @Override // i2.u
    public final synchronized void k0() {
        i2.u uVar = this.f8385c;
        if (uVar != null) {
            uVar.k0();
        }
    }

    @Override // i2.f0
    public final synchronized void q() {
        i2.f0 f0Var = this.f8387e;
        if (f0Var != null) {
            f0Var.q();
        }
    }

    @Override // i2.u
    public final synchronized void q3() {
        i2.u uVar = this.f8385c;
        if (uVar != null) {
            uVar.q3();
        }
    }

    @Override // i2.u
    public final synchronized void v0(int i8) {
        i2.u uVar = this.f8385c;
        if (uVar != null) {
            uVar.v0(i8);
        }
    }

    @Override // i2.u
    public final synchronized void y4() {
        i2.u uVar = this.f8385c;
        if (uVar != null) {
            uVar.y4();
        }
    }
}

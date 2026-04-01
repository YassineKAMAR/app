package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class jr0 implements pr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n00 f9750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zp0 f9751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jr0 f9752d = this;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f9753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w84 f9754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w84 f9755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w84 f9756h;

    /* synthetic */ jr0(zp0 zp0Var, Context context, n00 n00Var, hr0 hr0Var) {
        this.f9751c = zp0Var;
        this.f9749a = context;
        this.f9750b = n00Var;
        j84 j84VarA = k84.a(this);
        this.f9753e = j84VarA;
        j84 j84VarA2 = k84.a(n00Var);
        this.f9754f = j84VarA2;
        lr1 lr1Var = new lr1(j84VarA2);
        this.f9755g = lr1Var;
        this.f9756h = i84.b(new nr1(j84VarA, lr1Var));
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final gr1 k() {
        return new cr0(this.f9751c, this.f9752d, null);
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final mr1 p() {
        return (mr1) this.f9756h.k();
    }
}

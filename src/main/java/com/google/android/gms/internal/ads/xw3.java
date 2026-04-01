package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xw3 implements on3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g94 f17486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17487c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17490f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a94 f17485a = new a94();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17488d = 8000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17489e = 8000;

    public final xw3 a(boolean z7) {
        this.f17490f = true;
        return this;
    }

    public final xw3 b(int i8) {
        this.f17488d = i8;
        return this;
    }

    public final xw3 c(int i8) {
        this.f17489e = i8;
        return this;
    }

    public final xw3 d(g94 g94Var) {
        this.f17486b = g94Var;
        return this;
    }

    public final xw3 e(String str) {
        this.f17487c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.on3
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final a24 j() {
        a24 a24Var = new a24(this.f17487c, this.f17488d, this.f17489e, this.f17490f, this.f17485a);
        g94 g94Var = this.f17486b;
        if (g94Var != null) {
            a24Var.a(g94Var);
        }
        return a24Var;
    }
}

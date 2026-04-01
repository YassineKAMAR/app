package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class bi0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ gi0 f5803c;

    bi0(gi0 gi0Var, int i8, int i9) {
        this.f5803c = gi0Var;
        this.f5801a = i8;
        this.f5802b = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi0 gi0Var = this.f5803c;
        if (gi0Var.f8350p != null) {
            gi0Var.f8350p.C0(this.f5801a, this.f5802b);
        }
    }
}

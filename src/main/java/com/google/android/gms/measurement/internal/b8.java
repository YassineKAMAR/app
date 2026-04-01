package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class b8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Boolean f19834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f19835b;

    b8(b7 b7Var, Boolean bool) {
        this.f19835b = b7Var;
        this.f19834a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19835b.Q(this.f19834a, true);
    }
}

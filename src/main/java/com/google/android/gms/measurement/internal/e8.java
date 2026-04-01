package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class e8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ v f19991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f19992b;

    e8(b7 b7Var, v vVar) {
        this.f19992b = b7Var;
        this.f19991a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19992b.e().z(this.f19991a)) {
            this.f19992b.r().U(false);
        } else {
            this.f19992b.t().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f19991a.a()));
        }
    }
}

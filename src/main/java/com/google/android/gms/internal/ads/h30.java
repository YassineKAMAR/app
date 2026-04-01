package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class h30 extends qh0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8611c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m30 f8612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8613e;

    public h30(m30 m30Var) {
        this.f8612d = m30Var;
    }

    public final void g() {
        synchronized (this.f8611c) {
            if (this.f8613e) {
                return;
            }
            this.f8613e = true;
            e(new e30(this), new mh0());
            e(new f30(this), new g30(this));
        }
    }
}

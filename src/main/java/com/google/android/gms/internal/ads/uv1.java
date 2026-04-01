package com.google.android.gms.internal.ads;

import a3.c;
import android.os.Binder;

/* JADX INFO: loaded from: classes.dex */
public abstract class uv1 implements c.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final jh0 f15894a = new jh0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f15895b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f15896c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f15897d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ya0 f15898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected x90 f15899f;

    protected final void a() {
        synchronized (this.f15895b) {
            this.f15897d = true;
            if (this.f15899f.g() || this.f15899f.d()) {
                this.f15899f.f();
            }
            Binder.flushPendingCommands();
        }
    }

    public void k0(x2.b bVar) {
        qg0.b("Disconnected from remote ad request service.");
        this.f15894a.e(new kw1(1));
    }

    @Override // a3.c.a
    public final void v0(int i8) {
        qg0.b("Cannot connect to remote service, fallback to local instance.");
    }
}

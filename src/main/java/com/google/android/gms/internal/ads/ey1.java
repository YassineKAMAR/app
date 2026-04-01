package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class ey1 implements c.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final jh0 f7537a = new jh0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f7538b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f7539c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected aa0 f7540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Context f7541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Looper f7542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected ScheduledExecutorService f7543g;

    protected final synchronized void a() {
        if (this.f7540d == null) {
            this.f7540d = new aa0(this.f7541e, this.f7542f, this, this);
        }
        this.f7540d.q();
    }

    protected final synchronized void b() {
        this.f7539c = true;
        aa0 aa0Var = this.f7540d;
        if (aa0Var == null) {
            return;
        }
        if (aa0Var.g() || this.f7540d.d()) {
            this.f7540d.f();
        }
        Binder.flushPendingCommands();
    }

    @Override // a3.c.b
    public final void k0(x2.b bVar) {
        String str = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(bVar.g()));
        qg0.b(str);
        this.f7537a.e(new kw1(1, str));
    }

    @Override // a3.c.a
    public void v0(int i8) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i8));
        qg0.b(str);
        this.f7537a.e(new kw1(1, str));
    }
}

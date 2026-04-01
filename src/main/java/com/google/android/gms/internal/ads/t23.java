package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class t23 implements c.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o33 f14924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i33 f14925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f14926c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14927d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14928e = false;

    t23(Context context, Looper looper, i33 i33Var) {
        this.f14925b = i33Var;
        this.f14924a = new o33(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f14926c) {
            if (this.f14924a.g() || this.f14924a.d()) {
                this.f14924a.f();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // a3.c.a
    public final void H0(Bundle bundle) {
        synchronized (this.f14926c) {
            if (this.f14928e) {
                return;
            }
            this.f14928e = true;
            try {
                this.f14924a.j0().h5(new m33(this.f14925b.g()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                b();
                throw th;
            }
            b();
        }
    }

    final void a() {
        synchronized (this.f14926c) {
            if (!this.f14927d) {
                this.f14927d = true;
                this.f14924a.q();
            }
        }
    }

    @Override // a3.c.b
    public final void k0(x2.b bVar) {
    }

    @Override // a3.c.a
    public final void v0(int i8) {
    }
}

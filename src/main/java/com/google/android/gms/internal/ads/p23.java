package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class p23 implements c.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o33 f12709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f12712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HandlerThread f12713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g23 f12714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f12715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12716h;

    public p23(Context context, int i8, int i9, String str, String str2, String str3, g23 g23Var) {
        this.f12710b = str;
        this.f12716h = i9;
        this.f12711c = str2;
        this.f12714f = g23Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f12713e = handlerThread;
        handlerThread.start();
        this.f12715g = System.currentTimeMillis();
        o33 o33Var = new o33(context, handlerThread.getLooper(), this, this, 19621000);
        this.f12709a = o33Var;
        this.f12712d = new LinkedBlockingQueue();
        o33Var.q();
    }

    static b43 a() {
        return new b43(null, 1);
    }

    private final void e(int i8, long j8, Exception exc) {
        this.f12714f.c(i8, System.currentTimeMillis() - j8, exc);
    }

    @Override // a3.c.a
    public final void H0(Bundle bundle) {
        u33 u33VarD = d();
        if (u33VarD != null) {
            try {
                b43 b43VarY4 = u33VarD.y4(new z33(1, this.f12716h, this.f12710b, this.f12711c));
                e(5011, this.f12715g, null);
                this.f12712d.put(b43VarY4);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final b43 b(int i8) {
        b43 b43Var;
        try {
            b43Var = (b43) this.f12712d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            e(2009, this.f12715g, e8);
            b43Var = null;
        }
        e(3004, this.f12715g, null);
        if (b43Var != null) {
            g23.g(b43Var.f5603c == 7 ? 3 : 2);
        }
        return b43Var == null ? a() : b43Var;
    }

    public final void c() {
        o33 o33Var = this.f12709a;
        if (o33Var != null) {
            if (o33Var.g() || this.f12709a.d()) {
                this.f12709a.f();
            }
        }
    }

    protected final u33 d() {
        try {
            return this.f12709a.j0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // a3.c.b
    public final void k0(x2.b bVar) {
        try {
            e(4012, this.f12715g, null);
            this.f12712d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // a3.c.a
    public final void v0(int i8) {
        try {
            e(4011, this.f12715g, null);
            this.f12712d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}

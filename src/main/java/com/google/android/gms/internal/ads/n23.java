package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class n23 implements c.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o33 f11627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f11630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HandlerThread f11631e;

    public n23(Context context, String str, String str2) {
        this.f11628b = str;
        this.f11629c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f11631e = handlerThread;
        handlerThread.start();
        o33 o33Var = new o33(context, handlerThread.getLooper(), this, this, 9200000);
        this.f11627a = o33Var;
        this.f11630d = new LinkedBlockingQueue();
        o33Var.q();
    }

    static ze a() {
        ce ceVarM0 = ze.m0();
        ceVarM0.x(32768L);
        return (ze) ceVarM0.q();
    }

    @Override // a3.c.a
    public final void H0(Bundle bundle) {
        u33 u33VarD = d();
        if (u33VarD != null) {
            try {
                try {
                    this.f11630d.put(u33VarD.q3(new p33(this.f11628b, this.f11629c)).g());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    c();
                    this.f11631e.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.f11630d.put(a());
            }
            c();
            this.f11631e.quit();
        }
    }

    public final ze b(int i8) {
        ze zeVar;
        try {
            zeVar = (ze) this.f11630d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zeVar = null;
        }
        return zeVar == null ? a() : zeVar;
    }

    public final void c() {
        o33 o33Var = this.f11627a;
        if (o33Var != null) {
            if (o33Var.g() || this.f11627a.d()) {
                this.f11627a.f();
            }
        }
    }

    protected final u33 d() {
        try {
            return this.f11627a.j0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // a3.c.b
    public final void k0(x2.b bVar) {
        try {
            this.f11630d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // a3.c.a
    public final void v0(int i8) {
        try {
            this.f11630d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}

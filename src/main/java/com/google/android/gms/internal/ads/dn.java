package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScheduledFuture f6816a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f6817b = new ym(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f6818c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gn f6819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f6820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private jn f6821f;

    static /* bridge */ /* synthetic */ void h(dn dnVar) {
        synchronized (dnVar.f6818c) {
            gn gnVar = dnVar.f6819d;
            if (gnVar == null) {
                return;
            }
            if (gnVar.g() || dnVar.f6819d.d()) {
                dnVar.f6819d.f();
            }
            dnVar.f6819d = null;
            dnVar.f6821f = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f6818c) {
            if (this.f6820e != null && this.f6819d == null) {
                gn gnVarD = d(new bn(this), new cn(this));
                this.f6819d = gnVarD;
                gnVarD.q();
            }
        }
    }

    public final long a(hn hnVar) {
        synchronized (this.f6818c) {
            if (this.f6821f == null) {
                return -2L;
            }
            if (this.f6819d.j0()) {
                try {
                    return this.f6821f.q3(hnVar);
                } catch (RemoteException e8) {
                    qg0.e("Unable to call into cache service.", e8);
                }
            }
            return -2L;
        }
    }

    public final en b(hn hnVar) {
        synchronized (this.f6818c) {
            if (this.f6821f == null) {
                return new en();
            }
            try {
                if (this.f6819d.j0()) {
                    return this.f6821f.h5(hnVar);
                }
                return this.f6821f.y4(hnVar);
            } catch (RemoteException e8) {
                qg0.e("Unable to call into cache service.", e8);
                return new en();
            }
        }
    }

    protected final synchronized gn d(c.a aVar, c.b bVar) {
        return new gn(this.f6820e, g2.t.v().b(), aVar, bVar);
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f6818c) {
            if (this.f6820e != null) {
                return;
            }
            this.f6820e = context.getApplicationContext();
            if (((Boolean) h2.y.c().b(ns.f12035b4)).booleanValue()) {
                l();
            } else {
                if (((Boolean) h2.y.c().b(ns.f12026a4)).booleanValue()) {
                    g2.t.d().c(new an(this));
                }
            }
        }
    }

    public final void j() {
        if (((Boolean) h2.y.c().b(ns.f12044c4)).booleanValue()) {
            synchronized (this.f6818c) {
                l();
                ScheduledFuture scheduledFuture = this.f6816a;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f6816a = eh0.f7325d.schedule(this.f6817b, ((Long) h2.y.c().b(ns.f12053d4)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}

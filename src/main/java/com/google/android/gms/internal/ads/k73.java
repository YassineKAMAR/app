package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k73 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f9965o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z63 f9967b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f9973h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f9977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IInterface f9978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g63 f9979n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9969d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f9970e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f9971f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f9975j = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.b73
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            k73.j(this.f5638a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f9976k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9968c = "OverlayDisplayService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f9974i = new WeakReference(null);

    public k73(Context context, z63 z63Var, String str, Intent intent, g63 g63Var, f73 f73Var) {
        this.f9966a = context;
        this.f9967b = z63Var;
        this.f9973h = intent;
        this.f9979n = g63Var;
    }

    public static /* synthetic */ void j(k73 k73Var) {
        k73Var.f9967b.c("reportBinderDeath", new Object[0]);
        f73 f73Var = (f73) k73Var.f9974i.get();
        if (f73Var != null) {
            k73Var.f9967b.c("calling onBinderDied", new Object[0]);
            f73Var.j();
        } else {
            k73Var.f9967b.c("%s : Binder has died.", k73Var.f9968c);
            Iterator it = k73Var.f9969d.iterator();
            while (it.hasNext()) {
                ((a73) it.next()).c(k73Var.v());
            }
            k73Var.f9969d.clear();
        }
        synchronized (k73Var.f9971f) {
            k73Var.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(final k73 k73Var, final s3.i iVar) {
        k73Var.f9970e.add(iVar);
        iVar.a().c(new s3.d() { // from class: com.google.android.gms.internal.ads.c73
            @Override // s3.d
            public final void a(s3.h hVar) {
                this.f6203a.t(iVar, hVar);
            }
        });
    }

    static /* bridge */ /* synthetic */ void p(k73 k73Var, a73 a73Var) {
        if (k73Var.f9978m != null || k73Var.f9972g) {
            if (!k73Var.f9972g) {
                a73Var.run();
                return;
            } else {
                k73Var.f9967b.c("Waiting to bind to the service.", new Object[0]);
                k73Var.f9969d.add(a73Var);
                return;
            }
        }
        k73Var.f9967b.c("Initiate binding to the service.", new Object[0]);
        k73Var.f9969d.add(a73Var);
        j73 j73Var = new j73(k73Var, null);
        k73Var.f9977l = j73Var;
        k73Var.f9972g = true;
        if (k73Var.f9966a.bindService(k73Var.f9973h, j73Var, 1)) {
            return;
        }
        k73Var.f9967b.c("Failed to bind to the service.", new Object[0]);
        k73Var.f9972g = false;
        Iterator it = k73Var.f9969d.iterator();
        while (it.hasNext()) {
            ((a73) it.next()).c(new l73());
        }
        k73Var.f9969d.clear();
    }

    static /* bridge */ /* synthetic */ void q(k73 k73Var) {
        k73Var.f9967b.c("linkToDeath", new Object[0]);
        try {
            k73Var.f9978m.asBinder().linkToDeath(k73Var.f9975j, 0);
        } catch (RemoteException e8) {
            k73Var.f9967b.b(e8, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(k73 k73Var) {
        k73Var.f9967b.c("unlinkToDeath", new Object[0]);
        k73Var.f9978m.asBinder().unlinkToDeath(k73Var.f9975j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f9968c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Iterator it = this.f9970e.iterator();
        while (it.hasNext()) {
            ((s3.i) it.next()).d(v());
        }
        this.f9970e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f9965o;
        synchronized (map) {
            if (!map.containsKey(this.f9968c)) {
                HandlerThread handlerThread = new HandlerThread(this.f9968c, 10);
                handlerThread.start();
                map.put(this.f9968c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f9968c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f9978m;
    }

    public final void s(a73 a73Var, s3.i iVar) {
        c().post(new d73(this, a73Var.b(), iVar, a73Var));
    }

    final /* synthetic */ void t(s3.i iVar, s3.h hVar) {
        synchronized (this.f9971f) {
            this.f9970e.remove(iVar);
        }
    }

    public final void u() {
        c().post(new e73(this));
    }
}

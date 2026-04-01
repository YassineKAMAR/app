package z2;

import a3.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import y2.a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a.f, ServiceConnection {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f27709l = g.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f27712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f27713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f27714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f27715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f27716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IBinder f27717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f27718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f27719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f27720k;

    private final void s() {
        if (Thread.currentThread() != this.f27715f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void t(String str) {
        String.valueOf(this.f27717h);
    }

    @Override // y2.a.f
    public final void a(a3.i iVar, Set<Scope> set) {
    }

    @Override // y2.a.f
    public final Set<Scope> b() {
        return Collections.emptySet();
    }

    @Override // y2.a.f
    public final void c(String str) {
        s();
        this.f27719j = str;
        f();
    }

    @Override // y2.a.f
    public final boolean d() {
        s();
        return this.f27718i;
    }

    @Override // y2.a.f
    public final String e() {
        String str = this.f27710a;
        if (str != null) {
            return str;
        }
        a3.o.j(this.f27712c);
        return this.f27712c.getPackageName();
    }

    @Override // y2.a.f
    public final void f() {
        s();
        t("Disconnect called.");
        try {
            this.f27713d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f27718i = false;
        this.f27717h = null;
    }

    @Override // y2.a.f
    public final boolean g() {
        s();
        return this.f27717h != null;
    }

    @Override // y2.a.f
    public final void h(c.InterfaceC0001c interfaceC0001c) {
        s();
        t("Connect started.");
        if (g()) {
            try {
                c("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f27712c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f27710a).setAction(this.f27711b);
            }
            boolean zBindService = this.f27713d.bindService(intent, this, a3.h.a());
            this.f27718i = zBindService;
            if (!zBindService) {
                this.f27717h = null;
                this.f27716g.k0(new x2.b(16));
            }
            t("Finished connect.");
        } catch (SecurityException e8) {
            this.f27718i = false;
            this.f27717h = null;
            throw e8;
        }
    }

    @Override // y2.a.f
    public final void i(c.e eVar) {
    }

    @Override // y2.a.f
    public final boolean j() {
        return false;
    }

    @Override // y2.a.f
    public final int k() {
        return 0;
    }

    @Override // y2.a.f
    public final x2.d[] l() {
        return new x2.d[0];
    }

    @Override // y2.a.f
    public final String m() {
        return this.f27719j;
    }

    @Override // y2.a.f
    public final boolean o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f27715f.post(new Runnable() { // from class: z2.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f27731a.q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f27715f.post(new Runnable() { // from class: z2.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f27730a.p();
            }
        });
    }

    final /* synthetic */ void p() {
        this.f27718i = false;
        this.f27717h = null;
        t("Disconnected.");
        this.f27714e.v0(1);
    }

    final /* synthetic */ void q(IBinder iBinder) {
        this.f27718i = false;
        this.f27717h = iBinder;
        t("Connected.");
        this.f27714e.H0(new Bundle());
    }

    public final void r(String str) {
        this.f27720k = str;
    }
}

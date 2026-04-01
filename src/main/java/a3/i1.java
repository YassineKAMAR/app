package a3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class i1 implements ServiceConnection, m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f113a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f114b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g1 f117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ l1 f119g;

    public i1(l1 l1Var, g1 g1Var) {
        this.f119g = l1Var;
        this.f117e = g1Var;
    }

    public final int a() {
        return this.f114b;
    }

    public final ComponentName b() {
        return this.f118f;
    }

    public final IBinder c() {
        return this.f116d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f113a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f114b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (e3.m.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            l1 l1Var = this.f119g;
            boolean zD = l1Var.f130j.d(l1Var.f127g, str, this.f117e.b(l1Var.f127g), this, 4225, executor);
            this.f115c = zD;
            if (zD) {
                this.f119g.f128h.sendMessageDelayed(this.f119g.f128h.obtainMessage(1, this.f117e), this.f119g.f132l);
            } else {
                this.f114b = 2;
                try {
                    l1 l1Var2 = this.f119g;
                    l1Var2.f130j.c(l1Var2.f127g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f113a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f119g.f128h.removeMessages(1, this.f117e);
        l1 l1Var = this.f119g;
        l1Var.f130j.c(l1Var.f127g, this);
        this.f115c = false;
        this.f114b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f113a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f113a.isEmpty();
    }

    public final boolean j() {
        return this.f115c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f119g.f126f) {
            this.f119g.f128h.removeMessages(1, this.f117e);
            this.f116d = iBinder;
            this.f118f = componentName;
            Iterator it = this.f113a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f114b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f119g.f126f) {
            this.f119g.f128h.removeMessages(1, this.f117e);
            this.f116d = null;
            this.f118f = componentName;
            Iterator it = this.f113a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f114b = 2;
        }
    }
}

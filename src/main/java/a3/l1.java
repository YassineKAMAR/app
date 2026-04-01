package a3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class l1 extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f126f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Handler f128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k1 f129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d3.b f130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile Executor f133m;

    l1(Context context, Looper looper, Executor executor) {
        k1 k1Var = new k1(this, null);
        this.f129i = k1Var;
        this.f127g = context.getApplicationContext();
        this.f128h = new l3.e(looper, k1Var);
        this.f130j = d3.b.b();
        this.f131k = 5000L;
        this.f132l = 300000L;
        this.f133m = executor;
    }

    @Override // a3.h
    protected final void d(g1 g1Var, ServiceConnection serviceConnection, String str) {
        o.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f126f) {
            i1 i1Var = (i1) this.f126f.get(g1Var);
            if (i1Var == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + g1Var.toString());
            }
            if (!i1Var.h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + g1Var.toString());
            }
            i1Var.f(serviceConnection, str);
            if (i1Var.i()) {
                this.f128h.sendMessageDelayed(this.f128h.obtainMessage(0, g1Var), this.f131k);
            }
        }
    }

    @Override // a3.h
    protected final boolean f(g1 g1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        o.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f126f) {
            i1 i1Var = (i1) this.f126f.get(g1Var);
            if (executor == null) {
                executor = this.f133m;
            }
            if (i1Var == null) {
                i1Var = new i1(this, g1Var);
                i1Var.d(serviceConnection, serviceConnection, str);
                i1Var.e(str, executor);
                this.f126f.put(g1Var, i1Var);
            } else {
                this.f128h.removeMessages(0, g1Var);
                if (i1Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + g1Var.toString());
                }
                i1Var.d(serviceConnection, serviceConnection, str);
                int iA = i1Var.a();
                if (iA == 1) {
                    serviceConnection.onServiceConnected(i1Var.b(), i1Var.c());
                } else if (iA == 2) {
                    i1Var.e(str, executor);
                }
            }
            zJ = i1Var.j();
        }
        return zJ;
    }
}

package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public class g extends d<b1.b> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f20960j = j.f("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f20961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f20962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f20963i;

    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            j.c().a(g.f20960j, "Network broadcast received", new Throwable[0]);
            g gVar = g.this;
            gVar.d(gVar.g());
        }
    }

    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.c().a(g.f20960j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            g gVar = g.this;
            gVar.d(gVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.c().a(g.f20960j, "Network connection lost", new Throwable[0]);
            g gVar = g.this;
            gVar.d(gVar.g());
        }
    }

    public g(Context context, h1.a aVar) {
        super(context, aVar);
        this.f20961g = (ConnectivityManager) this.f20954b.getSystemService("connectivity");
        if (j()) {
            this.f20962h = new b();
        } else {
            this.f20963i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // d1.d
    public void e() {
        if (!j()) {
            j.c().a(f20960j, "Registering broadcast receiver", new Throwable[0]);
            this.f20954b.registerReceiver(this.f20963i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            j.c().a(f20960j, "Registering network callback", new Throwable[0]);
            this.f20961g.registerDefaultNetworkCallback(this.f20962h);
        } catch (IllegalArgumentException | SecurityException e8) {
            j.c().b(f20960j, "Received exception while registering network callback", e8);
        }
    }

    @Override // d1.d
    public void f() {
        if (!j()) {
            j.c().a(f20960j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f20954b.unregisterReceiver(this.f20963i);
            return;
        }
        try {
            j.c().a(f20960j, "Unregistering network callback", new Throwable[0]);
            this.f20961g.unregisterNetworkCallback(this.f20962h);
        } catch (IllegalArgumentException | SecurityException e8) {
            j.c().b(f20960j, "Received exception while unregistering network callback", e8);
        }
    }

    b1.b g() {
        NetworkInfo activeNetworkInfo = this.f20961g.getActiveNetworkInfo();
        return new b1.b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), i(), androidx.core.net.a.a(this.f20961g), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // d1.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b1.b b() {
        return g();
    }

    boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f20961g.getNetworkCapabilities(this.f20961g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e8) {
            j.c().b(f20960j, "Unable to validate active network", e8);
            return false;
        }
    }
}

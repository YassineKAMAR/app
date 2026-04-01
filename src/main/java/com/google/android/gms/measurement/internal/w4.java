package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
class w4 extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20615d = w4.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final va f20616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20618c;

    w4(va vaVar) {
        a3.o.j(vaVar);
        this.f20616a = vaVar;
    }

    public final void b() {
        this.f20616a.p0();
        this.f20616a.u().i();
        if (this.f20617b) {
            return;
        }
        this.f20616a.j().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f20618c = this.f20616a.g0().A();
        this.f20616a.t().K().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f20618c));
        this.f20617b = true;
    }

    public final void c() {
        this.f20616a.p0();
        this.f20616a.u().i();
        this.f20616a.u().i();
        if (this.f20617b) {
            this.f20616a.t().K().a("Unregistering connectivity change receiver");
            this.f20617b = false;
            this.f20618c = false;
            try {
                this.f20616a.j().unregisterReceiver(this);
            } catch (IllegalArgumentException e8) {
                this.f20616a.t().G().b("Failed to unregister the network broadcast receiver", e8);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f20616a.p0();
        String action = intent.getAction();
        this.f20616a.t().K().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f20616a.t().L().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zA = this.f20616a.g0().A();
        if (this.f20618c != zA) {
            this.f20618c = zA;
            this.f20616a.u().D(new z4(this, zA));
        }
    }
}

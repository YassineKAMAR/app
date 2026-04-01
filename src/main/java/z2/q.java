package z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f27728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f27729b;

    public q(p pVar) {
        this.f27729b = pVar;
    }

    public final void a(Context context) {
        this.f27728a = context;
    }

    public final synchronized void b() {
        Context context = this.f27728a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f27728a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f27729b.a();
            b();
        }
    }
}

package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import x0.j;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f3128a = j.f("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f3129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f3130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f3131c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3129a = intent;
            this.f3130b = context;
            this.f3131c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f3129a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3129a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3129a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3129a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                j.c().a(ConstraintProxyUpdateReceiver.f3128a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g1.e.a(this.f3130b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g1.e.a(this.f3130b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g1.e.a(this.f3130b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g1.e.a(this.f3130b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3131c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z7, boolean z8, boolean z9, boolean z10) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z7).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z8).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z10);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            i.k(context).p().b(new a(intent, context, goAsync()));
        } else {
            j.c().a(f3128a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}

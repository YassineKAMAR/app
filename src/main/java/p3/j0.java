package p3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.mf;
import com.google.android.gms.measurement.internal.w5;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f25605a;

    public j0(w5 w5Var) {
        this.f25605a = w5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f25605a.t().L().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f25605a.t().L().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f25605a.t().L().a("App receiver called with unknown action");
            return;
        }
        final w5 w5Var = this.f25605a;
        if (mf.a() && w5Var.z().D(null, com.google.android.gms.measurement.internal.e0.M0)) {
            w5Var.t().K().a("App receiver notified triggers are available");
            w5Var.u().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.nb
                @Override // java.lang.Runnable
                public final void run() {
                    w5 w5Var2 = w5Var;
                    if (!w5Var2.L().V0()) {
                        w5Var2.t().L().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final b7 b7VarH = w5Var2.H();
                    b7VarH.getClass();
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.ob
                        @Override // java.lang.Runnable
                        public final void run() {
                            b7VarH.p0();
                        }
                    }).start();
                }
            });
        }
    }
}

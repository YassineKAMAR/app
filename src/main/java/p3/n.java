package p3;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.n4;
import com.google.android.gms.measurement.internal.w5;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25606a;

    public interface a {
        void a(Context context, Intent intent);
    }

    public n(a aVar) {
        a3.o.j(aVar);
        this.f25606a = aVar;
    }

    public final void a(Context context, Intent intent) {
        n4 n4VarT = w5.a(context, null, null).t();
        if (intent == null) {
            n4VarT.L().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        n4VarT.K().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                n4VarT.L().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            n4VarT.K().a("Starting wakeful intent.");
            this.f25606a.a(context, className);
        }
    }
}

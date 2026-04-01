package h2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg0;

/* JADX INFO: loaded from: classes.dex */
final class r3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t3 f22251a;

    r3(t3 t3Var) {
        this.f22251a = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u3 u3Var = this.f22251a.f22302a;
        if (u3Var.f22304a != null) {
            try {
                u3Var.f22304a.g(1);
            } catch (RemoteException e8) {
                qg0.h("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}

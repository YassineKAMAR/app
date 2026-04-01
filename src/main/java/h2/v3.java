package h2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg0;

/* JADX INFO: loaded from: classes.dex */
final class v3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ w3 f22330a;

    v3(w3 w3Var) {
        this.f22330a = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w3 w3Var = this.f22330a;
        if (w3Var.f22350a != null) {
            try {
                w3Var.f22350a.g(1);
            } catch (RemoteException e8) {
                qg0.h("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}

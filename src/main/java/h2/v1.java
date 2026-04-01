package h2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg0;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u1 f22313b;

    public v1(u1 u1Var) {
        String strM;
        this.f22313b = u1Var;
        try {
            strM = u1Var.m();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            strM = null;
        }
        this.f22312a = strM;
    }

    public final String toString() {
        return this.f22312a;
    }
}

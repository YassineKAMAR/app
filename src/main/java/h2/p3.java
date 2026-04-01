package h2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.tv;

/* JADX INFO: loaded from: classes.dex */
public final class p3 implements z1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tv f22242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pw f22243b;

    @Override // z1.o
    public final boolean a() {
        try {
            return this.f22242a.u();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return false;
        }
    }

    public final tv b() {
        return this.f22242a;
    }

    @Override // z1.o
    public final pw j() {
        return this.f22243b;
    }

    @Override // z1.o
    public final boolean k() {
        try {
            return this.f22242a.s();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return false;
        }
    }
}

package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends jk implements h1 {
    f1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // h2.h1
    public final void F0(z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(1, parcelK0);
    }

    @Override // h2.h1
    public final void k() {
        H0(5, k0());
    }

    @Override // h2.h1
    public final void l() {
        H0(3, k0());
    }

    @Override // h2.h1
    public final void m() {
        H0(4, k0());
    }

    @Override // h2.h1
    public final void n() {
        H0(2, k0());
    }
}

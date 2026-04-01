package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends jk implements i0 {
    g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // h2.i0
    public final void l() {
        H0(1, k0());
    }

    @Override // h2.i0
    public final void z0(z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(2, parcelK0);
    }
}

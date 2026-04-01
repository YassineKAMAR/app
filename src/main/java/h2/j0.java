package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends jk implements l0 {
    j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // h2.l0
    public final void k1(r4 r4Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, r4Var);
        H0(1, parcelK0);
    }
}

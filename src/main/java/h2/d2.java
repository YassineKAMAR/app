package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends jk implements f2 {
    d2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // h2.f2
    public final boolean n() {
        Parcel parcelV0 = v0(2, k0());
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }

    @Override // h2.f2
    public final void p4(y4 y4Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, y4Var);
        H0(1, parcelK0);
    }
}

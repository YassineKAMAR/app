package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends jk implements f0 {
    d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // h2.f0
    public final void a(z2 z2Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, z2Var);
        H0(8, parcelK0);
    }

    @Override // h2.f0
    public final void g(int i8) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        H0(2, parcelK0);
    }

    @Override // h2.f0
    public final void l() {
        H0(6, k0());
    }

    @Override // h2.f0
    public final void o() {
        H0(3, k0());
    }

    @Override // h2.f0
    public final void p() {
        H0(1, k0());
    }

    @Override // h2.f0
    public final void q() {
        H0(7, k0());
    }

    @Override // h2.f0
    public final void r() {
        H0(4, k0());
    }

    @Override // h2.f0
    public final void s() {
        H0(9, k0());
    }

    @Override // h2.f0
    public final void t() {
        H0(5, k0());
    }
}

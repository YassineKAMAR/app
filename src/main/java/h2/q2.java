package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends jk implements s2 {
    q2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // h2.s2
    public final void C0(boolean z7) {
        Parcel parcelK0 = k0();
        int i8 = lk.f10749b;
        parcelK0.writeInt(z7 ? 1 : 0);
        H0(5, parcelK0);
    }

    @Override // h2.s2
    public final void m() {
        H0(4, k0());
    }

    @Override // h2.s2
    public final void o() {
        H0(2, k0());
    }

    @Override // h2.s2
    public final void q() {
        H0(3, k0());
    }

    @Override // h2.s2
    public final void r() {
        H0(1, k0());
    }
}

package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends jk implements p2 {
    n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // h2.p2
    public final float m() {
        throw null;
    }

    @Override // h2.p2
    public final float n() {
        throw null;
    }

    @Override // h2.p2
    public final float q() {
        throw null;
    }

    @Override // h2.p2
    public final s2 r() {
        s2 q2Var;
        Parcel parcelV0 = v0(11, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            q2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            q2Var = iInterfaceQueryLocalInterface instanceof s2 ? (s2) iInterfaceQueryLocalInterface : new q2(strongBinder);
        }
        parcelV0.recycle();
        return q2Var;
    }

    @Override // h2.p2
    public final void x4(s2 s2Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, s2Var);
        H0(8, parcelK0);
    }
}

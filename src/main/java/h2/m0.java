package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.kx;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.zw;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends jk implements o0 {
    m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // h2.o0
    public final void M5(kx kxVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, kxVar);
        H0(10, parcelK0);
    }

    @Override // h2.o0
    public final void f4(String str, cx cxVar, zw zwVar) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        lk.f(parcelK0, cxVar);
        lk.f(parcelK0, zwVar);
        H0(5, parcelK0);
    }

    @Override // h2.o0
    public final void j4(lv lvVar) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, lvVar);
        H0(6, parcelK0);
    }

    @Override // h2.o0
    public final l0 m() {
        l0 j0Var;
        Parcel parcelV0 = v0(1, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            j0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            j0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new j0(strongBinder);
        }
        parcelV0.recycle();
        return j0Var;
    }

    @Override // h2.o0
    public final void y3(f0 f0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, f0Var);
        H0(2, parcelK0);
    }
}

package a3;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends l3.a implements s0 {
    q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // a3.s0
    public final x2.c0 L1(x2.a0 a0Var) {
        Parcel parcelV0 = v0();
        l3.c.c(parcelV0, a0Var);
        Parcel parcelK0 = k0(8, parcelV0);
        x2.c0 c0Var = (x2.c0) l3.c.a(parcelK0, x2.c0.CREATOR);
        parcelK0.recycle();
        return c0Var;
    }

    @Override // a3.s0
    public final boolean U3(x2.e0 e0Var, g3.a aVar) {
        Parcel parcelV0 = v0();
        l3.c.c(parcelV0, e0Var);
        l3.c.d(parcelV0, aVar);
        Parcel parcelK0 = k0(5, parcelV0);
        boolean zE = l3.c.e(parcelK0);
        parcelK0.recycle();
        return zE;
    }

    @Override // a3.s0
    public final x2.c0 m2(x2.a0 a0Var) {
        Parcel parcelV0 = v0();
        l3.c.c(parcelV0, a0Var);
        Parcel parcelK0 = k0(6, parcelV0);
        x2.c0 c0Var = (x2.c0) l3.c.a(parcelK0, x2.c0.CREATOR);
        parcelK0.recycle();
        return c0Var;
    }

    @Override // a3.s0
    public final boolean r() {
        Parcel parcelK0 = k0(7, v0());
        boolean zE = l3.c.e(parcelK0);
        parcelK0.recycle();
        return zE;
    }
}

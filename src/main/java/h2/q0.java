package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.rm;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends jk implements s0 {
    q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // h2.s0
    public final String B() {
        Parcel parcelV0 = v0(31, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // h2.s0
    public final void D() {
        H0(2, k0());
    }

    @Override // h2.s0
    public final void H5(boolean z7) {
        Parcel parcelK0 = k0();
        int i8 = lk.f10749b;
        parcelK0.writeInt(z7 ? 1 : 0);
        H0(22, parcelK0);
    }

    @Override // h2.s0
    public final void I2(a1 a1Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, a1Var);
        H0(8, parcelK0);
    }

    @Override // h2.s0
    public final void I4(boolean z7) {
        Parcel parcelK0 = k0();
        int i8 = lk.f10749b;
        parcelK0.writeInt(z7 ? 1 : 0);
        H0(34, parcelK0);
    }

    @Override // h2.s0
    public final void P1(k4 k4Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, k4Var);
        H0(29, parcelK0);
    }

    @Override // h2.s0
    public final void S1(f0 f0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, f0Var);
        H0(7, parcelK0);
    }

    @Override // h2.s0
    public final void T3(r4 r4Var, i0 i0Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, r4Var);
        lk.f(parcelK0, i0Var);
        H0(43, parcelK0);
    }

    @Override // h2.s0
    public final void W() {
        H0(5, k0());
    }

    @Override // h2.s0
    public final void a2(rm rmVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, rmVar);
        H0(40, parcelK0);
    }

    @Override // h2.s0
    public final void a5(w4 w4Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, w4Var);
        H0(13, parcelK0);
    }

    @Override // h2.s0
    public final void c5(c5 c5Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, c5Var);
        H0(39, parcelK0);
    }

    @Override // h2.s0
    public final void f0() {
        H0(6, k0());
    }

    @Override // h2.s0
    public final void g4(c0 c0Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, c0Var);
        H0(20, parcelK0);
    }

    @Override // h2.s0
    public final void m4(f2 f2Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, f2Var);
        H0(42, parcelK0);
    }

    @Override // h2.s0
    public final w4 q() {
        Parcel parcelV0 = v0(12, k0());
        w4 w4Var = (w4) lk.a(parcelV0, w4.CREATOR);
        parcelV0.recycle();
        return w4Var;
    }

    @Override // h2.s0
    public final void r4(h1 h1Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, h1Var);
        H0(45, parcelK0);
    }

    @Override // h2.s0
    public final m2 s() {
        m2 k2Var;
        Parcel parcelV0 = v0(41, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            k2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            k2Var = iInterfaceQueryLocalInterface instanceof m2 ? (m2) iInterfaceQueryLocalInterface : new k2(strongBinder);
        }
        parcelV0.recycle();
        return k2Var;
    }

    @Override // h2.s0
    public final void s4(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(44, parcelK0);
    }

    @Override // h2.s0
    public final p2 u() {
        p2 n2Var;
        Parcel parcelV0 = v0(26, k0());
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            n2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            n2Var = iInterfaceQueryLocalInterface instanceof p2 ? (p2) iInterfaceQueryLocalInterface : new n2(strongBinder);
        }
        parcelV0.recycle();
        return n2Var;
    }

    @Override // h2.s0
    public final g3.a v() {
        Parcel parcelV0 = v0(1, k0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return aVarV0;
    }

    @Override // h2.s0
    public final boolean v2(r4 r4Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, r4Var);
        Parcel parcelV0 = v0(4, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }
}

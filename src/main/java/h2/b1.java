package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.ef0;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.i80;
import com.google.android.gms.internal.ads.ic0;
import com.google.android.gms.internal.ads.j80;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.q80;
import com.google.android.gms.internal.ads.z40;
import com.google.android.gms.internal.ads.zv;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends jk implements d1 {
    b1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // h2.d1
    public final j80 F3(g3.a aVar, z40 z40Var, int i8) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(15, parcelK0);
        j80 j80VarO5 = i80.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return j80VarO5;
    }

    @Override // h2.d1
    public final o0 H2(g3.a aVar, String str, z40 z40Var, int i8) {
        o0 m0Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString(str);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(3, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            m0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            m0Var = iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new m0(strongBinder);
        }
        parcelV0.recycle();
        return m0Var;
    }

    @Override // h2.d1
    public final s0 O0(g3.a aVar, w4 w4Var, String str, z40 z40Var, int i8) {
        s0 q0Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, w4Var);
        parcelK0.writeString(str);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(1, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            q0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            q0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new q0(strongBinder);
        }
        parcelV0.recycle();
        return q0Var;
    }

    @Override // h2.d1
    public final i2 Q0(g3.a aVar, z40 z40Var, int i8) {
        i2 g2Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(17, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            g2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            g2Var = iInterfaceQueryLocalInterface instanceof i2 ? (i2) iInterfaceQueryLocalInterface : new g2(strongBinder);
        }
        parcelV0.recycle();
        return g2Var;
    }

    @Override // h2.d1
    public final s0 R2(g3.a aVar, w4 w4Var, String str, z40 z40Var, int i8) {
        s0 q0Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, w4Var);
        parcelK0.writeString(str);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(13, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            q0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            q0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new q0(strongBinder);
        }
        parcelV0.recycle();
        return q0Var;
    }

    @Override // h2.d1
    public final s0 c1(g3.a aVar, w4 w4Var, String str, int i8) {
        s0 q0Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, w4Var);
        parcelK0.writeString(str);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(10, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            q0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            q0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new q0(strongBinder);
        }
        parcelV0.recycle();
        return q0Var;
    }

    @Override // h2.d1
    public final ff0 f1(g3.a aVar, z40 z40Var, int i8) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(14, parcelK0);
        ff0 ff0VarO5 = ef0.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return ff0VarO5;
    }

    @Override // h2.d1
    public final ic0 g1(g3.a aVar, String str, z40 z40Var, int i8) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString(str);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(12, parcelK0);
        ic0 ic0VarO5 = hc0.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return ic0VarO5;
    }

    @Override // h2.d1
    public final q80 j0(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        Parcel parcelV0 = v0(8, parcelK0);
        q80 q80VarO5 = p80.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return q80VarO5;
    }

    @Override // h2.d1
    public final s0 n1(g3.a aVar, w4 w4Var, String str, z40 z40Var, int i8) {
        s0 q0Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, w4Var);
        parcelK0.writeString(str);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(2, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            q0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            q0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new q0(strongBinder);
        }
        parcelV0.recycle();
        return q0Var;
    }

    @Override // h2.d1
    public final aw n3(g3.a aVar, g3.a aVar2) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, aVar2);
        Parcel parcelV0 = v0(5, parcelK0);
        aw awVarO5 = zv.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return awVarO5;
    }

    @Override // h2.d1
    public final n1 s0(g3.a aVar, int i8) {
        n1 l1Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(9, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        if (strongBinder == null) {
            l1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            l1Var = iInterfaceQueryLocalInterface instanceof n1 ? (n1) iInterfaceQueryLocalInterface : new l1(strongBinder);
        }
        parcelV0.recycle();
        return l1Var;
    }
}

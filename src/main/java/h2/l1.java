package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.f10;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.z40;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends jk implements n1 {
    l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // h2.n1
    public final void C1(m10 m10Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, m10Var);
        H0(12, parcelK0);
    }

    @Override // h2.n1
    public final void G3(z40 z40Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, z40Var);
        H0(11, parcelK0);
    }

    @Override // h2.n1
    public final void I5(boolean z7) {
        Parcel parcelK0 = k0();
        int i8 = lk.f10749b;
        parcelK0.writeInt(z7 ? 1 : 0);
        H0(4, parcelK0);
    }

    @Override // h2.n1
    public final void K4(g3.a aVar, String str) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString(str);
        H0(5, parcelK0);
    }

    @Override // h2.n1
    public final void M0(String str) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        H0(18, parcelK0);
    }

    @Override // h2.n1
    public final void Y2(String str, g3.a aVar) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(null);
        lk.f(parcelK0, aVar);
        H0(6, parcelK0);
    }

    @Override // h2.n1
    public final void h3(z1 z1Var) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, z1Var);
        H0(16, parcelK0);
    }

    @Override // h2.n1
    public final void m1(f4 f4Var) {
        Parcel parcelK0 = k0();
        lk.d(parcelK0, f4Var);
        H0(14, parcelK0);
    }

    @Override // h2.n1
    public final void p3(float f8) {
        Parcel parcelK0 = k0();
        parcelK0.writeFloat(f8);
        H0(2, parcelK0);
    }

    @Override // h2.n1
    public final List q() {
        Parcel parcelV0 = v0(13, k0());
        ArrayList arrayListCreateTypedArrayList = parcelV0.createTypedArrayList(f10.CREATOR);
        parcelV0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // h2.n1
    public final void r() {
        H0(15, k0());
    }

    @Override // h2.n1
    public final void s() {
        H0(1, k0());
    }
}

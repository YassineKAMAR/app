package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends jk {
    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder q3(g3.a aVar, w4 w4Var, String str, z40 z40Var, int i8, int i9) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.d(parcelK0, w4Var);
        parcelK0.writeString(str);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        parcelK0.writeInt(i9);
        Parcel parcelV0 = v0(2, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        parcelV0.recycle();
        return strongBinder;
    }
}

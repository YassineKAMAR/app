package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends jk {
    p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder q3(g3.a aVar, String str, z40 z40Var, int i8) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString(str);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(1, parcelK0);
        IBinder strongBinder = parcelV0.readStrongBinder();
        parcelV0.recycle();
        return strongBinder;
    }
}

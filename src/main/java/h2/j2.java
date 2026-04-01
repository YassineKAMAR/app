package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
public final class j2 extends jk {
    j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final i2 q3(g3.a aVar, z40 z40Var, int i8) {
        i2 g2Var;
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, z40Var);
        parcelK0.writeInt(233702000);
        Parcel parcelV0 = v0(1, parcelK0);
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
}

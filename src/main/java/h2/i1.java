package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.y40;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends jk implements k1 {
    i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // h2.k1
    public final z40 getAdapterCreator() {
        Parcel parcelV0 = v0(2, k0());
        z40 z40VarO5 = y40.O5(parcelV0.readStrongBinder());
        parcelV0.recycle();
        return z40VarO5;
    }

    @Override // h2.k1
    public final n3 getLiteSdkVersion() {
        Parcel parcelV0 = v0(1, k0());
        n3 n3Var = (n3) lk.a(parcelV0, n3.CREATOR);
        parcelV0.recycle();
        return n3Var;
    }
}

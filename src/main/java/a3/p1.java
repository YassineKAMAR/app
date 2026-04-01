package a3;

import android.os.IBinder;
import android.os.Parcel;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends l3.a implements n0 {
    p1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // a3.n0
    public final int l() {
        Parcel parcelK0 = k0(2, v0());
        int i8 = parcelK0.readInt();
        parcelK0.recycle();
        return i8;
    }

    @Override // a3.n0
    public final g3.a p() {
        Parcel parcelK0 = k0(1, v0());
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return aVarV0;
    }
}

package i3;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // i3.f
    public final String l() {
        Parcel parcelV0 = v0(1, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // i3.f
    public final boolean p() {
        Parcel parcelV0 = v0(6, k0());
        boolean zB = c.b(parcelV0);
        parcelV0.recycle();
        return zB;
    }

    @Override // i3.f
    public final boolean s1(boolean z7) {
        Parcel parcelK0 = k0();
        c.a(parcelK0, true);
        Parcel parcelV0 = v0(2, parcelK0);
        boolean zB = c.b(parcelV0);
        parcelV0.recycle();
        return zB;
    }
}

package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends jk implements u1 {
    s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // h2.u1
    public final String m() {
        Parcel parcelV0 = v0(1, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // h2.u1
    public final String n() {
        Parcel parcelV0 = v0(2, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }
}

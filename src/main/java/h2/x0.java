package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends jk implements a1 {
    x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // h2.a1
    public final void B0(String str, String str2) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        H0(1, parcelK0);
    }
}

package h2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends jk implements i2 {
    g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // h2.i2
    public final void h4(String str, g3.a aVar, g3.a aVar2) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        lk.f(parcelK0, aVar);
        lk.f(parcelK0, aVar2);
        H0(1, parcelK0);
    }
}

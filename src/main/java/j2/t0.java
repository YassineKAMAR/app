package j2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends jk implements v0 {
    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // j2.v0
    public final void zze(g3.a aVar) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        H0(2, parcelK0);
    }

    @Override // j2.v0
    public final boolean zzf(g3.a aVar, String str, String str2) {
        Parcel parcelK0 = k0();
        lk.f(parcelK0, aVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        Parcel parcelV0 = v0(1, parcelK0);
        boolean zG = lk.g(parcelV0);
        parcelV0.recycle();
        return zG;
    }
}

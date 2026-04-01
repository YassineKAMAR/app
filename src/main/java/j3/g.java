package j3;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void H0(u2.d dVar, f fVar) {
        Parcel parcelK0 = k0();
        c.b(parcelK0, dVar);
        c.c(parcelK0, fVar);
        v0(1, parcelK0);
    }
}

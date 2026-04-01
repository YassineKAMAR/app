package r3;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k3.a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void k3(j jVar, f fVar) {
        Parcel parcelK0 = k0();
        k3.c.b(parcelK0, jVar);
        k3.c.c(parcelK0, fVar);
        v0(12, parcelK0);
    }
}

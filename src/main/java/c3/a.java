package c3;

import a3.s;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k3.a {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void k3(s sVar) {
        Parcel parcelK0 = k0();
        k3.c.b(parcelK0, sVar);
        H0(1, parcelK0);
    }
}

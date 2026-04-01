package com.google.android.gms.measurement.internal;

import a3.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends a3.c<p3.i> {
    public o4(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // a3.c, y2.a.f
    public final int k() {
        return 12451000;
    }

    @Override // a3.c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof p3.i ? (p3.i) iInterfaceQueryLocalInterface : new j4(iBinder);
    }
}

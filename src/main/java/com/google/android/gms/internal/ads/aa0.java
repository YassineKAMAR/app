package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends a3.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public aa0(Context context, Looper looper, c.a aVar, c.b bVar) {
        Context applicationContext = context.getApplicationContext();
        super(applicationContext != null ? applicationContext : context, looper, 8, aVar, bVar, null);
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.ads.service.ADS";
    }

    public final na0 j0() {
        return (na0) super.D();
    }

    @Override // a3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return iInterfaceQueryLocalInterface instanceof na0 ? (na0) iInterfaceQueryLocalInterface : new la0(iBinder);
    }
}

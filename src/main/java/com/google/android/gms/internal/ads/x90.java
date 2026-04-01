package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class x90 extends g2.c {
    public x90(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(mb0.a(context), looper, 8, aVar, bVar, null);
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.ads.service.START";
    }

    public final ja0 j0() {
        return (ja0) super.D();
    }

    @Override // a3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof ja0 ? (ja0) iInterfaceQueryLocalInterface : new ha0(iBinder);
    }
}

package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class q00 extends g2.c {
    q00(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(mb0.a(context), looper, 166, aVar, bVar, null);
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final x00 j0() {
        return (x00) super.D();
    }

    @Override // a3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof x00 ? (x00) iInterfaceQueryLocalInterface : new x00(iBinder);
    }
}

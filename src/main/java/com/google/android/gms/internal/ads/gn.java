package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class gn extends g2.c {
    gn(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(mb0.a(context), looper, 123, aVar, bVar, null);
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean j0() {
        return ((Boolean) h2.y.c().b(ns.O1)).booleanValue() && e3.b.b(l(), z1.g0.f27622a);
    }

    public final jn k0() {
        return (jn) super.D();
    }

    @Override // a3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof jn ? (jn) iInterfaceQueryLocalInterface : new jn(iBinder);
    }

    @Override // a3.c
    public final x2.d[] v() {
        return z1.g0.f27623b;
    }
}

package com.google.android.gms.internal.ads;

import a3.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class o33 extends g2.c {
    private final int F;

    public o33(Context context, Looper looper, c.a aVar, c.b bVar, int i8) {
        super(context, looper, 116, aVar, bVar, null);
        this.F = i8;
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.gass.START";
    }

    public final u33 j0() {
        return (u33) super.D();
    }

    @Override // a3.c, y2.a.f
    public final int k() {
        return this.F;
    }

    @Override // a3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof u33 ? (u33) iInterfaceQueryLocalInterface : new u33(iBinder);
    }
}

package j3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a3.g<g> {
    protected d(Context context, Looper looper, a3.d dVar, z2.c cVar, z2.h hVar) {
        super(context, looper, RCHTTPStatusCodes.UNSUCCESSFUL, dVar, cVar, hVar);
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // a3.c
    protected final boolean I() {
        return true;
    }

    @Override // a3.c
    public final boolean S() {
        return true;
    }

    @Override // a3.c, y2.a.f
    public final int k() {
        return 212800000;
    }

    @Override // a3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // a3.c
    public final x2.d[] v() {
        return u2.h.f26715b;
    }
}

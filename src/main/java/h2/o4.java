package h2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.z40;
import g3.c;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends g3.c {
    public o4() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // g3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof p0 ? (p0) iInterfaceQueryLocalInterface : new p0(iBinder);
    }

    public final o0 c(Context context, String str, z40 z40Var) {
        try {
            IBinder iBinderQ3 = ((p0) b(context)).q3(g3.b.k3(context), str, z40Var, 233702000);
            if (iBinderQ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderQ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new m0(iBinderQ3);
        } catch (RemoteException | c.a e8) {
            qg0.h("Could not create remote builder for AdLoader.", e8);
            return null;
        }
    }
}

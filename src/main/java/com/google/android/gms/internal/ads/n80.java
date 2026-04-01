package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import g3.c;

/* JADX INFO: loaded from: classes.dex */
public final class n80 extends g3.c {
    public n80() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // g3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof t80 ? (t80) iInterfaceQueryLocalInterface : new r80(iBinder);
    }

    public final q80 c(Activity activity) {
        try {
            IBinder iBinderZze = ((t80) b(activity)).zze(g3.b.k3(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof q80 ? (q80) iInterfaceQueryLocalInterface : new o80(iBinderZze);
        } catch (RemoteException e8) {
            qg0.h("Could not create remote AdOverlay.", e8);
            return null;
        } catch (c.a e9) {
            qg0.h("Could not create remote AdOverlay.", e9);
            return null;
        }
    }
}

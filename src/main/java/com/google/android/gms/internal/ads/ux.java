package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import g3.c;

/* JADX INFO: loaded from: classes.dex */
public final class ux extends g3.c {
    public ux() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // g3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof dw ? (dw) iInterfaceQueryLocalInterface : new bw(iBinder);
    }

    public final aw c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderB3 = ((dw) b(context)).b3(g3.b.k3(context), g3.b.k3(frameLayout), g3.b.k3(frameLayout2), 233702000);
            if (iBinderB3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderB3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof aw ? (aw) iInterfaceQueryLocalInterface : new yv(iBinderB3);
        } catch (RemoteException | c.a e8) {
            qg0.h("Could not create remote NativeAdViewDelegate.", e8);
            return null;
        }
    }
}

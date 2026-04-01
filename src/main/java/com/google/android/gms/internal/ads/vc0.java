package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class vc0 {
    public static final ic0 a(Context context, String str, z40 z40Var) {
        try {
            IBinder iBinderQ3 = ((mc0) ug0.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new sg0() { // from class: com.google.android.gms.internal.ads.uc0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof mc0 ? (mc0) iInterfaceQueryLocalInterface : new mc0(obj);
                }
            })).q3(g3.b.k3(context), str, z40Var, 233702000);
            if (iBinderQ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderQ3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof ic0 ? (ic0) iInterfaceQueryLocalInterface : new gc0(iBinderQ3);
        } catch (RemoteException | tg0 e8) {
            qg0.i("#007 Could not call remote method.", e8);
            return null;
        }
    }
}

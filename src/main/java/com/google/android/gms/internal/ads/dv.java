package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class dv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7020a;

    public dv(Context context) {
        this.f7020a = context;
    }

    public final void a(w90 w90Var) {
        String strValueOf;
        String str;
        try {
            ((ev) ug0.b(this.f7020a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new sg0() { // from class: com.google.android.gms.internal.ads.cv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof ev ? (ev) iInterfaceQueryLocalInterface : new ev(obj);
                }
            })).q3(w90Var);
        } catch (RemoteException e8) {
            strValueOf = String.valueOf(e8.getMessage());
            str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
            qg0.g(str.concat(strValueOf));
        } catch (tg0 e9) {
            strValueOf = String.valueOf(e9.getMessage());
            str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
            qg0.g(str.concat(strValueOf));
        }
    }
}

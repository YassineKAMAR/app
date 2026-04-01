package h2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.r90;
import com.google.android.gms.internal.ads.sg0;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.z40;
import g3.c;

/* JADX INFO: loaded from: classes.dex */
public final class q4 extends g3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r90 f22246c;

    public q4() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // g3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof t0 ? (t0) iInterfaceQueryLocalInterface : new t0(iBinder);
    }

    public final s0 c(Context context, w4 w4Var, String str, z40 z40Var, int i8) {
        ns.a(context);
        if (!((Boolean) y.c().b(ns.Q9)).booleanValue()) {
            try {
                IBinder iBinderQ3 = ((t0) b(context)).q3(g3.b.k3(context), w4Var, str, z40Var, 233702000, i8);
                if (iBinderQ3 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderQ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new q0(iBinderQ3);
            } catch (RemoteException | c.a e8) {
                qg0.c("Could not create remote AdManager.", e8);
                return null;
            }
        }
        try {
            IBinder iBinderQ32 = ((t0) ug0.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new sg0() { // from class: h2.p4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof t0 ? (t0) iInterfaceQueryLocalInterface2 : new t0(obj);
                }
            })).q3(g3.b.k3(context), w4Var, str, z40Var, 233702000, i8);
            if (iBinderQ32 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderQ32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof s0 ? (s0) iInterfaceQueryLocalInterface2 : new q0(iBinderQ32);
        } catch (RemoteException | tg0 | NullPointerException e9) {
            r90 r90VarC = o90.c(context);
            this.f22246c = r90VarC;
            r90VarC.a(e9, "AdManagerCreator.newAdManagerByDynamiteLoader");
            qg0.i("#007 Could not call remote method.", e9);
            return null;
        }
    }
}

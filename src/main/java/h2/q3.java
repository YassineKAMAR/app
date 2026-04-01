package h2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg0;
import g3.c;

/* JADX INFO: loaded from: classes.dex */
public final class q3 extends g3.c {
    public q3() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // g3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof o1 ? (o1) iInterfaceQueryLocalInterface : new o1(iBinder);
    }

    public final n1 c(Context context) {
        try {
            IBinder iBinderQ3 = ((o1) b(context)).q3(g3.b.k3(context), 233702000);
            if (iBinderQ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderQ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof n1 ? (n1) iInterfaceQueryLocalInterface : new l1(iBinderQ3);
        } catch (RemoteException | c.a e8) {
            qg0.h("Could not get remote MobileAdsSettingManager.", e8);
            return null;
        }
    }
}

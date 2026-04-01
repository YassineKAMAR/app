package h2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.sg0;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.ug0;

/* JADX INFO: loaded from: classes.dex */
final class p extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f22241c;

    p(t tVar, Context context) {
        this.f22241c = tVar;
        this.f22240b = context;
    }

    @Override // h2.u
    protected final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22240b, "mobile_ads_settings");
        return new y3();
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.s0(g3.b.k3(this.f22240b), 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        ns.a(this.f22240b);
        if (!((Boolean) y.c().b(ns.Q9)).booleanValue()) {
            return this.f22241c.f22295c.c(this.f22240b);
        }
        try {
            IBinder iBinderQ3 = ((o1) ug0.b(this.f22240b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new sg0() { // from class: h2.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof o1 ? (o1) iInterfaceQueryLocalInterface : new o1(obj);
                }
            })).q3(g3.b.k3(this.f22240b), 233702000);
            if (iBinderQ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderQ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof n1 ? (n1) iInterfaceQueryLocalInterface : new l1(iBinderQ3);
        } catch (RemoteException | tg0 | NullPointerException e8) {
            this.f22241c.f22300h = o90.c(this.f22240b);
            this.f22241c.f22300h.a(e8, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}

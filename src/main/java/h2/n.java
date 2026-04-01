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
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
final class n extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f22231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ z40 f22232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f22233e;

    n(t tVar, Context context, String str, z40 z40Var) {
        this.f22233e = tVar;
        this.f22230b = context;
        this.f22231c = str;
        this.f22232d = z40Var;
    }

    @Override // h2.u
    protected final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22230b, "native_ad");
        return new u3();
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.H2(g3.b.k3(this.f22230b), this.f22231c, this.f22232d, 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        ns.a(this.f22230b);
        if (!((Boolean) y.c().b(ns.Q9)).booleanValue()) {
            return this.f22233e.f22294b.c(this.f22230b, this.f22231c, this.f22232d);
        }
        try {
            IBinder iBinderQ3 = ((p0) ug0.b(this.f22230b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new sg0() { // from class: h2.m
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof p0 ? (p0) iInterfaceQueryLocalInterface : new p0(obj);
                }
            })).q3(g3.b.k3(this.f22230b), this.f22231c, this.f22232d, 233702000);
            if (iBinderQ3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderQ3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new m0(iBinderQ3);
        } catch (RemoteException | tg0 | NullPointerException e8) {
            this.f22233e.f22300h = o90.c(this.f22230b);
            this.f22233e.f22300h.a(e8, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}

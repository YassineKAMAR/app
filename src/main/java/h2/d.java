package h2;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.sg0;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
final class d extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z40 f22173c;

    d(t tVar, Context context, z40 z40Var) {
        this.f22172b = context;
        this.f22173c = z40Var;
    }

    @Override // h2.u
    protected final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22172b, "out_of_context_tester");
        return null;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        Context context = this.f22172b;
        g3.a aVarK3 = g3.b.k3(context);
        ns.a(context);
        if (((Boolean) y.c().b(ns.e9)).booleanValue()) {
            return d1Var.Q0(aVarK3, this.f22173c, 233702000);
        }
        return null;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        Context context = this.f22172b;
        g3.a aVarK3 = g3.b.k3(context);
        ns.a(context);
        if (!((Boolean) y.c().b(ns.e9)).booleanValue()) {
            return null;
        }
        try {
            return ((j2) ug0.b(this.f22172b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new sg0() { // from class: h2.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return iInterfaceQueryLocalInterface instanceof j2 ? (j2) iInterfaceQueryLocalInterface : new j2(obj);
                }
            })).q3(aVarK3, this.f22173c, 233702000);
        } catch (RemoteException | tg0 | NullPointerException e8) {
            o90.c(this.f22172b).a(e8, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}

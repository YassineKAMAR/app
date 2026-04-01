package h2;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.s80;
import com.google.android.gms.internal.ads.sg0;
import com.google.android.gms.internal.ads.t80;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.ug0;

/* JADX INFO: loaded from: classes.dex */
final class b extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f22164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f22165c;

    b(t tVar, Activity activity) {
        this.f22165c = tVar;
        this.f22164b = activity;
    }

    @Override // h2.u
    protected final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22164b, "ad_overlay");
        return null;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.j0(g3.b.k3(this.f22164b));
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        ns.a(this.f22164b);
        if (!((Boolean) y.c().b(ns.Q9)).booleanValue()) {
            t tVar = this.f22165c;
            return tVar.f22298f.c(this.f22164b);
        }
        try {
            return p80.O5(((t80) ug0.b(this.f22164b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new sg0() { // from class: h2.f5
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    return s80.O5(obj);
                }
            })).zze(g3.b.k3(this.f22164b)));
        } catch (RemoteException | tg0 | NullPointerException e8) {
            this.f22165c.f22300h = o90.c(this.f22164b.getApplicationContext());
            this.f22165c.f22300h.a(e8, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}

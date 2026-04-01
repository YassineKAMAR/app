package h2;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.dw;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.sg0;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.zv;

/* JADX INFO: loaded from: classes.dex */
final class r extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f22247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f22248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f22249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f22250e;

    r(t tVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f22250e = tVar;
        this.f22247b = frameLayout;
        this.f22248c = frameLayout2;
        this.f22249d = context;
    }

    @Override // h2.u
    protected final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22249d, "native_ad_view_delegate");
        return new z3();
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.n3(g3.b.k3(this.f22247b), g3.b.k3(this.f22248c));
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        ns.a(this.f22249d);
        if (!((Boolean) y.c().b(ns.Q9)).booleanValue()) {
            t tVar = this.f22250e;
            return tVar.f22296d.c(this.f22249d, this.f22247b, this.f22248c);
        }
        try {
            return zv.O5(((dw) ug0.b(this.f22249d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new sg0() { // from class: h2.q
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    return cw.O5(obj);
                }
            })).b3(g3.b.k3(this.f22249d), g3.b.k3(this.f22247b), g3.b.k3(this.f22248c), 233702000));
        } catch (RemoteException | tg0 | NullPointerException e8) {
            this.f22250e.f22300h = o90.c(this.f22249d);
            this.f22250e.f22300h.a(e8, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}

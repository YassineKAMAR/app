package h2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.l80;
import com.google.android.gms.internal.ads.m80;
import com.google.android.gms.internal.ads.sg0;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
final class h extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z40 f22188c;

    h(t tVar, Context context, z40 z40Var) {
        this.f22187b = context;
        this.f22188c = z40Var;
    }

    @Override // h2.u
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.F3(g3.b.k3(this.f22187b), this.f22188c, 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((m80) ug0.b(this.f22187b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new sg0() { // from class: h2.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    return l80.O5(obj);
                }
            })).w0(g3.b.k3(this.f22187b), this.f22188c, 233702000);
        } catch (RemoteException | tg0 | NullPointerException unused) {
            return null;
        }
    }
}

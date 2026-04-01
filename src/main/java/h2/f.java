package h2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.hf0;
import com.google.android.gms.internal.ads.if0;
import com.google.android.gms.internal.ads.sg0;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
final class f extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z40 f22182c;

    f(t tVar, Context context, z40 z40Var) {
        this.f22181b = context;
        this.f22182c = z40Var;
    }

    @Override // h2.u
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.f1(g3.b.k3(this.f22181b), this.f22182c, 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((if0) ug0.b(this.f22181b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new sg0() { // from class: h2.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.sg0
                public final Object a(Object obj) {
                    return hf0.O5(obj);
                }
            })).w0(g3.b.k3(this.f22181b), this.f22182c, 233702000);
        } catch (RemoteException | tg0 | NullPointerException unused) {
            return null;
        }
    }
}

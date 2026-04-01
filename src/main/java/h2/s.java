package h2;

import android.content.Context;
import com.google.android.gms.internal.ads.vc0;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
final class s extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f22278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ z40 f22279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f22280e;

    s(t tVar, Context context, String str, z40 z40Var) {
        this.f22280e = tVar;
        this.f22277b = context;
        this.f22278c = str;
        this.f22279d = z40Var;
    }

    @Override // h2.u
    protected final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22277b, "rewarded");
        return new c4();
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.g1(g3.b.k3(this.f22277b), this.f22278c, this.f22279d, 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        return vc0.a(this.f22277b, this.f22278c, this.f22279d);
    }
}

package h2;

import android.content.Context;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
final class l extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ w4 f22219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f22220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ z40 f22221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ t f22222f;

    l(t tVar, Context context, w4 w4Var, String str, z40 z40Var) {
        this.f22222f = tVar;
        this.f22218b = context;
        this.f22219c = w4Var;
        this.f22220d = str;
        this.f22221e = z40Var;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22218b, "interstitial");
        return new w3();
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.n1(g3.b.k3(this.f22218b), this.f22219c, this.f22220d, this.f22221e, 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f22222f.f22293a.c(this.f22218b, this.f22219c, this.f22220d, this.f22221e, 2);
    }
}

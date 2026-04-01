package h2;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class k extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ w4 f22212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f22213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f22214e;

    k(t tVar, Context context, w4 w4Var, String str) {
        this.f22214e = tVar;
        this.f22211b = context;
        this.f22212c = w4Var;
        this.f22213d = str;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22211b, "search");
        return new w3();
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.c1(g3.b.k3(this.f22211b), this.f22212c, this.f22213d, 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f22214e.f22293a.c(this.f22211b, this.f22212c, this.f22213d, null, 3);
    }
}

package h2;

import android.content.Context;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
final class i extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ w4 f22191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f22192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ z40 f22193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ t f22194f;

    i(t tVar, Context context, w4 w4Var, String str, z40 z40Var) {
        this.f22194f = tVar;
        this.f22190b = context;
        this.f22191c = w4Var;
        this.f22192d = str;
        this.f22193e = z40Var;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22190b, "banner");
        return new w3();
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.O0(g3.b.k3(this.f22190b), this.f22191c, this.f22192d, this.f22193e, 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f22194f.f22293a.c(this.f22190b, this.f22191c, this.f22192d, this.f22193e, 1);
    }
}

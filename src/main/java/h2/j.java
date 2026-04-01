package h2;

import android.content.Context;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
final class j extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f22196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ w4 f22197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f22198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ z40 f22199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ t f22200f;

    j(t tVar, Context context, w4 w4Var, String str, z40 z40Var) {
        this.f22200f = tVar;
        this.f22196b = context;
        this.f22197c = w4Var;
        this.f22198d = str;
        this.f22199e = z40Var;
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object a() {
        t.q(this.f22196b, "app_open");
        return new w3();
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object b(d1 d1Var) {
        return d1Var.R2(g3.b.k3(this.f22196b), this.f22197c, this.f22198d, this.f22199e, 233702000);
    }

    @Override // h2.u
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f22200f.f22293a.c(this.f22196b, this.f22197c, this.f22198d, this.f22199e, 4);
    }
}

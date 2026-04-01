package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class z21 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f17977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f17978c;

    public z21(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f17976a = w84Var;
        this.f17977b = w84Var2;
        this.f17978c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        final Context context = (Context) this.f17976a.k();
        final wg0 wg0VarA = ((uo0) this.f17977b).a();
        final ts2 ts2VarA = ((x31) this.f17978c).a();
        return new z73() { // from class: com.google.android.gms.internal.ads.y21
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                wr2 wr2Var = (wr2) obj;
                j2.v vVar = new j2.v(context);
                vVar.p(wr2Var.D);
                vVar.q(wr2Var.E.toString());
                vVar.o(wg0VarA.f16723a);
                vVar.n(ts2VarA.f15304f);
                return vVar;
            }
        };
    }
}

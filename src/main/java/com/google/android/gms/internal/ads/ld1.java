package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ld1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fd1 f10617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f10618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f10619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f10620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f10621e;

    public ld1(fd1 fd1Var, w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f10617a = fd1Var;
        this.f10618b = w84Var;
        this.f10619c = w84Var2;
        this.f10620d = w84Var3;
        this.f10621e = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        final Context context = (Context) this.f10618b.k();
        final wg0 wg0VarA = ((uo0) this.f10619c).a();
        final wr2 wr2VarA = ((e01) this.f10620d).a();
        final ts2 ts2VarA = ((x31) this.f10621e).a();
        return new yb1(new v51() { // from class: com.google.android.gms.internal.ads.cd1
            @Override // com.google.android.gms.internal.ads.v51
            public final void B() {
                g2.t.u().n(context, wg0VarA.f16723a, wr2VarA.E.toString(), ts2VarA.f15304f);
            }
        }, eh0.f7327f);
    }
}

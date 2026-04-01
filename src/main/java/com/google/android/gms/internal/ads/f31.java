package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class f31 implements v51, c51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wr2 f7611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w80 f7612c;

    public f31(Context context, wr2 wr2Var, w80 w80Var) {
        this.f7610a = context;
        this.f7611b = wr2Var;
        this.f7612c = w80Var;
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        x80 x80Var = this.f7611b.f16876f0;
        if (x80Var == null || !x80Var.f17117a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f7611b.f16876f0.f17118b.isEmpty()) {
            return;
        }
        arrayList.add(this.f7611b.f16876f0.f17118b);
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void D(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void b(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.c51
    public final void q(Context context) {
    }
}

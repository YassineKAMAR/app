package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class l3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f18914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f18915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f18916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f18917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ g2 f18918i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l3(g2 g2Var, String str, String str2, Object obj, boolean z7) {
        super(g2Var);
        this.f18918i = g2Var;
        this.f18914e = str;
        this.f18915f = str2;
        this.f18916g = obj;
        this.f18917h = z7;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18918i.f18723i)).setUserProperty(this.f18914e, this.f18915f, g3.b.k3(this.f18916g), this.f18917h, this.f18724a);
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class a3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f18539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f18540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f18541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ t1 f18542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ g2 f18543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a3(g2 g2Var, String str, String str2, boolean z7, t1 t1Var) {
        super(g2Var);
        this.f18543i = g2Var;
        this.f18539e = str;
        this.f18540f = str2;
        this.f18541g = z7;
        this.f18542h = t1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18543i.f18723i)).getUserProperties(this.f18539e, this.f18540f, this.f18541g, this.f18542h);
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    protected final void b() {
        this.f18542h.f(null);
    }
}

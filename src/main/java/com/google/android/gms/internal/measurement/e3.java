package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class e3 extends g2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f18674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f18675g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final /* synthetic */ g2 f18678j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f18673e = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Object f18676h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Object f18677i = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e3(g2 g2Var, boolean z7, int i8, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f18678j = g2Var;
        this.f18674f = str;
        this.f18675g = obj;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18678j.f18723i)).logHealthData(this.f18673e, this.f18674f, g3.b.k3(this.f18675g), g3.b.k3(null), g3.b.k3(null));
    }
}

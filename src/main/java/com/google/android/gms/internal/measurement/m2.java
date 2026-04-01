package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class m2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Activity f18938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f18939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f18940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ g2 f18941h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m2(g2 g2Var, Activity activity, String str, String str2) {
        super(g2Var);
        this.f18941h = g2Var;
        this.f18938e = activity;
        this.f18939f = str;
        this.f18940g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        ((v1) a3.o.j(this.f18941h.f18723i)).setCurrentScreen(g3.b.k3(this.f18938e), this.f18939f, this.f18940g, this.f18724a);
    }
}

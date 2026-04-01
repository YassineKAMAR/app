package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class k3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Long f18867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f18868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f18869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f18870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f18871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f18872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final /* synthetic */ g2 f18873k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k3(g2 g2Var, Long l8, String str, String str2, Bundle bundle, boolean z7, boolean z8) {
        super(g2Var);
        this.f18873k = g2Var;
        this.f18867e = l8;
        this.f18868f = str;
        this.f18869g = str2;
        this.f18870h = bundle;
        this.f18871i = z7;
        this.f18872j = z8;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        Long l8 = this.f18867e;
        ((v1) a3.o.j(this.f18873k.f18723i)).logEvent(this.f18868f, this.f18869g, this.f18870h, this.f18871i, this.f18872j, l8 == null ? this.f18724a : l8.longValue());
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class xz implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h2.a f17503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f17504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f17505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b00 f17506d;

    xz(b00 b00Var, h2.a aVar, Map map, String str) {
        this.f17506d = b00Var;
        this.f17503a = aVar;
        this.f17504b = map;
        this.f17505c = str;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        g2.t.q().u(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        h2.a aVar = this.f17503a;
        Map map = this.f17504b;
        String str = this.f17505c;
        this.f17506d.h((String) obj, aVar, map, str);
    }
}

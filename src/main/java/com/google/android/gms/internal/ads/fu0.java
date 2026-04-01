package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class fu0 implements wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v22 f8058a;

    fu0(v22 v22Var) {
        this.f8058a = v22Var;
    }

    @Override // com.google.android.gms.internal.ads.wt0
    public final void a(Map map) {
        if (((Boolean) h2.y.c().b(ns.C9)).booleanValue()) {
            zf3.f(qf3.C(this.f8058a.a(true)), Throwable.class, new gf3() { // from class: com.google.android.gms.internal.ads.eu0
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    g2.t.q().u((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                    return zf3.h(new androidx.privacysandbox.ads.adservices.topics.c(jb3.z()));
                }
            }, eh0.f7322a);
        }
    }
}

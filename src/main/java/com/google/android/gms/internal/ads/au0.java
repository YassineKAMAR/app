package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class au0 implements wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2.x1 f5494a;

    public au0(j2.x1 x1Var) {
        this.f5494a = x1Var;
    }

    @Override // com.google.android.gms.internal.ads.wt0
    public final void a(Map map) {
        this.f5494a.h(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}

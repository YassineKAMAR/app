package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yt0 implements wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2.x1 f17920a;

    public yt0(j2.x1 x1Var) {
        this.f17920a = x1Var;
    }

    @Override // com.google.android.gms.internal.ads.wt0
    public final void a(Map map) {
        this.f17920a.M(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}

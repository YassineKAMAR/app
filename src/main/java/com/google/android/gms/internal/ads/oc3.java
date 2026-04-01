package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class oc3 extends j93 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient c93 f12444f;

    oc3(Map map, c93 c93Var) {
        super(map);
        this.f12444f = c93Var;
    }

    @Override // com.google.android.gms.internal.ads.ea3
    final Map d() {
        return n();
    }

    @Override // com.google.android.gms.internal.ads.ea3
    final Set e() {
        return o();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // com.google.android.gms.internal.ads.ba3
    protected final /* bridge */ /* synthetic */ Collection g() {
        return this.f12444f.j();
    }
}

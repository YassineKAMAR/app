package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class e84 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7192a;

    e84(Map map) {
        this.f7192a = Collections.unmodifiableMap(map);
    }

    final Map a() {
        return this.f7192a;
    }
}

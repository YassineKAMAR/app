package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f5154a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f5155b;

    public final synchronized Map a() {
        if (this.f5155b == null) {
            this.f5155b = Collections.unmodifiableMap(new HashMap(this.f5154a));
        }
        return this.f5155b;
    }
}

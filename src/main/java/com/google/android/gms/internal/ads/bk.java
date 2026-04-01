package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f5842a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            if (!this.f5842a.containsKey(str)) {
                this.f5842a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f5842a.get(str);
    }
}

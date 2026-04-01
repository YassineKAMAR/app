package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Callable<? extends m>> f18625a = new HashMap();

    public final r a(String str) {
        if (!this.f18625a.containsKey(str)) {
            return r.L;
        }
        try {
            return this.f18625a.get(str).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable<? extends m> callable) {
        this.f18625a.put(str, callable);
    }
}

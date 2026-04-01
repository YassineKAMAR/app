package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class uk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f15714a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f15715b;

    uk0() {
    }

    final long a() {
        Iterator it = this.f15714a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((a24) it.next()).m().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f15715b = Math.max(this.f15715b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f15715b;
    }

    final void b(a24 a24Var) {
        this.f15714a.add(a24Var);
    }
}

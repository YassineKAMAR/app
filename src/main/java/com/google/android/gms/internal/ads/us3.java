package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class us3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f15840a = new HashMap();

    public final ws3 a() {
        if (this.f15840a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        ws3 ws3Var = new ws3(Collections.unmodifiableMap(this.f15840a), null);
        this.f15840a = null;
        return ws3Var;
    }
}

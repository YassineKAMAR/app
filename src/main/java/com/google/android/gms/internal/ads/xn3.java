package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f17379a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f17380b = new HashMap();

    /* synthetic */ xn3(wn3 wn3Var) {
    }

    public final xn3 a(Enum r22, Object obj) {
        this.f17379a.put(r22, obj);
        this.f17380b.put(obj, r22);
        return this;
    }

    public final zn3 b() {
        return new zn3(Collections.unmodifiableMap(this.f17379a), Collections.unmodifiableMap(this.f17380b), null);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n84 extends e84 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w84 f11733b = k84.a(Collections.emptyMap());

    /* synthetic */ n84(Map map, l84 l84Var) {
        super(map);
    }

    public static m84 b(int i8) {
        return new m84(i8, null);
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map k() {
        LinkedHashMap linkedHashMapB = f84.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            linkedHashMapB.put(entry.getKey(), ((w84) entry.getValue()).k());
        }
        return Collections.unmodifiableMap(linkedHashMapB);
    }
}

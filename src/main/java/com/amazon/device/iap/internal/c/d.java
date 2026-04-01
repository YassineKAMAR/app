package com.amazon.device.iap.internal.c;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements com.amazon.device.iap.internal.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class, Class> f4319a;

    static {
        HashMap map = new HashMap();
        f4319a = map;
        map.put(com.amazon.device.iap.internal.e.class, e.class);
    }

    @Override // com.amazon.device.iap.internal.c
    public <T> Class<T> a(Class<T> cls) {
        return f4319a.get(cls);
    }
}

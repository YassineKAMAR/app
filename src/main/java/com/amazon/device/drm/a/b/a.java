package com.amazon.device.drm.a.b;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.amazon.device.drm.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class, Class> f4179a;

    static {
        HashMap map = new HashMap();
        f4179a = map;
        map.put(com.amazon.device.drm.a.c.class, c.class);
    }

    @Override // com.amazon.device.drm.a.b
    public <T> Class<T> a(Class<T> cls) {
        return f4179a.get(cls);
    }
}

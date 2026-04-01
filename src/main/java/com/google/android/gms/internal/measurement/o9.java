package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class o9<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map.Entry<K, l9> f19010a;

    private o9(Map.Entry<K, l9> entry) {
        this.f19010a = entry;
    }

    public final l9 a() {
        return this.f19010a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f19010a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f19010a.getValue() == null) {
            return null;
        }
        return l9.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof ma) {
            return this.f19010a.getValue().a((ma) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

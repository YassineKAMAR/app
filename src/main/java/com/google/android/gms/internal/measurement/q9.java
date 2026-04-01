package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class q9<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f19063a;

    public q9(Iterator<Map.Entry<K, Object>> it) {
        this.f19063a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19063a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f19063a.next();
        return next.getValue() instanceof l9 ? new o9(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19063a.remove();
    }
}

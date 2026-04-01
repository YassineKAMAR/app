package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class o extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j f19637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f19638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f19639e;

    o(j jVar, Object[] objArr, int i8, int i9) {
        this.f19637c = jVar;
        this.f19638d = objArr;
        this.f19639e = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final int a(Object[] objArr, int i8) {
        return i().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.d, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f19637c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.d
    /* JADX INFO: renamed from: n */
    public final t iterator() {
        return i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19639e;
    }

    @Override // com.google.android.gms.internal.play_billing.k
    final g v() {
        return new n(this);
    }
}

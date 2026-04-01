package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class fb3 extends ca3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f7711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f7712b;

    fb3(Object obj, Object obj2) {
        this.f7711a = obj;
        this.f7712b = obj2;
    }

    @Override // com.google.android.gms.internal.ads.ca3, java.util.Map.Entry
    public final Object getKey() {
        return this.f7711a;
    }

    @Override // com.google.android.gms.internal.ads.ca3, java.util.Map.Entry
    public final Object getValue() {
        return this.f7712b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

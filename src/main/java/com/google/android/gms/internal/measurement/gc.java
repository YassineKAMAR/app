package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class gc implements Iterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<String> f18751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ec f18752b;

    gc(ec ecVar) {
        this.f18752b = ecVar;
        this.f18751a = ecVar.f18684a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18751a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f18751a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

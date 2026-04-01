package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements Iterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<String> f19852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ z f19853b;

    c0(z zVar) {
        this.f19853b = zVar;
        this.f19852a = zVar.f20741a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19852a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f19852a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

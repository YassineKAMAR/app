package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class id3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f9159a;

    id3(Iterator it) {
        it.getClass();
        this.f9159a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9159a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f9159a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9159a.remove();
    }
}

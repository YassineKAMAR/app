package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class z34 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f17999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a44 f18000b;

    z34(a44 a44Var) {
        this.f18000b = a44Var;
        this.f17999a = a44Var.f5025a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17999a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f17999a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

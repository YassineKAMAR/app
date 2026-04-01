package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class x3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f19739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y3 f19740b;

    x3(y3 y3Var) {
        this.f19740b = y3Var;
        this.f19739a = y3Var.f19744a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19739a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f19739a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class y74 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f17619a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z74 f17620b;

    y74(z74 z74Var) {
        this.f17620b = z74Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17619a < this.f17620b.f18093a.size() || this.f17620b.f18094b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f17619a >= this.f17620b.f18093a.size()) {
            z74 z74Var = this.f17620b;
            z74Var.f18093a.add(z74Var.f18094b.next());
            return next();
        }
        z74 z74Var2 = this.f17620b;
        int i8 = this.f17619a;
        this.f17619a = i8 + 1;
        return z74Var2.f18093a.get(i8);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class da3 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ea3 f6636a;

    da3(ea3 ea3Var) {
        this.f6636a = ea3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f6636a.y();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f6636a.C().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f6636a.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f6636a.m();
    }
}

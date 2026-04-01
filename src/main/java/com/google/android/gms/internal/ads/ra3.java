package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ra3 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ sa3 f14031a;

    ra3(sa3 sa3Var) {
        this.f14031a = sa3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f14031a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        sa3 sa3Var = this.f14031a;
        Map mapK = sa3Var.k();
        return mapK != null ? mapK.values().iterator() : new ka3(sa3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f14031a.size();
    }
}

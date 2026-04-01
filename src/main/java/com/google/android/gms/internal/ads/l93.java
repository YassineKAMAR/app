package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class l93 extends ac3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n93 f10555a;

    l93(n93 n93Var) {
        this.f10555a = n93Var;
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final Map a() {
        return this.f10555a;
    }

    @Override // com.google.android.gms.internal.ads.ac3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ha3.a(this.f10555a.f11744c.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m93(this.f10555a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        n93 n93Var = this.f10555a;
        ba3.q(n93Var.f11745d, entry.getKey());
        return true;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class q93 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map.Entry f13357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f13358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r93 f13359c;

    q93(r93 r93Var, Iterator it) {
        this.f13359c = r93Var;
        this.f13358b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13358b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f13358b.next();
        this.f13357a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        l83.j(this.f13357a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f13357a.getValue();
        this.f13358b.remove();
        this.f13359c.f13992b.f5680e -= collection.size();
        collection.clear();
        this.f13357a = null;
    }
}

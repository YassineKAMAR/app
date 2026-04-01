package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class m93 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f11213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f11214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n93 f11215c;

    m93(n93 n93Var) {
        this.f11215c = n93Var;
        this.f11213a = n93Var.f11744c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11213a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f11213a.next();
        this.f11214b = (Collection) entry.getValue();
        return this.f11215c.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        l83.j(this.f11214b != null, "no calls to next() since the last call to remove()");
        this.f11213a.remove();
        this.f11215c.f11745d.f5680e -= this.f11214b.size();
        this.f11214b.clear();
        this.f11214b = null;
    }
}

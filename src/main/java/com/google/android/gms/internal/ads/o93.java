package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class o93 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f12424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12425b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Collection f12426c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Iterator f12427d = tb3.INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ba3 f12428e;

    o93(ba3 ba3Var) {
        this.f12428e = ba3Var;
        this.f12424a = ba3Var.f5679d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12424a.hasNext() || this.f12427d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12427d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f12424a.next();
            this.f12425b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f12426c = collection;
            this.f12427d = collection.iterator();
        }
        return this.f12427d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12427d.remove();
        Collection collection = this.f12426c;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f12424a.remove();
        }
        ba3 ba3Var = this.f12428e;
        ba3Var.f5680e--;
    }
}

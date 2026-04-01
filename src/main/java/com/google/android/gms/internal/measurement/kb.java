package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class kb implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator f18878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ib f18879c;

    private kb(ib ibVar) {
        this.f18879c = ibVar;
        this.f18877a = ibVar.f18801b.size();
    }

    private final Iterator a() {
        if (this.f18878b == null) {
            this.f18878b = this.f18879c.f18805f.entrySet().iterator();
        }
        return this.f18878b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i8 = this.f18877a;
        return (i8 > 0 && i8 <= this.f18879c.f18801b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object next;
        if (a().hasNext()) {
            next = a().next();
        } else {
            List list = this.f18879c.f18801b;
            int i8 = this.f18877a - 1;
            this.f18877a = i8;
            next = list.get(i8);
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

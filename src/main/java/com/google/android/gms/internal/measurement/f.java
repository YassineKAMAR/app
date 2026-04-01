package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class f implements Iterator<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f18690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Iterator f18691b;

    f(g gVar, Iterator it, Iterator it2) {
        this.f18690a = it;
        this.f18691b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f18690a.hasNext()) {
            return true;
        }
        return this.f18691b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ r next() {
        if (this.f18690a.hasNext()) {
            return new t(((Integer) this.f18690a.next()).toString());
        }
        if (this.f18691b.hasNext()) {
            return new t((String) this.f18691b.next());
        }
        throw new NoSuchElementException();
    }
}

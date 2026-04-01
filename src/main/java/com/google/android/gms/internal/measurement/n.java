package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class n implements Iterator<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Iterator f18971a;

    n(Iterator it) {
        this.f18971a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18971a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ r next() {
        return new t((String) this.f18971a.next());
    }
}

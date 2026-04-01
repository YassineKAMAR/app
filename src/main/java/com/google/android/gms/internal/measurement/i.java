package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class i implements Iterator<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ g f18793b;

    i(g gVar) {
        this.f18793b = gVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18792a < this.f18793b.y();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ r next() {
        if (this.f18792a < this.f18793b.y()) {
            g gVar = this.f18793b;
            int i8 = this.f18792a;
            this.f18792a = i8 + 1;
            return gVar.v(i8);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f18792a);
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class w implements Iterator<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19281a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t f19282b;

    w(t tVar) {
        this.f19282b = tVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19281a < this.f19282b.f19217a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ r next() {
        if (this.f19281a >= this.f19282b.f19217a.length()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f19281a;
        this.f19281a = i8 + 1;
        return new t(String.valueOf(i8));
    }
}

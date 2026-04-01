package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class v implements Iterator<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19263a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t f19264b;

    v(t tVar) {
        this.f19264b = tVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19263a < this.f19264b.f19217a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ r next() {
        if (this.f19263a >= this.f19264b.f19217a.length()) {
            throw new NoSuchElementException();
        }
        String str = this.f19264b.f19217a;
        int i8 = this.f19263a;
        this.f19263a = i8 + 1;
        return new t(String.valueOf(str.charAt(i8)));
    }
}

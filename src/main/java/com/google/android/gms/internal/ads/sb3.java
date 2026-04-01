package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class sb3 extends kd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f14600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f14601b;

    sb3(Object obj) {
        this.f14601b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14600a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14600a) {
            throw new NoSuchElementException();
        }
        this.f14600a = true;
        return this.f14601b;
    }
}

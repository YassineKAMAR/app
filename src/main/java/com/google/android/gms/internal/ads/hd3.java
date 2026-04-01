package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class hd3 extends ob3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f8728c;

    hd3(Object obj) {
        obj.getClass();
        this.f8728c = obj;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int a(Object[] objArr, int i8) {
        objArr[i8] = this.f8728c;
        return i8 + 1;
    }

    @Override // com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8728c.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.ob3, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8728c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3
    public final jb3 i() {
        return jb3.A(this.f8728c);
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new sb3(this.f8728c);
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3
    /* JADX INFO: renamed from: n */
    public final kd3 iterator() {
        return new sb3(this.f8728c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f8728c.toString() + "]";
    }
}

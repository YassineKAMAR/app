package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class yc3 extends jb3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f17732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f17733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f17734f;

    yc3(Object[] objArr, int i8, int i9) {
        this.f17732d = objArr;
        this.f17733e = i8;
        this.f17734f = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        l83.a(i8, this.f17734f, "index");
        Object obj = this.f17732d[i8 + i8 + this.f17733e];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17734f;
    }
}

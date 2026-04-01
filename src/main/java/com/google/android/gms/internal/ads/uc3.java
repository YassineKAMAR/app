package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class uc3 extends jb3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final jb3 f15606f = new uc3(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f15607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f15608e;

    uc3(Object[] objArr, int i8) {
        this.f15607d = objArr;
        this.f15608e = i8;
    }

    @Override // com.google.android.gms.internal.ads.jb3, com.google.android.gms.internal.ads.eb3
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f15607d, 0, objArr, i8, this.f15608e);
        return i8 + this.f15608e;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int e() {
        return this.f15608e;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        l83.a(i8, this.f15608e, "index");
        Object obj = this.f15607d[i8];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15608e;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final Object[] u() {
        return this.f15607d;
    }
}

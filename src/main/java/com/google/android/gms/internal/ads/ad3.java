package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class ad3 extends ob3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f5216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final ad3 f5217i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f5218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f5219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f5220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f5221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f5222g;

    static {
        Object[] objArr = new Object[0];
        f5216h = objArr;
        f5217i = new ad3(objArr, 0, objArr, 0, 0);
    }

    ad3(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f5218c = objArr;
        this.f5219d = i8;
        this.f5220e = objArr2;
        this.f5221f = i9;
        this.f5222g = i10;
    }

    @Override // com.google.android.gms.internal.ads.ob3
    final boolean H() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f5218c, 0, objArr, i8, this.f5222g);
        return i8 + this.f5222g;
    }

    @Override // com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f5220e;
            if (objArr.length != 0) {
                int iB = bb3.b(obj);
                while (true) {
                    int i8 = iB & this.f5221f;
                    Object obj2 = objArr[i8];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i8 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int e() {
        return this.f5222g;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ob3, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5219d;
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3
    /* JADX INFO: renamed from: n */
    public final kd3 iterator() {
        return i().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5222g;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final Object[] u() {
        return this.f5218c;
    }

    @Override // com.google.android.gms.internal.ads.ob3
    final jb3 w() {
        return jb3.w(this.f5218c, this.f5222g);
    }
}

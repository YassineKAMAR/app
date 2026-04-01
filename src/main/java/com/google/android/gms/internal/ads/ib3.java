package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ib3 extends jb3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f9132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f9133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ jb3 f9134f;

    ib3(jb3 jb3Var, int i8, int i9) {
        this.f9134f = jb3Var;
        this.f9132d = i8;
        this.f9133e = i9;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int e() {
        return this.f9134f.g() + this.f9132d + this.f9133e;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int g() {
        return this.f9134f.g() + this.f9132d;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        l83.a(i8, this.f9133e, "index");
        return this.f9134f.get(i8 + this.f9132d);
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9133e;
    }

    @Override // com.google.android.gms.internal.ads.jb3, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final Object[] u() {
        return this.f9134f.u();
    }

    @Override // com.google.android.gms.internal.ads.jb3
    /* JADX INFO: renamed from: v */
    public final jb3 subList(int i8, int i9) {
        l83.h(i8, i9, this.f9133e);
        int i10 = this.f9132d;
        return this.f9134f.subList(i8 + i10, i9 + i10);
    }
}

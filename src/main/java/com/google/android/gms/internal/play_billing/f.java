package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f19503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f19504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f19505f;

    f(g gVar, int i8, int i9) {
        this.f19505f = gVar;
        this.f19503d = i8;
        this.f19504e = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final int e() {
        return this.f19505f.g() + this.f19503d + this.f19504e;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final int g() {
        return this.f19505f.g() + this.f19503d;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        a6.a(i8, this.f19504e, "index");
        return this.f19505f.get(i8 + this.f19503d);
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19504e;
    }

    @Override // com.google.android.gms.internal.play_billing.g, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final Object[] u() {
        return this.f19505f.u();
    }

    @Override // com.google.android.gms.internal.play_billing.g
    /* JADX INFO: renamed from: v */
    public final g subList(int i8, int i9) {
        a6.d(i8, i9, this.f19504e);
        int i10 = this.f19503d;
        return this.f19505f.subList(i8 + i10, i9 + i10);
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class m extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final g f19626f = new m(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f19627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f19628e;

    m(Object[] objArr, int i8) {
        this.f19627d = objArr;
        this.f19628e = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.g, com.google.android.gms.internal.play_billing.d
    final int a(Object[] objArr, int i8) {
        System.arraycopy(this.f19627d, 0, objArr, 0, this.f19628e);
        return this.f19628e;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final int e() {
        return this.f19628e;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        a6.a(i8, this.f19628e, "index");
        Object obj = this.f19627d[i8];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19628e;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final Object[] u() {
        return this.f19627d;
    }
}

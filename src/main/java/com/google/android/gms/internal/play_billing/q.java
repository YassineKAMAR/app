package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class q extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f19657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f19658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f19659f;

    q(Object[] objArr, int i8, int i9) {
        this.f19657d = objArr;
        this.f19658e = i8;
        this.f19659f = i9;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        a6.a(i8, this.f19659f, "index");
        Object obj = this.f19657d[i8 + i8 + this.f19658e];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19659f;
    }
}

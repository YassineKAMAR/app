package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class op4 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12597b;

    public op4(nb nbVar, int i8) {
        this.f12596a = 1 == (nbVar.f11785d & 1);
        this.f12597b = gq4.s(i8, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(op4 op4Var) {
        return ya3.i().d(this.f12597b, op4Var.f12597b).d(this.f12596a, op4Var.f12596a).a();
    }
}

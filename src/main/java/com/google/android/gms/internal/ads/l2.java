package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class l2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10426c;

    private l2(int i8, int i9, int i10, int i11) {
        this.f10424a = i8;
        this.f10425b = i9;
        this.f10426c = i10;
    }

    public static l2 a(dq2 dq2Var) {
        int iQ = dq2Var.q();
        dq2Var.h(8);
        int iQ2 = dq2Var.q();
        int iQ3 = dq2Var.q();
        dq2Var.h(4);
        int iQ4 = dq2Var.q();
        dq2Var.h(12);
        return new l2(iQ, iQ2, iQ3, iQ4);
    }

    @Override // com.google.android.gms.internal.ads.g2
    public final int j() {
        return 1751742049;
    }
}

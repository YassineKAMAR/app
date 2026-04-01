package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class b24 implements i24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i24[] f5587a;

    b24(i24... i24VarArr) {
        this.f5587a = i24VarArr;
    }

    @Override // com.google.android.gms.internal.ads.i24
    public final h24 b(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            i24 i24Var = this.f5587a[i8];
            if (i24Var.c(cls)) {
                return i24Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.i24
    public final boolean c(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f5587a[i8].c(cls)) {
                return true;
            }
        }
        return false;
    }
}

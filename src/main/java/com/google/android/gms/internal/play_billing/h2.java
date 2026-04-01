package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class h2 implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p2[] f19565a;

    h2(p2... p2VarArr) {
        this.f19565a = p2VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final n2 b(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            p2 p2Var = this.f19565a[i8];
            if (p2Var.c(cls)) {
                return p2Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final boolean c(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f19565a[i8].c(cls)) {
                return true;
            }
        }
        return false;
    }
}

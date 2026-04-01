package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g4 f7860a = new g4();

    public final fo0 a(int i8) {
        this.f7860a.a(i8);
        return this;
    }

    public final fo0 b(hq0 hq0Var) {
        i6 i6Var = hq0Var.f8886a;
        for (int i8 = 0; i8 < i6Var.b(); i8++) {
            this.f7860a.a(i6Var.a(i8));
        }
        return this;
    }

    public final fo0 c(int... iArr) {
        for (int i8 = 0; i8 < 19; i8++) {
            this.f7860a.a(iArr[i8]);
        }
        return this;
    }

    public final fo0 d(int i8, boolean z7) {
        if (z7) {
            this.f7860a.a(i8);
        }
        return this;
    }

    public final hq0 e() {
        return new hq0(this.f7860a.b(), null);
    }
}

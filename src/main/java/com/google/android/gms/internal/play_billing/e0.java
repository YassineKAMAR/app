package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class e0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19498a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ n0 f19500c;

    e0(n0 n0Var) {
        this.f19500c = n0Var;
        this.f19499b = n0Var.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19498a < this.f19499b;
    }

    @Override // com.google.android.gms.internal.play_billing.i0
    public final byte j() {
        int i8 = this.f19498a;
        if (i8 >= this.f19499b) {
            throw new NoSuchElementException();
        }
        this.f19498a = i8 + 1;
        return this.f19500c.e(i8);
    }
}

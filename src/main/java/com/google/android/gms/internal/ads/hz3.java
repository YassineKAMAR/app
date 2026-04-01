package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class hz3 extends jz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9024a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ rz3 f9026c;

    hz3(rz3 rz3Var) {
        this.f9026c = rz3Var;
        this.f9025b = rz3Var.n();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9024a < this.f9025b;
    }

    @Override // com.google.android.gms.internal.ads.lz3
    public final byte j() {
        int i8 = this.f9024a;
        if (i8 >= this.f9025b) {
            throw new NoSuchElementException();
        }
        this.f9024a = i8 + 1;
        return this.f9026c.g(i8);
    }
}

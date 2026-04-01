package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class w24 extends jz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a34 f16599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    lz3 f16600b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d34 f16601c;

    w24(d34 d34Var) {
        this.f16601c = d34Var;
        this.f16599a = new a34(d34Var, null);
    }

    private final lz3 a() {
        a34 a34Var = this.f16599a;
        if (a34Var.hasNext()) {
            return a34Var.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16600b != null;
    }

    @Override // com.google.android.gms.internal.ads.lz3
    public final byte j() {
        lz3 lz3Var = this.f16600b;
        if (lz3Var == null) {
            throw new NoSuchElementException();
        }
        byte bJ = lz3Var.j();
        if (!this.f16600b.hasNext()) {
            this.f16600b = a();
        }
        return bJ;
    }
}

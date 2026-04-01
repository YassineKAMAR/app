package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f10582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jz2 f10583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10584c;

    public lc1(wr2 wr2Var, jz2 jz2Var) {
        this.f10582a = wr2Var.f16899r;
        this.f10583b = jz2Var;
    }

    public final void a() {
        if (this.f10584c) {
            return;
        }
        this.f10583b.d(this.f10582a);
        this.f10584c = true;
    }
}

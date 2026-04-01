package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class id4 implements yc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om4 f9160a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9164e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9162c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9161b = new Object();

    public id4(vm4 vm4Var, boolean z7) {
        this.f9160a = new om4(vm4Var, z7);
    }

    public final void a(int i8) {
        this.f9163d = i8;
        this.f9164e = false;
        this.f9162c.clear();
    }

    @Override // com.google.android.gms.internal.ads.yc4
    public final s11 j() {
        return this.f9160a.u();
    }

    @Override // com.google.android.gms.internal.ads.yc4
    public final Object k() {
        return this.f9161b;
    }
}

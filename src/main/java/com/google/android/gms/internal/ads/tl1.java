package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class tl1 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f15152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qz f15154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ul1 f15155d;

    /* synthetic */ tl1(ul1 ul1Var, WeakReference weakReference, String str, qz qzVar, sl1 sl1Var) {
        this.f15155d = ul1Var;
        this.f15152a = weakReference;
        this.f15153b = str;
        this.f15154c = qzVar;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        Object obj2 = this.f15152a.get();
        if (obj2 == null) {
            this.f15155d.k(this.f15153b, this);
        } else {
            this.f15154c.a(obj2, map);
        }
    }
}

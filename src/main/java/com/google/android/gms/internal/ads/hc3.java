package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class hc3 extends lc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f8722a;

    hc3(Comparator comparator) {
        this.f8722a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.lc3
    final Map a() {
        return new TreeMap(this.f8722a);
    }
}

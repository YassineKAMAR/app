package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class va3 extends ya3 {
    va3() {
        super(null);
    }

    static final ya3 j(int i8) {
        return i8 < 0 ? ya3.f17723b : i8 > 0 ? ya3.f17724c : ya3.f17722a;
    }

    @Override // com.google.android.gms.internal.ads.ya3
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ya3
    public final ya3 b(int i8, int i9) {
        return j(i8 < i9 ? -1 : i8 > i9 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.ya3
    public final ya3 c(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.ya3
    public final ya3 d(boolean z7, boolean z8) {
        return j(rd3.a(z7, z8));
    }

    @Override // com.google.android.gms.internal.ads.ya3
    public final ya3 e(boolean z7, boolean z8) {
        return j(rd3.a(false, false));
    }
}

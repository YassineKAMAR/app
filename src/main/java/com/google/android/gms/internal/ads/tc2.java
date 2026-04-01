package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class tc2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f15056a;

    tc2(Set set) {
        this.f15056a = set;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f15056a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zf3.h(new ni2() { // from class: com.google.android.gms.internal.ads.sc2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}

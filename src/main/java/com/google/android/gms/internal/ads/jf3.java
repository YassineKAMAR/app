package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class jf3 extends xe3 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f9597p;

    jf3(eb3 eb3Var, boolean z7) {
        super(eb3Var, z7, true);
        List listEmptyList = eb3Var.isEmpty() ? Collections.emptyList() : yb3.a(eb3Var.size());
        for (int i8 = 0; i8 < eb3Var.size(); i8++) {
            listEmptyList.add(null);
        }
        this.f9597p = listEmptyList;
    }

    @Override // com.google.android.gms.internal.ads.xe3
    final void P(int i8, Object obj) {
        List list = this.f9597p;
        if (list != null) {
            list.set(i8, new if3(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.xe3
    final void Q() {
        List list = this.f9597p;
        if (list != null) {
            f(V(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.xe3
    final void U(int i8) {
        super.U(i8);
        this.f9597p = null;
    }

    abstract Object V(List list);
}

package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
final class vc3 extends jb3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ wc3 f16103d;

    vc3(wc3 wc3Var) {
        this.f16103d = wc3Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        l83.a(i8, this.f16103d.f16689e, "index");
        wc3 wc3Var = this.f16103d;
        int i9 = i8 + i8;
        Object obj = wc3Var.f16688d[i9];
        obj.getClass();
        Object obj2 = wc3Var.f16688d[i9 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.eb3
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16103d.f16689e;
    }
}

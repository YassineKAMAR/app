package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
final class n extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f19632d;

    n(o oVar) {
        this.f19632d = oVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        a6.a(i8, this.f19632d.f19639e, "index");
        o oVar = this.f19632d;
        int i9 = i8 + i8;
        Object obj = oVar.f19638d[i9];
        obj.getClass();
        Object obj2 = oVar.f19638d[i9 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.d
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19632d.f19639e;
    }
}

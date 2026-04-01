package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h14 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g14 f8600b;

    public h14(List list, g14 g14Var) {
        this.f8599a = list;
        this.f8600b = g14Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        to toVarA = to.a(((Integer) this.f8599a.get(i8)).intValue());
        return toVarA == null ? to.AD_FORMAT_TYPE_UNSPECIFIED : toVarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8599a.size();
    }
}

package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class p extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j f19650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient g f19651d;

    p(j jVar, g gVar) {
        this.f19650c = jVar;
        this.f19651d = gVar;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    final int a(Object[] objArr, int i8) {
        return this.f19651d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.d, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19650c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.k, com.google.android.gms.internal.play_billing.d
    public final g i() {
        return this.f19651d;
    }

    @Override // com.google.android.gms.internal.play_billing.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f19651d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.d
    /* JADX INFO: renamed from: n */
    public final t iterator() {
        return this.f19651d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19650c.size();
    }
}

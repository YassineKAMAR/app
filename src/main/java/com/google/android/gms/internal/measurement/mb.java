package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class mb extends ub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ib f18964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private mb(ib ibVar) {
        super(ibVar);
        this.f18964b = ibVar;
    }

    @Override // com.google.android.gms.internal.measurement.ub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new kb(this.f18964b);
    }
}

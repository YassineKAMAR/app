package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class qb3 extends i93 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f13390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ m83 f13391d;

    qb3(Iterator it, m83 m83Var) {
        this.f13390c = it;
        this.f13391d = m83Var;
    }

    @Override // com.google.android.gms.internal.ads.i93
    protected final Object a() {
        while (this.f13390c.hasNext()) {
            Iterator it = this.f13390c;
            m83 m83Var = this.f13391d;
            Object next = it.next();
            if (m83Var.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}

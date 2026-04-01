package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class n34 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11667a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f11669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ r34 f11670d;

    /* synthetic */ n34(r34 r34Var, m34 m34Var) {
        this.f11670d = r34Var;
    }

    private final Iterator a() {
        if (this.f11669c == null) {
            this.f11669c = this.f11670d.f13889c.entrySet().iterator();
        }
        return this.f11669c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11667a + 1 >= this.f11670d.f13888b.size()) {
            return !this.f11670d.f13889c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f11668b = true;
        int i8 = this.f11667a + 1;
        this.f11667a = i8;
        return (Map.Entry) (i8 < this.f11670d.f13888b.size() ? this.f11670d.f13888b.get(this.f11667a) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f11668b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f11668b = false;
        this.f11670d.o();
        if (this.f11667a >= this.f11670d.f13888b.size()) {
            a().remove();
            return;
        }
        r34 r34Var = this.f11670d;
        int i8 = this.f11667a;
        this.f11667a = i8 - 1;
        r34Var.m(i8);
    }
}

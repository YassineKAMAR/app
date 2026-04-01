package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class k3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19611a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f19613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o3 f19614d;

    /* synthetic */ k3(o3 o3Var, j3 j3Var) {
        this.f19614d = o3Var;
    }

    private final Iterator a() {
        if (this.f19613c == null) {
            this.f19613c = this.f19614d.f19645c.entrySet().iterator();
        }
        return this.f19613c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19611a + 1 >= this.f19614d.f19644b.size()) {
            return !this.f19614d.f19645c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f19612b = true;
        int i8 = this.f19611a + 1;
        this.f19611a = i8;
        return (Map.Entry) (i8 < this.f19614d.f19644b.size() ? this.f19614d.f19644b.get(this.f19611a) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19612b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f19612b = false;
        this.f19614d.o();
        if (this.f19611a >= this.f19614d.f19644b.size()) {
            a().remove();
            return;
        }
        o3 o3Var = this.f19614d;
        int i8 = this.f19611a;
        this.f19611a = i8 - 1;
        o3Var.m(i8);
    }
}

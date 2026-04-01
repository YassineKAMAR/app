package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class sb implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f19210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ ib f19211d;

    private sb(ib ibVar) {
        this.f19211d = ibVar;
        this.f19208a = -1;
    }

    private final Iterator a() {
        if (this.f19210c == null) {
            this.f19210c = this.f19211d.f18802c.entrySet().iterator();
        }
        return this.f19210c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19208a + 1 < this.f19211d.f18801b.size() || (!this.f19211d.f18802c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f19209b = true;
        int i8 = this.f19208a + 1;
        this.f19208a = i8;
        return (Map.Entry) (i8 < this.f19211d.f18801b.size() ? this.f19211d.f18801b.get(this.f19208a) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19209b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f19209b = false;
        this.f19211d.r();
        if (this.f19208a >= this.f19211d.f18801b.size()) {
            a().remove();
            return;
        }
        ib ibVar = this.f19211d;
        int i8 = this.f19208a;
        this.f19208a = i8 - 1;
        ibVar.l(i8);
    }
}

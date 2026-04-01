package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class r7 extends t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19131a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ o7 f19133c;

    r7(o7 o7Var) {
        this.f19133c = o7Var;
        this.f19132b = o7Var.y();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19131a < this.f19132b;
    }

    @Override // com.google.android.gms.internal.measurement.u7
    public final byte j() {
        int i8 = this.f19131a;
        if (i8 >= this.f19132b) {
            throw new NoSuchElementException();
        }
        this.f19131a = i8 + 1;
        return this.f19133c.x(i8);
    }
}

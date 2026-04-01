package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e6 extends g6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7136d;

    public e6(int i8, long j8) {
        super(i8);
        this.f7134b = j8;
        this.f7135c = new ArrayList();
        this.f7136d = new ArrayList();
    }

    public final e6 c(int i8) {
        int size = this.f7136d.size();
        for (int i9 = 0; i9 < size; i9++) {
            e6 e6Var = (e6) this.f7136d.get(i9);
            if (e6Var.f8224a == i8) {
                return e6Var;
            }
        }
        return null;
    }

    public final f6 d(int i8) {
        int size = this.f7135c.size();
        for (int i9 = 0; i9 < size; i9++) {
            f6 f6Var = (f6) this.f7135c.get(i9);
            if (f6Var.f8224a == i8) {
                return f6Var;
            }
        }
        return null;
    }

    public final void e(e6 e6Var) {
        this.f7136d.add(e6Var);
    }

    public final void f(f6 f6Var) {
        this.f7135c.add(f6Var);
    }

    @Override // com.google.android.gms.internal.ads.g6
    public final String toString() {
        List list = this.f7135c;
        return g6.b(this.f8224a) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.f7136d.toArray());
    }
}

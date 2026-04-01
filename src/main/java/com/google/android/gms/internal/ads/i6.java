package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f9072a;

    public final int a(int i8) {
        uu1.a(i8, 0, this.f9072a.size());
        return this.f9072a.keyAt(i8);
    }

    public final int b() {
        return this.f9072a.size();
    }

    public final boolean c(int i8) {
        return this.f9072a.get(i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        if (nz2.f12300a >= 24) {
            return this.f9072a.equals(i6Var.f9072a);
        }
        if (this.f9072a.size() != i6Var.f9072a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f9072a.size(); i8++) {
            if (a(i8) != i6Var.a(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (nz2.f12300a >= 24) {
            return this.f9072a.hashCode();
        }
        int size = this.f9072a.size();
        for (int i8 = 0; i8 < this.f9072a.size(); i8++) {
            size = (size * 31) + a(i8);
        }
        return size;
    }
}

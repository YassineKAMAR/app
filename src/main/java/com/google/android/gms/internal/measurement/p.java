package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p implements r {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof p;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        return r.M;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        return Boolean.FALSE;
    }
}

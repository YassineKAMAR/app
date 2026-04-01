package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y implements r {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof y;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        return r.L;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        return "undefined";
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

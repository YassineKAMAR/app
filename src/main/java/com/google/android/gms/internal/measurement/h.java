package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18757a;

    public h(Boolean bool) {
        this.f18757a = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f18757a == ((h) obj).f18757a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        if ("toString".equals(str)) {
            return new t(Boolean.toString(this.f18757a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f18757a), str));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f18757a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        return new h(Boolean.valueOf(this.f18757a));
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        return Double.valueOf(this.f18757a ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        return Boolean.toString(this.f18757a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        return Boolean.valueOf(this.f18757a);
    }

    public final String toString() {
        return String.valueOf(this.f18757a);
    }
}

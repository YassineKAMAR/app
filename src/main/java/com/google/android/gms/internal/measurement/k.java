package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f18861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18862b;

    public k() {
        this.f18861a = r.L;
        this.f18862b = "return";
    }

    public k(String str) {
        this.f18861a = r.L;
        this.f18862b = str;
    }

    public k(String str, r rVar) {
        this.f18861a = rVar;
        this.f18862b = str;
    }

    public final r a() {
        return this.f18861a;
    }

    public final String b() {
        return this.f18862b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f18862b.equals(kVar.f18862b) && this.f18861a.equals(kVar.f18861a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return (this.f18862b.hashCode() * 31) + this.f18861a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        return new k(this.f18862b, this.f18861a.l());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        throw new IllegalStateException("Control is not a boolean");
    }
}

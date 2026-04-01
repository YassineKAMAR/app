package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements l, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f18934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map<String, r> f18935b = new HashMap();

    public m(String str) {
        this.f18934a = str;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final r a(String str) {
        return this.f18935b.containsKey(str) ? this.f18935b.get(str) : r.L;
    }

    public abstract r b(b7 b7Var, List<r> list);

    public final String c() {
        return this.f18934a;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final boolean e(String str) {
        return this.f18935b.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        String str = this.f18934a;
        if (str != null) {
            return str.equals(mVar.f18934a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, b7 b7Var, List<r> list) {
        return "toString".equals(str) ? new t(this.f18934a) : o.a(this, new t(str), b7Var, list);
    }

    public int hashCode() {
        String str = this.f18934a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.l
    public final void i(String str, r rVar) {
        if (rVar == null) {
            this.f18935b.remove(str);
        } else {
            this.f18935b.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r l() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        return this.f18934a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return o.b(this.f18935b);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        return Boolean.TRUE;
    }
}

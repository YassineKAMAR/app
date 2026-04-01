package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class v5 extends v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u3.k<u3.g<i6>> f19268b;

    v5(Context context, u3.k<u3.g<i6>> kVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f19267a = context;
        this.f19268b = kVar;
    }

    @Override // com.google.android.gms.internal.measurement.v6
    final Context a() {
        return this.f19267a;
    }

    @Override // com.google.android.gms.internal.measurement.v6
    final u3.k<u3.g<i6>> b() {
        return this.f19268b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v6) {
            v6 v6Var = (v6) obj;
            if (this.f19267a.equals(v6Var.a())) {
                u3.k<u3.g<i6>> kVar = this.f19268b;
                u3.k<u3.g<i6>> kVarB = v6Var.b();
                if (kVar != null ? kVar.equals(kVarB) : kVarB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f19267a.hashCode() ^ 1000003) * 1000003;
        u3.k<u3.g<i6>> kVar = this.f19268b;
        return iHashCode ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f19267a) + ", hermeticFileOverrides=" + String.valueOf(this.f19268b) + "}";
    }
}

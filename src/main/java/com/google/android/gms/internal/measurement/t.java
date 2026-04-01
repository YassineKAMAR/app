package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t implements r, Iterable<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19217a;

    public t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f19217a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f19217a.equals(((t) obj).f19217a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[PHI: r4
  0x00b8: PHI (r4v77 java.lang.String) = 
  (r4v7 java.lang.String)
  (r4v8 java.lang.String)
  (r4v9 java.lang.String)
  (r4v11 java.lang.String)
  (r4v13 java.lang.String)
  (r4v15 java.lang.String)
  (r4v17 java.lang.String)
  (r4v19 java.lang.String)
  (r4v22 java.lang.String)
  (r4v24 java.lang.String)
  (r4v26 java.lang.String)
  (r4v28 java.lang.String)
  (r4v30 java.lang.String)
  (r4v32 java.lang.String)
  (r4v34 java.lang.String)
  (r4v78 java.lang.String)
 binds: [B:104:0x01cc, B:100:0x01bb, B:298:?, B:297:?, B:296:?, B:295:?, B:294:?, B:293:?, B:292:?, B:291:?, B:290:?, B:289:?, B:288:?, B:287:?, B:286:?, B:44:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.r g(java.lang.String r22, com.google.android.gms.internal.measurement.b7 r23, java.util.List<com.google.android.gms.internal.measurement.r> r24) {
        /*
            Method dump skipped, instruction units count: 1886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t.g(java.lang.String, com.google.android.gms.internal.measurement.b7, java.util.List):com.google.android.gms.internal.measurement.r");
    }

    public final int hashCode() {
        return this.f19217a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<r> iterator() {
        return new v(this);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l() {
        return new t(this.f19217a);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double m() {
        double d8;
        if (this.f19217a.isEmpty()) {
            d8 = 0.0d;
        } else {
            try {
                return Double.valueOf(this.f19217a);
            } catch (NumberFormatException unused) {
                d8 = Double.NaN;
            }
        }
        return Double.valueOf(d8);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String n() {
        return this.f19217a;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator<r> o() {
        return new w(this);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean p() {
        return Boolean.valueOf(!this.f19217a.isEmpty());
    }

    public final String toString() {
        return "\"" + this.f19217a + "\"";
    }
}

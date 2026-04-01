package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.y6;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap<y6.a, j> f20167a;

    k() {
        this.f20167a = new EnumMap<>(y6.a.class);
    }

    private k(EnumMap<y6.a, j> enumMap) {
        EnumMap<y6.a, j> enumMap2 = new EnumMap<>(y6.a.class);
        this.f20167a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static k b(String str) {
        EnumMap enumMap = new EnumMap(y6.a.class);
        if (str.length() >= y6.a.values().length) {
            int i8 = 0;
            if (str.charAt(0) == '1') {
                y6.a[] aVarArrValues = y6.a.values();
                int length = aVarArrValues.length;
                int i9 = 1;
                while (i8 < length) {
                    enumMap.put(aVarArrValues[i8], j.c(str.charAt(i9)));
                    i8++;
                    i9++;
                }
                return new k(enumMap);
            }
        }
        return new k();
    }

    public final j a(y6.a aVar) {
        j jVar = this.f20167a.get(aVar);
        return jVar == null ? j.UNSET : jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.measurement.internal.y6.a r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.j.UNSET
            r1 = -20
            if (r4 == r1) goto L17
            r1 = -10
            if (r4 == r1) goto L14
            if (r4 == 0) goto L17
            r1 = 30
            if (r4 == r1) goto L11
            goto L19
        L11:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.j.INITIALIZATION
            goto L19
        L14:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.j.MANIFEST
            goto L19
        L17:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.j.API
        L19:
            java.util.EnumMap<com.google.android.gms.measurement.internal.y6$a, com.google.android.gms.measurement.internal.j> r4 = r2.f20167a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.k.c(com.google.android.gms.measurement.internal.y6$a, int):void");
    }

    public final void d(y6.a aVar, j jVar) {
        this.f20167a.put(aVar, jVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (y6.a aVar : y6.a.values()) {
            j jVar = this.f20167a.get(aVar);
            if (jVar == null) {
                jVar = j.UNSET;
            }
            sb.append(jVar.f20145a);
        }
        return sb.toString();
    }
}

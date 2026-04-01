package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class s6 extends o6<Long> {
    s6(w6 w6Var, String str, Long l8, boolean z7) {
        super(w6Var, str, l8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.o6
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Long g(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}

package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class r6 extends o6<Boolean> {
    r6(w6 w6Var, String str, Boolean bool, boolean z7) {
        super(w6Var, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.o6
    final /* synthetic */ Boolean g(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (r5.f19118c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (r5.f19119d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}

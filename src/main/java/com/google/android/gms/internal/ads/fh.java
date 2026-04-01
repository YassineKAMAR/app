package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fh extends eh {
    protected fh(Context context, String str, boolean z7) {
        super(context, str, z7);
    }

    public static fh x(String str, Context context, boolean z7) {
        eh.t(context, false);
        return new fh(context, str, false);
    }

    @Deprecated
    public static fh y(String str, Context context, boolean z7, int i8) {
        eh.t(context, z7);
        return new fh(context, str, z7);
    }

    @Override // com.google.android.gms.internal.ads.eh
    protected final List r(ii iiVar, Context context, ce ceVar, vd vdVar) {
        if (iiVar.k() == null || !this.f7318v) {
            return super.r(iiVar, context, ceVar, null);
        }
        int iA = iiVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.r(iiVar, context, ceVar, null));
        arrayList.add(new dj(iiVar, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", ceVar, iA, 24));
        return arrayList;
    }
}

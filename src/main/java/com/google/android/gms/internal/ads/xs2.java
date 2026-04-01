package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xs2 {
    public static h2.w4 a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xr2 xr2Var = (xr2) it.next();
            if (xr2Var.f17448c) {
                arrayList.add(z1.h.f27631p);
            } else {
                arrayList.add(new z1.h(xr2Var.f17446a, xr2Var.f17447b));
            }
        }
        return new h2.w4(context, (z1.h[]) arrayList.toArray(new z1.h[arrayList.size()]));
    }

    public static xr2 b(h2.w4 w4Var) {
        return w4Var.f22359i ? new xr2(-3, 0, true) : new xr2(w4Var.f22355e, w4Var.f22352b, false);
    }
}

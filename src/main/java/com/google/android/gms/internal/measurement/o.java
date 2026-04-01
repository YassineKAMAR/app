package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o {
    public static r a(l lVar, r rVar, b7 b7Var, List<r> list) {
        if (lVar.e(rVar.n())) {
            r rVarA = lVar.a(rVar.n());
            if (rVarA instanceof m) {
                return ((m) rVarA).b(b7Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", rVar.n()));
        }
        if (!"hasOwnProperty".equals(rVar.n())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", rVar.n()));
        }
        a6.g("hasOwnProperty", 1, list);
        return lVar.e(b7Var.b(list.get(0)).n()) ? r.Q : r.R;
    }

    public static Iterator<r> b(Map<String, r> map) {
        return new n(map.keySet().iterator());
    }
}

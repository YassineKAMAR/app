package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f15861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f15862b;

    ut0(Map map, Map map2) {
        this.f15861a = map;
        this.f15862b = map2;
    }

    public final void a(ks2 ks2Var) {
        for (is2 is2Var : ks2Var.f10323b.f9794c) {
            if (this.f15861a.containsKey(is2Var.f9338a)) {
                ((xt0) this.f15861a.get(is2Var.f9338a)).a(is2Var.f9339b);
            } else if (this.f15862b.containsKey(is2Var.f9338a)) {
                wt0 wt0Var = (wt0) this.f15862b.get(is2Var.f9338a);
                JSONObject jSONObject = is2Var.f9339b;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                wt0Var.a(map);
            }
        }
    }
}

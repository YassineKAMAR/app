package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u03 implements s03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s03 f15433a;

    public u03(s03 s03Var) {
        this.f15433a = s03Var;
    }

    @Override // com.google.android.gms.internal.ads.s03
    public final JSONObject a(View view) {
        JSONObject jSONObjectA = c13.a(0, 0, 0, 0);
        int iB = f13.b();
        int i8 = iB - 1;
        if (iB == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i8 == 0);
        } catch (JSONException e8) {
            d13.a("Error with setting output device status", e8);
        }
        return jSONObjectA;
    }

    @Override // com.google.android.gms.internal.ads.s03
    public final void b(View view, JSONObject jSONObject, r03 r03Var, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        i03 i03VarA = i03.a();
        if (i03VarA != null) {
            Collection collectionB = i03VarA.b();
            int size = collectionB.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                View viewF = ((uz2) it.next()).f();
                if (viewF != null && viewF.isAttachedToWindow() && viewF.isShown()) {
                    View view2 = viewF;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewF.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float fA = i13.a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i8 = size2 - 1;
                                    if (i13.a((View) arrayList.get(i8)) <= fA) {
                                        break;
                                    } else {
                                        size2 = i8;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            r03Var.a((View) arrayList.get(i9), this.f15433a, jSONObject, z8);
        }
    }
}

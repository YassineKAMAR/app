package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v03 implements s03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f15950a = new int[2];

    @Override // com.google.android.gms.internal.ads.s03
    public final JSONObject a(View view) {
        if (view == null) {
            return c13.a(0, 0, 0, 0);
        }
        int[] iArr = this.f15950a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.f15950a;
        return c13.a(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.s03
    public final void b(View view, JSONObject jSONObject, r03 r03Var, boolean z7, boolean z8) {
        int i8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z7) {
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    r03Var.a(viewGroup.getChildAt(i9), this, jSONObject, z8);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i11));
                int size2 = arrayList3.size();
                int i12 = 0;
                while (true) {
                    i8 = i11 + 1;
                    if (i12 < size2) {
                        r03Var.a((View) arrayList3.get(i12), this, jSONObject, z8);
                        i12++;
                    }
                }
                i11 = i8;
            }
        }
    }
}

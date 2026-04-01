package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f5851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wj1 f5852b;

    public bk1(Executor executor, wj1 wj1Var) {
        this.f5851a = executor;
        this.f5852b = wj1Var;
    }

    public final x3.d a(JSONObject jSONObject, String str) {
        final String strOptString;
        x3.d dVarM;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zf3.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i8);
            ak1 ak1Var = null;
            if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                dVarM = zf3.h(ak1Var);
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("type");
                if ("string".equals(strOptString2)) {
                    ak1Var = new ak1(strOptString, jSONObjectOptJSONObject.optString("string_value"));
                } else if ("image".equals(strOptString2)) {
                    dVarM = zf3.m(this.f5852b.e(jSONObjectOptJSONObject, "image_value"), new z73() { // from class: com.google.android.gms.internal.ads.yj1
                        @Override // com.google.android.gms.internal.ads.z73
                        public final Object apply(Object obj) {
                            return new ak1(strOptString, (jv) obj);
                        }
                    }, this.f5851a);
                }
                dVarM = zf3.h(ak1Var);
            }
            arrayList.add(dVarM);
        }
        return zf3.m(zf3.d(arrayList), new z73() { // from class: com.google.android.gms.internal.ads.zj1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (ak1 ak1Var2 : (List) obj) {
                    if (ak1Var2 != null) {
                        arrayList2.add(ak1Var2);
                    }
                }
                return arrayList2;
            }
        }, this.f5851a);
    }
}

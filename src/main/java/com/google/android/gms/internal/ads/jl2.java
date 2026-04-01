package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jl2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9701a;

    public jl2(List list) {
        this.f9701a = list;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(com.amazon.a.a.o.b.f.f3942a, this.f9701a));
        } catch (JSONException unused) {
            j2.v1.k("Failed putting experiment ids.");
        }
    }
}

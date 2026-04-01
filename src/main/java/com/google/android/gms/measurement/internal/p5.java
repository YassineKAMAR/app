package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ee;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class p5 implements ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i5 f20351b;

    p5(i5 i5Var, String str) {
        this.f20351b = i5Var;
        this.f20350a = str;
    }

    @Override // com.google.android.gms.internal.measurement.ee
    public final String a(String str) {
        Map map = (Map) this.f20351b.f20098d.get(this.f20350a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}

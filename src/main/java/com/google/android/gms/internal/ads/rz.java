package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rz implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sz f14385a;

    public rz(sz szVar) {
        this.f14385a = szVar;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f8 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f8 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e8) {
            qg0.e("Fail to parse float", e8);
        }
        this.f14385a.c(zEquals);
        this.f14385a.b(zEquals2, f8);
        fm0Var.K0(zEquals);
    }
}

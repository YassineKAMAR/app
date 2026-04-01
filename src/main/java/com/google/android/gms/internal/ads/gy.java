package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gy implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hy f8545a;

    public gy(hy hyVar) {
        this.f8545a = hyVar;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            qg0.g("App event with no name parameter.");
        } else {
            this.f8545a.b(str, (String) map.get("info"));
        }
    }
}

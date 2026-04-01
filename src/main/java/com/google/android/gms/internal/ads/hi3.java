package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class hi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f8757a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ii3 f8760d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentMap f8758b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8759c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ws3 f8761e = ws3.f16937b;

    /* synthetic */ hi3(Class cls, gi3 gi3Var) {
        this.f8757a = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.hi3 e(java.lang.Object r13, java.lang.Object r14, com.google.android.gms.internal.ads.iw3 r15, boolean r16) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hi3.e(java.lang.Object, java.lang.Object, com.google.android.gms.internal.ads.iw3, boolean):com.google.android.gms.internal.ads.hi3");
    }

    public final hi3 a(Object obj, Object obj2, iw3 iw3Var) {
        e(obj, obj2, iw3Var, false);
        return this;
    }

    public final hi3 b(Object obj, Object obj2, iw3 iw3Var) {
        e(obj, obj2, iw3Var, true);
        return this;
    }

    public final hi3 c(ws3 ws3Var) {
        if (this.f8758b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f8761e = ws3Var;
        return this;
    }

    public final ni3 d() {
        ConcurrentMap concurrentMap = this.f8758b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        ni3 ni3Var = new ni3(concurrentMap, this.f8759c, this.f8760d, this.f8761e, this.f8757a, null);
        this.f8758b = null;
        return ni3Var;
    }
}

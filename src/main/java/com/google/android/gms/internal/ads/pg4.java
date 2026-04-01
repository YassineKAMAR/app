package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes.dex */
public final class pg4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pg4 f12868b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final og4 f12869a;

    static {
        f12868b = nz2.f12300a < 31 ? new pg4() : new pg4(og4.f12477b);
    }

    public pg4() {
        uu1.f(nz2.f12300a < 31);
        this.f12869a = null;
    }

    public pg4(LogSessionId logSessionId) {
        this.f12869a = new og4(logSessionId);
    }

    private pg4(og4 og4Var) {
        this.f12869a = og4Var;
    }

    public final LogSessionId a() {
        og4 og4Var = this.f12869a;
        og4Var.getClass();
        return og4Var.f12478a;
    }
}

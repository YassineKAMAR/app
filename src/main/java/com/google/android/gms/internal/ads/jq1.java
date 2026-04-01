package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class jq1 extends mq1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ux2 f9747l;

    public jq1(Executor executor, vg0 vg0Var, ux2 ux2Var, wx2 wx2Var, Context context) {
        super(executor, vg0Var, wx2Var, context);
        this.f9747l = ux2Var;
        ux2Var.a(this.f11510b);
    }

    public final Map g() {
        return new HashMap(this.f11510b);
    }
}

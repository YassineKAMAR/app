package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class tw2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x3.d f15355d = zf3.h(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f15356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f15357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uw2 f15358c;

    public tw2(lg3 lg3Var, ScheduledExecutorService scheduledExecutorService, uw2 uw2Var) {
        this.f15356a = lg3Var;
        this.f15357b = scheduledExecutorService;
        this.f15358c = uw2Var;
    }

    public final iw2 a(Object obj, x3.d... dVarArr) {
        return new iw2(this, obj, Arrays.asList(dVarArr), null);
    }

    public final sw2 b(Object obj, x3.d dVar) {
        return new sw2(this, obj, dVar, Collections.singletonList(dVar), dVar);
    }

    protected abstract String f(Object obj);
}

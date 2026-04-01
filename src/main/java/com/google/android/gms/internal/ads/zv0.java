package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l40 f18495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f18496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ew0 f18497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qz f18498e = new wv0(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qz f18499f = new yv0(this);

    public zv0(String str, l40 l40Var, Executor executor) {
        this.f18494a = str;
        this.f18495b = l40Var;
        this.f18496c = executor;
    }

    static /* bridge */ /* synthetic */ boolean g(zv0 zv0Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zv0Var.f18494a);
    }

    public final void c(ew0 ew0Var) {
        this.f18495b.b("/updateActiveView", this.f18498e);
        this.f18495b.b("/untrackActiveViewUnit", this.f18499f);
        this.f18497d = ew0Var;
    }

    public final void d(fm0 fm0Var) {
        fm0Var.f1("/updateActiveView", this.f18498e);
        fm0Var.f1("/untrackActiveViewUnit", this.f18499f);
    }

    public final void e() {
        this.f18495b.c("/updateActiveView", this.f18498e);
        this.f18495b.c("/untrackActiveViewUnit", this.f18499f);
    }

    public final void f(fm0 fm0Var) {
        fm0Var.e1("/updateActiveView", this.f18498e);
        fm0Var.e1("/untrackActiveViewUnit", this.f18499f);
    }
}

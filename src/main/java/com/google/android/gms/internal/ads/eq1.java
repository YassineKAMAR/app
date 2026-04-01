package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class eq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jq1 f7462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f7463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7464c;

    public eq1(jq1 jq1Var, Executor executor) {
        this.f7462a = jq1Var;
        this.f7464c = jq1Var.g();
        this.f7463b = executor;
    }

    public final dq1 a() {
        dq1 dq1Var = new dq1(this);
        dq1.a(dq1Var);
        return dq1Var;
    }

    public final void e() {
        if (((Boolean) h2.y.c().b(ns.Fa)).booleanValue()) {
            dq1 dq1VarA = a();
            dq1VarA.b("action", "pecr");
            dq1VarA.g();
        }
    }
}

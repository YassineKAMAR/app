package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6863a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ eq1 f6864b;

    dq1(eq1 eq1Var) {
        this.f6864b = eq1Var;
    }

    static /* bridge */ /* synthetic */ dq1 a(dq1 dq1Var) {
        dq1Var.f6863a.putAll(dq1Var.f6864b.f7464c);
        return dq1Var;
    }

    public final dq1 b(String str, String str2) {
        this.f6863a.put(str, str2);
        return this;
    }

    public final dq1 c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f6863a.put(str, str2);
        }
        return this;
    }

    public final dq1 d(wr2 wr2Var) {
        this.f6863a.put("aai", wr2Var.f16910y);
        if (((Boolean) h2.y.c().b(ns.W6)).booleanValue()) {
            c("rid", wr2Var.f16896p0);
        }
        return this;
    }

    public final dq1 e(as2 as2Var) {
        this.f6863a.put("gqi", as2Var.f5462b);
        return this;
    }

    public final String f() {
        return this.f6864b.f7462a.b(this.f6863a);
    }

    public final void g() {
        this.f6864b.f7463b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bq1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5986a.i();
            }
        });
    }

    public final void h() {
        this.f6864b.f7463b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cq1
            @Override // java.lang.Runnable
            public final void run() {
                this.f6441a.j();
            }
        });
    }

    final /* synthetic */ void i() {
        this.f6864b.f7462a.f(this.f6863a);
    }

    final /* synthetic */ void j() {
        this.f6864b.f7462a.e(this.f6863a);
    }
}

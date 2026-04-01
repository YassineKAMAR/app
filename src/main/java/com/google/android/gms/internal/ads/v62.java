package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.e f16020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w62 f16021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jz2 f16022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f16023d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16024e = ((Boolean) h2.y.c().b(ns.O6)).booleanValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c32 f16025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f16026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f16027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f16028i;

    public v62(e3.e eVar, w62 w62Var, c32 c32Var, jz2 jz2Var) {
        this.f16020a = eVar;
        this.f16021b = w62Var;
        this.f16025f = c32Var;
        this.f16022c = jz2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean q(wr2 wr2Var) {
        u62 u62Var = (u62) this.f16023d.get(wr2Var);
        if (u62Var == null) {
            return false;
        }
        return u62Var.f15516c == 8;
    }

    public final synchronized long a() {
        return this.f16027h;
    }

    final synchronized x3.d f(ks2 ks2Var, wr2 wr2Var, x3.d dVar, fz2 fz2Var) {
        as2 as2Var = ks2Var.f10323b.f9793b;
        long jB = this.f16020a.b();
        String str = wr2Var.f16910y;
        if (str != null) {
            this.f16023d.put(wr2Var, new u62(str, wr2Var.f16880h0, 7, 0L, null));
            zf3.r(dVar, new t62(this, jB, as2Var, wr2Var, str, fz2Var, ks2Var), eh0.f7327f);
        }
        return dVar;
    }

    public final synchronized String g() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f16023d.entrySet().iterator();
        while (it.hasNext()) {
            u62 u62Var = (u62) ((Map.Entry) it.next()).getValue();
            if (u62Var.f15516c != Integer.MAX_VALUE) {
                arrayList.add(u62Var.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void i(wr2 wr2Var) {
        this.f16027h = this.f16020a.b() - this.f16028i;
        if (wr2Var != null) {
            this.f16025f.e(wr2Var);
        }
        this.f16026g = true;
    }

    public final synchronized void j() {
        this.f16027h = this.f16020a.b() - this.f16028i;
    }

    public final synchronized void k(List list) {
        this.f16028i = this.f16020a.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wr2 wr2Var = (wr2) it.next();
            if (!TextUtils.isEmpty(wr2Var.f16910y)) {
                this.f16023d.put(wr2Var, new u62(wr2Var.f16910y, wr2Var.f16880h0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void l() {
        this.f16028i = this.f16020a.b();
    }

    public final synchronized void m(wr2 wr2Var) {
        u62 u62Var = (u62) this.f16023d.get(wr2Var);
        if (u62Var == null || this.f16026g) {
            return;
        }
        u62Var.f15516c = 8;
    }
}

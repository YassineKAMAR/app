package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class f62 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tg3 f7643c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f7646f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f7648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f7649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final v62 f7650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private wr2 f7651k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7641a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7642b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f7644d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f7645e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7647g = Integer.MAX_VALUE;

    f62(ks2 ks2Var, v62 v62Var, tg3 tg3Var) {
        this.f7649i = ks2Var.f10323b.f9793b.f5476p;
        this.f7650j = v62Var;
        this.f7643c = tg3Var;
        this.f7648h = b72.d(ks2Var);
        List list = ks2Var.f10323b.f9792a;
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f7641a.put((wr2) list.get(i8), Integer.valueOf(i8));
        }
        this.f7642b.addAll(list);
    }

    private final synchronized void f() {
        this.f7650j.i(this.f7651k);
        Object obj = this.f7646f;
        if (obj != null) {
            this.f7643c.f(obj);
        } else {
            this.f7643c.g(new y62(3, this.f7648h));
        }
    }

    private final synchronized boolean g(boolean z7) {
        boolean z8;
        for (wr2 wr2Var : this.f7642b) {
            Integer num = (Integer) this.f7641a.get(wr2Var);
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z7 || !this.f7645e.contains(wr2Var.f16906u0)) {
                if (numValueOf.intValue() < this.f7647g) {
                    z8 = true;
                    break;
                }
                if (numValueOf.intValue() > this.f7647g) {
                    break;
                }
            }
        }
        z8 = false;
        return z8;
    }

    private final synchronized boolean h() {
        boolean z7;
        Iterator it = this.f7644d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z7 = false;
                break;
            }
            Integer num = (Integer) this.f7641a.get((wr2) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.f7647g) {
                z7 = true;
                break;
            }
        }
        return z7;
    }

    private final synchronized boolean i() {
        if (!g(true)) {
            if (!h()) {
                return false;
            }
        }
        return true;
    }

    final synchronized wr2 a() {
        for (int i8 = 0; i8 < this.f7642b.size(); i8++) {
            wr2 wr2Var = (wr2) this.f7642b.get(i8);
            String str = wr2Var.f16906u0;
            if (!this.f7645e.contains(str)) {
                if (!TextUtils.isEmpty(str)) {
                    this.f7645e.add(str);
                }
                this.f7644d.add(wr2Var);
                return (wr2) this.f7642b.remove(i8);
            }
        }
        return null;
    }

    final synchronized void b(Throwable th, wr2 wr2Var) {
        this.f7644d.remove(wr2Var);
        this.f7645e.remove(wr2Var.f16906u0);
        if (d() || i()) {
            return;
        }
        f();
    }

    final synchronized void c(Object obj, wr2 wr2Var) {
        this.f7644d.remove(wr2Var);
        if (d()) {
            return;
        }
        Integer num = (Integer) this.f7641a.get(wr2Var);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (numValueOf.intValue() > this.f7647g) {
            this.f7650j.m(wr2Var);
            return;
        }
        if (this.f7646f != null) {
            this.f7650j.m(this.f7651k);
        }
        this.f7647g = numValueOf.intValue();
        this.f7646f = obj;
        this.f7651k = wr2Var;
        if (i()) {
            return;
        }
        f();
    }

    final synchronized boolean d() {
        return this.f7643c.isDone();
    }

    final synchronized boolean e() {
        if (!d()) {
            List list = this.f7644d;
            if (list.size() < this.f7649i) {
                if (g(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}

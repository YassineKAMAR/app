package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b7 f18588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0 f18589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, r> f18590c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f18591d = new HashMap();

    public b7(b7 b7Var, d0 d0Var) {
        this.f18588a = b7Var;
        this.f18589b = d0Var;
    }

    public final r a(g gVar) {
        r rVarA = r.L;
        Iterator<Integer> itD = gVar.D();
        while (itD.hasNext()) {
            rVarA = this.f18589b.a(this, gVar.v(itD.next().intValue()));
            if (rVarA instanceof k) {
                break;
            }
        }
        return rVarA;
    }

    public final r b(r rVar) {
        return this.f18589b.a(this, rVar);
    }

    public final r c(String str) {
        b7 b7Var = this;
        while (!b7Var.f18590c.containsKey(str)) {
            b7Var = b7Var.f18588a;
            if (b7Var == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return b7Var.f18590c.get(str);
    }

    public final b7 d() {
        return new b7(this, this.f18589b);
    }

    public final void e(String str, r rVar) {
        if (this.f18591d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            this.f18590c.remove(str);
        } else {
            this.f18590c.put(str, rVar);
        }
    }

    public final void f(String str, r rVar) {
        e(str, rVar);
        this.f18591d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        b7 b7Var = this;
        while (!b7Var.f18590c.containsKey(str)) {
            b7Var = b7Var.f18588a;
            if (b7Var == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, r rVar) {
        b7 b7Var;
        b7 b7Var2 = this;
        while (!b7Var2.f18590c.containsKey(str) && (b7Var = b7Var2.f18588a) != null && b7Var.g(str)) {
            b7Var2 = b7Var2.f18588a;
        }
        if (b7Var2.f18591d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            b7Var2.f18590c.remove(str);
        } else {
            b7Var2.f18590c.put(str, rVar);
        }
    }
}

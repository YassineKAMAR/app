package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class at1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final js1 f5479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final un1 f5480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f5481c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f5482d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5483e;

    at1(js1 js1Var, un1 un1Var) {
        this.f5479a = js1Var;
        this.f5480b = un1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List list) {
        tn1 tn1VarA;
        tn1 tn1VarA2;
        m70 m70Var;
        synchronized (this.f5481c) {
            if (this.f5483e) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f10 f10Var = (f10) it.next();
                String string = (!((Boolean) h2.y.c().b(ns.b9)).booleanValue() || (tn1VarA2 = this.f5480b.a(f10Var.f7567a)) == null || (m70Var = tn1VarA2.f15173c) == null) ? "" : m70Var.toString();
                boolean z7 = ((Boolean) h2.y.c().b(ns.c9)).booleanValue() && (tn1VarA = this.f5480b.a(f10Var.f7567a)) != null && tn1VarA.f15174d;
                List list2 = this.f5482d;
                String str = f10Var.f7567a;
                list2.add(new zs1(str, string, this.f5480b.c(str), f10Var.f7568b ? 1 : 0, f10Var.f7570d, f10Var.f7569c, z7));
            }
            this.f5483e = true;
        }
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f5481c) {
            if (!this.f5483e) {
                if (!this.f5479a.t()) {
                    c();
                    return jSONArray;
                }
                d(this.f5479a.g());
            }
            Iterator it = this.f5482d.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zs1) it.next()).a());
            }
            return jSONArray;
        }
    }

    public final void c() {
        this.f5479a.s(new ys1(this));
    }
}

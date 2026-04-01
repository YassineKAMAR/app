package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hq1 implements cx2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zp1 f8888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e3.e f8889c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8887a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8890d = new HashMap();

    public hq1(zp1 zp1Var, Set set, e3.e eVar) {
        this.f8888b = zp1Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            gq1 gq1Var = (gq1) it.next();
            this.f8890d.put(gq1Var.f8453c, gq1Var);
        }
        this.f8889c = eVar;
    }

    private final void a(vw2 vw2Var, boolean z7) {
        vw2 vw2Var2 = ((gq1) this.f8890d.get(vw2Var)).f8452b;
        if (this.f8887a.containsKey(vw2Var2)) {
            String str = true != z7 ? "f." : "s.";
            long jB = this.f8889c.b() - ((Long) this.f8887a.get(vw2Var2)).longValue();
            this.f8888b.a().put("label.".concat(((gq1) this.f8890d.get(vw2Var)).f8451a), str.concat(String.valueOf(Long.toString(jB))));
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void C(vw2 vw2Var, String str) {
        this.f8887a.put(vw2Var, Long.valueOf(this.f8889c.b()));
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void e(vw2 vw2Var, String str) {
        if (this.f8887a.containsKey(vw2Var)) {
            long jB = this.f8889c.b() - ((Long) this.f8887a.get(vw2Var)).longValue();
            zp1 zp1Var = this.f8888b;
            String strValueOf = String.valueOf(str);
            zp1Var.a().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jB))));
        }
        if (this.f8890d.containsKey(vw2Var)) {
            a(vw2Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void h(vw2 vw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void o(vw2 vw2Var, String str, Throwable th) {
        if (this.f8887a.containsKey(vw2Var)) {
            long jB = this.f8889c.b() - ((Long) this.f8887a.get(vw2Var)).longValue();
            zp1 zp1Var = this.f8888b;
            String strValueOf = String.valueOf(str);
            zp1Var.a().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jB))));
        }
        if (this.f8890d.containsKey(vw2Var)) {
            a(vw2Var, false);
        }
    }
}

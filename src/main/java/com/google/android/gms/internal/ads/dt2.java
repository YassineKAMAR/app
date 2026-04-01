package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr2 f7006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final as2 f7007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q12 f7008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jz2 f7009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qy2 f7010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gv0 f7011f;

    public dt2(q12 q12Var, jz2 jz2Var, wr2 wr2Var, as2 as2Var, gv0 gv0Var, qy2 qy2Var) {
        this.f7006a = wr2Var;
        this.f7007b = as2Var;
        this.f7008c = q12Var;
        this.f7009d = jz2Var;
        this.f7011f = gv0Var;
        this.f7010e = qy2Var;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), 2);
        }
    }

    public final void b(String str, int i8) {
        if (!this.f7006a.f16886k0) {
            this.f7009d.c(str, this.f7010e);
        } else {
            this.f7008c.h(new s12(g2.t.b().a(), this.f7007b.f5462b, str, i8));
        }
    }

    public final void c(List list, int i8) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zf3.r(((Boolean) h2.y.c().b(ns.u9)).booleanValue() ? this.f7011f.c(str, h2.v.e()) : zf3.h(str), new ct2(this, i8), eh0.f7322a);
        }
    }
}

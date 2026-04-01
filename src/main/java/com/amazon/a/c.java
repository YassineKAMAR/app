package com.amazon.a;

import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.amazon.a.a.n.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f4016b = new com.amazon.a.a.o.c("CheckIfAppisBlockedTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f4017c;

    @Override // com.amazon.a.a.n.a.a
    protected void a(h hVar) {
        if (m()) {
            n();
        }
        f4016b.c("app is blocked, killing");
        this.f4017c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e())));
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
        if (jVar.b() == null || !jVar.b().containsKey("verbose")) {
            return;
        }
        boolean zBooleanValue = ((Boolean) jVar.b().get("verbose")).booleanValue();
        com.amazon.a.a.o.c.f3948b = zBooleanValue;
        com.amazon.a.a.o.c.f3947a = zBooleanValue;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return "check_blocked_status";
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        return null;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return true;
    }
}

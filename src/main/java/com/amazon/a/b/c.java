package com.amazon.a.b;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.amazon.a.a.n.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3982a = new com.amazon.a.a.o.c("LicenseKillTask");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f3983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f3984c;

    private boolean b() {
        return this.f3983b.b(com.amazon.a.a.m.c.f3745b);
    }

    private com.amazon.a.a.i.c c() {
        com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.f3983b.a(com.amazon.a.a.m.c.f3746c);
        if (cVar == null) {
            return e.f3990e;
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f3982a.a("Fetched failure content from store: " + cVar);
        }
        this.f3983b.c(com.amazon.a.a.m.c.f3746c);
        return cVar;
    }

    @Override // com.amazon.a.a.n.a
    public void a() {
        if (com.amazon.a.a.o.c.f3947a) {
            f3982a.a("License Kill Task Executing!!!");
        }
        if (b()) {
            f3982a.c("license verification succeeded");
            return;
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f3982a.a("License Kill Task determined app is not licensed, killing app");
        }
        if (m()) {
            n();
        }
        this.f3984c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(c()));
    }
}

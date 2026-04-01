package com.amazon.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.amazon.a.a.n.c.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.a.d f4019b;

    public f() {
        a(new c());
        a(new com.amazon.a.a.b.b.a());
        a((com.amazon.a.a.n.a) new com.amazon.a.b.d());
    }

    @Override // com.amazon.a.a.n.c.b
    protected void b() {
        if (m()) {
            return;
        }
        this.f4019b.b();
    }

    @Override // com.amazon.a.a.n.c.b
    protected String b_() {
        return "DrmFullApplicationLaunchTaskWorkflow";
    }
}

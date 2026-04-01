package com.amazon.a.a.h;

/* JADX INFO: loaded from: classes.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3635a = new com.amazon.a.a.o.c("MetricsManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f3636b = new b();

    @Override // com.amazon.a.a.h.c
    public synchronized b a() {
        if (this.f3636b.a()) {
            return this.f3636b;
        }
        b bVar = this.f3636b;
        this.f3636b = new b();
        return bVar;
    }

    @Override // com.amazon.a.a.h.c
    public synchronized void a(a aVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3635a.a("Recording Metric: " + aVar);
        }
        this.f3636b.a(aVar);
    }
}

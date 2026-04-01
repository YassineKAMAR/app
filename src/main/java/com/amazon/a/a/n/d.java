package com.amazon.a.a.n;

import com.amazon.a.a.c.f;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class d implements com.amazon.a.a.k.d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3877a = new com.amazon.a.a.o.c("TaskManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f3878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f3879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f3880d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<com.amazon.a.a.n.b.d, com.amazon.a.a.n.b.c> f3881e;

    private interface a {
        void a(com.amazon.a.a.n.a aVar, com.amazon.a.a.n.b.c cVar);
    }

    public d() {
        HashMap map = new HashMap();
        this.f3881e = map;
        com.amazon.a.a.n.b.d dVar = com.amazon.a.a.n.b.d.COMMAND;
        com.amazon.a.a.n.b.b bVarA = com.amazon.a.a.n.b.b.a(dVar.name());
        com.amazon.a.a.n.b.d dVar2 = com.amazon.a.a.n.b.d.BACKGROUND;
        com.amazon.a.a.n.b.b bVarA2 = com.amazon.a.a.n.b.b.a(dVar2.name());
        com.amazon.a.a.n.b.a aVar = new com.amazon.a.a.n.b.a(bVarA2);
        map.put(dVar, bVarA);
        map.put(dVar2, bVarA2);
        map.put(com.amazon.a.a.n.b.d.FOREGROUND, aVar);
    }

    private com.amazon.a.a.n.b.c a(com.amazon.a.a.n.b.d dVar) {
        com.amazon.a.a.n.b.c cVar = this.f3881e.get(dVar);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("No pipeline registered with id: " + dVar);
    }

    private void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, a aVar2) {
        if (b()) {
            if (com.amazon.a.a.o.c.f3948b) {
                f3877a.b("Task enqueued after TaskManager has been finished! Task: " + aVar);
                return;
            }
            return;
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f3877a.a("Populating Task: " + aVar);
        }
        this.f3878b.b(aVar);
        aVar2.a(aVar, a(dVar));
    }

    private boolean b() {
        return this.f3880d.get();
    }

    private void c() {
        this.f3879c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.n.d.5
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                d.this.a();
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }

    public void a() {
        if (this.f3880d.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3877a.a("TaskManager finishing....");
            }
            Iterator<com.amazon.a.a.n.b.c> it = this.f3881e.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // com.amazon.a.a.n.b
    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3877a.a("Enqueue task on pipeline id: " + dVar);
        }
        a(dVar, aVar, new a() { // from class: com.amazon.a.a.n.d.1
            @Override // com.amazon.a.a.n.d.a
            public void a(com.amazon.a.a.n.a aVar2, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar2);
            }
        });
    }

    @Override // com.amazon.a.a.n.b
    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, final long j8) {
        a(dVar, aVar, new a() { // from class: com.amazon.a.a.n.d.4
            @Override // com.amazon.a.a.n.d.a
            public void a(com.amazon.a.a.n.a aVar2, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar2, j8);
            }
        });
    }

    @Override // com.amazon.a.a.n.b
    public void a(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar, final Date date) {
        a(dVar, aVar, new a() { // from class: com.amazon.a.a.n.d.3
            @Override // com.amazon.a.a.n.d.a
            public void a(com.amazon.a.a.n.a aVar2, com.amazon.a.a.n.b.c cVar) {
                cVar.a(aVar2, date);
            }
        });
    }

    @Override // com.amazon.a.a.n.b
    public void b(com.amazon.a.a.n.b.d dVar, com.amazon.a.a.n.a aVar) {
        a(dVar, aVar, new a() { // from class: com.amazon.a.a.n.d.2
            @Override // com.amazon.a.a.n.d.a
            public void a(com.amazon.a.a.n.a aVar2, com.amazon.a.a.n.b.c cVar) {
                cVar.b(aVar2);
            }
        });
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        Iterator<com.amazon.a.a.n.b.c> it = this.f3881e.values().iterator();
        while (it.hasNext()) {
            this.f3878b.b(it.next());
        }
        c();
    }
}

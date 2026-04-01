package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class f implements e, com.amazon.a.a.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f3669a = new com.amazon.a.a.o.c("PromptManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f3670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f3671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f3672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f3673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f3674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<b> f3675g = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f3676h = new AtomicBoolean(false);

    private b a() {
        if (this.f3675g.isEmpty()) {
            return null;
        }
        return this.f3675g.iterator().next();
    }

    private void a(Activity activity) {
        b bVarA = a();
        if (bVarA == null) {
            return;
        }
        a(bVarA, activity);
    }

    private void a(b bVar, Activity activity) {
        this.f3674f = bVar;
        bVar.a(activity);
    }

    private void b() {
        this.f3671c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.i.f.3
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                f.this.b(aVar.b());
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        b bVar = this.f3674f;
        if (bVar != null) {
            a(bVar, activity);
        } else {
            a(activity);
        }
    }

    private void c() {
        this.f3671c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.i.f.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                f.this.d();
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.FIRST;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(b bVar) {
        if (this.f3676h.get()) {
            if (com.amazon.a.a.o.c.f3948b) {
                f3669a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
            }
            bVar.c();
            return;
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f3669a.a("Presening Prompt: " + bVar);
        }
        bVar.a(this);
        this.f3675g.add(bVar);
        if (this.f3674f != null) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3669a.a("Dialog currently showing, not presenting given dialog");
            }
        } else {
            Activity activityB = this.f3670b.b();
            if (activityB != null) {
                a(activityB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f3676h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3669a.a("PromptManager finishing....");
            }
            Iterator<b> it = this.f3675g.iterator();
            while (it.hasNext()) {
                b next = it.next();
                it.remove();
                next.c();
            }
            b bVar = this.f3674f;
            if (bVar != null) {
                bVar.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b bVar) {
        this.f3675g.remove(bVar);
        if (this.f3674f == bVar) {
            this.f3674f = null;
            Activity activityB = this.f3670b.b();
            if (activityB != null) {
                a(activityB);
            }
        }
    }

    @Override // com.amazon.a.a.i.e
    public Dialog a(Activity activity, int i8) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3669a.a("onCreateDialog, id: " + i8 + ", activity: " + activity);
        }
        b bVar = this.f3674f;
        if (bVar == null) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3669a.a("Showing dialog is null, returning");
            }
            return null;
        }
        if (bVar.j() == i8) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3669a.a("Creating dialog prompt: " + this.f3674f);
            }
            return this.f3674f.c(activity);
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f3669a.a("Showing dialog id does not match given id: " + i8 + ", returning");
        }
        return null;
    }

    @Override // com.amazon.a.a.i.e
    public void a(Activity activity, boolean z7) {
        b bVar = this.f3674f;
        if (bVar != null) {
            bVar.a(activity, z7);
        }
    }

    @Override // com.amazon.a.a.i.e
    public void a(final b bVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3669a.a("Scheduling presentation: " + bVar);
        }
        this.f3673e.b(bVar);
        if (!this.f3676h.get()) {
            this.f3672d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.f.1
                @Override // com.amazon.a.a.n.a
                public void a() {
                    f.this.c(bVar);
                }

                public String toString() {
                    return "Prompt Presentation on Main Thread: " + bVar + ", " + bVar.a();
                }
            });
            return;
        }
        if (com.amazon.a.a.o.c.f3948b) {
            f3669a.b("Prompt: " + bVar + " presented after app destruction expiring it now!");
        }
        bVar.c();
    }

    @Override // com.amazon.a.a.e.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final b bVar) {
        this.f3672d.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.i.f.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                f.this.d(bVar);
            }

            public String toString() {
                return "PromptManager:removeExpiredPrompt: " + bVar;
            }
        });
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        b();
        c();
    }
}

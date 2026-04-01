package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.d.a.c;
import com.amazon.d.a.j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.amazon.a.a.n.c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3753b = new com.amazon.a.a.o.c("AbstractCommandTask");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.l.b f3754a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f3755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private d f3756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f3757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f3758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private b f3759g;

    private void a(c cVar) throws RemoteException, com.amazon.a.a.n.a.a.a, com.amazon.a.a.n.a.a.f {
        if (com.amazon.a.a.o.c.f3947a) {
            f3753b.a("Received result from CommandService: " + cVar);
        }
        if (cVar == null) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3753b.a("Received null result from command service, exiting task");
            }
        } else {
            if (cVar.e() != null) {
                a(cVar.e());
                return;
            }
            this.f3759g.a(cVar.a(), this.f3756d.a());
            if (cVar.b() != null) {
                b(cVar.b());
            } else if (cVar.c() != null) {
                b(cVar.c());
            } else if (f()) {
                a(cVar.d());
            }
        }
    }

    private void a(com.amazon.d.a.f fVar) throws RemoteException, com.amazon.a.a.n.a.a.a, com.amazon.a.a.n.a.a.f {
        if (com.amazon.a.a.o.c.f3947a) {
            f3753b.a("Handling Decision");
        }
        try {
            f fVar2 = new f(fVar);
            this.f3757e.a((com.amazon.a.a.i.b) fVar2);
            com.amazon.d.a.a aVarI = fVar2.i();
            if (aVarI != null) {
                a(fVar, aVarI);
                return;
            }
            if (com.amazon.a.a.o.c.f3947a) {
                f3753b.a("DecisionChooser returned null!!, expiring");
            }
            a(fVar, e.EXPIRATION_DURATION_ELAPSED);
        } catch (com.amazon.a.a.n.a.a.e e8) {
            a(fVar, e8.a());
        }
    }

    private void a(com.amazon.d.a.f fVar, e eVar) throws RemoteException, com.amazon.a.a.n.a.a.a, com.amazon.a.a.n.a.a.f {
        if (com.amazon.a.a.o.c.f3947a) {
            f3753b.a("Expiring Decision: " + fVar + ", reason: " + eVar);
        }
        a(this.f3756d.a(fVar, eVar));
    }

    private void a(com.amazon.d.a.f fVar, com.amazon.d.a.a aVar) throws RemoteException, com.amazon.a.a.n.a.a.a, com.amazon.a.a.n.a.a.f {
        com.amazon.a.a.o.c cVar;
        String str;
        e eVar;
        if (com.amazon.a.a.o.c.f3947a) {
            f3753b.a("Handling customer choice: " + aVar);
        }
        Intent intentB = aVar.b();
        if (intentB != null) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3753b.a("Choice has intent, scheduling it to be fired!!");
            }
            com.amazon.a.a.l.a aVarA = this.f3754a.a(intentB);
            if (aVarA == null) {
                if (com.amazon.a.a.o.c.f3947a) {
                    f3753b.a("No result recived, expiring decision");
                }
                eVar = e.EXPIRATION_DURATION_ELAPSED;
            } else if (aVarA.d() == 0) {
                if (com.amazon.a.a.o.c.f3947a) {
                    f3753b.a("Result canceled, expiring decision");
                }
                eVar = e.ACTION_CANCELED;
            } else if (com.amazon.a.a.o.c.f3947a) {
                cVar = f3753b;
                str = "Result received!!!, notifying service";
                cVar.a(str);
            }
            a(fVar, eVar);
            return;
        }
        if (com.amazon.a.a.o.c.f3947a) {
            cVar = f3753b;
            str = "No intent given, choosing now";
            cVar.a(str);
        }
        a(this.f3756d.a(aVar));
    }

    private void a(com.amazon.d.a.g gVar) throws com.amazon.a.a.n.a.a.f {
        throw new com.amazon.a.a.n.a.a.f(gVar);
    }

    private void a(Throwable th) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3753b.a("Exception occurred while processing task: " + th, th);
        }
        com.amazon.a.a.d.b bVarB = b(th);
        b(bVarB);
        this.f3758f.a(a(bVarB));
    }

    private com.amazon.a.a.d.b b(Throwable th) {
        return th instanceof com.amazon.a.a.d.b ? (com.amazon.a.a.d.b) th : th instanceof RemoteException ? new com.amazon.a.a.n.a.a.d((RemoteException) th) : new com.amazon.a.a.n.a.a.h(th);
    }

    private void b(com.amazon.d.a.h hVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3753b.a("Command failed execution: " + hVar.b());
        }
        a(hVar);
    }

    private void b(j jVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3753b.a("Command executed successfully");
        }
        a(jVar);
    }

    private com.amazon.d.a.c i() {
        return new c.a() { // from class: com.amazon.a.a.n.a.a.1
            @Override // com.amazon.d.a.c
            public String a() {
                return a.this.c();
            }

            @Override // com.amazon.d.a.c
            public String b() {
                return a.this.a_();
            }

            @Override // com.amazon.d.a.c
            public Map c() {
                return a.this.b();
            }

            @Override // com.amazon.d.a.c
            public String d() {
                return a.this.f3755c.getPackageName();
            }
        };
    }

    private void j() {
        if (m()) {
            return;
        }
        this.f3756d.b();
    }

    protected com.amazon.a.a.h.a a(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.h.a aVar = new com.amazon.a.a.h.a(g());
        aVar.a("subType", bVar.a()).a("reason", bVar.b()).a("context", bVar.c());
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // com.amazon.a.a.n.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r5 = this;
            java.lang.String r0 = "----------------------------------------------"
            java.lang.String r1 = "Task finished"
            boolean r2 = com.amazon.a.a.o.c.f3947a     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L28
            com.amazon.a.a.o.c r2 = com.amazon.a.a.n.a.a.f3753b     // Catch: java.lang.Throwable -> L79
            r2.a(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "Executing: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r5.a_()     // Catch: java.lang.Throwable -> L79
            r3.append(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L79
            r2.a(r3)     // Catch: java.lang.Throwable -> L79
            r2.a(r0)     // Catch: java.lang.Throwable -> L79
        L28:
            r5.e()     // Catch: java.lang.Throwable -> L79
            boolean r0 = r5.d()     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L49
            boolean r0 = com.amazon.a.a.o.c.f3947a     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L3c
            com.amazon.a.a.o.c r0 = com.amazon.a.a.n.a.a.f3753b     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = "Execution not needed, quitting"
            r0.a(r2)     // Catch: java.lang.Throwable -> L79
        L3c:
            boolean r0 = com.amazon.a.a.o.c.f3947a
            if (r0 == 0) goto L45
            com.amazon.a.a.o.c r0 = com.amazon.a.a.n.a.a.f3753b
            r0.a(r1)
        L45:
            r5.j()
            return
        L49:
            boolean r0 = com.amazon.a.a.o.c.f3947a     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L67
            com.amazon.a.a.o.c r0 = com.amazon.a.a.n.a.a.f3753b     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "Executing Command: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r5.a_()     // Catch: java.lang.Throwable -> L79
            r2.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L79
            r0.a(r2)     // Catch: java.lang.Throwable -> L79
        L67:
            com.amazon.a.a.n.a.d r0 = r5.f3756d     // Catch: java.lang.Throwable -> L79
            com.amazon.d.a.c r2 = r5.i()     // Catch: java.lang.Throwable -> L79
            com.amazon.a.a.n.a.c r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L79
            r5.a(r0)     // Catch: java.lang.Throwable -> L79
            boolean r0 = com.amazon.a.a.o.c.f3947a
            if (r0 == 0) goto L86
            goto L81
        L79:
            r0 = move-exception
            r5.a(r0)     // Catch: java.lang.Throwable -> L8a
            boolean r0 = com.amazon.a.a.o.c.f3947a
            if (r0 == 0) goto L86
        L81:
            com.amazon.a.a.o.c r0 = com.amazon.a.a.n.a.a.f3753b
            r0.a(r1)
        L86:
            r5.j()
            return
        L8a:
            r0 = move-exception
            boolean r2 = com.amazon.a.a.o.c.f3947a
            if (r2 == 0) goto L94
            com.amazon.a.a.o.c r2 = com.amazon.a.a.n.a.a.f3753b
            r2.a(r1)
        L94:
            r5.j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.a.a.n.a.a.a():void");
    }

    protected abstract void a(com.amazon.d.a.h hVar);

    protected abstract void a(j jVar);

    protected abstract String a_();

    protected abstract Map<String, Object> b();

    protected void b(com.amazon.a.a.d.b bVar) {
        f3753b.b("On Exception!!!!: " + bVar);
    }

    protected abstract String c();

    protected abstract boolean d();

    protected void e() {
    }

    protected boolean f() {
        return true;
    }

    protected String g() {
        return a_() + "_failure";
    }

    protected String h() {
        return a_() + "_success";
    }
}

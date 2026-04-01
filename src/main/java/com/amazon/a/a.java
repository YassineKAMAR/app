package com.amazon.a;

import android.app.Application;
import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.amazon.a.a.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f3496a = "ActivityName";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f3497b = "EventName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f3498c = "Timestamp";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3499d = new com.amazon.a.a.o.c("AppstoreSDK");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.amazon.a.a.g.c f3500e = new com.amazon.a.a.g.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f3501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f3502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.l.b f3503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f3504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f3505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f3506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f3507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f3508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f3509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.g.c f3510o;

    private a(Application application) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.amazon.a.a.o.c.f3947a) {
            f3499d.a("Starting initialization process for application: " + application.getPackageName());
        }
        b(application);
        if (com.amazon.a.a.o.c.f3947a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f3499d.a("AppstoreSDK.Constructor Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static com.amazon.a.a.i.e a() {
        if (d()) {
            return f3501f.f3506k;
        }
        f3499d.b("Appstore SDK is not initialized. Cannot get PromptManager returning null");
        return null;
    }

    private static String a(String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{com.amazon.a.a.o.b.ap, str}).getInputStream()));
                try {
                    String line = bufferedReader2.readLine();
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused) {
                        f3499d.b("Unable to close BufferedReader instance");
                    }
                    return line;
                } catch (IOException e8) {
                    e = e8;
                    bufferedReader = bufferedReader2;
                    f3499d.a("Can't get system property", e);
                    if (bufferedReader == null) {
                        return "";
                    }
                    try {
                        bufferedReader.close();
                        return "";
                    } catch (Exception unused2) {
                        f3499d.b("Unable to close BufferedReader instance");
                        return "";
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                            f3499d.b("Unable to close BufferedReader instance");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    public static void a(Context context) {
        if (d()) {
            return;
        }
        synchronized (a.class) {
            if (!d()) {
                Application application = (Application) context.getApplicationContext();
                f3501f = new a(application);
                application.registerActivityLifecycleCallbacks(com.amazon.a.a.f.a.a());
            }
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3499d.a("WARNING: Use of deprecated method detected.");
        }
        if (d()) {
            c(aVar);
        } else {
            f3499d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!d()) {
            if (context == null || context.getApplicationContext() == null) {
                f3499d.b("AppstoreSDK subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
            f3501f = new a((Application) context.getApplicationContext());
        }
        c(aVar);
    }

    public static boolean a(Application application) throws Throwable {
        boolean z7 = (application.getApplicationInfo().flags & 2) != 0;
        boolean zL = l();
        if (z7 && zL) {
            f3499d.a("Sandbox Mode: Debug build and debug.amazon.sandboxmode property is set on device");
            return true;
        }
        f3499d.a("Production Mode: Release build or debug.amazon.sandboxmode property is not set on device");
        return false;
    }

    public static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f3947a) {
            f3499d.a(str + ": " + context);
        }
        if (d()) {
            return true;
        }
        b(str, context);
        return false;
    }

    public static boolean a(String str, String str2) {
        if (!d()) {
            f3499d.a("AppstoreSDK was not yet initialized - cannot do the IAP call");
            return false;
        }
        try {
            return com.amazon.a.a.o.b.e.a(str, str2, f3501f.f3509n.a());
        } catch (com.amazon.a.a.o.b.a.a e8) {
            f3499d.a("Unable to validate signature: " + e8.getMessage());
            return false;
        }
    }

    public static com.amazon.a.a.a.a b() {
        if (d()) {
            return f3501f.f3502g;
        }
        f3499d.b("Appstore SDK is not initialized. Cannot get ContextManager returning null");
        return null;
    }

    private void b(Application application) {
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.c());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.d());
        cVar.a(new com.amazon.a.a.n.a.b());
        cVar.a(a(application) ? new com.amazon.a.a.g.d() : new com.amazon.a.a.g.b());
        cVar.a();
        cVar.b(this);
    }

    private static void b(String str, Context context) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3499d.a(str + " called on context: " + context + " when AppstoreSDK is dead, ignoring...");
        }
    }

    public static com.amazon.a.a.g.c c() {
        if (d()) {
            return f3501f.f3510o;
        }
        f3499d.a("Appstore SDK is not initialized. Returning default log handler");
        return f3500e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.amazon.a.a.n.a.a aVar) {
        if (d()) {
            f3501f.f3505j.a(com.amazon.a.a.n.b.d.COMMAND, aVar);
        } else {
            f3499d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static boolean d() {
        return f3501f != null;
    }

    private static boolean l() throws Throwable {
        String strA;
        try {
            strA = (String) Class.forName(com.amazon.a.a.o.b.aq).getMethod(com.amazon.a.a.o.b.ar, String.class).invoke(null, com.amazon.a.a.o.b.an);
        } catch (Throwable unused) {
            f3499d.b("Unable to retrieve Sandbox property through reflection, using getProp");
            strA = a(com.amazon.a.a.o.b.an);
        }
        return com.amazon.a.a.o.b.ao.equals(strA);
    }

    private com.amazon.a.a.n.a m() {
        return new e();
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        h();
        j();
        f();
        g();
    }

    public void f() {
        this.f3504i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.PAUSE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap map = new HashMap();
                map.put(a.f3497b, com.amazon.a.a.a.a.b.PAUSE.name());
                map.put(a.f3496a, aVar.b().getClass().getName());
                map.put(a.f3498c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(map);
                if (com.amazon.a.a.o.c.f3947a) {
                    a.f3499d.a("Adding lifecycle PAUSE command to pipeline");
                }
                a.c(bVar);
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }

    public void g() {
        this.f3504i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.2
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap map = new HashMap();
                map.put(a.f3497b, com.amazon.a.a.a.a.b.RESUME.name());
                map.put(a.f3496a, aVar.b().getClass().getName());
                map.put(a.f3498c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(map);
                if (com.amazon.a.a.o.c.f3947a) {
                    a.f3499d.a("Adding lifecycle RESUME command to pipeline");
                }
                a.c(bVar);
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }

    public void h() {
        this.f3504i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.3
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.CREATE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                a.this.i();
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }
        });
    }

    public void i() {
        if (com.amazon.a.a.o.c.f3947a) {
            f3499d.a("Enqueuing launch workflow");
        }
        if (a(this.f3508m)) {
            return;
        }
        this.f3505j.a(com.amazon.a.a.n.b.d.COMMAND, m());
    }

    public void j() {
        this.f3504i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                if (com.amazon.a.a.o.c.f3947a) {
                    a.f3499d.a("Beginning shutdown process for application: " + a.this.f3508m.getPackageName());
                }
                a unused = a.f3501f = null;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }
        });
    }
}

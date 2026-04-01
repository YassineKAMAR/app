package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.k6;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class o6<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile v6 f18994h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w6 f18998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f19000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f19001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile T f19002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f18993g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReference<Collection<o6<?>>> f18995i = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static z6 f18996j = new z6(new d7() { // from class: com.google.android.gms.internal.measurement.p6
        @Override // com.google.android.gms.internal.measurement.d7
        public final boolean j() {
            return o6.n();
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f18997k = new AtomicInteger();

    private o6(w6 w6Var, String str, T t7, boolean z7) {
        this.f19001d = -1;
        String str2 = w6Var.f19290a;
        if (str2 == null && w6Var.f19291b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && w6Var.f19291b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f18998a = w6Var;
        this.f18999b = str;
        this.f19000c = t7;
        this.f19003f = z7;
    }

    static /* synthetic */ o6 a(w6 w6Var, String str, Boolean bool, boolean z7) {
        return new r6(w6Var, str, bool, true);
    }

    static /* synthetic */ o6 b(w6 w6Var, String str, Double d8, boolean z7) {
        return new u6(w6Var, str, d8, true);
    }

    static /* synthetic */ o6 c(w6 w6Var, String str, Long l8, boolean z7) {
        return new s6(w6Var, str, l8, true);
    }

    static /* synthetic */ o6 d(w6 w6Var, String str, String str2, boolean z7) {
        return new t6(w6Var, str, str2, true);
    }

    private final T f(v6 v6Var) {
        u3.c<Context, Boolean> cVar;
        w6 w6Var = this.f18998a;
        if (!w6Var.f19294e && ((cVar = w6Var.f19298i) == null || cVar.apply(v6Var.a()).booleanValue())) {
            h6 h6VarB = h6.b(v6Var.a());
            w6 w6Var2 = this.f18998a;
            Object objA = h6VarB.a(w6Var2.f19294e ? null : h(w6Var2.f19292c));
            if (objA != null) {
                return g(objA);
            }
        }
        return null;
    }

    private final String h(String str) {
        if (str != null && str.isEmpty()) {
            return this.f18999b;
        }
        return str + this.f18999b;
    }

    private final T j(v6 v6Var) {
        Object objA;
        c6 c6VarB = this.f18998a.f19291b != null ? m6.b(v6Var.a(), this.f18998a.f19291b) ? this.f18998a.f19297h ? y5.b(v6Var.a().getContentResolver(), l6.a(l6.b(v6Var.a(), this.f18998a.f19291b.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.n6
            @Override // java.lang.Runnable
            public final void run() {
                o6.m();
            }
        }) : y5.b(v6Var.a().getContentResolver(), this.f18998a.f19291b, new Runnable() { // from class: com.google.android.gms.internal.measurement.n6
            @Override // java.lang.Runnable
            public final void run() {
                o6.m();
            }
        }) : null : x6.c(v6Var.a(), this.f18998a.f19290a, new Runnable() { // from class: com.google.android.gms.internal.measurement.n6
            @Override // java.lang.Runnable
            public final void run() {
                o6.m();
            }
        });
        if (c6VarB == null || (objA = c6VarB.a(k())) == null) {
            return null;
        }
        return g(objA);
    }

    public static void l(final Context context) {
        if (f18994h != null || context == null) {
            return;
        }
        Object obj = f18993g;
        synchronized (obj) {
            if (f18994h == null) {
                synchronized (obj) {
                    v6 v6Var = f18994h;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (v6Var == null || v6Var.a() != context) {
                        y5.e();
                        x6.d();
                        h6.c();
                        f18994h = new v5(context, u3.l.a(new u3.k() { // from class: com.google.android.gms.internal.measurement.q6
                            @Override // u3.k
                            public final Object get() {
                                return k6.a.a(context);
                            }
                        }));
                        f18997k.incrementAndGet();
                    }
                }
            }
        }
    }

    public static void m() {
        f18997k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[Catch: all -> 0x0090, TryCatch #0 {, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:18:0x0052, B:20:0x005d, B:33:0x007b, B:36:0x0083, B:37:0x0086, B:38:0x008a, B:23:0x0064, B:32:0x0079, B:26:0x006b, B:29:0x0072, B:39:0x008e), top: B:46:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T e() {
        /*
            r8 = this;
            boolean r0 = r8.f19003f
            if (r0 != 0) goto L11
            com.google.android.gms.internal.measurement.z6 r0 = com.google.android.gms.internal.measurement.o6.f18996j
            java.lang.String r1 = r8.f18999b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            u3.h.n(r0, r1)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.o6.f18997k
            int r0 = r0.get()
            int r1 = r8.f19001d
            if (r1 >= r0) goto L93
            monitor-enter(r8)
            int r1 = r8.f19001d     // Catch: java.lang.Throwable -> L90
            if (r1 >= r0) goto L8e
            com.google.android.gms.internal.measurement.v6 r1 = com.google.android.gms.internal.measurement.o6.f18994h     // Catch: java.lang.Throwable -> L90
            u3.g r2 = u3.g.a()     // Catch: java.lang.Throwable -> L90
            r3 = 0
            if (r1 == 0) goto L4d
            u3.k r2 = r1.b()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L90
            u3.g r2 = (u3.g) r2     // Catch: java.lang.Throwable -> L90
            boolean r4 = r2.c()     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L4d
            java.lang.Object r3 = r2.b()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.i6 r3 = (com.google.android.gms.internal.measurement.i6) r3     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.w6 r4 = r8.f18998a     // Catch: java.lang.Throwable -> L90
            android.net.Uri r5 = r4.f19291b     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r4.f19290a     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r4.f19293d     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = r8.f18999b     // Catch: java.lang.Throwable -> L90
            java.lang.String r3 = r3.a(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L90
        L4d:
            if (r1 == 0) goto L51
            r4 = 1
            goto L52
        L51:
            r4 = 0
        L52:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            u3.h.n(r4, r5)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.w6 r4 = r8.f18998a     // Catch: java.lang.Throwable -> L90
            boolean r4 = r4.f19295f     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r8.f(r1)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L64
            goto L7b
        L64:
            java.lang.Object r4 = r8.j(r1)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L79
            goto L7b
        L6b:
            java.lang.Object r4 = r8.j(r1)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L72
            goto L7b
        L72:
            java.lang.Object r4 = r8.f(r1)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L79
            goto L7b
        L79:
            T r4 = r8.f19000c     // Catch: java.lang.Throwable -> L90
        L7b:
            boolean r1 = r2.c()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8a
            if (r3 != 0) goto L86
            T r4 = r8.f19000c     // Catch: java.lang.Throwable -> L90
            goto L8a
        L86:
            java.lang.Object r4 = r8.g(r3)     // Catch: java.lang.Throwable -> L90
        L8a:
            r8.f19002e = r4     // Catch: java.lang.Throwable -> L90
            r8.f19001d = r0     // Catch: java.lang.Throwable -> L90
        L8e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L90
            throw r0
        L93:
            T r0 = r8.f19002e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o6.e():java.lang.Object");
    }

    abstract T g(Object obj);

    public final String k() {
        return h(this.f18998a.f19293d);
    }
}

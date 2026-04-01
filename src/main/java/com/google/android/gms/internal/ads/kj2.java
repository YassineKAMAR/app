package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import d2.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kj2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f10113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f10114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f10116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f10117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final of0 f10118g;

    kj2(of0 of0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i8, boolean z7, boolean z8) {
        this.f10118g = of0Var;
        this.f10112a = context;
        this.f10113b = scheduledExecutorService;
        this.f10114c = executor;
        this.f10115d = i8;
        this.f10116e = z7;
        this.f10117f = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.lj2 a(d2.a.C0100a r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.f53 r0 = new com.google.android.gms.internal.ads.f53
            r0.<init>()
            boolean r1 = r7.f10116e
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.O2
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.f10116e
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.P2
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.f10112a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.i53 r1 = com.google.android.gms.internal.ads.i53.k(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r8.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.a()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.f10112a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.V2     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.ls r4 = h2.y.c()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.f10117f     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.f53 r0 = r1.j(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            com.google.android.gms.internal.ads.zf0 r1 = g2.t.q()
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.u(r0, r2)
            com.google.android.gms.internal.ads.f53 r0 = new com.google.android.gms.internal.ads.f53
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.lj2 r1 = new com.google.android.gms.internal.ads.lj2
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kj2.a(d2.a$a):com.google.android.gms.internal.ads.lj2");
    }

    final /* synthetic */ lj2 b(Throwable th) {
        h2.v.b();
        ContentResolver contentResolver = this.f10112a.getContentResolver();
        return new lj2(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new f53());
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        if (!((Boolean) h2.y.c().b(ns.T0)).booleanValue()) {
            return zf3.g(new Exception("Did not ad Ad ID into query param."));
        }
        return zf3.e((qf3) zf3.o(zf3.m(qf3.C(this.f10118g.a(this.f10112a, this.f10115d)), new z73() { // from class: com.google.android.gms.internal.ads.ij2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return this.f9246a.a((a.C0100a) obj);
            }
        }, this.f10114c), ((Long) h2.y.c().b(ns.U0)).longValue(), TimeUnit.MILLISECONDS, this.f10113b), Throwable.class, new z73() { // from class: com.google.android.gms.internal.ads.jj2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return this.f9659a.b((Throwable) obj);
            }
        }, this.f10114c);
    }
}

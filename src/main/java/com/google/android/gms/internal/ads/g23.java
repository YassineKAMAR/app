package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g23 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile int f8164e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8165f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f8167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s3.h f8168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8169d;

    g23(Context context, Executor executor, s3.h hVar, boolean z7) {
        this.f8166a = context;
        this.f8167b = executor;
        this.f8168c = hVar;
        this.f8169d = z7;
    }

    public static g23 a(final Context context, Executor executor, boolean z7) {
        final s3.i iVar = new s3.i();
        executor.execute(z7 ? new Runnable() { // from class: com.google.android.gms.internal.ads.e23
            @Override // java.lang.Runnable
            public final void run() {
                iVar.c(k43.b(context, "GLAS", null));
            }
        } : new Runnable() { // from class: com.google.android.gms.internal.ads.f23
            @Override // java.lang.Runnable
            public final void run() {
                iVar.c(k43.c());
            }
        });
        return new g23(context, executor, iVar.a(), z7);
    }

    static void g(int i8) {
        f8164e = i8;
    }

    private final s3.h h(final int i8, long j8, Exception exc, String str, Map map, String str2) {
        if (!this.f8169d) {
            return this.f8168c.f(this.f8167b, new s3.a() { // from class: com.google.android.gms.internal.ads.c23
                @Override // s3.a
                public final Object a(s3.h hVar) {
                    return Boolean.valueOf(hVar.m());
                }
            });
        }
        Context context = this.f8166a;
        final nd ndVarM = sd.M();
        ndVarM.u(context.getPackageName());
        ndVarM.y(j8);
        ndVarM.A(f8164e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            ndVarM.z(stringWriter.toString());
            ndVarM.x(exc.getClass().getName());
        }
        if (str2 != null) {
            ndVarM.v(str2);
        }
        if (str != null) {
            ndVarM.w(str);
        }
        return this.f8168c.f(this.f8167b, new s3.a() { // from class: com.google.android.gms.internal.ads.d23
            @Override // s3.a
            public final Object a(s3.h hVar) {
                int i9 = g23.f8165f;
                if (!hVar.m()) {
                    return Boolean.FALSE;
                }
                int i10 = i8;
                j43 j43VarA = ((k43) hVar.j()).a(((sd) ndVarM.q()).g());
                j43VarA.a(i10);
                j43VarA.c();
                return Boolean.TRUE;
            }
        });
    }

    public final s3.h b(int i8, String str) {
        return h(i8, 0L, null, null, null, str);
    }

    public final s3.h c(int i8, long j8, Exception exc) {
        return h(i8, j8, exc, null, null, null);
    }

    public final s3.h d(int i8, long j8) {
        return h(i8, j8, null, null, null, null);
    }

    public final s3.h e(int i8, long j8, String str) {
        return h(i8, j8, null, null, null, str);
    }

    public final s3.h f(int i8, long j8, String str, Map map) {
        return h(i8, j8, null, str, null, null);
    }
}

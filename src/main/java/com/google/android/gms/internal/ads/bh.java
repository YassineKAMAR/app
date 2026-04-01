package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class bh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f5783c = new ConditionVariable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static volatile k43 f5784d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Random f5785e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii f5786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile Boolean f5787b;

    public bh(ii iiVar) {
        this.f5786a = iiVar;
        iiVar.k().execute(new ah(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    private static Random e() {
        if (f5785e == null) {
            synchronized (bh.class) {
                if (f5785e == null) {
                    f5785e = new Random();
                }
            }
        }
        return f5785e;
    }

    public final void c(int i8, int i9, long j8, String str, Exception exc) {
        try {
            f5783c.block();
            if (!this.f5787b.booleanValue() || f5784d == null) {
                return;
            }
            nd ndVarM = sd.M();
            ndVarM.u(this.f5786a.f9202a.getPackageName());
            ndVarM.y(j8);
            if (str != null) {
                ndVarM.v(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                ndVarM.z(stringWriter.toString());
                ndVarM.x(exc.getClass().getName());
            }
            j43 j43VarA = f5784d.a(((sd) ndVarM.q()).g());
            j43VarA.a(i8);
            if (i9 != -1) {
                j43VarA.b(i9);
            }
            j43VarA.c();
        } catch (Exception unused) {
        }
    }
}

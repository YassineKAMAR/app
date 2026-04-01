package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g43 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap f8198g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h43 f8200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g23 f8201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b23 f8202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v33 f8203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f8204f = new Object();

    public g43(Context context, h43 h43Var, g23 g23Var, b23 b23Var) {
        this.f8199a = context;
        this.f8200b = h43Var;
        this.f8201c = g23Var;
        this.f8202d = b23Var;
    }

    private final synchronized Class d(w33 w33Var) {
        String strV = w33Var.a().V();
        HashMap map = f8198g;
        Class cls = (Class) map.get(strV);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.f8202d.a(w33Var.c())) {
                throw new f43(2026, "VM did not pass signature verification");
            }
            try {
                File fileB = w33Var.b();
                if (!fileB.exists()) {
                    fileB.mkdirs();
                }
                Class<?> clsLoadClass = new DexClassLoader(w33Var.c().getAbsolutePath(), fileB.getAbsolutePath(), null, this.f8199a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strV, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e8) {
                throw new f43(2008, e8);
            }
        } catch (GeneralSecurityException e9) {
            throw new f43(2026, e9);
        }
    }

    public final j23 a() {
        v33 v33Var;
        synchronized (this.f8204f) {
            v33Var = this.f8203e;
        }
        return v33Var;
    }

    public final w33 b() {
        synchronized (this.f8204f) {
            v33 v33Var = this.f8203e;
            if (v33Var == null) {
                return null;
            }
            return v33Var.f();
        }
    }

    public final boolean c(w33 w33Var) {
        int iA;
        Exception exc;
        g23 g23Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                v33 v33Var = new v33(d(w33Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f8199a, "msa-r", w33Var.e(), null, new Bundle(), 2), w33Var, this.f8200b, this.f8201c);
                if (!v33Var.h()) {
                    throw new f43(4000, "init failed");
                }
                int iE = v33Var.e();
                if (iE != 0) {
                    throw new f43(4001, "ci: " + iE);
                }
                synchronized (this.f8204f) {
                    v33 v33Var2 = this.f8203e;
                    if (v33Var2 != null) {
                        try {
                            v33Var2.g();
                        } catch (f43 e8) {
                            this.f8201c.c(e8.a(), -1L, e8);
                        }
                        this.f8203e = v33Var;
                    } else {
                        this.f8203e = v33Var;
                    }
                }
                this.f8201c.d(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e9) {
                throw new f43(2004, e9);
            }
        } catch (f43 e10) {
            g23 g23Var2 = this.f8201c;
            iA = e10.a();
            g23Var = g23Var2;
            exc = e10;
            g23Var.c(iA, System.currentTimeMillis() - jCurrentTimeMillis, exc);
            return false;
        } catch (Exception e11) {
            iA = 4010;
            g23Var = this.f8201c;
            exc = e11;
            g23Var.c(iA, System.currentTimeMillis() - jCurrentTimeMillis, exc);
            return false;
        }
    }
}

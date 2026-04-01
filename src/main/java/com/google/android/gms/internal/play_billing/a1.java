package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a1 f19468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a1 f19469c = new a1(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19470a;

    a1() {
        this.f19470a = new HashMap();
    }

    a1(boolean z7) {
        this.f19470a = Collections.emptyMap();
    }

    public static a1 a() {
        a1 a1Var = f19468b;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (a1.class) {
            a1 a1Var2 = f19468b;
            if (a1Var2 != null) {
                return a1Var2;
            }
            a1 a1VarB = i1.b(a1.class);
            f19468b = a1VarB;
            return a1VarB;
        }
    }

    public final m1 b(r2 r2Var, int i8) {
        return (m1) this.f19470a.get(new z0(r2Var, i8));
    }
}

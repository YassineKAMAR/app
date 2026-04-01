package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class z2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z2 f19748c = new z2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f19750b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c3 f19749a = new i2();

    private z2() {
    }

    public static z2 a() {
        return f19748c;
    }

    public final b3 b(Class cls) {
        s1.c(cls, "messageType");
        b3 b3VarA = (b3) this.f19750b.get(cls);
        if (b3VarA == null) {
            b3VarA = this.f19749a.a(cls);
            s1.c(cls, "messageType");
            b3 b3Var = (b3) this.f19750b.putIfAbsent(cls, b3VarA);
            if (b3Var != null) {
                return b3Var;
            }
        }
        return b3VarA;
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class s24 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s24 f14491c = new s24();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f14493b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f34 f14492a = new c24();

    private s24() {
    }

    public static s24 a() {
        return f14491c;
    }

    public final e34 b(Class cls) {
        k14.c(cls, "messageType");
        e34 e34VarA = (e34) this.f14493b.get(cls);
        if (e34VarA == null) {
            e34VarA = this.f14492a.a(cls);
            k14.c(cls, "messageType");
            e34 e34Var = (e34) this.f14493b.putIfAbsent(cls, e34VarA);
            if (e34Var != null) {
                return e34Var;
            }
        }
        return e34VarA;
    }
}

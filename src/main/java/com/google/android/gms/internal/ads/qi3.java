package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class qi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f13519a = Logger.getLogger(qi3.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f13520b = new AtomicReference(new rh3());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f13521c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f13522d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap f13523e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap f13524f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f13525g = 0;

    private qi3() {
    }

    public static synchronized vv3 a(bw3 bw3Var) {
        oh3 oh3VarB;
        oh3VarB = ((rh3) f13520b.get()).b(bw3Var.R());
        if (!((Boolean) f13522d.get(bw3Var.R())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(bw3Var.R())));
        }
        return oh3VarB.b(bw3Var.Q());
    }

    public static Class b(Class cls) {
        try {
            return vo3.a().b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object c(vv3 vv3Var, Class cls) {
        return d(vv3Var.R(), vv3Var.Q(), cls);
    }

    public static Object d(String str, rz3 rz3Var, Class cls) {
        return ((rh3) f13520b.get()).a(str, cls).a(rz3Var);
    }

    static synchronized Map e() {
        return Collections.unmodifiableMap(f13524f);
    }

    public static synchronized void f(ko3 ko3Var, boolean z7) {
        AtomicReference atomicReference = f13520b;
        rh3 rh3Var = new rh3((rh3) atomicReference.get());
        rh3Var.c(ko3Var);
        Map mapC = ko3Var.a().c();
        String strD = ko3Var.d();
        h(strD, mapC, true);
        if (!((rh3) atomicReference.get()).d(strD)) {
            f13521c.put(strD, new pi3(ko3Var));
            for (Map.Entry entry : ko3Var.a().c().entrySet()) {
                f13524f.put((String) entry.getKey(), (fi3) entry.getValue());
            }
        }
        f13522d.put(strD, Boolean.TRUE);
        f13520b.set(rh3Var);
    }

    public static synchronized void g(oi3 oi3Var) {
        vo3.a().f(oi3Var);
    }

    private static synchronized void h(String str, Map map, boolean z7) {
        ConcurrentMap concurrentMap = f13522d;
        if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        if (((rh3) f13520b.get()).d(str)) {
            for (Map.Entry entry : map.entrySet()) {
                if (!f13524f.containsKey(entry.getKey())) {
                    throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                }
            }
        } else {
            for (Map.Entry entry2 : map.entrySet()) {
                if (f13524f.containsKey(entry2.getKey())) {
                    throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                }
            }
        }
    }
}

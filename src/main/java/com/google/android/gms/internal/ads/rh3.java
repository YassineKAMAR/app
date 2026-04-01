package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class rh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f14133b = Logger.getLogger(rh3.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f14134a;

    rh3() {
        this.f14134a = new ConcurrentHashMap();
    }

    rh3(rh3 rh3Var) {
        this.f14134a = new ConcurrentHashMap(rh3Var.f14134a);
    }

    private final synchronized qh3 e(String str) {
        if (!this.f14134a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (qh3) this.f14134a.get(str);
    }

    private final synchronized void f(qh3 qh3Var, boolean z7) {
        String strL = qh3Var.a().l();
        qh3 qh3Var2 = (qh3) this.f14134a.get(strL);
        if (qh3Var2 != null && !qh3Var2.f13490a.getClass().equals(qh3Var.f13490a.getClass())) {
            f14133b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strL));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strL, qh3Var2.f13490a.getClass().getName(), qh3Var.f13490a.getClass().getName()));
        }
        this.f14134a.putIfAbsent(strL, qh3Var);
    }

    final oh3 a(String str, Class cls) throws GeneralSecurityException {
        qh3 qh3VarE = e(str);
        if (qh3VarE.f13490a.j().contains(cls)) {
            try {
                return new ph3(qh3VarE.f13490a, cls);
            } catch (IllegalArgumentException e8) {
                throw new GeneralSecurityException("Primitive type not supported", e8);
            }
        }
        String name = cls.getName();
        ko3 ko3Var = qh3VarE.f13490a;
        String strValueOf = String.valueOf(ko3Var.getClass());
        Set<Class> setJ = ko3Var.j();
        StringBuilder sb = new StringBuilder();
        boolean z7 = true;
        for (Class cls2 : setJ) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z7 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    final oh3 b(String str) {
        return e(str).a();
    }

    final synchronized void c(ko3 ko3Var) {
        if (!un3.a(ko3Var.f())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(ko3Var.getClass()) + " as it is not FIPS compatible.");
        }
        f(new qh3(ko3Var), false);
    }

    final boolean d(String str) {
        return this.f14134a.containsKey(str);
    }
}

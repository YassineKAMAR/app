package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14785b;

    /* synthetic */ sp3(np3 np3Var, rp3 rp3Var) {
        this.f14784a = new HashMap(np3Var.f11975a);
        this.f14785b = new HashMap(np3Var.f11976b);
    }

    public final Class a(Class cls) throws GeneralSecurityException {
        if (this.f14785b.containsKey(cls)) {
            return ((oi3) this.f14785b.get(cls)).j();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object b(nh3 nh3Var, Class cls) throws GeneralSecurityException {
        pp3 pp3Var = new pp3(nh3Var.getClass(), cls, null);
        if (this.f14784a.containsKey(pp3Var)) {
            return ((kp3) this.f14784a.get(pp3Var)).a(nh3Var);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + pp3Var.toString() + " available");
    }

    public final Object c(ni3 ni3Var, Class cls) throws GeneralSecurityException {
        if (!this.f14785b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        oi3 oi3Var = (oi3) this.f14785b.get(cls);
        if (ni3Var.c().equals(oi3Var.j()) && oi3Var.j().equals(ni3Var.c())) {
            return oi3Var.a(ni3Var);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}

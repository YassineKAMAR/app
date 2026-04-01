package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class np3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11976b;

    /* synthetic */ np3(mp3 mp3Var) {
        this.f11975a = new HashMap();
        this.f11976b = new HashMap();
    }

    /* synthetic */ np3(sp3 sp3Var, mp3 mp3Var) {
        this.f11975a = new HashMap(sp3Var.f14784a);
        this.f11976b = new HashMap(sp3Var.f14785b);
    }

    public final np3 a(kp3 kp3Var) throws GeneralSecurityException {
        pp3 pp3Var = new pp3(kp3Var.c(), kp3Var.d(), null);
        if (this.f11975a.containsKey(pp3Var)) {
            kp3 kp3Var2 = (kp3) this.f11975a.get(pp3Var);
            if (!kp3Var2.equals(kp3Var) || !kp3Var.equals(kp3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(pp3Var.toString()));
            }
        } else {
            this.f11975a.put(pp3Var, kp3Var);
        }
        return this;
    }

    public final np3 b(oi3 oi3Var) throws GeneralSecurityException {
        Map map = this.f11976b;
        Class clsK = oi3Var.k();
        if (map.containsKey(clsK)) {
            oi3 oi3Var2 = (oi3) this.f11976b.get(clsK);
            if (!oi3Var2.equals(oi3Var) || !oi3Var.equals(oi3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsK.toString()));
            }
        } else {
            this.f11976b.put(clsK, oi3Var);
        }
        return this;
    }
}

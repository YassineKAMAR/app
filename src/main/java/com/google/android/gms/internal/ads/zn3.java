package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f18302b;

    /* synthetic */ zn3(Map map, Map map2, yn3 yn3Var) {
        this.f18301a = map;
        this.f18302b = map2;
    }

    public static xn3 a() {
        return new xn3(null);
    }

    public final Enum b(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) this.f18302b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r32) throws GeneralSecurityException {
        Object obj = this.f18301a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}

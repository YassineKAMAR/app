package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fq3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7989d;

    /* synthetic */ fq3(zp3 zp3Var, eq3 eq3Var) {
        this.f7986a = new HashMap(zp3Var.f18367a);
        this.f7987b = new HashMap(zp3Var.f18368b);
        this.f7988c = new HashMap(zp3Var.f18369c);
        this.f7989d = new HashMap(zp3Var.f18370d);
    }

    public final nh3 a(yp3 yp3Var, ri3 ri3Var) throws GeneralSecurityException {
        bq3 bq3Var = new bq3(yp3Var.getClass(), yp3Var.p(), null);
        if (this.f7987b.containsKey(bq3Var)) {
            return ((eo3) this.f7987b.get(bq3Var)).a(yp3Var, ri3Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + bq3Var.toString() + " available");
    }

    public final yp3 b(fi3 fi3Var, Class cls) throws GeneralSecurityException {
        dq3 dq3Var = new dq3(fi3Var.getClass(), cls, null);
        if (this.f7988c.containsKey(dq3Var)) {
            return ((gp3) this.f7988c.get(dq3Var)).a(fi3Var);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dq3Var.toString() + " available");
    }

    public final boolean g(yp3 yp3Var) {
        return this.f7987b.containsKey(new bq3(yp3Var.getClass(), yp3Var.p(), null));
    }
}

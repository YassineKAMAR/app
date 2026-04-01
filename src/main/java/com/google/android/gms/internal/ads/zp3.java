package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f18368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f18369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f18370d;

    public zp3() {
        this.f18367a = new HashMap();
        this.f18368b = new HashMap();
        this.f18369c = new HashMap();
        this.f18370d = new HashMap();
    }

    public zp3(fq3 fq3Var) {
        this.f18367a = new HashMap(fq3Var.f7986a);
        this.f18368b = new HashMap(fq3Var.f7987b);
        this.f18369c = new HashMap(fq3Var.f7988c);
        this.f18370d = new HashMap(fq3Var.f7989d);
    }

    public final zp3 a(eo3 eo3Var) throws GeneralSecurityException {
        bq3 bq3Var = new bq3(eo3Var.d(), eo3Var.c(), null);
        if (this.f18368b.containsKey(bq3Var)) {
            eo3 eo3Var2 = (eo3) this.f18368b.get(bq3Var);
            if (!eo3Var2.equals(eo3Var) || !eo3Var.equals(eo3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(bq3Var.toString()));
            }
        } else {
            this.f18368b.put(bq3Var, eo3Var);
        }
        return this;
    }

    public final zp3 b(io3 io3Var) throws GeneralSecurityException {
        dq3 dq3Var = new dq3(io3Var.b(), io3Var.c(), null);
        if (this.f18367a.containsKey(dq3Var)) {
            io3 io3Var2 = (io3) this.f18367a.get(dq3Var);
            if (!io3Var2.equals(io3Var) || !io3Var.equals(io3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dq3Var.toString()));
            }
        } else {
            this.f18367a.put(dq3Var, io3Var);
        }
        return this;
    }

    public final zp3 c(cp3 cp3Var) throws GeneralSecurityException {
        bq3 bq3Var = new bq3(cp3Var.c(), cp3Var.b(), null);
        if (this.f18370d.containsKey(bq3Var)) {
            cp3 cp3Var2 = (cp3) this.f18370d.get(bq3Var);
            if (!cp3Var2.equals(cp3Var) || !cp3Var.equals(cp3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(bq3Var.toString()));
            }
        } else {
            this.f18370d.put(bq3Var, cp3Var);
        }
        return this;
    }

    public final zp3 d(gp3 gp3Var) throws GeneralSecurityException {
        dq3 dq3Var = new dq3(gp3Var.c(), gp3Var.d(), null);
        if (this.f18369c.containsKey(dq3Var)) {
            gp3 gp3Var2 = (gp3) this.f18369c.get(dq3Var);
            if (!gp3Var2.equals(gp3Var) || !gp3Var.equals(gp3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dq3Var.toString()));
            }
        } else {
            this.f18369c.put(dq3Var, gp3Var);
        }
        return this;
    }
}

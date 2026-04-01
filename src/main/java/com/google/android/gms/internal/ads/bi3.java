package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jw3 f5808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f5809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ws3 f5810c;

    private bi3(jw3 jw3Var, List list) {
        this.f5808a = jw3Var;
        this.f5809b = list;
        this.f5810c = ws3.f16937b;
    }

    private bi3(jw3 jw3Var, List list, ws3 ws3Var) {
        this.f5808a = jw3Var;
        this.f5809b = list;
        this.f5810c = ws3Var;
    }

    static final bi3 a(jw3 jw3Var) throws GeneralSecurityException {
        i(jw3Var);
        return new bi3(jw3Var, h(jw3Var));
    }

    static final bi3 b(jw3 jw3Var, ws3 ws3Var) throws GeneralSecurityException {
        i(jw3Var);
        return new bi3(jw3Var, h(jw3Var), ws3Var);
    }

    public static final bi3 c(fi3 fi3Var) {
        yh3 yh3Var = new yh3();
        wh3 wh3Var = new wh3(fi3Var, null);
        wh3Var.e();
        wh3Var.d();
        yh3Var.a(wh3Var);
        return yh3Var.b();
    }

    private static tp3 f(iw3 iw3Var) {
        try {
            return tp3.a(iw3Var.N().R(), iw3Var.N().Q(), iw3Var.N().N(), iw3Var.Q(), iw3Var.Q() == dx3.RAW ? null : Integer.valueOf(iw3Var.M()));
        } catch (GeneralSecurityException e8) {
            throw new hq3("Creating a protokey serialization failed", e8);
        }
    }

    private static Object g(ao3 ao3Var, iw3 iw3Var, Class cls) throws GeneralSecurityException {
        try {
            return qi3.c(iw3Var.N(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e8) {
            if (e8.getMessage().contains("No key manager found for key type ") || e8.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e8;
        }
    }

    private static List h(jw3 jw3Var) {
        nh3 nh3VarA;
        int iV;
        sh3 sh3Var;
        ArrayList arrayList = new ArrayList(jw3Var.M());
        for (iw3 iw3Var : jw3Var.S()) {
            int iM = iw3Var.M();
            try {
                nh3VarA = yo3.b().a(f(iw3Var), ri3.a());
                iV = iw3Var.V() - 2;
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
            if (iV == 1) {
                sh3Var = sh3.f14673b;
            } else if (iV == 2) {
                sh3Var = sh3.f14674c;
            } else {
                if (iV != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                }
                sh3Var = sh3.f14675d;
            }
            arrayList.add(new ai3(nh3VarA, sh3Var, iM, iM == jw3Var.N(), null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void i(jw3 jw3Var) throws GeneralSecurityException {
        if (jw3Var == null || jw3Var.M() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object j(ao3 ao3Var, nh3 nh3Var, Class cls) {
        try {
            return vo3.a().c(nh3Var, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    final jw3 d() {
        return this.f5808a;
    }

    public final Object e(kh3 kh3Var, Class cls) throws GeneralSecurityException {
        Class clsB = qi3.b(cls);
        if (clsB == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        jw3 jw3Var = this.f5808a;
        Charset charset = si3.f14712a;
        int iN = jw3Var.N();
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = true;
        for (iw3 iw3Var : jw3Var.S()) {
            if (iw3Var.V() == 3) {
                if (!iw3Var.U()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(iw3Var.M())));
                }
                if (iw3Var.Q() == dx3.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(iw3Var.M())));
                }
                if (iw3Var.V() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(iw3Var.M())));
                }
                if (iw3Var.M() == iN) {
                    if (z7) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z7 = true;
                }
                z8 &= iw3Var.N().N() == uv3.ASYMMETRIC_PUBLIC;
                i8++;
            }
        }
        if (i8 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z7 && !z8) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        hi3 hi3Var = new hi3(clsB, null);
        hi3Var.c(this.f5810c);
        for (int i9 = 0; i9 < this.f5808a.M(); i9++) {
            iw3 iw3VarP = this.f5808a.P(i9);
            if (iw3VarP.V() == 3) {
                ao3 ao3Var = (ao3) kh3Var;
                Object objG = g(ao3Var, iw3VarP, clsB);
                Object objJ = this.f5809b.get(i9) != null ? j(ao3Var, ((ai3) this.f5809b.get(i9)).a(), clsB) : null;
                if (objJ == null && objG == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + clsB.toString() + " for key of type " + iw3VarP.N().R());
                }
                if (iw3VarP.M() == this.f5808a.N()) {
                    hi3Var.b(objJ, objG, iw3VarP);
                } else {
                    hi3Var.a(objJ, objG, iw3VarP);
                }
            }
        }
        return vo3.a().d(hi3Var.d(), cls);
    }

    public final String toString() {
        Charset charset = si3.f14712a;
        jw3 jw3Var = this.f5808a;
        lw3 lw3VarM = ow3.M();
        lw3VarM.v(jw3Var.N());
        for (iw3 iw3Var : jw3Var.S()) {
            mw3 mw3VarM = nw3.M();
            mw3VarM.w(iw3Var.N().R());
            mw3VarM.x(iw3Var.V());
            mw3VarM.v(iw3Var.Q());
            mw3VarM.u(iw3Var.M());
            lw3VarM.u((nw3) mw3VarM.q());
        }
        return ((ow3) lw3VarM.q()).toString();
    }
}

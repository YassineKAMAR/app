package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class rj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wy3 f14157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gp3 f14158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cp3 f14159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io3 f14160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final eo3 f14161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f14162f = 0;

    static {
        wy3 wy3VarA = iq3.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f14157a = wy3VarA;
        f14158b = gp3.b(new ep3() { // from class: com.google.android.gms.internal.ads.nj3
            @Override // com.google.android.gms.internal.ads.ep3
            public final yp3 a(fi3 fi3Var) throws GeneralSecurityException {
                hv3 hv3Var;
                dx3 dx3Var;
                mj3 mj3Var = (mj3) fi3Var;
                int i8 = rj3.f14162f;
                aw3 aw3VarM = bw3.M();
                aw3VarM.v("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                st3 st3VarM = tt3.M();
                zt3 zt3VarN = au3.N();
                cu3 cu3VarN = du3.N();
                cu3VarN.u(mj3Var.c());
                zt3VarN.v((du3) cu3VarN.q());
                zt3VarN.u(mj3Var.a());
                st3VarM.u((au3) zt3VarN.q());
                mv3 mv3VarN = nv3.N();
                pv3 pv3VarO = qv3.O();
                pv3VarO.v(mj3Var.d());
                ij3 ij3VarE = mj3Var.e();
                if (ij3.f9247b.equals(ij3VarE)) {
                    hv3Var = hv3.SHA1;
                } else if (ij3.f9248c.equals(ij3VarE)) {
                    hv3Var = hv3.SHA224;
                } else if (ij3.f9249d.equals(ij3VarE)) {
                    hv3Var = hv3.SHA256;
                } else if (ij3.f9250e.equals(ij3VarE)) {
                    hv3Var = hv3.SHA384;
                } else {
                    if (!ij3.f9251f.equals(ij3VarE)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(ij3VarE)));
                    }
                    hv3Var = hv3.SHA512;
                }
                pv3VarO.u(hv3Var);
                mv3VarN.v((qv3) pv3VarO.q());
                mv3VarN.u(mj3Var.b());
                st3VarM.v((nv3) mv3VarN.q());
                aw3VarM.w(((tt3) st3VarM.q()).c());
                jj3 jj3VarF = mj3Var.f();
                if (jj3.f9660b.equals(jj3VarF)) {
                    dx3Var = dx3.TINK;
                } else if (jj3.f9661c.equals(jj3VarF)) {
                    dx3Var = dx3.CRUNCHY;
                } else {
                    if (!jj3.f9662d.equals(jj3VarF)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(jj3VarF)));
                    }
                    dx3Var = dx3.RAW;
                }
                aw3VarM.u(dx3Var);
                return up3.a((bw3) aw3VarM.q());
            }
        }, mj3.class, up3.class);
        f14159c = cp3.a(new ap3() { // from class: com.google.android.gms.internal.ads.oj3
        }, wy3VarA, up3.class);
        f14160d = io3.a(new go3() { // from class: com.google.android.gms.internal.ads.pj3
        }, cj3.class, tp3.class);
        f14161e = eo3.b(new co3() { // from class: com.google.android.gms.internal.ads.qj3
            @Override // com.google.android.gms.internal.ads.co3
            public final nh3 a(yp3 yp3Var, ri3 ri3Var) throws GeneralSecurityException {
                ij3 ij3Var;
                jj3 jj3Var;
                int i8 = rj3.f14162f;
                if (!((tp3) yp3Var).f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    qt3 qt3VarP = qt3.P(((tp3) yp3Var).d(), m04.a());
                    if (qt3VarP.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (qt3VarP.Q().M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (qt3VarP.R().M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    hj3 hj3Var = new hj3(null);
                    hj3Var.a(qt3VarP.Q().S().n());
                    hj3Var.c(qt3VarP.R().S().n());
                    hj3Var.d(qt3VarP.Q().R().M());
                    hj3Var.e(qt3VarP.R().R().M());
                    hv3 hv3VarN = qt3VarP.R().R().N();
                    hv3 hv3Var = hv3.UNKNOWN_HASH;
                    dx3 dx3Var = dx3.UNKNOWN_PREFIX;
                    int iOrdinal = hv3VarN.ordinal();
                    if (iOrdinal == 1) {
                        ij3Var = ij3.f9247b;
                    } else if (iOrdinal == 2) {
                        ij3Var = ij3.f9250e;
                    } else if (iOrdinal == 3) {
                        ij3Var = ij3.f9249d;
                    } else if (iOrdinal == 4) {
                        ij3Var = ij3.f9251f;
                    } else {
                        if (iOrdinal != 5) {
                            throw new GeneralSecurityException("Unable to parse HashType: " + hv3VarN.j());
                        }
                        ij3Var = ij3.f9248c;
                    }
                    hj3Var.b(ij3Var);
                    dx3 dx3VarC = ((tp3) yp3Var).c();
                    int iOrdinal2 = dx3VarC.ordinal();
                    if (iOrdinal2 == 1) {
                        jj3Var = jj3.f9660b;
                    } else if (iOrdinal2 == 2) {
                        jj3Var = jj3.f9661c;
                    } else if (iOrdinal2 == 3) {
                        jj3Var = jj3.f9662d;
                    } else {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + dx3VarC.j());
                        }
                        jj3Var = jj3.f9661c;
                    }
                    hj3Var.f(jj3Var);
                    mj3 mj3VarG = hj3Var.g();
                    aj3 aj3Var = new aj3(null);
                    aj3Var.d(mj3VarG);
                    aj3Var.a(xy3.b(qt3VarP.Q().S().a(), ri3Var));
                    aj3Var.b(xy3.b(qt3VarP.R().S().a(), ri3Var));
                    aj3Var.c(((tp3) yp3Var).e());
                    return aj3Var.e();
                } catch (m14 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            }
        }, wy3VarA, tp3.class);
    }

    public static void a(yo3 yo3Var) {
        yo3Var.g(f14158b);
        yo3Var.f(f14159c);
        yo3Var.e(f14160d);
        yo3Var.d(f14161e);
    }
}

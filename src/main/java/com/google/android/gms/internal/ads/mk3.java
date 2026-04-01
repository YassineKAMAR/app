package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class mk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wy3 f11356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gp3 f11357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cp3 f11358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io3 f11359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final eo3 f11360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11361f = 0;

    static {
        wy3 wy3VarA = iq3.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f11356a = wy3VarA;
        f11357b = gp3.b(new ep3() { // from class: com.google.android.gms.internal.ads.hk3
            @Override // com.google.android.gms.internal.ads.ep3
            public final yp3 a(fi3 fi3Var) throws GeneralSecurityException {
                dx3 dx3Var;
                gk3 gk3Var = (gk3) fi3Var;
                int i8 = mk3.f11361f;
                aw3 aw3VarM = bw3.M();
                aw3VarM.v("type.googleapis.com/google.crypto.tink.AesEaxKey");
                iu3 iu3VarN = ju3.N();
                lu3 lu3VarN = mu3.N();
                lu3VarN.u(gk3Var.a());
                iu3VarN.v((mu3) lu3VarN.q());
                iu3VarN.u(gk3Var.b());
                aw3VarM.w(((ju3) iu3VarN.q()).c());
                ek3 ek3VarC = gk3Var.c();
                if (ek3.f7387b.equals(ek3VarC)) {
                    dx3Var = dx3.TINK;
                } else if (ek3.f7388c.equals(ek3VarC)) {
                    dx3Var = dx3.CRUNCHY;
                } else {
                    if (!ek3.f7389d.equals(ek3VarC)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ek3VarC)));
                    }
                    dx3Var = dx3.RAW;
                }
                aw3VarM.u(dx3Var);
                return up3.a((bw3) aw3VarM.q());
            }
        }, gk3.class, up3.class);
        f11358c = cp3.a(new ap3() { // from class: com.google.android.gms.internal.ads.ik3
        }, wy3VarA, up3.class);
        f11359d = io3.a(new go3() { // from class: com.google.android.gms.internal.ads.jk3
        }, yj3.class, tp3.class);
        f11360e = eo3.b(new co3() { // from class: com.google.android.gms.internal.ads.kk3
            @Override // com.google.android.gms.internal.ads.co3
            public final nh3 a(yp3 yp3Var, ri3 ri3Var) throws GeneralSecurityException {
                ek3 ek3Var;
                int i8 = mk3.f11361f;
                if (!((tp3) yp3Var).f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    gu3 gu3VarP = gu3.P(((tp3) yp3Var).d(), m04.a());
                    if (gu3VarP.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dk3 dk3Var = new dk3(null);
                    dk3Var.b(gu3VarP.R().n());
                    dk3Var.a(gu3VarP.Q().M());
                    dk3Var.c(16);
                    dx3 dx3VarC = ((tp3) yp3Var).c();
                    dx3 dx3Var = dx3.UNKNOWN_PREFIX;
                    int iOrdinal = dx3VarC.ordinal();
                    if (iOrdinal == 1) {
                        ek3Var = ek3.f7387b;
                    } else if (iOrdinal == 2) {
                        ek3Var = ek3.f7388c;
                    } else if (iOrdinal == 3) {
                        ek3Var = ek3.f7389d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + dx3VarC.j());
                        }
                        ek3Var = ek3.f7388c;
                    }
                    dk3Var.d(ek3Var);
                    gk3 gk3VarE = dk3Var.e();
                    wj3 wj3Var = new wj3(null);
                    wj3Var.c(gk3VarE);
                    wj3Var.b(xy3.b(gu3VarP.R().a(), ri3Var));
                    wj3Var.a(((tp3) yp3Var).e());
                    return wj3Var.d();
                } catch (m14 unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            }
        }, wy3VarA, tp3.class);
    }

    public static void a(yo3 yo3Var) {
        yo3Var.g(f11357b);
        yo3Var.f(f11358c);
        yo3Var.e(f11359d);
        yo3Var.d(f11360e);
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class dl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wy3 f6797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gp3 f6798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cp3 f6799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io3 f6800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final eo3 f6801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f6802f = 0;

    static {
        wy3 wy3VarA = iq3.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f6797a = wy3VarA;
        f6798b = gp3.b(new ep3() { // from class: com.google.android.gms.internal.ads.zk3
            @Override // com.google.android.gms.internal.ads.ep3
            public final yp3 a(fi3 fi3Var) throws GeneralSecurityException {
                dx3 dx3Var;
                yk3 yk3Var = (yk3) fi3Var;
                int i8 = dl3.f6802f;
                aw3 aw3VarM = bw3.M();
                aw3VarM.v("type.googleapis.com/google.crypto.tink.AesGcmKey");
                ru3 ru3VarN = su3.N();
                ru3VarN.u(yk3Var.a());
                aw3VarM.w(((su3) ru3VarN.q()).c());
                wk3 wk3VarB = yk3Var.b();
                if (wk3.f16781b.equals(wk3VarB)) {
                    dx3Var = dx3.TINK;
                } else if (wk3.f16782c.equals(wk3VarB)) {
                    dx3Var = dx3.CRUNCHY;
                } else {
                    if (!wk3.f16783d.equals(wk3VarB)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(wk3VarB)));
                    }
                    dx3Var = dx3.RAW;
                }
                aw3VarM.u(dx3Var);
                return up3.a((bw3) aw3VarM.q());
            }
        }, yk3.class, up3.class);
        f6799c = cp3.a(new ap3() { // from class: com.google.android.gms.internal.ads.al3
        }, wy3VarA, up3.class);
        f6800d = io3.a(new go3() { // from class: com.google.android.gms.internal.ads.bl3
        }, qk3.class, tp3.class);
        f6801e = eo3.b(new co3() { // from class: com.google.android.gms.internal.ads.cl3
            @Override // com.google.android.gms.internal.ads.co3
            public final nh3 a(yp3 yp3Var, ri3 ri3Var) throws GeneralSecurityException {
                wk3 wk3Var;
                int i8 = dl3.f6802f;
                if (!((tp3) yp3Var).f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    pu3 pu3VarP = pu3.P(((tp3) yp3Var).d(), m04.a());
                    if (pu3VarP.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    vk3 vk3Var = new vk3(null);
                    vk3Var.b(pu3VarP.Q().n());
                    vk3Var.a(12);
                    vk3Var.c(16);
                    dx3 dx3VarC = ((tp3) yp3Var).c();
                    dx3 dx3Var = dx3.UNKNOWN_PREFIX;
                    int iOrdinal = dx3VarC.ordinal();
                    if (iOrdinal == 1) {
                        wk3Var = wk3.f16781b;
                    } else if (iOrdinal == 2) {
                        wk3Var = wk3.f16782c;
                    } else if (iOrdinal == 3) {
                        wk3Var = wk3.f16783d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + dx3VarC.j());
                        }
                        wk3Var = wk3.f16782c;
                    }
                    vk3Var.d(wk3Var);
                    yk3 yk3VarE = vk3Var.e();
                    ok3 ok3Var = new ok3(null);
                    ok3Var.c(yk3VarE);
                    ok3Var.b(xy3.b(pu3VarP.Q().a(), ri3Var));
                    ok3Var.a(((tp3) yp3Var).e());
                    return ok3Var.d();
                } catch (m14 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
        }, wy3VarA, tp3.class);
    }

    public static void a(yo3 yo3Var) {
        yo3Var.g(f6798b);
        yo3Var.f(f6799c);
        yo3Var.e(f6800d);
        yo3Var.d(f6801e);
    }
}

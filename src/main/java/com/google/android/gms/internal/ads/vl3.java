package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class vl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wy3 f16344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gp3 f16345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cp3 f16346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io3 f16347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final eo3 f16348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f16349f = 0;

    static {
        wy3 wy3VarA = iq3.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f16344a = wy3VarA;
        f16345b = gp3.b(new ep3() { // from class: com.google.android.gms.internal.ads.rl3
            @Override // com.google.android.gms.internal.ads.ep3
            public final yp3 a(fi3 fi3Var) throws GeneralSecurityException {
                dx3 dx3Var;
                ql3 ql3Var = (ql3) fi3Var;
                int i8 = vl3.f16349f;
                aw3 aw3VarM = bw3.M();
                aw3VarM.v("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                yu3 yu3VarN = zu3.N();
                yu3VarN.u(ql3Var.a());
                aw3VarM.w(((zu3) yu3VarN.q()).c());
                ol3 ol3VarB = ql3Var.b();
                if (ol3.f12537b.equals(ol3VarB)) {
                    dx3Var = dx3.TINK;
                } else if (ol3.f12538c.equals(ol3VarB)) {
                    dx3Var = dx3.CRUNCHY;
                } else {
                    if (!ol3.f12539d.equals(ol3VarB)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ol3VarB)));
                    }
                    dx3Var = dx3.RAW;
                }
                aw3VarM.u(dx3Var);
                return up3.a((bw3) aw3VarM.q());
            }
        }, ql3.class, up3.class);
        f16346c = cp3.a(new ap3() { // from class: com.google.android.gms.internal.ads.sl3
        }, wy3VarA, up3.class);
        f16347d = io3.a(new go3() { // from class: com.google.android.gms.internal.ads.tl3
        }, hl3.class, tp3.class);
        f16348e = eo3.b(new co3() { // from class: com.google.android.gms.internal.ads.ul3
            @Override // com.google.android.gms.internal.ads.co3
            public final nh3 a(yp3 yp3Var, ri3 ri3Var) throws GeneralSecurityException {
                ol3 ol3Var;
                int i8 = vl3.f16349f;
                if (!((tp3) yp3Var).f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    wu3 wu3VarP = wu3.P(((tp3) yp3Var).d(), m04.a());
                    if (wu3VarP.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    nl3 nl3Var = new nl3(null);
                    nl3Var.a(wu3VarP.Q().n());
                    dx3 dx3VarC = ((tp3) yp3Var).c();
                    dx3 dx3Var = dx3.UNKNOWN_PREFIX;
                    int iOrdinal = dx3VarC.ordinal();
                    if (iOrdinal == 1) {
                        ol3Var = ol3.f12537b;
                    } else if (iOrdinal == 2) {
                        ol3Var = ol3.f12538c;
                    } else if (iOrdinal == 3) {
                        ol3Var = ol3.f12539d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + dx3VarC.j());
                        }
                        ol3Var = ol3.f12538c;
                    }
                    nl3Var.b(ol3Var);
                    ql3 ql3VarC = nl3Var.c();
                    fl3 fl3Var = new fl3(null);
                    fl3Var.c(ql3VarC);
                    fl3Var.b(xy3.b(wu3VarP.Q().a(), ri3Var));
                    fl3Var.a(((tp3) yp3Var).e());
                    return fl3Var.d();
                } catch (m14 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
        }, wy3VarA, tp3.class);
    }

    public static void a(yo3 yo3Var) {
        yo3Var.g(f16345b);
        yo3Var.f(f16346c);
        yo3Var.e(f16347d);
        yo3Var.d(f16348e);
    }
}

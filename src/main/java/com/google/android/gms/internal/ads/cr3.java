package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class cr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wy3 f6457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gp3 f6458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cp3 f6459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io3 f6460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final eo3 f6461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f6462f = 0;

    static {
        wy3 wy3VarA = iq3.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f6457a = wy3VarA;
        f6458b = gp3.b(new ep3() { // from class: com.google.android.gms.internal.ads.yq3
            @Override // com.google.android.gms.internal.ads.ep3
            public final yp3 a(fi3 fi3Var) throws GeneralSecurityException {
                dx3 dx3Var;
                xq3 xq3Var = (xq3) fi3Var;
                int i8 = cr3.f6462f;
                aw3 aw3VarM = bw3.M();
                aw3VarM.v("type.googleapis.com/google.crypto.tink.AesCmacKey");
                jt3 jt3VarN = kt3.N();
                mt3 mt3VarN = nt3.N();
                mt3VarN.u(xq3Var.a());
                jt3VarN.v((nt3) mt3VarN.q());
                jt3VarN.u(xq3Var.b());
                aw3VarM.w(((kt3) jt3VarN.q()).c());
                vq3 vq3VarD = xq3Var.d();
                if (vq3.f16419b.equals(vq3VarD)) {
                    dx3Var = dx3.TINK;
                } else if (vq3.f16420c.equals(vq3VarD)) {
                    dx3Var = dx3.CRUNCHY;
                } else if (vq3.f16422e.equals(vq3VarD)) {
                    dx3Var = dx3.RAW;
                } else {
                    if (!vq3.f16421d.equals(vq3VarD)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(vq3VarD)));
                    }
                    dx3Var = dx3.LEGACY;
                }
                aw3VarM.u(dx3Var);
                return up3.a((bw3) aw3VarM.q());
            }
        }, xq3.class, up3.class);
        f6459c = cp3.a(new ap3() { // from class: com.google.android.gms.internal.ads.zq3
        }, wy3VarA, up3.class);
        f6460d = io3.a(new go3() { // from class: com.google.android.gms.internal.ads.ar3
        }, mq3.class, tp3.class);
        f6461e = eo3.b(new co3() { // from class: com.google.android.gms.internal.ads.br3
            @Override // com.google.android.gms.internal.ads.co3
            public final nh3 a(yp3 yp3Var, ri3 ri3Var) throws GeneralSecurityException {
                vq3 vq3Var;
                int i8 = cr3.f6462f;
                if (!((tp3) yp3Var).f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    ht3 ht3VarP = ht3.P(((tp3) yp3Var).d(), m04.a());
                    if (ht3VarP.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    uq3 uq3Var = new uq3(null);
                    uq3Var.a(ht3VarP.R().n());
                    uq3Var.b(ht3VarP.Q().M());
                    dx3 dx3VarC = ((tp3) yp3Var).c();
                    dx3 dx3Var = dx3.UNKNOWN_PREFIX;
                    int iOrdinal = dx3VarC.ordinal();
                    if (iOrdinal == 1) {
                        vq3Var = vq3.f16419b;
                    } else if (iOrdinal == 2) {
                        vq3Var = vq3.f16421d;
                    } else if (iOrdinal == 3) {
                        vq3Var = vq3.f16422e;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + dx3VarC.j());
                        }
                        vq3Var = vq3.f16420c;
                    }
                    uq3Var.c(vq3Var);
                    xq3 xq3VarD = uq3Var.d();
                    kq3 kq3Var = new kq3(null);
                    kq3Var.c(xq3VarD);
                    kq3Var.a(xy3.b(ht3VarP.R().a(), ri3Var));
                    kq3Var.b(((tp3) yp3Var).e());
                    return kq3Var.d();
                } catch (m14 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        }, wy3VarA, tp3.class);
    }

    public static void a(yo3 yo3Var) {
        yo3Var.g(f6458b);
        yo3Var.f(f6459c);
        yo3Var.e(f6460d);
        yo3Var.d(f6461e);
    }
}

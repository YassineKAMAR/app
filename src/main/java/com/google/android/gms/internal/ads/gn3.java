package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class gn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wy3 f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gp3 f8427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cp3 f8428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io3 f8429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final eo3 f8430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8431f = 0;

    static {
        wy3 wy3VarA = iq3.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f8426a = wy3VarA;
        f8427b = gp3.b(new ep3() { // from class: com.google.android.gms.internal.ads.cn3
            @Override // com.google.android.gms.internal.ads.ep3
            public final yp3 a(fi3 fi3Var) throws GeneralSecurityException {
                dx3 dx3Var;
                int i8 = gn3.f8431f;
                aw3 aw3VarM = bw3.M();
                aw3VarM.v("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                aw3VarM.w(mx3.N().c());
                an3 an3VarA = ((bn3) fi3Var).a();
                if (an3.f5348b.equals(an3VarA)) {
                    dx3Var = dx3.TINK;
                } else if (an3.f5349c.equals(an3VarA)) {
                    dx3Var = dx3.CRUNCHY;
                } else {
                    if (!an3.f5350d.equals(an3VarA)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(an3VarA.toString()));
                    }
                    dx3Var = dx3.RAW;
                }
                aw3VarM.u(dx3Var);
                return up3.a((bw3) aw3VarM.q());
            }
        }, bn3.class, up3.class);
        f8428c = cp3.a(new ap3() { // from class: com.google.android.gms.internal.ads.dn3
        }, wy3VarA, up3.class);
        f8429d = io3.a(new go3() { // from class: com.google.android.gms.internal.ads.en3
        }, wm3.class, tp3.class);
        f8430e = eo3.b(new co3() { // from class: com.google.android.gms.internal.ads.fn3
            @Override // com.google.android.gms.internal.ads.co3
            public final nh3 a(yp3 yp3Var, ri3 ri3Var) throws GeneralSecurityException {
                an3 an3Var;
                int i8 = gn3.f8431f;
                if (!((tp3) yp3Var).f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    jx3 jx3VarP = jx3.P(((tp3) yp3Var).d(), m04.a());
                    if (jx3VarP.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dx3 dx3VarC = ((tp3) yp3Var).c();
                    dx3 dx3Var = dx3.UNKNOWN_PREFIX;
                    int iOrdinal = dx3VarC.ordinal();
                    if (iOrdinal == 1) {
                        an3Var = an3.f5348b;
                    } else if (iOrdinal == 2) {
                        an3Var = an3.f5349c;
                    } else if (iOrdinal == 3) {
                        an3Var = an3.f5350d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + dx3VarC.j());
                        }
                        an3Var = an3.f5349c;
                    }
                    return wm3.a(an3Var, xy3.b(jx3VarP.Q().a(), ri3Var), ((tp3) yp3Var).e());
                } catch (m14 unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            }
        }, wy3VarA, tp3.class);
    }

    public static void a(yo3 yo3Var) {
        yo3Var.g(f8427b);
        yo3Var.f(f8428c);
        yo3Var.e(f8429d);
        yo3Var.d(f8430e);
    }
}

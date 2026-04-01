package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class gm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wy3 f8406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gp3 f8407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final cp3 f8408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io3 f8409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final eo3 f8410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8411f = 0;

    static {
        wy3 wy3VarA = iq3.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f8406a = wy3VarA;
        f8407b = gp3.b(new ep3() { // from class: com.google.android.gms.internal.ads.cm3
            @Override // com.google.android.gms.internal.ads.ep3
            public final yp3 a(fi3 fi3Var) throws GeneralSecurityException {
                dx3 dx3Var;
                int i8 = gm3.f8411f;
                aw3 aw3VarM = bw3.M();
                aw3VarM.v("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                aw3VarM.w(fv3.N().c());
                am3 am3VarA = ((bm3) fi3Var).a();
                if (am3.f5332b.equals(am3VarA)) {
                    dx3Var = dx3.TINK;
                } else if (am3.f5333c.equals(am3VarA)) {
                    dx3Var = dx3.CRUNCHY;
                } else {
                    if (!am3.f5334d.equals(am3VarA)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(am3VarA.toString()));
                    }
                    dx3Var = dx3.RAW;
                }
                aw3VarM.u(dx3Var);
                return up3.a((bw3) aw3VarM.q());
            }
        }, bm3.class, up3.class);
        f8408c = cp3.a(new ap3() { // from class: com.google.android.gms.internal.ads.dm3
        }, wy3VarA, up3.class);
        f8409d = io3.a(new go3() { // from class: com.google.android.gms.internal.ads.em3
        }, wl3.class, tp3.class);
        f8410e = eo3.b(new co3() { // from class: com.google.android.gms.internal.ads.fm3
            @Override // com.google.android.gms.internal.ads.co3
            public final nh3 a(yp3 yp3Var, ri3 ri3Var) throws GeneralSecurityException {
                am3 am3Var;
                int i8 = gm3.f8411f;
                if (!((tp3) yp3Var).f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    cv3 cv3VarP = cv3.P(((tp3) yp3Var).d(), m04.a());
                    if (cv3VarP.M() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    dx3 dx3VarC = ((tp3) yp3Var).c();
                    dx3 dx3Var = dx3.UNKNOWN_PREFIX;
                    int iOrdinal = dx3VarC.ordinal();
                    if (iOrdinal == 1) {
                        am3Var = am3.f5332b;
                    } else if (iOrdinal == 2) {
                        am3Var = am3.f5333c;
                    } else if (iOrdinal == 3) {
                        am3Var = am3.f5334d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + dx3VarC.j());
                        }
                        am3Var = am3.f5333c;
                    }
                    return wl3.a(am3Var, xy3.b(cv3VarP.Q().a(), ri3Var), ((tp3) yp3Var).e());
                } catch (m14 unused) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            }
        }, wy3VarA, tp3.class);
    }

    public static void a(yo3 yo3Var) {
        yo3Var.g(f8407b);
        yo3Var.f(f8408c);
        yo3Var.e(f8409d);
        yo3Var.d(f8410e);
    }
}

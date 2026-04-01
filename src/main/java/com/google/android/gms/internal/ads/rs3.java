package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class rs3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wy3 f14319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zn3 f14320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zn3 f14321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final gp3 f14322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final cp3 f14323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final io3 f14324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final eo3 f14325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f14326h = 0;

    static {
        wy3 wy3VarA = iq3.a("type.googleapis.com/google.crypto.tink.HmacKey");
        f14319a = wy3VarA;
        xn3 xn3VarA = zn3.a();
        xn3VarA.a(dx3.RAW, ur3.f15825e);
        xn3VarA.a(dx3.TINK, ur3.f15822b);
        xn3VarA.a(dx3.LEGACY, ur3.f15824d);
        xn3VarA.a(dx3.CRUNCHY, ur3.f15823c);
        f14320b = xn3VarA.b();
        xn3 xn3VarA2 = zn3.a();
        xn3VarA2.a(hv3.SHA1, tr3.f15256b);
        xn3VarA2.a(hv3.SHA224, tr3.f15257c);
        xn3VarA2.a(hv3.SHA256, tr3.f15258d);
        xn3VarA2.a(hv3.SHA384, tr3.f15259e);
        xn3VarA2.a(hv3.SHA512, tr3.f15260f);
        f14321c = xn3VarA2.b();
        f14322d = gp3.b(new ep3() { // from class: com.google.android.gms.internal.ads.ns3
            @Override // com.google.android.gms.internal.ads.ep3
            public final yp3 a(fi3 fi3Var) {
                return rs3.a((wr3) fi3Var);
            }
        }, wr3.class, up3.class);
        f14323e = cp3.a(new ap3() { // from class: com.google.android.gms.internal.ads.os3
        }, wy3VarA, up3.class);
        f14324f = io3.a(new go3() { // from class: com.google.android.gms.internal.ads.ps3
        }, kr3.class, tp3.class);
        f14325g = eo3.b(new co3() { // from class: com.google.android.gms.internal.ads.qs3
            @Override // com.google.android.gms.internal.ads.co3
            public final nh3 a(yp3 yp3Var, ri3 ri3Var) {
                return rs3.b((tp3) yp3Var, ri3Var);
            }
        }, wy3VarA, tp3.class);
    }

    public static /* synthetic */ up3 a(wr3 wr3Var) {
        aw3 aw3VarM = bw3.M();
        aw3VarM.v("type.googleapis.com/google.crypto.tink.HmacKey");
        mv3 mv3VarN = nv3.N();
        pv3 pv3VarO = qv3.O();
        pv3VarO.v(wr3Var.a());
        pv3VarO.u((hv3) f14321c.b(wr3Var.e()));
        mv3VarN.v((qv3) pv3VarO.q());
        mv3VarN.u(wr3Var.b());
        aw3VarM.w(((nv3) mv3VarN.q()).c());
        aw3VarM.u((dx3) f14320b.b(wr3Var.f()));
        return up3.a((bw3) aw3VarM.q());
    }

    public static /* synthetic */ kr3 b(tp3 tp3Var, ri3 ri3Var) throws GeneralSecurityException {
        if (!tp3Var.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            kv3 kv3VarQ = kv3.Q(tp3Var.d(), m04.a());
            if (kv3VarQ.M() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            rr3 rr3VarD = wr3.d();
            rr3VarD.b(kv3VarQ.S().n());
            rr3VarD.c(kv3VarQ.R().M());
            rr3VarD.a((tr3) f14321c.c(kv3VarQ.R().N()));
            rr3VarD.d((ur3) f14320b.c(tp3Var.c()));
            wr3 wr3VarE = rr3VarD.e();
            ir3 ir3VarC = kr3.c();
            ir3VarC.c(wr3VarE);
            ir3VarC.b(xy3.b(kv3VarQ.S().a(), ri3Var));
            ir3VarC.a(tp3Var.e());
            return ir3VarC.d();
        } catch (m14 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c(yo3 yo3Var) {
        yo3Var.g(f14322d);
        yo3Var.f(f14323e);
        yo3Var.e(f14324f);
        yo3Var.d(f14325g);
    }
}

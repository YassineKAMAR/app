package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class oo2 implements lp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lp2 f12582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lp2 f12583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ev2 f12584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m31 f12586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f12587f;

    public oo2(lp2 lp2Var, lp2 lp2Var2, ev2 ev2Var, String str, Executor executor) {
        this.f12582a = lp2Var;
        this.f12583b = lp2Var2;
        this.f12584c = ev2Var;
        this.f12585d = str;
        this.f12587f = executor;
    }

    private final x3.d f(ru2 ru2Var, mp2 mp2Var) {
        m31 m31Var = ru2Var.f14345a;
        this.f12586e = m31Var;
        if (ru2Var.f14347c != null) {
            if (m31Var.n() != null) {
                ru2Var.f14347c.f().o(ru2Var.f14345a.n());
            }
            return zf3.h(ru2Var.f14347c);
        }
        m31Var.k().l(ru2Var.f14346b);
        return ((yo2) this.f12582a).c(mp2Var, null, ru2Var.f14345a);
    }

    @Override // com.google.android.gms.internal.ads.lp2
    public final /* bridge */ /* synthetic */ x3.d a(mp2 mp2Var, kp2 kp2Var, Object obj) {
        return e(mp2Var, kp2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.lp2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized m31 p() {
        return this.f12586e;
    }

    final /* synthetic */ x3.d c(mp2 mp2Var, no2 no2Var, kp2 kp2Var, m31 m31Var, to2 to2Var) {
        if (to2Var != null) {
            no2 no2Var2 = new no2(no2Var.f11933a, no2Var.f11934b, no2Var.f11935c, no2Var.f11936d, no2Var.f11937e, no2Var.f11938f, to2Var.f15197a);
            if (to2Var.f15199c != null) {
                this.f12586e = null;
                this.f12584c.e(no2Var2);
                return f(to2Var.f15199c, mp2Var);
            }
            x3.d dVarA = this.f12584c.a(no2Var2);
            if (dVarA != null) {
                this.f12586e = null;
                return zf3.n(dVarA, new gf3() { // from class: com.google.android.gms.internal.ads.ko2
                    @Override // com.google.android.gms.internal.ads.gf3
                    public final x3.d a(Object obj) {
                        return this.f10190a.d((bv2) obj);
                    }
                }, this.f12587f);
            }
            this.f12584c.e(no2Var2);
            mp2Var = new mp2(mp2Var.f11440b, to2Var.f15198b);
        }
        x3.d dVarC = ((yo2) this.f12582a).c(mp2Var, kp2Var, m31Var);
        this.f12586e = m31Var;
        return dVarC;
    }

    final /* synthetic */ x3.d d(bv2 bv2Var) throws gu1 {
        dv2 dv2Var;
        if (bv2Var == null || bv2Var.f6053a == null || (dv2Var = bv2Var.f6054b) == null) {
            throw new gu1(1, "Empty prefetch");
        }
        ko koVarM = qo.M();
        io ioVarM = jo.M();
        ioVarM.x(2);
        ioVarM.v(no.O());
        koVarM.u(ioVarM);
        bv2Var.f6053a.f14345a.k().c().d0((qo) koVarM.q());
        return f(bv2Var.f6053a, ((no2) dv2Var).f11934b);
    }

    public final synchronized x3.d e(final mp2 mp2Var, final kp2 kp2Var, m31 m31Var) {
        l31 l31VarA = kp2Var.a(mp2Var.f11440b);
        l31VarA.u(new po2(this.f12585d));
        final m31 m31Var2 = (m31) l31VarA.o();
        m31Var2.q();
        m31Var2.q();
        h2.r4 r4Var = m31Var2.q().f15302d;
        if (r4Var.f22270s == null && r4Var.f22275x == null) {
            ts2 ts2VarQ = m31Var2.q();
            final no2 no2Var = new no2(kp2Var, mp2Var, ts2VarQ.f15302d, ts2VarQ.f15304f, this.f12587f, ts2VarQ.f15308j, null);
            return zf3.n(qf3.C(((uo2) this.f12583b).c(mp2Var, kp2Var, m31Var2)), new gf3() { // from class: com.google.android.gms.internal.ads.lo2
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return this.f10795a.c(mp2Var, no2Var, kp2Var, m31Var2, (to2) obj);
                }
            }, this.f12587f);
        }
        this.f12586e = m31Var2;
        return ((yo2) this.f12582a).c(mp2Var, kp2Var, m31Var2);
    }
}

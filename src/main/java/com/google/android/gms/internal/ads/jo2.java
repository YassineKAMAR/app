package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jo2 implements lp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m31 f9731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f9732b = rg3.b();

    @Override // com.google.android.gms.internal.ads.lp2
    public final /* bridge */ /* synthetic */ x3.d a(mp2 mp2Var, kp2 kp2Var, Object obj) {
        return c(mp2Var, kp2Var, null);
    }

    public final m31 b() {
        return this.f9731a;
    }

    public final x3.d c(mp2 mp2Var, kp2 kp2Var, m31 m31Var) {
        l31 l31VarA = kp2Var.a(mp2Var.f11440b);
        l31VarA.g(new pp2(true));
        m31 m31Var2 = (m31) l31VarA.o();
        this.f9731a = m31Var2;
        final w01 w01VarK = m31Var2.k();
        final ru2 ru2Var = new ru2();
        return zf3.m(zf3.n(qf3.C(w01VarK.j()), new gf3() { // from class: com.google.android.gms.internal.ads.ho2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                ks2 ks2Var = (ks2) obj;
                ru2Var.f14346b = ks2Var;
                Iterator it = ks2Var.f10323b.f9792a.iterator();
                boolean z7 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((wr2) it.next()).f16865a.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z7 = true;
                        }
                    } else if (z7) {
                        return w01VarK.i(zf3.h(ks2Var));
                    }
                }
                return zf3.h(null);
            }
        }, this.f9732b), new z73() { // from class: com.google.android.gms.internal.ads.io2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                ru2 ru2Var2 = ru2Var;
                ru2Var2.f14347c = (nz0) obj;
                return ru2Var2;
            }
        }, this.f9732b);
    }

    @Override // com.google.android.gms.internal.ads.lp2
    public final /* synthetic */ Object p() {
        return this.f9731a;
    }
}

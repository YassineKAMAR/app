package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o82 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z22 f12397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e32 f12398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bx2 f12399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lg3 f12400d;

    public o82(bx2 bx2Var, lg3 lg3Var, z22 z22Var, e32 e32Var) {
        this.f12399c = bx2Var;
        this.f12400d = lg3Var;
        this.f12398b = e32Var;
        this.f12397a = z22Var;
    }

    static final String e(String str, int i8) {
        return "Error from: " + str + ", code: " + i8;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(final ks2 ks2Var, final wr2 wr2Var) {
        final a32 a32VarA;
        Iterator it = wr2Var.f16907v.iterator();
        while (true) {
            if (!it.hasNext()) {
                a32VarA = null;
                break;
            }
            try {
                a32VarA = this.f12397a.a((String) it.next(), wr2Var.f16909x);
                break;
            } catch (ys2 unused) {
            }
        }
        if (a32VarA == null) {
            return zf3.g(new c62("Unable to instantiate mediation adapter class."));
        }
        jh0 jh0Var = new jh0();
        a32VarA.f5002c.k3(new n82(this, a32VarA, jh0Var));
        if (wr2Var.O) {
            Bundle bundle = ks2Var.f10322a.f8947a.f15302d.f22264m;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        bx2 bx2Var = this.f12399c;
        return lw2.d(new ew2() { // from class: com.google.android.gms.internal.ads.l82
            @Override // com.google.android.gms.internal.ads.ew2
            public final void j() {
                this.f10521a.d(ks2Var, wr2Var, a32VarA);
            }
        }, this.f12400d, vw2.ADAPTER_LOAD_AD_SYN, bx2Var).b(vw2.ADAPTER_LOAD_AD_ACK).d(jh0Var).b(vw2.ADAPTER_WRAP_ADAPTER).e(new dw2() { // from class: com.google.android.gms.internal.ads.m82
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                return this.f11203a.c(ks2Var, wr2Var, a32VarA, (Void) obj);
            }
        }).a();
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        return !wr2Var.f16907v.isEmpty();
    }

    final /* synthetic */ Object c(ks2 ks2Var, wr2 wr2Var, a32 a32Var, Void r42) {
        return this.f12398b.b(ks2Var, wr2Var, a32Var);
    }

    final /* synthetic */ void d(ks2 ks2Var, wr2 wr2Var, a32 a32Var) {
        this.f12398b.a(ks2Var, wr2Var, a32Var);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ef2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f7305b;

    public ef2(Context context, lg3 lg3Var) {
        this.f7304a = context;
        this.f7305b = lg3Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f7305b.Z(new Callable() { // from class: com.google.android.gms.internal.ads.df2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strT;
                String strS;
                String strE;
                g2.t.r();
                tl tlVarQ = g2.t.q().h().q();
                Bundle bundle = null;
                if (tlVarQ != null && (!g2.t.q().h().H() || !g2.t.q().h().I())) {
                    if (tlVarQ.h()) {
                        tlVarQ.g();
                    }
                    jl jlVarA = tlVarQ.a();
                    if (jlVarA != null) {
                        strT = jlVarA.d();
                        strE = jlVarA.e();
                        strS = jlVarA.f();
                        if (strT != null) {
                            g2.t.q().h().A(strT);
                        }
                        if (strS != null) {
                            g2.t.q().h().G(strS);
                        }
                    } else {
                        strT = g2.t.q().h().t();
                        strS = g2.t.q().h().s();
                        strE = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!g2.t.q().h().I()) {
                        if (strS == null || TextUtils.isEmpty(strS)) {
                            strS = "no_hash";
                        }
                        bundle2.putString("v_fp_vertical", strS);
                    }
                    if (strT != null && !g2.t.q().h().H()) {
                        bundle2.putString("fingerprint", strT);
                        if (!strT.equals(strE)) {
                            bundle2.putString("v_fp", strE);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new ff2(bundle);
            }
        });
    }
}

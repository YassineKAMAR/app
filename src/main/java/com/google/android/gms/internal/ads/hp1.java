package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hp1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f8871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f8872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f8873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f8874d;

    public hp1(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f8871a = w84Var;
        this.f8872b = w84Var2;
        this.f8873c = w84Var3;
        this.f8874d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        Set setEmptySet;
        final String str = (String) this.f8871a.k();
        Context contextA = ((io0) this.f8872b).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Map mapK = ((n84) this.f8874d).k();
        if (((Boolean) h2.y.c().b(ns.M4)).booleanValue()) {
            vn vnVar = new vn(new bo(contextA));
            vnVar.b(new un() { // from class: com.google.android.gms.internal.ads.ip1
                @Override // com.google.android.gms.internal.ads.un
                public final void a(lp lpVar) {
                    lpVar.B(str);
                }
            });
            setEmptySet = Collections.singleton(new yb1(new kp1(vnVar, mapK), lg3Var));
        } else {
            setEmptySet = Collections.emptySet();
        }
        r84.b(setEmptySet);
        return setEmptySet;
    }
}

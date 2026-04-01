package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class fd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ke1 f7721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fm0 f7722b;

    public fd1(ke1 ke1Var, fm0 fm0Var) {
        this.f7721a = ke1Var;
        this.f7722b = fm0Var;
    }

    public static final yb1 h(by2 by2Var) {
        return new yb1(by2Var, eh0.f7327f);
    }

    public static final yb1 i(pe1 pe1Var) {
        return new yb1(pe1Var, eh0.f7327f);
    }

    public final View a() {
        fm0 fm0Var = this.f7722b;
        if (fm0Var == null) {
            return null;
        }
        return fm0Var.X();
    }

    public final View b() {
        fm0 fm0Var = this.f7722b;
        if (fm0Var != null) {
            return fm0Var.X();
        }
        return null;
    }

    public final fm0 c() {
        return this.f7722b;
    }

    public final yb1 d(Executor executor) {
        final fm0 fm0Var = this.f7722b;
        return new yb1(new y81() { // from class: com.google.android.gms.internal.ads.dd1
            @Override // com.google.android.gms.internal.ads.y81
            public final void j() {
                i2.s sVarL;
                fm0 fm0Var2 = fm0Var;
                if (fm0Var2 == null || (sVarL = fm0Var2.L()) == null) {
                    return;
                }
                sVarL.k();
            }
        }, executor);
    }

    public final ke1 e() {
        return this.f7721a;
    }

    public Set f(c31 c31Var) {
        return Collections.singleton(new yb1(c31Var, eh0.f7327f));
    }

    public Set g(c31 c31Var) {
        return Collections.singleton(new yb1(c31Var, eh0.f7327f));
    }
}

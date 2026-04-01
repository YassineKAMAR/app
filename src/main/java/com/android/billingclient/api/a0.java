package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.e5;
import com.google.android.gms.internal.play_billing.k5;
import com.google.android.gms.internal.play_billing.l5;
import com.google.android.gms.internal.play_billing.o4;
import com.google.android.gms.internal.play_billing.p5;
import com.google.android.gms.internal.play_billing.s4;

/* JADX INFO: loaded from: classes.dex */
final class a0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e5 f4457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f4458b;

    a0(Context context, e5 e5Var) {
        this.f4458b = new b0(context);
        this.f4457a = e5Var;
    }

    @Override // com.android.billingclient.api.y
    public final void a(o4 o4Var) {
        if (o4Var == null) {
            return;
        }
        try {
            k5 k5VarY = l5.y();
            e5 e5Var = this.f4457a;
            if (e5Var != null) {
                k5VarY.r(e5Var);
            }
            k5VarY.p(o4Var);
            this.f4458b.a((l5) k5VarY.h());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.v.k("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.y
    public final void b(p5 p5Var) {
        if (p5Var == null) {
            return;
        }
        try {
            k5 k5VarY = l5.y();
            e5 e5Var = this.f4457a;
            if (e5Var != null) {
                k5VarY.r(e5Var);
            }
            k5VarY.t(p5Var);
            this.f4458b.a((l5) k5VarY.h());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.v.k("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.y
    public final void c(s4 s4Var) {
        if (s4Var == null) {
            return;
        }
        try {
            k5 k5VarY = l5.y();
            e5 e5Var = this.f4457a;
            if (e5Var != null) {
                k5VarY.r(e5Var);
            }
            k5VarY.q(s4Var);
            this.f4458b.a((l5) k5VarY.h());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.v.k("BillingLogger", "Unable to log.");
        }
    }
}

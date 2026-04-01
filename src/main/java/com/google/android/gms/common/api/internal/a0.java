package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f4819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f4820b;

    a0(b0 b0Var, y yVar) {
        this.f4820b = b0Var;
        this.f4819a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4820b.f4842b) {
            x2.b bVarB = this.f4819a.b();
            if (bVarB.p()) {
                b0 b0Var = this.f4820b;
                b0Var.f4813a.startActivityForResult(GoogleApiActivity.a(b0Var.b(), (PendingIntent) a3.o.j(bVarB.n()), this.f4819a.a(), false), 1);
                return;
            }
            b0 b0Var2 = this.f4820b;
            if (b0Var2.f4845e.b(b0Var2.b(), bVarB.g(), null) != null) {
                b0 b0Var3 = this.f4820b;
                b0Var3.f4845e.v(b0Var3.b(), this.f4820b.f4813a, bVarB.g(), 2, this.f4820b);
            } else {
                if (bVarB.g() != 18) {
                    this.f4820b.l(bVarB, this.f4819a.a());
                    return;
                }
                b0 b0Var4 = this.f4820b;
                Dialog dialogQ = b0Var4.f4845e.q(b0Var4.b(), this.f4820b);
                b0 b0Var5 = this.f4820b;
                b0Var5.f4845e.r(b0Var5.b().getApplicationContext(), new z(this, dialogQ));
            }
        }
    }
}

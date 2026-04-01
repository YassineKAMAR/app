package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
@TargetApi(18)
final class l63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z63 f10474c = new z63("OverlayDisplayService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Intent f10475d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k73 f10476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10477b;

    l63(Context context) {
        this.f10476a = n73.a(context) ? new k73(context.getApplicationContext(), f10474c, "OverlayDisplayService", f10475d, g63.f8227a, null) : null;
        this.f10477b = context.getPackageName();
    }

    final void c() {
        if (this.f10476a == null) {
            return;
        }
        f10474c.c("unbind LMD display overlay service", new Object[0]);
        this.f10476a.u();
    }

    final void d(c63 c63Var, r63 r63Var) {
        if (this.f10476a == null) {
            f10474c.a("error: %s", "Play Store not found.");
        } else {
            s3.i iVar = new s3.i();
            this.f10476a.s(new i63(this, iVar, c63Var, r63Var, iVar), iVar);
        }
    }

    final void e(o63 o63Var, r63 r63Var) {
        if (this.f10476a == null) {
            f10474c.a("error: %s", "Play Store not found.");
            return;
        }
        if (o63Var.g() != null) {
            s3.i iVar = new s3.i();
            this.f10476a.s(new h63(this, iVar, o63Var, r63Var, iVar), iVar);
        } else {
            f10474c.a("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            p63 p63VarC = q63.c();
            p63VarC.b(8160);
            r63Var.a(p63VarC.c());
        }
    }

    final void f(t63 t63Var, r63 r63Var, int i8) {
        if (this.f10476a == null) {
            f10474c.a("error: %s", "Play Store not found.");
        } else {
            s3.i iVar = new s3.i();
            this.f10476a.s(new j63(this, iVar, t63Var, i8, r63Var, iVar), iVar);
        }
    }
}

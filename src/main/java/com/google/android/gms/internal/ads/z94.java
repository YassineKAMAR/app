package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class z94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f18124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w94 f18125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y94 f18126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f18128e = 1.0f;

    public z94(Context context, Handler handler, y94 y94Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f18124a = audioManager;
        this.f18126c = y94Var;
        this.f18125b = new w94(this, handler);
        this.f18127d = 0;
    }

    static /* bridge */ /* synthetic */ void c(z94 z94Var, int i8) {
        if (i8 == -3 || i8 == -2) {
            if (i8 != -2) {
                z94Var.g(3);
                return;
            } else {
                z94Var.f(0);
                z94Var.g(2);
                return;
            }
        }
        if (i8 == -1) {
            z94Var.f(-1);
            z94Var.e();
        } else if (i8 == 1) {
            z94Var.g(1);
            z94Var.f(1);
        } else {
            pf2.f("AudioFocusManager", "Unknown focus change type: " + i8);
        }
    }

    private final void e() {
        if (this.f18127d == 0) {
            return;
        }
        if (nz2.f12300a < 26) {
            this.f18124a.abandonAudioFocus(this.f18125b);
        }
        g(0);
    }

    private final void f(int i8) {
        y94 y94Var = this.f18126c;
        if (y94Var != null) {
            wb4 wb4Var = (wb4) y94Var;
            boolean zA = wb4Var.f16679a.A();
            wb4Var.f16679a.l0(zA, i8, bc4.Y(zA, i8));
        }
    }

    private final void g(int i8) {
        if (this.f18127d == i8) {
            return;
        }
        this.f18127d = i8;
        float f8 = i8 == 3 ? 0.2f : 1.0f;
        if (this.f18128e == f8) {
            return;
        }
        this.f18128e = f8;
        y94 y94Var = this.f18126c;
        if (y94Var != null) {
            ((wb4) y94Var).f16679a.i0();
        }
    }

    public final float a() {
        return this.f18128e;
    }

    public final int b(boolean z7, int i8) {
        e();
        return z7 ? 1 : -1;
    }

    public final void d() {
        this.f18126c = null;
        e();
    }
}

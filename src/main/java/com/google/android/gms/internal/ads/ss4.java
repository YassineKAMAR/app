package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
final class ss4 implements DisplayManager.DisplayListener, qs4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayManager f14815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ms4 f14816b;

    private ss4(DisplayManager displayManager) {
        this.f14815a = displayManager;
    }

    public static qs4 b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new ss4(displayManager);
        }
        return null;
    }

    private final Display c() {
        return this.f14815a.getDisplay(0);
    }

    @Override // com.google.android.gms.internal.ads.qs4
    public final void a(ms4 ms4Var) {
        this.f14816b = ms4Var;
        this.f14815a.registerDisplayListener(this, nz2.H(null));
        us4.b(ms4Var.f11536a, c());
    }

    @Override // com.google.android.gms.internal.ads.qs4
    public final void j() {
        this.f14815a.unregisterDisplayListener(this);
        this.f14816b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i8) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i8) {
        ms4 ms4Var = this.f14816b;
        if (ms4Var == null || i8 != 0) {
            return;
        }
        us4.b(ms4Var.f11536a, c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i8) {
    }
}

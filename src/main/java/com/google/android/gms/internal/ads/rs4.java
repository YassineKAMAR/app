package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
final class rs4 implements qs4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f14327a;

    private rs4(WindowManager windowManager) {
        this.f14327a = windowManager;
    }

    public static qs4 b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new rs4(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.qs4
    public final void a(ms4 ms4Var) {
        us4.b(ms4Var.f11536a, this.f14327a.getDefaultDisplay());
    }

    @Override // com.google.android.gms.internal.ads.qs4
    public final void j() {
    }
}

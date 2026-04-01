package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ed2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2.c5 f7272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wg0 f7273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7274c;

    public ed2(h2.c5 c5Var, wg0 wg0Var, boolean z7) {
        this.f7272a = c5Var;
        this.f7273b = wg0Var;
        this.f7274c = z7;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.f7273b.f16725c >= ((Integer) h2.y.c().b(ns.f12063e5)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) h2.y.c().b(ns.f12072f5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f7274c);
        }
        h2.c5 c5Var = this.f7272a;
        if (c5Var != null) {
            int i8 = c5Var.f22171a;
            if (i8 == 1) {
                str = "p";
            } else if (i8 != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }
}

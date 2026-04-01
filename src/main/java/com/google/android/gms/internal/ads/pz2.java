package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class pz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13235a;

    final void a(Context context) {
        h13.b(context, "Application Context cannot be null");
        if (this.f13235a) {
            return;
        }
        this.f13235a = true;
        q03.c().d(context);
        h03.i().d(context);
        b13.b(context);
        c13.d(context);
        f13.a(context);
        m03.b().c(context);
        g03.a().d(context);
    }

    final boolean b() {
        return this.f13235a;
    }
}

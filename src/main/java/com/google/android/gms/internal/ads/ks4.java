package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class ks4 extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f10325e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final is4 f10327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10328c;

    /* synthetic */ ks4(is4 is4Var, SurfaceTexture surfaceTexture, boolean z7, js4 js4Var) {
        super(surfaceTexture);
        this.f10327b = is4Var;
        this.f10326a = z7;
    }

    public static ks4 b(Context context, boolean z7) {
        boolean z8 = true;
        if (z7 && !c(context)) {
            z8 = false;
        }
        uu1.f(z8);
        return new is4().a(z7 ? f10324d : 0);
    }

    public static synchronized boolean c(Context context) {
        if (!f10325e) {
            f10324d = e42.c(context) ? e42.d() ? 1 : 2 : 0;
            f10325e = true;
        }
        return f10324d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f10327b) {
            if (!this.f10328c) {
                this.f10327b.b();
                this.f10328c = true;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i53 extends g53 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static i53 f9071h;

    private i53(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final i53 k(Context context) {
        i53 i53Var;
        synchronized (i53.class) {
            if (f9071h == null) {
                f9071h = new i53(context);
            }
            i53Var = f9071h;
        }
        return i53Var;
    }

    public final f53 i(long j8, boolean z7) {
        f53 f53VarB;
        synchronized (i53.class) {
            f53VarB = b(null, null, j8, z7);
        }
        return f53VarB;
    }

    public final f53 j(String str, String str2, long j8, boolean z7) {
        f53 f53VarB;
        synchronized (i53.class) {
            f53VarB = b(str, str2, j8, z7);
        }
        return f53VarB;
    }

    public final void l() {
        synchronized (i53.class) {
            f(false);
        }
    }

    public final void m() {
        synchronized (i53.class) {
            f(true);
        }
    }
}

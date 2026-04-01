package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class qz2 {
    public static qz2 a(rz2 rz2Var, sz2 sz2Var) {
        if (oz2.b()) {
            return new uz2(rz2Var, sz2Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b(View view, xz2 xz2Var, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}

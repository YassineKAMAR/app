package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class s23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Looper f14490b;

    public s23(Context context, Looper looper) {
        this.f14489a = context;
        this.f14490b = looper;
    }

    public final void a(String str) {
        g33 g33VarM = i33.M();
        g33VarM.u(this.f14489a.getPackageName());
        g33VarM.w(2);
        d33 d33VarM = e33.M();
        d33VarM.u(str);
        d33VarM.v(2);
        g33VarM.v(d33VarM);
        new t23(this.f14489a, this.f14490b, (i33) g33VarM.q()).a();
    }
}

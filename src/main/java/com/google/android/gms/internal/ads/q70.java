package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class q70 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s70 f13317a;

    q70(s70 s70Var) {
        this.f13317a = s70Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        s70 s70Var = this.f13317a;
        Intent intentI = s70Var.i();
        g2.t.r();
        j2.k2.s(s70Var.f14544d, intentI);
    }
}

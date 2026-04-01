package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class e9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p8 f19993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ v8 f19994b;

    e9(v8 v8Var, p8 p8Var) {
        this.f19994b = v8Var;
        this.f19993a = p8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j8;
        String str;
        String str2;
        String packageName;
        p3.i iVar = this.f19994b.f20564d;
        if (iVar == null) {
            this.f19994b.t().G().a("Failed to send current screen to service");
            return;
        }
        try {
            p8 p8Var = this.f19993a;
            if (p8Var == null) {
                j8 = 0;
                str = null;
                str2 = null;
                packageName = this.f19994b.j().getPackageName();
            } else {
                j8 = p8Var.f20366c;
                str = p8Var.f20364a;
                str2 = p8Var.f20365b;
                packageName = this.f19994b.j().getPackageName();
            }
            iVar.J2(j8, str, str2, packageName);
            this.f19994b.g0();
        } catch (RemoteException e8) {
            this.f19994b.t().G().b("Failed to send current screen to the service", e8);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
final class gi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f8334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ii f8335b;

    gi(ii iiVar, int i8, boolean z7) {
        this.f8335b = iiVar;
        this.f8334a = i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ze zeVarA;
        int i8 = this.f8334a;
        ii iiVar = this.f8335b;
        if (i8 > 0) {
            try {
                Thread.sleep(i8 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = iiVar.f9202a.getPackageManager().getPackageInfo(iiVar.f9202a.getPackageName(), 0);
            Context context = iiVar.f9202a;
            zeVarA = o23.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zeVarA = null;
        }
        this.f8335b.f9211j = zeVarA;
        if (this.f8334a < 4) {
            if (zeVarA != null && zeVarA.w0() && !zeVarA.L0().equals("0000000000000000000000000000000000000000000000000000000000000000") && zeVarA.x0() && zeVarA.J0().P() && zeVarA.J0().M() != -2) {
                return;
            }
            this.f8335b.o(this.f8334a + 1, true);
        }
    }
}

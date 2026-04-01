package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final w5 f20028a;

    g5(va vaVar) {
        this.f20028a = vaVar.i0();
    }

    final Bundle a(String str, com.google.android.gms.internal.measurement.a1 a1Var) {
        this.f20028a.u().i();
        if (a1Var == null) {
            this.f20028a.t().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleF = a1Var.f(bundle);
            if (bundleF != null) {
                return bundleF;
            }
            this.f20028a.t().G().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e8) {
            this.f20028a.t().G().b("Exception occurred while retrieving the Install Referrer", e8.getMessage());
            return null;
        }
    }

    final boolean b() {
        try {
            f3.d dVarA = f3.e.a(this.f20028a.j());
            if (dVarA != null) {
                return dVarA.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f20028a.t().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e8) {
            this.f20028a.t().K().b("Failed to retrieve Play Store version for Install Referrer", e8);
            return false;
        }
    }
}

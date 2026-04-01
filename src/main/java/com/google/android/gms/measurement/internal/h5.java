package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.eg;
import com.google.android.gms.internal.measurement.ne;

/* JADX INFO: loaded from: classes.dex */
final class h5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.a1 f20054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f20055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ f5 f20056c;

    h5(f5 f5Var, com.google.android.gms.internal.measurement.a1 a1Var, ServiceConnection serviceConnection) {
        this.f20056c = f5Var;
        this.f20054a = a1Var;
        this.f20055b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4 p4VarG;
        String str;
        f5 f5Var = this.f20056c;
        g5 g5Var = f5Var.f20008b;
        String str2 = f5Var.f20007a;
        com.google.android.gms.internal.measurement.a1 a1Var = this.f20054a;
        ServiceConnection serviceConnection = this.f20055b;
        Bundle bundleA = g5Var.a(str2, a1Var);
        g5Var.f20028a.u().i();
        g5Var.f20028a.Q();
        if (bundleA != null) {
            long j8 = bundleA.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j8 == 0) {
                p4VarG = g5Var.f20028a.t().L();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundleA.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    p4VarG = g5Var.f20028a.t().G();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    g5Var.f20028a.t().K().b("InstallReferrer API result", string);
                    Bundle bundleC = g5Var.f20028a.L().C(Uri.parse("?" + string), eg.a() && g5Var.f20028a.z().q(e0.F0), ne.a() && g5Var.f20028a.z().q(e0.f19923a1));
                    if (bundleC == null) {
                        p4VarG = g5Var.f20028a.t().G();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = bundleC.getString("medium");
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j9 = bundleA.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j9 == 0) {
                                p4VarG = g5Var.f20028a.t().G();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                bundleC.putLong("click_timestamp", j9);
                            }
                        }
                        if (j8 == g5Var.f20028a.F().f20700f.a()) {
                            g5Var.f20028a.t().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (g5Var.f20028a.m()) {
                            g5Var.f20028a.F().f20700f.b(j8);
                            g5Var.f20028a.t().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleC.putString("_cis", "referrer API v2");
                            g5Var.f20028a.H().W("auto", "_cmp", bundleC, str2);
                        }
                    }
                }
            }
            p4VarG.a(str);
        }
        if (serviceConnection != null) {
            d3.b.b().c(g5Var.f20028a.j(), serviceConnection);
        }
    }
}

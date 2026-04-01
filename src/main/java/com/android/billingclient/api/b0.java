package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.l5;

/* JADX INFO: loaded from: classes.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l1.f f4466b;

    b0(Context context) {
        try {
            n1.t.f(context);
            this.f4466b = n1.t.c().g(com.google.android.datatransport.cct.a.f4702g).a("PLAY_BILLING_LIBRARY", l5.class, l1.b.b("proto"), new l1.e() { // from class: j1.g0
                @Override // l1.e
                public final Object apply(Object obj) {
                    return ((l5) obj).b();
                }
            });
        } catch (Throwable unused) {
            this.f4465a = true;
        }
    }

    public final void a(l5 l5Var) {
        String str;
        if (this.f4465a) {
            str = "Skipping logging since initialization failed.";
        } else {
            try {
                this.f4466b.a(l1.c.d(l5Var));
                return;
            } catch (Throwable unused) {
                str = "logging failed.";
            }
        }
        com.google.android.gms.internal.play_billing.v.k("BillingLogger", str);
    }
}

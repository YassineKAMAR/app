package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.f;
import com.google.android.gms.internal.play_billing.o2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class v extends o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j1.e f4638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final y f4639b;

    /* synthetic */ v(j1.e eVar, y yVar, j1.t tVar) {
        this.f4638a = eVar;
        this.f4639b = yVar;
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void f(Bundle bundle) {
        if (bundle == null) {
            y yVar = this.f4639b;
            f fVar = z.f4660j;
            yVar.a(j1.c0.a(63, 13, fVar));
            this.f4638a.a(fVar, null);
            return;
        }
        int iB = com.google.android.gms.internal.play_billing.v.b(bundle, "BillingClient");
        String strG = com.google.android.gms.internal.play_billing.v.g(bundle, "BillingClient");
        f.a aVarC = f.c();
        aVarC.c(iB);
        aVarC.b(strG);
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "getBillingConfig() failed. Response code: " + iB);
            f fVarA = aVarC.a();
            this.f4639b.a(j1.c0.a(23, 13, fVarA));
            this.f4638a.a(fVarA, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            aVarC.c(6);
            f fVarA2 = aVarC.a();
            this.f4639b.a(j1.c0.a(64, 13, fVarA2));
            this.f4638a.a(fVarA2, null);
            return;
        }
        try {
            this.f4638a.a(aVarC.a(), new d(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e8) {
            com.google.android.gms.internal.play_billing.v.l("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e8);
            y yVar2 = this.f4639b;
            f fVar2 = z.f4660j;
            yVar2.a(j1.c0.a(65, 13, fVar2));
            this.f4638a.a(fVar2, null);
        }
    }
}

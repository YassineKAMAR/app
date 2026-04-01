package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class l0 {
    static k0 a(Bundle bundle, String str, String str2) {
        f fVar = z.f4660j;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", String.format("%s got null owned items list", str2));
            return new k0(fVar, 54);
        }
        int iB = com.google.android.gms.internal.play_billing.v.b(bundle, "BillingClient");
        String strG = com.google.android.gms.internal.play_billing.v.g(bundle, "BillingClient");
        f.a aVarC = f.c();
        aVarC.c(iB);
        aVarC.b(strG);
        f fVarA = aVarC.a();
        if (iB != 0) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new k0(fVarA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new k0(fVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new k0(fVar, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new k0(fVar, 57);
        }
        if (stringArrayList3 != null) {
            return new k0(z.f4662l, 1);
        }
        com.google.android.gms.internal.play_billing.v.k("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new k0(fVar, 58);
    }
}

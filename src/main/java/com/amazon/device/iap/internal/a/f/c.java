package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4262c = "c";

    public c(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, com.amazon.a.a.o.b.ae);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f4262c, "data: " + mapB);
        String str = (String) b().get(com.amazon.a.a.o.b.B);
        String str2 = (String) mapB.get("userId");
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f3903m);
        String str4 = (String) mapB.get(com.amazon.a.a.o.b.D);
        if (!f.a(str4)) {
            Receipt receiptA = null;
            JSONObject jSONObject = new JSONObject(str4);
            PurchaseResponse.RequestStatus requestStatusSafeValueOf = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString(com.amazon.a.a.o.b.f3904n));
            if (requestStatusSafeValueOf == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                try {
                    receiptA = com.amazon.device.iap.internal.util.c.a(jSONObject, str2, str);
                } catch (Throwable unused) {
                }
            }
            com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
            cVar.a().a(new PurchaseResponseBuilder().setRequestId(cVar.d()).setRequestStatus(requestStatusSafeValueOf).setUserData(new UserDataBuilder().setUserId(str2).setMarketplace(str3).build()).setReceipt(receiptA).build());
            return true;
        }
        a(str2, str3, str, PurchaseResponse.RequestStatus.FAILED);
        return false;
    }
}

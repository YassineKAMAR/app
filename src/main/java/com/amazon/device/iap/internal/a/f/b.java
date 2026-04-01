package com.amazon.device.iap.internal.a.f;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4261c = "b";

    public b(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, "1.0");
    }

    private void a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            if (PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString(com.amazon.a.a.o.b.f3904n)) == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                com.amazon.device.iap.internal.b.d.a().a(str, str2, com.amazon.device.iap.internal.util.c.a(jSONObject, str2, str).getReceiptId(), str3);
            }
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.b.b(f4261c, "Error in savePendingReceipt: " + th);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f4261c, "data: " + mapB);
        String str = (String) b().get(com.amazon.a.a.o.b.B);
        String str2 = (String) mapB.get("userId");
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f3903m);
        String str4 = (String) mapB.get(com.amazon.a.a.o.b.D);
        if (str == null || !e.a().a(str)) {
            j().a().c();
            return true;
        }
        if (!f.a(str4)) {
            Receipt receiptA = null;
            JSONObject jSONObject = new JSONObject(str4);
            PurchaseResponse.RequestStatus requestStatusSafeValueOf = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.getString(com.amazon.a.a.o.b.f3904n));
            if (requestStatusSafeValueOf == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                try {
                    receiptA = com.amazon.device.iap.internal.util.c.a(jSONObject, str2, str);
                    if (ProductType.CONSUMABLE == receiptA.getProductType()) {
                        a(str, str2, str4);
                    }
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

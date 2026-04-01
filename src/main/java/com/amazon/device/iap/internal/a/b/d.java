package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4226d = "d";

    public d(com.amazon.device.iap.internal.a.c cVar, boolean z7) {
        super(cVar, com.amazon.a.a.o.b.ae, z7);
    }

    private List<Receipt> a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb;
        String message;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            try {
                arrayList.add(com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i8), str, str3));
            } catch (e e8) {
                str4 = f4226d;
                sb = new StringBuilder();
                sb.append("fail to parse receipt, requestId:");
                message = e8.a();
                sb.append(message);
                com.amazon.device.iap.internal.util.b.b(str4, sb.toString());
            } catch (f e9) {
                str4 = f4226d;
                sb = new StringBuilder();
                sb.append("fail to verify receipt, requestId:");
                message = e9.a();
                sb.append(message);
                com.amazon.device.iap.internal.util.b.b(str4, sb.toString());
            } catch (Throwable th) {
                str4 = f4226d;
                sb = new StringBuilder();
                sb.append("fail to verify receipt, requestId:");
                message = th.getMessage();
                sb.append(message);
                com.amazon.device.iap.internal.util.b.b(str4, sb.toString());
            }
        }
        return arrayList;
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f4226d, "data: " + mapB);
        String str = (String) mapB.get("userId");
        String str2 = (String) mapB.get(com.amazon.a.a.o.b.f3903m);
        List<Receipt> listA = a(str, (String) mapB.get(com.amazon.a.a.o.b.G), (String) mapB.get(com.amazon.a.a.o.b.B));
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f3892b);
        boolean zBooleanValue = Boolean.valueOf((String) mapB.get(com.amazon.a.a.o.b.f3899i)).booleanValue();
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse purchaseUpdatesResponseBuild = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(listA).setHasMore(zBooleanValue).build();
        cVar.a().a(com.amazon.a.a.o.b.am, str3);
        cVar.a().a(purchaseUpdatesResponseBuild);
        return true;
    }
}

package com.amazon.device.iap.internal.a.b;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4224d = "c";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Date f4225e = new Date(0);

    public c(com.amazon.device.iap.internal.a.c cVar, boolean z7) {
        super(cVar, "1.0", z7);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        String str;
        StringBuilder sb;
        String message;
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f4224d, "data: " + mapB);
        String str2 = (String) mapB.get("userId");
        String str3 = (String) mapB.get(com.amazon.a.a.o.b.f3903m);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray((String) mapB.get(com.amazon.a.a.o.b.G));
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            try {
                Receipt receiptA = com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i8), str2, (String) null);
                arrayList.add(receiptA);
                if (ProductType.ENTITLED == receiptA.getProductType()) {
                    com.amazon.device.iap.internal.b.a.a().a(str2, receiptA.getReceiptId(), receiptA.getSku());
                }
            } catch (e e8) {
                str = f4224d;
                sb = new StringBuilder();
                sb.append("fail to parse receipt, requestId:");
                message = e8.a();
                sb.append(message);
                com.amazon.device.iap.internal.util.b.b(str, sb.toString());
            } catch (f e9) {
                str = f4224d;
                sb = new StringBuilder();
                sb.append("fail to verify receipt, requestId:");
                message = e9.a();
                sb.append(message);
                com.amazon.device.iap.internal.util.b.b(str, sb.toString());
            } catch (Throwable th) {
                str = f4224d;
                sb = new StringBuilder();
                sb.append("fail to verify receipt, requestId:");
                message = th.getMessage();
                sb.append(message);
                com.amazon.device.iap.internal.util.b.b(str, sb.toString());
            }
        }
        JSONArray jSONArray2 = new JSONArray((String) mapB.get(com.amazon.a.a.o.b.H));
        for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
            try {
                String string = jSONArray2.getString(i9);
                arrayList.add(new ReceiptBuilder().setSku(string).setProductType(ProductType.ENTITLED).setPurchaseDate(null).setCancelDate(f4225e).setReceiptId(com.amazon.device.iap.internal.b.a.a().a(str2, string)).build());
            } catch (JSONException unused) {
                com.amazon.device.iap.internal.util.b.b(f4224d, "fail to parse JSON[" + i9 + "] in \"" + jSONArray2 + "\"");
            }
        }
        String str4 = (String) mapB.get(com.amazon.a.a.o.b.f3892b);
        boolean zEqualsIgnoreCase = com.amazon.a.a.o.b.ac.equalsIgnoreCase((String) mapB.get(com.amazon.a.a.o.b.f3899i));
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse purchaseUpdatesResponseBuild = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str2).setMarketplace(str3).build()).setReceipts(arrayList).setHasMore(zEqualsIgnoreCase).build();
        purchaseUpdatesResponseBuild.getReceipts().addAll(com.amazon.device.iap.internal.b.d.a().b(purchaseUpdatesResponseBuild.getUserData().getUserId()));
        cVar.a().a(purchaseUpdatesResponseBuild);
        cVar.a().a(com.amazon.a.a.o.b.am, str4);
        return true;
    }
}

package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Promotion;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4220d = "c";

    public c(com.amazon.device.iap.internal.a.c cVar, Set<String> set) {
        super(cVar, com.amazon.a.a.o.b.ae, set);
    }

    private Product a(String str, Map map) {
        JSONObject jSONObjectOptJSONObject;
        String str2 = (String) map.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            ProductType productTypeValueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f3901k).toUpperCase());
            String string = jSONObject.getString(com.amazon.a.a.o.b.f3893c);
            List<Promotion> listA = null;
            String strOptString = jSONObject.optString(com.amazon.a.a.o.b.f3914x, null);
            if (f.a(strOptString) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(com.amazon.a.a.o.b.f3915y)) != null) {
                Currency currency = Currency.getInstance(jSONObjectOptJSONObject.getString(com.amazon.a.a.o.b.f3891a));
                strOptString = currency.getSymbol() + new BigDecimal(jSONObjectOptJSONObject.getString("value"));
            }
            String string2 = jSONObject.getString(com.amazon.a.a.o.b.S);
            String string3 = jSONObject.getString(com.amazon.a.a.o.b.f3900j);
            int iOptInt = jSONObject.optInt(com.amazon.a.a.o.b.T, 0);
            String string4 = jSONObject.isNull(com.amazon.a.a.o.b.f3905o) ? null : jSONObject.getString(com.amazon.a.a.o.b.f3905o);
            String string5 = jSONObject.isNull(com.amazon.a.a.o.b.f3906p) ? null : jSONObject.getString(com.amazon.a.a.o.b.f3906p);
            if (!jSONObject.isNull(com.amazon.a.a.o.b.f3907q)) {
                listA = e.a(jSONObject);
            }
            return new ProductBuilder().setSku(str).setProductType(productTypeValueOf).setDescription(string).setPrice(strOptString).setSmallIconUrl(string3).setTitle(string2).setCoinsRewardAmount(iOptInt).setSubscriptionPeriod(string4).setFreeTrialPeriod(string5).setPromotions(listA).build();
        } catch (JSONException unused) {
            throw new IllegalArgumentException("error in parsing json string" + str2);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f4220d, "data: " + mapB);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        for (String str : ((a) this).f4218c) {
            if (mapB.containsKey(str)) {
                try {
                    map.put(str, a(str, mapB));
                } catch (IllegalArgumentException e8) {
                    linkedHashSet.add(str);
                    String str2 = (String) mapB.get(str);
                    String strK = k();
                    StringBuilder sb = new StringBuilder();
                    String str3 = f4220d;
                    sb.append(str3);
                    sb.append(".onResult()");
                    MetricsHelper.submitJsonParsingExceptionMetrics(strK, str2, sb.toString());
                    com.amazon.device.iap.internal.util.b.b(str3, "Error parsing JSON for SKU " + str + ": " + e8.getMessage());
                }
            } else {
                linkedHashSet.add(str);
            }
        }
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a(new ProductDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(linkedHashSet).setProductData(map).build());
        return true;
    }
}

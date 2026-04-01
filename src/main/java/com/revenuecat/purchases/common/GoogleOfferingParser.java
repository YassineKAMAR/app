package com.revenuecat.purchases.common;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import f6.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleOfferingParser extends OfferingParser {
    @Override // com.revenuecat.purchases.common.OfferingParser
    protected StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> productsById, JSONObject packageJson) throws JSONException {
        SubscriptionOption basePlan;
        q.f(productsById, "productsById");
        q.f(packageJson, "packageJson");
        String string = packageJson.getString("platform_product_identifier");
        String it = packageJson.optString("platform_product_plan_identifier");
        q.e(it, "it");
        Object obj = null;
        if (!(it.length() > 0)) {
            it = null;
        }
        List<? extends StoreProduct> list = productsById.get(string);
        if (it == null) {
            if (!(list != null && list.size() == 1)) {
                list = null;
            }
            if (list == null) {
                return null;
            }
            if (!(list.get(0).getType() == ProductType.INAPP)) {
                list = null;
            }
            if (list != null) {
                return (StoreProduct) w.B(list);
            }
            return null;
        }
        if (list == null) {
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            SubscriptionOptions subscriptionOptions = ((StoreProduct) next).getSubscriptionOptions();
            if (q.b((subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null) ? null : basePlan.getId(), it)) {
                obj = next;
                break;
            }
        }
        return (StoreProduct) obj;
    }
}

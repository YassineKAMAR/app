package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import f6.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonOfferingParser extends OfferingParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20870a = 0;

    @Override // com.revenuecat.purchases.common.OfferingParser
    protected StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> productsById, JSONObject packageJson) {
        q.f(productsById, "productsById");
        q.f(packageJson, "packageJson");
        List<? extends StoreProduct> list = productsById.get(packageJson.getString("platform_product_identifier"));
        if (list != null) {
            return (StoreProduct) w.B(list);
        }
        return null;
    }
}

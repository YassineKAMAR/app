package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import e6.k;
import e6.m;
import f6.k0;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonCache {
    private final k amazonPostedTokensKey$delegate;
    private final DeviceCache deviceCache;

    public AmazonCache(DeviceCache deviceCache) {
        q.f(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.amazonPostedTokensKey$delegate = m.b(new AmazonCache$amazonPostedTokensKey$2(this));
    }

    public final synchronized void addSuccessfullyPostedToken(String token) {
        q.f(token, "token");
        this.deviceCache.addSuccessfullyPostedToken(token);
    }

    public final synchronized void cacheSkusByToken(Map<String, String> receiptsToSkus) {
        q.f(receiptsToSkus, "receiptsToSkus");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AmazonStrings.CACHING_RECEIPT_TERM_SKUS, Arrays.copyOf(new Object[]{receiptsToSkus}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        JSONObject jSONObject = new JSONObject(k0.j(getReceiptSkus(), receiptsToSkus));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("receiptsToSkus", jSONObject);
        DeviceCache deviceCache = this.deviceCache;
        String amazonPostedTokensKey$purchases_defaultsRelease = getAmazonPostedTokensKey$purchases_defaultsRelease();
        String string = jSONObject2.toString();
        q.e(string, "jsonToCache.toString()");
        deviceCache.putString(amazonPostedTokensKey$purchases_defaultsRelease, string);
    }

    public final String getAmazonPostedTokensKey$purchases_defaultsRelease() {
        return (String) this.amazonPostedTokensKey$delegate.getValue();
    }

    public final synchronized Map<String, String> getReceiptSkus() {
        Map<String, String> mapE;
        JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getAmazonPostedTokensKey$purchases_defaultsRelease());
        JSONObject jSONObject = jSONObjectOrNull != null ? jSONObjectOrNull.getJSONObject("receiptsToSkus") : null;
        if (jSONObject == null || (mapE = JSONObjectExtensionsKt.toMap$default(jSONObject, false, 1, null)) == null) {
            mapE = k0.e();
        }
        return mapE;
    }
}

package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.BackendHelper;
import e6.i0;
import e6.r;
import e6.x;
import f6.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonBackend {
    private final BackendHelper backendHelper;
    private volatile Map<List<String>, List<r<l<JSONObject, i0>, l<PurchasesError, i0>>>> postAmazonReceiptCallbacks;

    public AmazonBackend(BackendHelper backendHelper) {
        q.f(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
        this.postAmazonReceiptCallbacks = new LinkedHashMap();
    }

    public final void getAmazonReceiptData(String receiptId, String storeUserID, l<? super JSONObject, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(receiptId, "receiptId");
        q.f(storeUserID, "storeUserID");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        List<String> listI = o.i(receiptId, storeUserID);
        AmazonBackend$getAmazonReceiptData$call$1 amazonBackend$getAmazonReceiptData$call$1 = new AmazonBackend$getAmazonReceiptData$call$1(this, storeUserID, receiptId, listI);
        r<l<JSONObject, i0>, l<PurchasesError, i0>> rVarA = x.a(onSuccess, onError);
        synchronized (this) {
            if (this.postAmazonReceiptCallbacks.containsKey(listI)) {
                List<r<l<JSONObject, i0>, l<PurchasesError, i0>>> list = this.postAmazonReceiptCallbacks.get(listI);
                q.c(list);
                list.add(rVarA);
            } else {
                this.postAmazonReceiptCallbacks.put(listI, o.j(rVarA));
                amazonBackend$getAmazonReceiptData$call$1.invoke();
                i0 i0Var = i0.f21430a;
            }
        }
    }

    public final synchronized Map<List<String>, List<r<l<JSONObject, i0>, l<PurchasesError, i0>>>> getPostAmazonReceiptCallbacks() {
        return this.postAmazonReceiptCallbacks;
    }

    public final synchronized void setPostAmazonReceiptCallbacks(Map<List<String>, List<r<l<JSONObject, i0>, l<PurchasesError, i0>>>> map) {
        q.f(map, "<set-?>");
        this.postAmazonReceiptCallbacks = map;
    }
}

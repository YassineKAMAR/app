package com.revenuecat.purchases.amazon.purchasing;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.RequestId;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.common.LogUtilsKt;
import java.util.Arrays;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class ProxyAmazonBillingDelegate {
    private /* synthetic */ ProxyAmazonBillingActivityBroadcastReceiver broadcastReceiver;
    private final IntentFilter filter = ProxyAmazonBillingActivityBroadcastReceiver.Companion.newPurchaseFinishedIntentFilter();

    public static /* synthetic */ void getBroadcastReceiver$purchases_defaultsRelease$annotations() {
    }

    public final ProxyAmazonBillingActivityBroadcastReceiver getBroadcastReceiver$purchases_defaultsRelease() {
        return this.broadcastReceiver;
    }

    public final void onCreate(Activity activity, Bundle bundle) {
        q.f(activity, "activity");
        ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver = new ProxyAmazonBillingActivityBroadcastReceiver(activity);
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
        activity.registerReceiver(proxyAmazonBillingActivityBroadcastReceiver, this.filter);
        if (bundle == null) {
            Intent intent = activity.getIntent();
            q.e(intent, "activity.intent");
            if (startAmazonPurchase$purchases_defaultsRelease(intent) == null) {
                activity.finish();
            }
        }
    }

    public final void onDestroy(Activity activity) {
        q.f(activity, "activity");
        activity.unregisterReceiver(this.broadcastReceiver);
        this.broadcastReceiver = null;
    }

    public final void setBroadcastReceiver$purchases_defaultsRelease(ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver) {
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
    }

    public final RequestId startAmazonPurchase$purchases_defaultsRelease(Intent intent) {
        q.f(intent, "intent");
        String stringExtra = intent.getStringExtra("sku");
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
        PurchasingServiceProvider purchasingServiceProvider = (PurchasingServiceProvider) intent.getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_PURCHASING_SERVICE_PROVIDER);
        if (stringExtra != null && resultReceiver != null && purchasingServiceProvider != null) {
            RequestId requestIdPurchase = purchasingServiceProvider.purchase(stringExtra);
            Bundle bundle = new Bundle();
            bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, requestIdPurchase);
            resultReceiver.send(0, bundle);
            return requestIdPurchase;
        }
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
        c0 c0Var = c0.f24298a;
        String str = String.format(AmazonStrings.ERROR_PURCHASE_INVALID_PROXY_ACTIVITY_ARGUMENTS, Arrays.copyOf(new Object[]{intent.toUri(0)}, 1));
        q.e(str, "format(format, *args)");
        LogUtilsKt.errorLog(new PurchasesError(purchasesErrorCode, str));
        return null;
    }
}

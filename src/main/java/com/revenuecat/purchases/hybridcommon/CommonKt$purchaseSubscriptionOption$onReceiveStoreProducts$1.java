package com.revenuecat.purchases.hybridcommon;

import android.app.Activity;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import e6.i0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
final class CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1 extends r implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Boolean $googleIsPersonalizedPrice;
    final /* synthetic */ String $googleOldProductId;
    final /* synthetic */ GoogleProrationMode $googleProrationMode;
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ String $optionIdentifier;
    final /* synthetic */ String $presentedOfferingIdentifier;
    final /* synthetic */ String $productIdentifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(Activity activity, String str, Boolean bool, OnResult onResult, String str2, String str3, String str4, GoogleProrationMode googleProrationMode) {
        super(1);
        this.$activity = activity;
        this.$googleOldProductId = str;
        this.$googleIsPersonalizedPrice = bool;
        this.$onResult = onResult;
        this.$productIdentifier = str2;
        this.$optionIdentifier = str3;
        this.$presentedOfferingIdentifier = str4;
        this.$googleProrationMode = googleProrationMode;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends StoreProduct> storeProducts) {
        SubscriptionOption subscriptionOption;
        SubscriptionOption next;
        q.f(storeProducts, "storeProducts");
        String str = this.$presentedOfferingIdentifier;
        String str2 = this.$productIdentifier;
        String str3 = this.$optionIdentifier;
        Iterator<T> it = storeProducts.iterator();
        while (true) {
            if (!it.hasNext()) {
                subscriptionOption = null;
                break;
            }
            StoreProduct storeProduct = (StoreProduct) it.next();
            SubscriptionOptions subscriptionOptions = CommonKt.applyOfferingIdentifier(storeProduct, str).getSubscriptionOptions();
            if (subscriptionOptions != null) {
                Iterator<SubscriptionOption> it2 = subscriptionOptions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (q.b(storeProduct.getPurchasingData().getProductId(), str2) && q.b(next.getId(), str3)) {
                            break;
                        }
                    }
                }
                subscriptionOption = next;
            } else {
                subscriptionOption = null;
            }
            if (subscriptionOption != null) {
                break;
            }
        }
        if (subscriptionOption == null) {
            this.$onResult.onError(CommonKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product " + this.$productIdentifier + ':' + this.$optionIdentifier), null, 1, null));
            return;
        }
        PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, subscriptionOption);
        String str4 = this.$googleOldProductId;
        String str5 = str4 == null || v.p(str4) ? null : str4;
        if (str5 != null) {
            GoogleProrationMode googleProrationMode = this.$googleProrationMode;
            builder.oldProductId(str5);
            if (googleProrationMode != null) {
                builder.googleProrationMode(googleProrationMode);
            }
        }
        Boolean bool = this.$googleIsPersonalizedPrice;
        if (bool != null) {
            bool.booleanValue();
            builder.isPersonalizedPrice(bool.booleanValue());
        }
        ListenerConversionsCommonKt.purchaseWith(Purchases.Companion.getSharedInstance(), builder.build(), CommonKt.getPurchaseErrorFunction(this.$onResult), CommonKt.getPurchaseCompletedFunction(this.$onResult));
    }
}

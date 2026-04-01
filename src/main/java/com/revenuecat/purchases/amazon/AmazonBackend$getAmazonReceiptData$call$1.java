package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import e6.i0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONObject;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class AmazonBackend$getAmazonReceiptData$call$1 extends r implements p6.a<i0> {
    final /* synthetic */ List<String> $cacheKey;
    final /* synthetic */ String $receiptId;
    final /* synthetic */ String $storeUserID;
    final /* synthetic */ AmazonBackend this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ List<String> $cacheKey;
        final /* synthetic */ AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AmazonBackend amazonBackend, List<String> list) {
            super(1);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            List<e6.r<l<JSONObject, i0>, l<PurchasesError, i0>>> listRemove;
            q.f(error, "error");
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                Iterator<T> it = listRemove.iterator();
                while (it.hasNext()) {
                    ((l) ((e6.r) it.next()).b()).invoke(error);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends r implements p6.q<PurchasesError, Integer, JSONObject, i0> {
        final /* synthetic */ List<String> $cacheKey;
        final /* synthetic */ AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AmazonBackend amazonBackend, List<String> list) {
            super(3);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override // p6.q
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Integer num, JSONObject jSONObject) {
            invoke(purchasesError, num.intValue(), jSONObject);
            return i0.f21430a;
        }

        public final void invoke(PurchasesError purchasesError, int i8, JSONObject body) {
            List<e6.r<l<JSONObject, i0>, l<PurchasesError, i0>>> listRemove;
            q.f(body, "body");
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                Iterator<T> it = listRemove.iterator();
                while (it.hasNext()) {
                    e6.r rVar = (e6.r) it.next();
                    l lVar = (l) rVar.a();
                    l lVar2 = (l) rVar.b();
                    if (purchasesError != null) {
                        lVar2.invoke(purchasesError);
                    } else {
                        lVar.invoke(body);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmazonBackend$getAmazonReceiptData$call$1(AmazonBackend amazonBackend, String str, String str2, List<String> list) {
        super(0);
        this.this$0 = amazonBackend;
        this.$storeUserID = str;
        this.$receiptId = str2;
        this.$cacheKey = list;
    }

    @Override // p6.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.backendHelper.performRequest(new Endpoint.GetAmazonReceipt(this.$storeUserID, this.$receiptId), null, null, Delay.NONE, new AnonymousClass1(this.this$0, this.$cacheKey), new AnonymousClass2(this.this$0, this.$cacheKey));
    }
}

package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.strings.AttributionStrings;
import e6.i0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.x;
import p6.q;

/* JADX INFO: loaded from: classes.dex */
final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2 extends r implements q<PurchasesError, Boolean, List<? extends SubscriberAttributeError>, i0> {
    final /* synthetic */ p6.a<i0> $completion;
    final /* synthetic */ x $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, x xVar, p6.a<i0> aVar, int i8) {
        super(3);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentSyncedAttributeCount = xVar;
        this.$completion = aVar;
        this.$unsyncedStoredAttributesCount = i8;
    }

    @Override // p6.q
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool, List<? extends SubscriberAttributeError> list) {
        invoke(purchasesError, bool.booleanValue(), (List<SubscriberAttributeError>) list);
        return i0.f21430a;
    }

    public final void invoke(PurchasesError error, boolean z7, List<SubscriberAttributeError> attributeErrors) {
        kotlin.jvm.internal.q.f(error, "error");
        kotlin.jvm.internal.q.f(attributeErrors, "attributeErrors");
        if (z7) {
            this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, attributeErrors);
        }
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(AttributionStrings.ATTRIBUTES_SYNC_ERROR, Arrays.copyOf(new Object[]{this.$syncingAppUserID, error}, 2));
        kotlin.jvm.internal.q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        x xVar = this.$currentSyncedAttributeCount;
        int i8 = xVar.f24324a + 1;
        xVar.f24324a = i8;
        p6.a<i0> aVar = this.$completion;
        if (aVar == null || i8 != this.$unsyncedStoredAttributesCount) {
            return;
        }
        aVar.invoke();
    }
}

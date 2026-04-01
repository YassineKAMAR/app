package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.AttributionStrings;
import e6.i0;
import f6.o;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.x;

/* JADX INFO: loaded from: classes.dex */
final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 extends r implements p6.a<i0> {
    final /* synthetic */ p6.a<i0> $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ x $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, x xVar, p6.a<i0> aVar, int i8) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = xVar;
        this.$completion = aVar;
        this.$unsyncedStoredAttributesCount = i8;
    }

    @Override // p6.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, o.d());
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        String str = String.format(AttributionStrings.ATTRIBUTES_SYNC_SUCCESS, Arrays.copyOf(new Object[]{this.$syncingAppUserID}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        if (!q.b(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
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

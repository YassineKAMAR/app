package com.revenuecat.purchases.subscriberattributes;

import e6.i0;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes.dex */
final class SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1 extends r implements p6.a<i0> {
    final /* synthetic */ p6.a<i0> $completion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(p6.a<i0> aVar) {
        super(0);
        this.$completion = aVar;
    }

    @Override // p6.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$completion.invoke();
    }
}

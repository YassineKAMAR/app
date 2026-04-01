package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import e6.i0;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes.dex */
final class CustomerInfoUpdateHandler$notifyListeners$2$2 extends r implements p6.a<i0> {
    final /* synthetic */ CustomerInfo $customerInfo;
    final /* synthetic */ UpdatedCustomerInfoListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfoUpdateHandler$notifyListeners$2$2(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    @Override // p6.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$listener.onReceived(this.$customerInfo);
    }
}

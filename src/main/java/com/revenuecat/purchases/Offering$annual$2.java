package com.revenuecat.purchases;

import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes.dex */
final class Offering$annual$2 extends r implements p6.a<Package> {
    final /* synthetic */ Offering this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Offering$annual$2(Offering offering) {
        super(0);
        this.this$0 = offering;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p6.a
    public final Package invoke() {
        return this.this$0.findPackage(PackageType.ANNUAL);
    }
}

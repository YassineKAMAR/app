package com.revenuecat.purchases.common;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDateProvider implements DateProvider {
    @Override // com.revenuecat.purchases.common.DateProvider
    public Date getNow() {
        return new Date();
    }
}

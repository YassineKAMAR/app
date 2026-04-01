package com.revenuecat.purchases.models;

import com.revenuecat.purchases.models.Period;
import e6.x;
import f6.k0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriptionOptionsKt {
    private static final int DAYS_IN_DAY = 1;
    private static final int DAYS_IN_WEEK = 7;
    private static final int DAYS_IN_MONTH = 30;
    private static final int DAYS_IN_YEAR = 365;
    private static final Map<Period.Unit, Integer> DAYS_IN_UNIT = k0.g(x.a(Period.Unit.DAY, 1), x.a(Period.Unit.WEEK, 7), x.a(Period.Unit.MONTH, Integer.valueOf(DAYS_IN_MONTH)), x.a(Period.Unit.YEAR, Integer.valueOf(DAYS_IN_YEAR)));
}

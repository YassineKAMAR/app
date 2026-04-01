package com.revenuecat.purchases.models;

import com.revenuecat.purchases.models.Period;
import e6.r;
import w6.h;
import w6.j;

/* JADX INFO: loaded from: classes.dex */
public final class PeriodKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final r<Integer, Period.Unit> toPeriod(String str) {
        h hVarA = new j("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$").a(str);
        if (hVarA == null) {
            return new r<>(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        h.b bVarA = hVarA.a();
        String str2 = bVarA.a().b().get(1);
        String str3 = bVarA.a().b().get(2);
        String str4 = bVarA.a().b().get(3);
        String str5 = bVarA.a().b().get(4);
        int iIntValue = periodKt$toPeriod$1$toInt$1.invoke(str2).intValue();
        int iIntValue2 = periodKt$toPeriod$1$toInt$1.invoke(str3).intValue();
        int iIntValue3 = periodKt$toPeriod$1$toInt$1.invoke(str4).intValue();
        int iIntValue4 = periodKt$toPeriod$1$toInt$1.invoke(str5).intValue();
        return iIntValue > 0 ? new r<>(Integer.valueOf(iIntValue), Period.Unit.YEAR) : iIntValue2 > 0 ? new r<>(Integer.valueOf(iIntValue2), Period.Unit.MONTH) : iIntValue3 > 0 ? new r<>(Integer.valueOf(iIntValue3), Period.Unit.WEEK) : iIntValue4 > 0 ? new r<>(Integer.valueOf(iIntValue4), Period.Unit.DAY) : new r<>(0, Period.Unit.UNKNOWN);
    }
}

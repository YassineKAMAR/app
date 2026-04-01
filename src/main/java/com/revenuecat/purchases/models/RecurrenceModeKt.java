package com.revenuecat.purchases.models;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class RecurrenceModeKt {
    public static final RecurrenceMode toRecurrenceMode(Integer num) {
        RecurrenceMode recurrenceMode;
        RecurrenceMode[] recurrenceModeArrValues = RecurrenceMode.values();
        int length = recurrenceModeArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                recurrenceMode = null;
                break;
            }
            recurrenceMode = recurrenceModeArrValues[i8];
            if (q.b(recurrenceMode.getIdentifier(), num)) {
                break;
            }
            i8++;
        }
        return recurrenceMode == null ? RecurrenceMode.UNKNOWN : recurrenceMode;
    }
}

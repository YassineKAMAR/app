package com.revenuecat.purchases.common.caching;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.ReceiptStrings;
import java.util.Arrays;
import java.util.Date;
import kotlin.jvm.internal.q;
import x6.a;
import x6.c;
import x6.d;

/* JADX INFO: loaded from: classes.dex */
public final class DateExtensionsKt {
    private static final long CACHE_REFRESH_PERIOD_IN_BACKGROUND;
    private static final long CACHE_REFRESH_PERIOD_IN_FOREGROUND;

    static {
        a.C0190a c0190a = a.f27324b;
        CACHE_REFRESH_PERIOD_IN_FOREGROUND = c.s(5, d.f27335f);
        CACHE_REFRESH_PERIOD_IN_BACKGROUND = c.s(25, d.f27336g);
    }

    public static final boolean isCacheStale(Date date, boolean z7, DateProvider dateProvider) {
        q.f(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(ReceiptStrings.CHECKING_IF_CACHE_STALE, Arrays.copyOf(new Object[]{Boolean.valueOf(z7)}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        return m13isCacheStale8Mi8wO0(date, z7 ? CACHE_REFRESH_PERIOD_IN_BACKGROUND : CACHE_REFRESH_PERIOD_IN_FOREGROUND, dateProvider);
    }

    public static /* synthetic */ boolean isCacheStale$default(Date date, boolean z7, DateProvider dateProvider, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return isCacheStale(date, z7, dateProvider);
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0, reason: not valid java name */
    public static final boolean m13isCacheStale8Mi8wO0(Date date, long j8, DateProvider dateProvider) {
        q.f(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        a.C0190a c0190a = a.f27324b;
        return a.i(c.t(dateProvider.getNow().getTime() - date.getTime(), d.f27333d), j8) >= 0;
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ boolean m14isCacheStale8Mi8wO0$default(Date date, long j8, DateProvider dateProvider, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return m13isCacheStale8Mi8wO0(date, j8, dateProvider);
    }
}

package com.revenuecat.purchases.utils;

import java.util.Date;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import x6.a;
import x6.c;
import x6.d;

/* JADX INFO: loaded from: classes.dex */
public final class DateHelper {
    public static final Companion Companion = new Companion(null);
    private static final long ENTITLEMENT_GRACE_PERIOD;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA$default, reason: not valid java name */
        public static /* synthetic */ DateActive m19isDateActiveSxA4cEA$default(Companion companion, Date date, Date date2, long j8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                j8 = DateHelper.ENTITLEMENT_GRACE_PERIOD;
            }
            return companion.m20isDateActiveSxA4cEA(date, date2, j8);
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA, reason: not valid java name */
        public final DateActive m20isDateActiveSxA4cEA(Date date, Date requestDate, long j8) {
            q.f(requestDate, "requestDate");
            if (date == null) {
                return new DateActive(true, true);
            }
            boolean z7 = new Date().getTime() - requestDate.getTime() <= x6.a.u(j8);
            if (!z7) {
                requestDate = new Date();
            }
            return new DateActive(date.after(requestDate), z7);
        }
    }

    static {
        a.C0190a c0190a = x6.a.f27324b;
        ENTITLEMENT_GRACE_PERIOD = c.s(3, d.f27337h);
    }

    private DateHelper() {
    }
}

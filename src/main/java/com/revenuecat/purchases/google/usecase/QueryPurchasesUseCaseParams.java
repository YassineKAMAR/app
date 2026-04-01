package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class QueryPurchasesUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;

    public QueryPurchasesUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z7) {
        q.f(dateProvider, "dateProvider");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.appInBackground = z7;
    }

    public /* synthetic */ QueryPurchasesUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z7, int i8, j jVar) {
        this((i8 & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, z7);
    }

    public static /* synthetic */ QueryPurchasesUseCaseParams copy$default(QueryPurchasesUseCaseParams queryPurchasesUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            dateProvider = queryPurchasesUseCaseParams.dateProvider;
        }
        if ((i8 & 2) != 0) {
            diagnosticsTracker = queryPurchasesUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i8 & 4) != 0) {
            z7 = queryPurchasesUseCaseParams.getAppInBackground();
        }
        return queryPurchasesUseCaseParams.copy(dateProvider, diagnosticsTracker, z7);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final boolean component3() {
        return getAppInBackground();
    }

    public final QueryPurchasesUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z7) {
        q.f(dateProvider, "dateProvider");
        return new QueryPurchasesUseCaseParams(dateProvider, diagnosticsTracker, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPurchasesUseCaseParams)) {
            return false;
        }
        QueryPurchasesUseCaseParams queryPurchasesUseCaseParams = (QueryPurchasesUseCaseParams) obj;
        return q.b(this.dateProvider, queryPurchasesUseCaseParams.dateProvider) && q.b(this.diagnosticsTrackerIfEnabled, queryPurchasesUseCaseParams.diagnosticsTrackerIfEnabled) && getAppInBackground() == queryPurchasesUseCaseParams.getAppInBackground();
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int iHashCode2 = (iHashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31;
        boolean appInBackground = getAppInBackground();
        ?? r12 = appInBackground;
        if (appInBackground) {
            r12 = 1;
        }
        return iHashCode2 + r12;
    }

    public String toString() {
        return "QueryPurchasesUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", appInBackground=" + getAppInBackground() + ')';
    }
}

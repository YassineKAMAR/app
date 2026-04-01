package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class QueryProductDetailsUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Set<String> productIds;
    private final ProductType productType;

    public QueryProductDetailsUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set<String> productIds, ProductType productType, boolean z7) {
        q.f(dateProvider, "dateProvider");
        q.f(productIds, "productIds");
        q.f(productType, "productType");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.productIds = productIds;
        this.productType = productType;
        this.appInBackground = z7;
    }

    public /* synthetic */ QueryProductDetailsUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z7, int i8, j jVar) {
        this((i8 & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, set, productType, z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryProductDetailsUseCaseParams copy$default(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            dateProvider = queryProductDetailsUseCaseParams.dateProvider;
        }
        if ((i8 & 2) != 0) {
            diagnosticsTracker = queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        DiagnosticsTracker diagnosticsTracker2 = diagnosticsTracker;
        if ((i8 & 4) != 0) {
            set = queryProductDetailsUseCaseParams.productIds;
        }
        Set set2 = set;
        if ((i8 & 8) != 0) {
            productType = queryProductDetailsUseCaseParams.productType;
        }
        ProductType productType2 = productType;
        if ((i8 & 16) != 0) {
            z7 = queryProductDetailsUseCaseParams.getAppInBackground();
        }
        return queryProductDetailsUseCaseParams.copy(dateProvider, diagnosticsTracker2, set2, productType2, z7);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final Set<String> component3() {
        return this.productIds;
    }

    public final ProductType component4() {
        return this.productType;
    }

    public final boolean component5() {
        return getAppInBackground();
    }

    public final QueryProductDetailsUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set<String> productIds, ProductType productType, boolean z7) {
        q.f(dateProvider, "dateProvider");
        q.f(productIds, "productIds");
        q.f(productType, "productType");
        return new QueryProductDetailsUseCaseParams(dateProvider, diagnosticsTracker, productIds, productType, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryProductDetailsUseCaseParams)) {
            return false;
        }
        QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams = (QueryProductDetailsUseCaseParams) obj;
        return q.b(this.dateProvider, queryProductDetailsUseCaseParams.dateProvider) && q.b(this.diagnosticsTrackerIfEnabled, queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled) && q.b(this.productIds, queryProductDetailsUseCaseParams.productIds) && this.productType == queryProductDetailsUseCaseParams.productType && getAppInBackground() == queryProductDetailsUseCaseParams.getAppInBackground();
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

    public final Set<String> getProductIds() {
        return this.productIds;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int iHashCode2 = (((((iHashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31) + this.productIds.hashCode()) * 31) + this.productType.hashCode()) * 31;
        boolean appInBackground = getAppInBackground();
        ?? r12 = appInBackground;
        if (appInBackground) {
            r12 = 1;
        }
        return iHashCode2 + r12;
    }

    public String toString() {
        return "QueryProductDetailsUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", productIds=" + this.productIds + ", productType=" + this.productType + ", appInBackground=" + getAppInBackground() + ')';
    }
}

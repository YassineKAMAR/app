package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import f6.k0;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class QueryPurchasesUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final l<PurchasesError, i0> onError;
    private final l<Map<String, StoreTransaction>, i0> onSuccess;
    private final QueryPurchasesUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<com.android.billingclient.api.b, i0> {

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00931 extends r implements l<Map<String, ? extends StoreTransaction>, i0> {
            final /* synthetic */ QueryPurchasesUseCase this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase$executeAsync$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00941 extends r implements l<Map<String, ? extends StoreTransaction>, i0> {
                final /* synthetic */ Map<String, StoreTransaction> $activeSubs;
                final /* synthetic */ QueryPurchasesUseCase this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00941(QueryPurchasesUseCase queryPurchasesUseCase, Map<String, StoreTransaction> map) {
                    super(1);
                    this.this$0 = queryPurchasesUseCase;
                    this.$activeSubs = map;
                }

                @Override // p6.l
                public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
                    invoke2((Map<String, StoreTransaction>) map);
                    return i0.f21430a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, StoreTransaction> unconsumedInApps) {
                    q.f(unconsumedInApps, "unconsumedInApps");
                    this.this$0.onOk2(k0.j(this.$activeSubs, unconsumedInApps));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00931(QueryPurchasesUseCase queryPurchasesUseCase) {
                super(1);
                this.this$0 = queryPurchasesUseCase;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
                invoke2((Map<String, StoreTransaction>) map);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, StoreTransaction> activeSubs) {
                q.f(activeSubs, "activeSubs");
                QueryPurchasesUseCase queryPurchasesUseCase = this.this$0;
                queryPurchasesUseCase.queryInApps(new C00941(queryPurchasesUseCase, activeSubs), this.this$0.getOnError());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.b bVar) {
            invoke2(bVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.b invoke) {
            q.f(invoke, "$this$invoke");
            QueryPurchasesUseCase queryPurchasesUseCase = QueryPurchasesUseCase.this;
            queryPurchasesUseCase.querySubscriptions(new C00931(queryPurchasesUseCase), QueryPurchasesUseCase.this.getOnError());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryPurchasesUseCase(QueryPurchasesUseCaseParams useCaseParams, l<? super Map<String, StoreTransaction>, i0> onSuccess, l<? super PurchasesError, i0> onError, l<? super l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient, p<? super Long, ? super l<? super PurchasesError, i0>, i0> executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        q.f(useCaseParams, "useCaseParams");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        q.f(withConnectedClient, "withConnectedClient");
        q.f(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onSuccess = onSuccess;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryInApps(l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "inapp"), lVar, lVar2, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void querySubscriptions(l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "subs"), lVar, lVar2, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<Map<String, StoreTransaction>, i0> getOnSuccess() {
        return this.onSuccess;
    }

    public final l<l<? super com.android.billingclient.api.b, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(Map<String, ? extends StoreTransaction> map) {
        onOk2((Map<String, StoreTransaction>) map);
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(Map<String, StoreTransaction> received) {
        q.f(received, "received");
        this.onSuccess.invoke(received);
    }
}

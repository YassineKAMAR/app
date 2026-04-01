package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import e6.i0;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class CustomerInfoHelper {
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final Handler handler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            try {
                iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements p6.a<i0> {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$callback.onReceived(this.$cachedCustomerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$2, reason: invalid class name */
    static final class AnonymousClass2 extends r implements p6.a<i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$error = purchasesError;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$callback.onError(this.$error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$1, reason: invalid class name and case insensitive filesystem */
    static final class C02021 extends r implements p6.a<i0> {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02021(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            if (receiveCustomerInfoCallback != null) {
                receiveCustomerInfoCallback.onReceived(this.$cachedCustomerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1, reason: invalid class name and case insensitive filesystem */
    static final class C02031 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00771 extends r implements p6.a<i0> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00771(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$info = customerInfo;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$info);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02031(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo info) {
            q.f(info, "info");
            LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_NETWORK);
            CustomerInfoHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            CustomerInfoHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(info);
            CustomerInfoHelper.this.dispatch(new C00771(this.$callback, info));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2, reason: invalid class name and case insensitive filesystem */
    static final class C02042 extends r implements p<PurchasesError, Boolean, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends r implements l<CustomerInfo, i0> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00781 extends r implements p6.a<i0> {
                final /* synthetic */ ReceiveCustomerInfoCallback $callback;
                final /* synthetic */ CustomerInfo $offlineComputedCustomerInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00781(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                    super(0);
                    this.$callback = receiveCustomerInfoCallback;
                    this.$offlineComputedCustomerInfo = customerInfo;
                }

                @Override // p6.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f21430a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                    if (receiveCustomerInfoCallback != null) {
                        receiveCustomerInfoCallback.onReceived(this.$offlineComputedCustomerInfo);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = receiveCustomerInfoCallback;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo offlineComputedCustomerInfo) {
                q.f(offlineComputedCustomerInfo, "offlineComputedCustomerInfo");
                this.this$0.customerInfoUpdateHandler.notifyListeners(offlineComputedCustomerInfo);
                this.this$0.dispatch(new C00781(this.$callback, offlineComputedCustomerInfo));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2, reason: invalid class name and collision with other inner class name */
        static final class C00792 extends r implements l<PurchasesError, i0> {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends r implements p6.a<i0> {
                final /* synthetic */ PurchasesError $backendError;
                final /* synthetic */ ReceiveCustomerInfoCallback $callback;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                    super(0);
                    this.$callback = receiveCustomerInfoCallback;
                    this.$backendError = purchasesError;
                }

                @Override // p6.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f21430a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                    if (receiveCustomerInfoCallback != null) {
                        receiveCustomerInfoCallback.onError(this.$backendError);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00792(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = receiveCustomerInfoCallback;
                this.$backendError = purchasesError;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                q.f(it, "it");
                this.this$0.dispatch(new AnonymousClass1(this.$callback, this.$backendError));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends r implements p6.a<i0> {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$backendError = purchasesError;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02042(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(2);
            this.$appUserID = str;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
            invoke(purchasesError, bool.booleanValue());
            return i0.f21430a;
        }

        public final void invoke(PurchasesError backendError, boolean z7) {
            q.f(backendError, "backendError");
            String str = String.format(CustomerInfoStrings.ERROR_FETCHING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{backendError}, 1));
            q.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            CustomerInfoHelper.this.deviceCache.clearCustomerInfoCacheTimestamp(this.$appUserID);
            if (CustomerInfoHelper.this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z7, this.$appUserID)) {
                CustomerInfoHelper.this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(this.$appUserID, new AnonymousClass1(CustomerInfoHelper.this, this.$callback), new C00792(CustomerInfoHelper.this, this.$callback, backendError));
            } else {
                CustomerInfoHelper.this.dispatch(new AnonymousClass3(this.$callback, backendError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1, reason: invalid class name and case insensitive filesystem */
    static final class C02051 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02051(String str, boolean z7, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z7;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2, reason: invalid class name and case insensitive filesystem */
    static final class C02062 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends r implements p6.a<i0> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$customerInfo);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02062(String str, boolean z7, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z7;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            if (customerInfo == null) {
                CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
            } else {
                LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_SYNCING_PENDING_PURCHASES);
                CustomerInfoHelper.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
            }
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler) {
        q.f(deviceCache, "deviceCache");
        q.f(backend, "backend");
        q.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        q.f(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        q.f(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        q.f(handler, "handler");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.handler = handler;
    }

    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler, int i8, j jVar) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, (i8 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final p6.a<i0> aVar) {
        if (q.b(Thread.currentThread(), this.handler.getLooper().getThread())) {
            aVar.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: com.revenuecat.purchases.a
                @Override // java.lang.Runnable
                public final void run() {
                    CustomerInfoHelper.dispatch$lambda$0(aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(p6.a tmp0) {
        q.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo(str) : offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        p6.a<i0> anonymousClass2;
        if (receiveCustomerInfoCallback == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            anonymousClass2 = new AnonymousClass1(receiveCustomerInfoCallback, cachedCustomerInfo);
        } else {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            LogUtilsKt.errorLog(purchasesError);
            anonymousClass2 = new AnonymousClass2(receiveCustomerInfoCallback, purchasesError);
        }
        dispatch(anonymousClass2);
    }

    static /* synthetic */ void getCustomerInfoCacheOnly$default(CustomerInfoHelper customerInfoHelper, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoCachedOrFetched(String str, boolean z7, boolean z8, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo == null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.NO_CACHED_CUSTOMERINFO);
            postPendingPurchasesAndFetchCustomerInfo(str, z7, z8, receiveCustomerInfoCallback);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new C02021(receiveCustomerInfoCallback, cachedCustomerInfo));
            updateCachedCustomerInfoIfStale(str, z7, z8);
        }
    }

    static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z7, boolean z8, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z7, z8, receiveCustomerInfoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getCustomerInfoFetchOnly(String str, boolean z7, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow(str);
        this.backend.getCustomerInfo(str, z7, new C02031(receiveCustomerInfoCallback), new C02042(str, receiveCustomerInfoCallback));
    }

    static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z7, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z7, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String str, boolean z7, boolean z8, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        if (this.deviceCache.isCustomerInfoCacheStale(str, z7)) {
            postPendingPurchasesAndFetchCustomerInfo(str, z7, z8, receiveCustomerInfoCallback);
        } else {
            getCustomerInfoCachedOrFetched(str, z7, z8, receiveCustomerInfoCallback);
        }
    }

    static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z7, boolean z8, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z7, z8, receiveCustomerInfoCallback);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String str, boolean z7, boolean z8, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(z8, new C02051(str, z7, receiveCustomerInfoCallback), new C02062(str, z7, receiveCustomerInfoCallback));
    }

    static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z7, boolean z8, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z7, z8, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z7, boolean z8, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z7, z8, receiveCustomerInfoCallback);
    }

    private final void updateCachedCustomerInfoIfStale(String str, boolean z7, boolean z8) {
        if (this.deviceCache.isCustomerInfoCacheStale(str, z7)) {
            LogWrapperKt.log(LogIntent.DEBUG, z7 ? CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_BACKGROUND : CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            postPendingPurchasesAndFetchCustomerInfo$default(this, str, z7, z8, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(String appUserID, CacheFetchPolicy fetchPolicy, boolean z7, boolean z8, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        q.f(appUserID, "appUserID");
        q.f(fetchPolicy, "fetchPolicy");
        String str = String.format(CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{fetchPolicy}, 1));
        q.e(str, "format(this, *args)");
        LogUtilsKt.debugLog(str);
        int i8 = WhenMappings.$EnumSwitchMapping$0[fetchPolicy.ordinal()];
        if (i8 == 1) {
            getCustomerInfoCacheOnly(appUserID, receiveCustomerInfoCallback);
            return;
        }
        if (i8 == 2) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, z7, z8, receiveCustomerInfoCallback);
        } else if (i8 == 3) {
            getCustomerInfoCachedOrFetched(appUserID, z7, z8, receiveCustomerInfoCallback);
        } else {
            if (i8 != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(appUserID, z7, z8, receiveCustomerInfoCallback);
        }
    }
}

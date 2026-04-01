package com.revenuecat.purchases.common.offerings;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import e6.i0;
import f6.p0;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONObject;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class OfferingsManager {
    private final Backend backend;
    private final Handler mainHandler;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            q.f(error, "error");
            OfferingsManager.this.handleErrorFetchingOfferings(error, this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2, reason: invalid class name */
    static final class AnonymousClass2 extends r implements l<Offerings, i0> {
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$2, reason: invalid class name and collision with other inner class name */
        static final class C00902 extends r implements p6.a<i0> {
            final /* synthetic */ Offerings $offerings;
            final /* synthetic */ l<Offerings, i0> $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00902(l<? super Offerings, i0> lVar, Offerings offerings) {
                super(0);
                this.$onSuccess = lVar;
                this.$offerings = offerings;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                l<Offerings, i0> lVar = this.$onSuccess;
                if (lVar != null) {
                    lVar.invoke(this.$offerings);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(JSONObject jSONObject, l<? super Offerings, i0> lVar) {
            super(1);
            this.$offeringsJSON = jSONObject;
            this.$onSuccess = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings offerings) {
            q.f(offerings, "offerings");
            Offering current = offerings.getCurrent();
            if (current != null) {
                OfferingsManager.this.offeringImagePreDownloader.preDownloadOfferingImages(current);
            }
            OfferingsManager.this.offeringsCache.cacheOfferings(offerings, this.$offeringsJSON);
            OfferingsManager.this.dispatch(new C00902(this.$onSuccess, offerings));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C02521 extends r implements l<JSONObject, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02521(l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject it) {
            q.f(it, "it");
            OfferingsManager.this.createAndCacheOfferings(it, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$2, reason: invalid class name and case insensitive filesystem */
    static final class C02532 extends r implements p<PurchasesError, Boolean, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02532(l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
            super(2);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
            invoke(purchasesError, bool.booleanValue());
            return i0.f21430a;
        }

        public final void invoke(PurchasesError backendError, boolean z7) {
            JSONObject cachedOfferingsResponse;
            q.f(backendError, "backendError");
            if (!z7 || (cachedOfferingsResponse = OfferingsManager.this.offeringsCache.getCachedOfferingsResponse()) == null) {
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
            } else {
                LogUtilsKt.warnLog(OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
                OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, this.$onError, this.$onSuccess);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C02541 extends r implements p6.a<i0> {
        final /* synthetic */ Offerings $cachedOfferings;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02541(l<? super Offerings, i0> lVar, Offerings offerings) {
            super(0);
            this.$onSuccess = lVar;
            this.$cachedOfferings = offerings;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            l<Offerings, i0> lVar = this.$onSuccess;
            if (lVar != null) {
                lVar.invoke(this.$cachedOfferings);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C02551 extends r implements p6.a<i0> {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02551(l<? super PurchasesError, i0> lVar, PurchasesError purchasesError) {
            super(0);
            this.$onError = lVar;
            this.$error = purchasesError;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            l<PurchasesError, i0> lVar = this.$onError;
            if (lVar != null) {
                lVar.invoke(this.$error);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler) {
        q.f(offeringsCache, "offeringsCache");
        q.f(backend, "backend");
        q.f(offeringsFactory, "offeringsFactory");
        q.f(offeringImagePreDownloader, "offeringImagePreDownloader");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.mainHandler = handler;
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler, int i8, j jVar) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, (i8 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndCacheOfferings(JSONObject jSONObject, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
        this.offeringsFactory.createOfferings(jSONObject, new AnonymousClass1(lVar), new AnonymousClass2(jSONObject, lVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        if ((i8 & 4) != 0) {
            lVar2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final p6.a<i0> aVar) {
        if (q.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.common.offerings.c
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsManager.dispatch$lambda$0(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(p6.a tmp0) {
        q.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z7, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        if ((i8 & 8) != 0) {
            lVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z7, lVar, lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z7, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        if ((i8 & 8) != 0) {
            lVar2 = null;
        }
        offeringsManager.getOfferings(str, z7, lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(PurchasesError purchasesError, l<? super PurchasesError, i0> lVar) {
        LogIntent logIntent = p0.d(PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError).contains(purchasesError.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        String str = String.format(OfferingStrings.FETCHING_OFFERINGS_ERROR, Arrays.copyOf(new Object[]{purchasesError}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.offeringsCache.clearOfferingsCacheTimestamp();
        dispatch(new C02551(lVar, purchasesError));
    }

    public final void fetchAndCacheOfferings(String appUserID, boolean z7, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
        q.f(appUserID, "appUserID");
        LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_START_UPDATE_FROM_NETWORK);
        this.backend.getOfferings(appUserID, z7, new C02521(lVar, lVar2), new C02532(lVar, lVar2));
    }

    public final void getOfferings(String appUserID, boolean z7, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
        q.f(appUserID, "appUserID");
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(appUserID, z7, lVar, lVar2);
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, OfferingStrings.VENDING_OFFERINGS_CACHE);
        dispatch(new C02541(lVar2, cachedOfferings));
        if (this.offeringsCache.isOfferingsCacheStale(z7)) {
            LogWrapperKt.log(logIntent, z7 ? OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND : OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, appUserID, z7, null, null, 12, null);
        }
    }

    public final void onAppForeground(String appUserID) {
        q.f(appUserID, "appUserID");
        if (this.offeringsCache.isOfferingsCacheStale(false)) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }
}

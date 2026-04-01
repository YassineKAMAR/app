package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import e6.i0;
import e6.r;
import e6.x;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class CustomerInfoUpdateHandler {
    private final AppConfig appConfig;
    private final DeviceCache deviceCache;
    private final Handler handler;
    private final IdentityManager identityManager;
    private CustomerInfo lastSentCustomerInfo;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private UpdatedCustomerInfoListener updatedCustomerInfoListener;

    public CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, Handler handler) {
        q.f(deviceCache, "deviceCache");
        q.f(identityManager, "identityManager");
        q.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        q.f(appConfig, "appConfig");
        q.f(handler, "handler");
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.appConfig = appConfig;
        this.handler = handler;
    }

    public /* synthetic */ CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, Handler handler, int i8, j jVar) {
        this(deviceCache, identityManager, offlineEntitlementsManager, appConfig, (i8 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    private final void afterSetListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        CustomerInfo cachedCustomerInfo;
        if (updatedCustomerInfoListener != null) {
            LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.LISTENER_SET);
            if (this.appConfig.getCustomEntitlementComputation() || (cachedCustomerInfo = getCachedCustomerInfo(this.identityManager.getCurrentAppUserID())) == null) {
                return;
            }
            notifyListeners(cachedCustomerInfo);
        }
    }

    private final void dispatch(final p6.a<i0> aVar) {
        if (q.b(Thread.currentThread(), this.handler.getLooper().getThread())) {
            aVar.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: com.revenuecat.purchases.b
                @Override // java.lang.Runnable
                public final void run() {
                    CustomerInfoUpdateHandler.dispatch$lambda$5(aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$5(p6.a tmp0) {
        q.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo(str) : offlineCustomerInfo;
    }

    public final void cacheAndNotifyListeners(CustomerInfo customerInfo) {
        q.f(customerInfo, "customerInfo");
        this.deviceCache.cacheCustomerInfo(this.identityManager.getCurrentAppUserID(), customerInfo);
        notifyListeners(customerInfo);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.updatedCustomerInfoListener;
    }

    public final void notifyListeners(CustomerInfo customerInfo) {
        r rVarA;
        LogIntent logIntent;
        String str;
        q.f(customerInfo, "customerInfo");
        synchronized (this) {
            rVarA = x.a(this.updatedCustomerInfoListener, this.lastSentCustomerInfo);
        }
        UpdatedCustomerInfoListener updatedCustomerInfoListener = (UpdatedCustomerInfoListener) rVarA.a();
        CustomerInfo customerInfo2 = (CustomerInfo) rVarA.b();
        if (updatedCustomerInfoListener == null || q.b(customerInfo2, customerInfo)) {
            return;
        }
        if (customerInfo2 != null) {
            logIntent = LogIntent.DEBUG;
            str = CustomerInfoStrings.CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER;
        } else {
            logIntent = LogIntent.DEBUG;
            str = CustomerInfoStrings.SENDING_LATEST_CUSTOMERINFO_TO_LISTENER;
        }
        LogWrapperKt.log(logIntent, str);
        synchronized (this) {
            this.lastSentCustomerInfo = customerInfo;
            i0 i0Var = i0.f21430a;
        }
        dispatch(new CustomerInfoUpdateHandler$notifyListeners$2$2(updatedCustomerInfoListener, customerInfo));
    }

    public final void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        synchronized (this) {
            this.updatedCustomerInfoListener = updatedCustomerInfoListener;
            i0 i0Var = i0.f21430a;
        }
        afterSetListener(updatedCustomerInfoListener);
    }
}

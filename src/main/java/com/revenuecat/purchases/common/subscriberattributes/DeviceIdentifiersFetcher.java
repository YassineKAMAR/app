package com.revenuecat.purchases.common.subscriberattributes;

import android.app.Application;
import e6.i0;
import java.util.Map;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public interface DeviceIdentifiersFetcher {
    void getDeviceIdentifiers(Application application, l<? super Map<String, String>, i0> lVar);
}

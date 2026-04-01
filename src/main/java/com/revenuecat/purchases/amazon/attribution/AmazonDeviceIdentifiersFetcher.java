package com.revenuecat.purchases.amazon.attribution;

import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import e6.i0;
import e6.x;
import f6.k0;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application applicationContext, l<? super Map<String, String>, i0> completion) {
        ContentResolver contentResolver;
        q.f(applicationContext, "applicationContext");
        q.f(completion, "completion");
        try {
            contentResolver = applicationContext.getContentResolver();
        } catch (Settings.SettingNotFoundException e8) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str = String.format(AttributionStrings.AMAZON_COULD_NOT_GET_ADID, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
        String string = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0 ? Settings.Secure.getString(contentResolver, "advertising_id") : null;
        completion.invoke(MapExtensionsKt.filterNotNullValues(k0.g(x.a(SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID.INSTANCE.getBackendKey(), string), x.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), b.ac))));
    }
}

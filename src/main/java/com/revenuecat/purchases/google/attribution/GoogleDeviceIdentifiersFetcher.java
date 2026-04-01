package com.revenuecat.purchases.google.attribution;

import android.annotation.SuppressLint;
import android.app.Application;
import android.provider.Settings;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import d2.a;
import e6.i0;
import e6.x;
import f6.k0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.q;
import p6.l;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue;

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        q.f(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";
    }

    private final String getAdvertisingID(Application application) {
        LogIntent logIntent;
        String str;
        try {
            a.C0100a c0100aA = a.a(application);
            if (!c0100aA.b()) {
                if (!q.b(c0100aA.a(), this.noPermissionAdvertisingIdValue)) {
                    return c0100aA.a();
                }
                LogWrapperKt.log(LogIntent.WARNING, AttributionStrings.GOOGLE_PLAY_ADVERTISING_ID_NOT_AVAILABLE);
            }
        } catch (IOException e8) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } catch (NullPointerException e9) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e9.getLocalizedMessage()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } catch (TimeoutException e10) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } catch (g e11) {
            logIntent = LogIntent.GOOGLE_ERROR;
            str = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e11.getLocalizedMessage()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
        return null;
    }

    @SuppressLint({"HardwareIds"})
    private final String getAndroidID(Application application) {
        return Settings.Secure.getString(application.getContentResolver(), "android_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher this$0, Application applicationContext, l completion) {
        q.f(this$0, "this$0");
        q.f(applicationContext, "$applicationContext");
        q.f(completion, "$completion");
        completion.invoke(MapExtensionsKt.filterNotNullValues(k0.g(x.a(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), this$0.getAdvertisingID(applicationContext)), x.a(SubscriberAttributeKey.DeviceIdentifiers.AndroidID.INSTANCE.getBackendKey(), this$0.getAndroidID(applicationContext)), x.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), b.ac))));
    }

    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(final Application applicationContext, final l<? super Map<String, String>, i0> completion) {
        q.f(applicationContext, "applicationContext");
        q.f(completion, "completion");
        Dispatcher.enqueue$default(this.dispatcher, new Runnable() { // from class: z4.a
            @Override // java.lang.Runnable
            public final void run() {
                GoogleDeviceIdentifiersFetcher.getDeviceIdentifiers$lambda$0(this.f27753a, applicationContext, completion);
            }
        }, null, 2, null);
    }
}

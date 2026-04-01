package com.google.android.gms.measurement;

import a3.o;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.measurement.internal.w5;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3.c0;
import p3.q;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f19751b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19752a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            o.j(bundle);
            this.mAppId = (String) q.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) q.a(bundle, "origin", String.class, null);
            this.mName = (String) q.a(bundle, "name", String.class, null);
            this.mValue = q.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) q.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) q.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) q.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) q.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) q.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) q.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) q.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) q.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) q.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) q.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) q.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) q.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a implements c0 {
        private a() {
        }
    }

    private AppMeasurement(w5 w5Var) {
        this.f19752a = new com.google.android.gms.measurement.a(w5Var);
    }

    private AppMeasurement(c0 c0Var) {
        this.f19752a = new c(c0Var);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f19751b == null) {
            synchronized (AppMeasurement.class) {
                if (f19751b == null) {
                    c0 c0VarB = b(context, null);
                    if (c0VarB != null) {
                        f19751b = new AppMeasurement(c0VarB);
                    } else {
                        f19751b = new AppMeasurement(w5.a(context, new e2(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f19751b;
    }

    private static c0 b(Context context, Bundle bundle) {
        return (c0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f19752a.c(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f19752a.b(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f19752a.e(str);
    }

    @Keep
    public long generateEventId() {
        return this.f19752a.j();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f19752a.n();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listD = this.f19752a.d(str, str2);
        ArrayList arrayList = new ArrayList(listD == null ? 0 : listD.size());
        Iterator<Bundle> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f19752a.q();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f19752a.o();
    }

    @Keep
    public String getGmpAppId() {
        return this.f19752a.r();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f19752a.a(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z7) {
        return this.f19752a.g(str, str2, z7);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f19752a.h(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        o.j(conditionalUserProperty);
        a aVar = this.f19752a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            q.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.f(bundle);
    }
}

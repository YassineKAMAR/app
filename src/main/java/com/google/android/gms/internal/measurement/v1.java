package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface v1 extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(w1 w1Var);

    void getAppInstanceId(w1 w1Var);

    void getCachedAppInstanceId(w1 w1Var);

    void getConditionalUserProperties(String str, String str2, w1 w1Var);

    void getCurrentScreenClass(w1 w1Var);

    void getCurrentScreenName(w1 w1Var);

    void getGmpAppId(w1 w1Var);

    void getMaxUserProperties(String str, w1 w1Var);

    void getSessionId(w1 w1Var);

    void getTestFlag(w1 w1Var, int i8);

    void getUserProperties(String str, String str2, boolean z7, w1 w1Var);

    void initForTests(Map map);

    void initialize(g3.a aVar, e2 e2Var, long j8);

    void isDataCollectionEnabled(w1 w1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, w1 w1Var, long j8);

    void logHealthData(int i8, String str, g3.a aVar, g3.a aVar2, g3.a aVar3);

    void onActivityCreated(g3.a aVar, Bundle bundle, long j8);

    void onActivityDestroyed(g3.a aVar, long j8);

    void onActivityPaused(g3.a aVar, long j8);

    void onActivityResumed(g3.a aVar, long j8);

    void onActivitySaveInstanceState(g3.a aVar, w1 w1Var, long j8);

    void onActivityStarted(g3.a aVar, long j8);

    void onActivityStopped(g3.a aVar, long j8);

    void performAction(Bundle bundle, w1 w1Var, long j8);

    void registerOnMeasurementEventListener(b2 b2Var);

    void resetAnalyticsData(long j8);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(g3.a aVar, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z7);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(b2 b2Var);

    void setInstanceIdProvider(c2 c2Var);

    void setMeasurementEnabled(boolean z7, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, g3.a aVar, boolean z7, long j8);

    void unregisterOnMeasurementEventListener(b2 b2Var);
}

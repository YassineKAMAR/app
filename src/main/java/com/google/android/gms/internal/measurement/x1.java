package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends w0 implements v1 {
    x1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void beginAdUnitExposure(String str, long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeLong(j8);
        H0(23, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        y0.d(parcelK0, bundle);
        H0(9, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void clearMeasurementEnabled(long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeLong(j8);
        H0(43, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void endAdUnitExposure(String str, long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeLong(j8);
        H0(24, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void generateEventId(w1 w1Var) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, w1Var);
        H0(22, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getAppInstanceId(w1 w1Var) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, w1Var);
        H0(20, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getCachedAppInstanceId(w1 w1Var) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, w1Var);
        H0(19, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getConditionalUserProperties(String str, String str2, w1 w1Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        y0.c(parcelK0, w1Var);
        H0(10, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getCurrentScreenClass(w1 w1Var) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, w1Var);
        H0(17, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getCurrentScreenName(w1 w1Var) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, w1Var);
        H0(16, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getGmpAppId(w1 w1Var) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, w1Var);
        H0(21, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getMaxUserProperties(String str, w1 w1Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        y0.c(parcelK0, w1Var);
        H0(6, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getSessionId(w1 w1Var) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, w1Var);
        H0(46, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void getUserProperties(String str, String str2, boolean z7, w1 w1Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        y0.e(parcelK0, z7);
        y0.c(parcelK0, w1Var);
        H0(5, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void initialize(g3.a aVar, e2 e2Var, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        y0.d(parcelK0, e2Var);
        parcelK0.writeLong(j8);
        H0(1, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        y0.d(parcelK0, bundle);
        y0.e(parcelK0, z7);
        y0.e(parcelK0, z8);
        parcelK0.writeLong(j8);
        H0(2, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void logHealthData(int i8, String str, g3.a aVar, g3.a aVar2, g3.a aVar3) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeString(str);
        y0.c(parcelK0, aVar);
        y0.c(parcelK0, aVar2);
        y0.c(parcelK0, aVar3);
        H0(33, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityCreated(g3.a aVar, Bundle bundle, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        y0.d(parcelK0, bundle);
        parcelK0.writeLong(j8);
        H0(27, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityDestroyed(g3.a aVar, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        parcelK0.writeLong(j8);
        H0(28, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityPaused(g3.a aVar, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        parcelK0.writeLong(j8);
        H0(29, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityResumed(g3.a aVar, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        parcelK0.writeLong(j8);
        H0(30, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivitySaveInstanceState(g3.a aVar, w1 w1Var, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        y0.c(parcelK0, w1Var);
        parcelK0.writeLong(j8);
        H0(31, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityStarted(g3.a aVar, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        parcelK0.writeLong(j8);
        H0(25, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void onActivityStopped(g3.a aVar, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        parcelK0.writeLong(j8);
        H0(26, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void performAction(Bundle bundle, w1 w1Var, long j8) {
        Parcel parcelK0 = k0();
        y0.d(parcelK0, bundle);
        y0.c(parcelK0, w1Var);
        parcelK0.writeLong(j8);
        H0(32, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void resetAnalyticsData(long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeLong(j8);
        H0(12, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setConditionalUserProperty(Bundle bundle, long j8) {
        Parcel parcelK0 = k0();
        y0.d(parcelK0, bundle);
        parcelK0.writeLong(j8);
        H0(8, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setConsent(Bundle bundle, long j8) {
        Parcel parcelK0 = k0();
        y0.d(parcelK0, bundle);
        parcelK0.writeLong(j8);
        H0(44, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setConsentThirdParty(Bundle bundle, long j8) {
        Parcel parcelK0 = k0();
        y0.d(parcelK0, bundle);
        parcelK0.writeLong(j8);
        H0(45, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setCurrentScreen(g3.a aVar, String str, String str2, long j8) {
        Parcel parcelK0 = k0();
        y0.c(parcelK0, aVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeLong(j8);
        H0(15, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setDataCollectionEnabled(boolean z7) {
        Parcel parcelK0 = k0();
        y0.e(parcelK0, z7);
        H0(39, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelK0 = k0();
        y0.d(parcelK0, bundle);
        H0(42, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setMeasurementEnabled(boolean z7, long j8) {
        Parcel parcelK0 = k0();
        y0.e(parcelK0, z7);
        parcelK0.writeLong(j8);
        H0(11, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setSessionTimeoutDuration(long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeLong(j8);
        H0(14, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setUserId(String str, long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeLong(j8);
        H0(7, parcelK0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public final void setUserProperty(String str, String str2, g3.a aVar, boolean z7, long j8) {
        Parcel parcelK0 = k0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        y0.c(parcelK0, aVar);
        y0.e(parcelK0, z7);
        parcelK0.writeLong(j8);
        H0(4, parcelK0);
    }
}

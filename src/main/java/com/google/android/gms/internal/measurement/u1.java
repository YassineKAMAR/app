package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1 extends z0 implements v1 {
    public u1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static v1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof v1 ? (v1) iInterfaceQueryLocalInterface : new x1(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.z0
    protected final boolean k0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        w1 y1Var;
        w1 y1Var2 = null;
        w1 y1Var3 = null;
        w1 y1Var4 = null;
        w1 y1Var5 = null;
        b2 d2Var = null;
        b2 d2Var2 = null;
        b2 d2Var3 = null;
        w1 y1Var6 = null;
        w1 y1Var7 = null;
        w1 y1Var8 = null;
        w1 y1Var9 = null;
        w1 y1Var10 = null;
        w1 y1Var11 = null;
        c2 f2Var = null;
        w1 y1Var12 = null;
        w1 y1Var13 = null;
        w1 y1Var14 = null;
        w1 y1Var15 = null;
        switch (i8) {
            case 1:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                e2 e2Var = (e2) y0.a(parcel, e2.CREATOR);
                long j8 = parcel.readLong();
                y0.f(parcel);
                initialize(aVarV0, e2Var, j8);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) y0.a(parcel, Bundle.CREATOR);
                boolean zH = y0.h(parcel);
                boolean zH2 = y0.h(parcel);
                long j9 = parcel.readLong();
                y0.f(parcel);
                logEvent(string, string2, bundle, zH, zH2, j9);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    y1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var = iInterfaceQueryLocalInterface instanceof w1 ? (w1) iInterfaceQueryLocalInterface : new y1(strongBinder);
                }
                long j10 = parcel.readLong();
                y0.f(parcel);
                logEventAndBundle(string3, string4, bundle2, y1Var, j10);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                boolean zH3 = y0.h(parcel);
                long j11 = parcel.readLong();
                y0.f(parcel);
                setUserProperty(string5, string6, aVarV02, zH3, j11);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zH4 = y0.h(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var2 = iInterfaceQueryLocalInterface2 instanceof w1 ? (w1) iInterfaceQueryLocalInterface2 : new y1(strongBinder2);
                }
                y0.f(parcel);
                getUserProperties(string7, string8, zH4, y1Var2);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var15 = iInterfaceQueryLocalInterface3 instanceof w1 ? (w1) iInterfaceQueryLocalInterface3 : new y1(strongBinder3);
                }
                y0.f(parcel);
                getMaxUserProperties(string9, y1Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j12 = parcel.readLong();
                y0.f(parcel);
                setUserId(string10, j12);
                break;
            case 8:
                Bundle bundle3 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                long j13 = parcel.readLong();
                y0.f(parcel);
                setConditionalUserProperty(bundle3, j13);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                y0.f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var14 = iInterfaceQueryLocalInterface4 instanceof w1 ? (w1) iInterfaceQueryLocalInterface4 : new y1(strongBinder4);
                }
                y0.f(parcel);
                getConditionalUserProperties(string13, string14, y1Var14);
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                boolean zH5 = y0.h(parcel);
                long j14 = parcel.readLong();
                y0.f(parcel);
                setMeasurementEnabled(zH5, j14);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                long j15 = parcel.readLong();
                y0.f(parcel);
                resetAnalyticsData(j15);
                break;
            case 13:
                long j16 = parcel.readLong();
                y0.f(parcel);
                setMinimumSessionDuration(j16);
                break;
            case 14:
                long j17 = parcel.readLong();
                y0.f(parcel);
                setSessionTimeoutDuration(j17);
                break;
            case 15:
                g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j18 = parcel.readLong();
                y0.f(parcel);
                setCurrentScreen(aVarV03, string15, string16, j18);
                break;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var13 = iInterfaceQueryLocalInterface5 instanceof w1 ? (w1) iInterfaceQueryLocalInterface5 : new y1(strongBinder5);
                }
                y0.f(parcel);
                getCurrentScreenName(y1Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var12 = iInterfaceQueryLocalInterface6 instanceof w1 ? (w1) iInterfaceQueryLocalInterface6 : new y1(strongBinder6);
                }
                y0.f(parcel);
                getCurrentScreenClass(y1Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    f2Var = iInterfaceQueryLocalInterface7 instanceof c2 ? (c2) iInterfaceQueryLocalInterface7 : new f2(strongBinder7);
                }
                y0.f(parcel);
                setInstanceIdProvider(f2Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var11 = iInterfaceQueryLocalInterface8 instanceof w1 ? (w1) iInterfaceQueryLocalInterface8 : new y1(strongBinder8);
                }
                y0.f(parcel);
                getCachedAppInstanceId(y1Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var10 = iInterfaceQueryLocalInterface9 instanceof w1 ? (w1) iInterfaceQueryLocalInterface9 : new y1(strongBinder9);
                }
                y0.f(parcel);
                getAppInstanceId(y1Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var9 = iInterfaceQueryLocalInterface10 instanceof w1 ? (w1) iInterfaceQueryLocalInterface10 : new y1(strongBinder10);
                }
                y0.f(parcel);
                getGmpAppId(y1Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var8 = iInterfaceQueryLocalInterface11 instanceof w1 ? (w1) iInterfaceQueryLocalInterface11 : new y1(strongBinder11);
                }
                y0.f(parcel);
                generateEventId(y1Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j19 = parcel.readLong();
                y0.f(parcel);
                beginAdUnitExposure(string17, j19);
                break;
            case 24:
                String string18 = parcel.readString();
                long j20 = parcel.readLong();
                y0.f(parcel);
                endAdUnitExposure(string18, j20);
                break;
            case 25:
                g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                long j21 = parcel.readLong();
                y0.f(parcel);
                onActivityStarted(aVarV04, j21);
                break;
            case 26:
                g3.a aVarV05 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                y0.f(parcel);
                onActivityStopped(aVarV05, j22);
                break;
            case 27:
                g3.a aVarV06 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                y0.f(parcel);
                onActivityCreated(aVarV06, bundle5, j23);
                break;
            case 28:
                g3.a aVarV07 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                y0.f(parcel);
                onActivityDestroyed(aVarV07, j24);
                break;
            case 29:
                g3.a aVarV08 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                y0.f(parcel);
                onActivityPaused(aVarV08, j25);
                break;
            case 30:
                g3.a aVarV09 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                y0.f(parcel);
                onActivityResumed(aVarV09, j26);
                break;
            case 31:
                g3.a aVarV010 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var7 = iInterfaceQueryLocalInterface12 instanceof w1 ? (w1) iInterfaceQueryLocalInterface12 : new y1(strongBinder12);
                }
                long j27 = parcel.readLong();
                y0.f(parcel);
                onActivitySaveInstanceState(aVarV010, y1Var7, j27);
                break;
            case com.amazon.c.a.a.c.f4053h /* 32 */:
                Bundle bundle6 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var6 = iInterfaceQueryLocalInterface13 instanceof w1 ? (w1) iInterfaceQueryLocalInterface13 : new y1(strongBinder13);
                }
                long j28 = parcel.readLong();
                y0.f(parcel);
                performAction(bundle6, y1Var6, j28);
                break;
            case 33:
                int i10 = parcel.readInt();
                String string19 = parcel.readString();
                g3.a aVarV011 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g3.a aVarV012 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g3.a aVarV013 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                y0.f(parcel);
                logHealthData(i10, string19, aVarV011, aVarV012, aVarV013);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    d2Var3 = iInterfaceQueryLocalInterface14 instanceof b2 ? (b2) iInterfaceQueryLocalInterface14 : new d2(strongBinder14);
                }
                y0.f(parcel);
                setEventInterceptor(d2Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    d2Var2 = iInterfaceQueryLocalInterface15 instanceof b2 ? (b2) iInterfaceQueryLocalInterface15 : new d2(strongBinder15);
                }
                y0.f(parcel);
                registerOnMeasurementEventListener(d2Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    d2Var = iInterfaceQueryLocalInterface16 instanceof b2 ? (b2) iInterfaceQueryLocalInterface16 : new d2(strongBinder16);
                }
                y0.f(parcel);
                unregisterOnMeasurementEventListener(d2Var);
                break;
            case 37:
                HashMap mapB = y0.b(parcel);
                y0.f(parcel);
                initForTests(mapB);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var5 = iInterfaceQueryLocalInterface17 instanceof w1 ? (w1) iInterfaceQueryLocalInterface17 : new y1(strongBinder17);
                }
                int i11 = parcel.readInt();
                y0.f(parcel);
                getTestFlag(y1Var5, i11);
                break;
            case 39:
                boolean zH6 = y0.h(parcel);
                y0.f(parcel);
                setDataCollectionEnabled(zH6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var4 = iInterfaceQueryLocalInterface18 instanceof w1 ? (w1) iInterfaceQueryLocalInterface18 : new y1(strongBinder18);
                }
                y0.f(parcel);
                isDataCollectionEnabled(y1Var4);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                y0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j29 = parcel.readLong();
                y0.f(parcel);
                clearMeasurementEnabled(j29);
                break;
            case 44:
                Bundle bundle8 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                long j30 = parcel.readLong();
                y0.f(parcel);
                setConsent(bundle8, j30);
                break;
            case 45:
                Bundle bundle9 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                y0.f(parcel);
                setConsentThirdParty(bundle9, j31);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    y1Var3 = iInterfaceQueryLocalInterface19 instanceof w1 ? (w1) iInterfaceQueryLocalInterface19 : new y1(strongBinder19);
                }
                y0.f(parcel);
                getSessionId(y1Var3);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

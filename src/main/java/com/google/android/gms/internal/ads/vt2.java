package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class vt2 {
    public static h2.z2 a(Throwable th) {
        if (th instanceof b32) {
            b32 b32Var = (b32) th;
            return c(b32Var.a(), b32Var.b());
        }
        if (th instanceof gu1) {
            return th.getMessage() == null ? d(((gu1) th).a(), null, null) : d(((gu1) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof j2.c0)) {
            return d(1, null, null);
        }
        j2.c0 c0Var = (j2.c0) th;
        return new h2.z2(c0Var.a(), b93.c(c0Var.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static h2.z2 b(Throwable th, c32 c32Var) {
        h2.z2 z2Var;
        h2.z2 z2VarA = a(th);
        int i8 = z2VarA.f22383a;
        if ((i8 == 3 || i8 == 0) && (z2Var = z2VarA.f22386d) != null && !z2Var.f22385c.equals("com.google.android.gms.ads")) {
            z2VarA.f22386d = null;
        }
        if (c32Var != null) {
            z2VarA.f22387e = c32Var.b();
        }
        return z2VarA;
    }

    public static h2.z2 c(int i8, h2.z2 z2Var) {
        if (i8 == 0) {
            throw null;
        }
        if (i8 == 8) {
            if (((Integer) h2.y.c().b(ns.a8)).intValue() > 0) {
                return z2Var;
            }
            i8 = 8;
        }
        return d(i8, null, z2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static h2.z2 d(int i8, String str, h2.z2 z2Var) {
        String str2;
        String str3;
        int i9 = i8 - 1;
        if (str == null) {
            if (i8 == 0) {
                throw null;
            }
            switch (i9) {
                case 1:
                    str = "Invalid request.";
                    str2 = str;
                    break;
                case 2:
                    str2 = "No fill.";
                    break;
                case 3:
                    str = "App ID missing.";
                    str2 = str;
                    break;
                case 4:
                    str = "Network error.";
                    str2 = str;
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    str2 = str;
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    str2 = str;
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    str2 = str;
                    break;
                case 8:
                    str = "The ad is not ready.";
                    str2 = str;
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    str2 = str;
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    str = "The ad can not be shown when app is not in foreground.";
                    str2 = str;
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                default:
                    str = "Internal error.";
                    str2 = str;
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    if (((Integer) h2.y.c().b(ns.d8)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        str2 = str;
                    }
                    str2 = "No fill.";
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    str2 = str;
                    break;
                case 14:
                    str = "Invalid ad string.";
                    str2 = str;
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    str2 = str;
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    str = "Ad inspector failed to load.";
                    str2 = str;
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    str2 = str;
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    str2 = str;
                    break;
            }
        } else {
            str2 = str;
        }
        if (i8 == 0) {
            throw null;
        }
        int i10 = 3;
        switch (i9) {
            case 0:
            case R.styleable.GradientColor_android_endY /* 11 */:
            case 15:
                i10 = 0;
                break;
            case 1:
            case 5:
            case 6:
            case 9:
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                i10 = 1;
                break;
            case 2:
            case R.styleable.GradientColor_android_endX /* 10 */:
            case 18:
                break;
            case 3:
                i10 = 8;
                break;
            case 4:
            case 8:
            case 17:
                i10 = 2;
                break;
            case 7:
                i10 = 4;
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (((Integer) h2.y.c().b(ns.d8)).intValue() <= 0) {
                    i10 = 9;
                }
                break;
            case 13:
                i10 = 10;
                break;
            case 14:
                i10 = 11;
                break;
            default:
                switch (i8) {
                    case 1:
                        str3 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str3 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str3 = "NO_FILL";
                        break;
                    case 4:
                        str3 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str3 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str3 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str3 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str3 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str3 = "NOT_READY";
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        str3 = "AD_REUSED";
                        break;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        str3 = "APP_NOT_FOREGROUND";
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        str3 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str3 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str3 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str3 = "INVALID_AD_STRING";
                        break;
                    case com.amazon.c.a.a.c.f4052g /* 16 */:
                        str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str3 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str3));
        }
        return new h2.z2(i10, str2, "com.google.android.gms.ads", z2Var, null);
    }
}

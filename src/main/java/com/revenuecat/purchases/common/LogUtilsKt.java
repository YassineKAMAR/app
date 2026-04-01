package com.revenuecat.purchases.common;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import e6.i0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class LogUtilsKt {
    private static final String PURCHASES_LOG_TAG = "[Purchases]";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesErrorCode.values().length];
            try {
                iArr[PurchasesErrorCode.UnknownError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesErrorCode.NetworkError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchasesErrorCode.ReceiptAlreadyInUseError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchasesErrorCode.UnexpectedBackendResponseError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidAppUserIdError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchasesErrorCode.OperationAlreadyInProgressError.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchasesErrorCode.UnknownBackendError.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PurchasesErrorCode.LogOutWithAnonymousUserError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PurchasesErrorCode.ConfigurationError.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PurchasesErrorCode.UnsupportedError.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PurchasesErrorCode.EmptySubscriberAttributesError.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PurchasesErrorCode.CustomerInfoError.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PurchasesErrorCode.SignatureVerificationError.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidSubscriberAttributesError.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseCancelledError.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PurchasesErrorCode.StoreProblemError.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseNotAllowedError.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PurchasesErrorCode.PurchaseInvalidError.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PurchasesErrorCode.ProductNotAvailableForPurchaseError.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PurchasesErrorCode.ProductAlreadyPurchasedError.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidReceiptError.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PurchasesErrorCode.MissingReceiptFileError.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidAppleSubscriptionKeyError.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PurchasesErrorCode.IneligibleError.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[PurchasesErrorCode.InsufficientPermissionsError.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[PurchasesErrorCode.PaymentPendingError.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[PurchasesErrorCode.InvalidCredentialsError.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.LogUtilsKt$debugLog$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends o implements p<String, String, i0> {
        AnonymousClass1(Object obj) {
            super(2, obj, LogHandler.class, "d", "d(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(String str, String str2) {
            invoke2(str, str2);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p02, String p12) {
            q.f(p02, "p0");
            q.f(p12, "p1");
            ((LogHandler) this.receiver).d(p02, p12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.LogUtilsKt$infoLog$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02441 extends o implements p<String, String, i0> {
        C02441(Object obj) {
            super(2, obj, LogHandler.class, "i", "i(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(String str, String str2) {
            invoke2(str, str2);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p02, String p12) {
            q.f(p02, "p0");
            q.f(p12, "p1");
            ((LogHandler) this.receiver).i(p02, p12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.LogUtilsKt$verboseLog$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02451 extends o implements p<String, String, i0> {
        C02451(Object obj) {
            super(2, obj, LogHandler.class, "v", "v(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(String str, String str2) {
            invoke2(str, str2);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p02, String p12) {
            q.f(p02, "p0");
            q.f(p12, "p1");
            ((LogHandler) this.receiver).v(p02, p12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.LogUtilsKt$warnLog$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02461 extends o implements p<String, String, i0> {
        C02461(Object obj) {
            super(2, obj, LogHandler.class, "w", "w(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(String str, String str2) {
            invoke2(str, str2);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p02, String p12) {
            q.f(p02, "p0");
            q.f(p12, "p1");
            ((LogHandler) this.receiver).w(p02, p12);
        }
    }

    public static final void debugLog(String message) {
        q.f(message, "message");
        logIfEnabled(LogLevel.DEBUG, new AnonymousClass1(LogWrapperKt.getCurrentLogHandler()), message);
    }

    public static final LogLevel debugLogsEnabled(LogLevel.Companion companion, boolean z7) {
        q.f(companion, "<this>");
        return z7 ? LogLevel.DEBUG : LogLevel.INFO;
    }

    public static final void errorLog(PurchasesError error) {
        LogIntent logIntent;
        q.f(error, "error");
        switch (WhenMappings.$EnumSwitchMapping$0[error.getCode().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case R.styleable.GradientColor_android_endX /* 10 */:
            case R.styleable.GradientColor_android_endY /* 11 */:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
                logIntent = LogIntent.RC_ERROR;
                break;
            case 15:
            case com.amazon.c.a.a.c.f4052g /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                logIntent = LogIntent.GOOGLE_ERROR;
                break;
            default:
                return;
        }
        LogWrapperKt.log(logIntent, error.toString());
    }

    public static final void errorLog(String message, Throwable th) {
        q.f(message, "message");
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", message, th);
    }

    public static /* synthetic */ void errorLog$default(String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        errorLog(str, th);
    }

    public static final boolean getDebugLogsEnabled(LogLevel logLevel) {
        q.f(logLevel, "<this>");
        return logLevel.compareTo(LogLevel.DEBUG) <= 0;
    }

    public static final void infoLog(String message) {
        q.f(message, "message");
        logIfEnabled(LogLevel.INFO, new C02441(LogWrapperKt.getCurrentLogHandler()), message);
    }

    private static final void logIfEnabled(LogLevel logLevel, p<? super String, ? super String, i0> pVar, String str) {
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            pVar.invoke("[Purchases] - " + logLevel.name(), str);
        }
    }

    public static final void verboseLog(String message) {
        q.f(message, "message");
        logIfEnabled(LogLevel.VERBOSE, new C02451(LogWrapperKt.getCurrentLogHandler()), message);
    }

    public static final void warnLog(String message) {
        q.f(message, "message");
        logIfEnabled(LogLevel.WARN, new C02461(LogWrapperKt.getCurrentLogHandler()), message);
    }
}

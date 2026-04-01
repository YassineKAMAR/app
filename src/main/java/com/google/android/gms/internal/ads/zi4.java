package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class zi4 implements fi4 {
    protected zi4(yi4 yi4Var) {
    }

    protected static int a(int i8, int i9, int i10) {
        return td3.a(((((long) i8) * ((long) i9)) * ((long) i10)) / 1000000);
    }

    protected static int b(int i8) {
        switch (i8) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return 100000;
            case R.styleable.GradientColor_android_endY /* 11 */:
                return 16000;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}

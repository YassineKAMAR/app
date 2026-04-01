package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
final class z64 implements e14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e14 f18049a = new z64();

    private z64() {
    }

    @Override // com.google.android.gms.internal.ads.e14
    public final boolean b(int i8) {
        switch (i8) {
            case 0:
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
                return true;
            default:
                return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
final class i64 implements e14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e14 f9084a = new i64();

    private i64() {
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
                return true;
            default:
                return false;
        }
    }
}

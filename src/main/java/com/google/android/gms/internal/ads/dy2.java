package com.google.android.gms.internal.ads;

import android.content.Context;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy2 {
    public static ey2 a(Context context, int i8) {
        ut utVar;
        if (ty2.a()) {
            int i9 = i8 - 2;
            if (i9 != 20 && i9 != 21) {
                switch (i9) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        utVar = bu.f6041c;
                        break;
                    case 4:
                    case 9:
                    case R.styleable.GradientColor_android_endX /* 10 */:
                    case R.styleable.GradientColor_android_endY /* 11 */:
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    case 13:
                        utVar = bu.f6042d;
                        break;
                    case 5:
                        utVar = bu.f6040b;
                        break;
                }
            } else {
                utVar = bu.f6043e;
            }
            if (((Boolean) utVar.e()).booleanValue()) {
                return new gy2(context, i8);
            }
        }
        return new cz2();
    }

    public static ey2 b(Context context, int i8, int i9, h2.r4 r4Var) {
        ey2 ey2VarA = a(context, i8);
        if (!(ey2VarA instanceof gy2)) {
            return ey2VarA;
        }
        ey2VarA.o();
        ey2VarA.a(i9);
        if (py2.e(r4Var.f22267p)) {
            ey2VarA.b(r4Var.f22267p);
        }
        return ey2VarA;
    }
}

package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
final class t34 {
    static String a(rz3 rz3Var) {
        String str;
        StringBuilder sb = new StringBuilder(rz3Var.n());
        for (int i8 = 0; i8 < rz3Var.n(); i8++) {
            int iE = rz3Var.e(i8);
            if (iE == 34) {
                str = "\\\"";
            } else if (iE == 39) {
                str = "\\'";
            } else if (iE != 92) {
                switch (iE) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        str = "\\n";
                        break;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        str = "\\v";
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iE < 32 || iE > 126) {
                            sb.append('\\');
                            sb.append((char) (((iE >>> 6) & 3) + 48));
                            sb.append((char) (((iE >>> 3) & 7) + 48));
                            iE = (iE & 7) + 48;
                        }
                        sb.append((char) iE);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}

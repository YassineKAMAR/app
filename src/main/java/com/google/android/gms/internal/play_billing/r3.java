package com.google.android.gms.internal.play_billing;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
final class r3 {
    static String a(n0 n0Var) {
        String str;
        StringBuilder sb = new StringBuilder(n0Var.g());
        for (int i8 = 0; i8 < n0Var.g(); i8++) {
            int iA = n0Var.a(i8);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
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
                        if (iA < 32 || iA > 126) {
                            sb.append('\\');
                            sb.append((char) (((iA >>> 6) & 3) + 48));
                            sb.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb.append((char) iA);
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

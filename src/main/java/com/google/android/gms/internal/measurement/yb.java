package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
final class yb {
    static String a(o7 o7Var) {
        String str;
        xb xbVar = new xb(o7Var);
        StringBuilder sb = new StringBuilder(xbVar.j());
        for (int i8 = 0; i8 < xbVar.j(); i8++) {
            int iB = xbVar.b(i8);
            if (iB == 34) {
                str = "\\\"";
            } else if (iB == 39) {
                str = "\\'";
            } else if (iB != 92) {
                switch (iB) {
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
                        if (iB < 32 || iB > 126) {
                            sb.append('\\');
                            sb.append((char) (((iB >>> 6) & 3) + 48));
                            sb.append((char) (((iB >>> 3) & 7) + 48));
                            iB = (iB & 7) + 48;
                        }
                        sb.append((char) iB);
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

package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f19138a;

    static {
        char[] cArr = new char[80];
        f19138a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(ma maVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(maVar, sb, 0);
        return sb.toString();
    }

    private static void b(int i8, StringBuilder sb) {
        while (i8 > 0) {
            char[] cArr = f19138a;
            int length = i8 > cArr.length ? cArr.length : i8;
            sb.append(cArr, 0, length);
            i8 -= length;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(com.google.android.gms.internal.measurement.ma r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.c(com.google.android.gms.internal.measurement.ma, java.lang.StringBuilder, int):void");
    }

    static void d(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i8, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i9 = 1; i9 < str.length(); i9++) {
                char cCharAt = str.charAt(i9);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(yb.a(o7.p((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof o7) {
            sb.append(": \"");
            sb.append(yb.a((o7) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof y8) {
            sb.append(" {");
            c((y8) obj, sb, i8 + 2);
            sb.append("\n");
            b(i8, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i10 = i8 + 2;
        d(sb, i10, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        d(sb, i10, "value", entry.getValue());
        sb.append("\n");
        b(i8, sb);
        sb.append("}");
    }
}

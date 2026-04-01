package com.google.android.gms.internal.play_billing;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f19674a;

    static {
        char[] cArr = new char[80];
        f19674a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(r2 r2Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(r2Var, sb, 0);
        return sb.toString();
    }

    static void b(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i8, sb);
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
            sb.append(r3.a(new k0(((String) obj).getBytes(s1.f19669b))));
            sb.append('\"');
            return;
        }
        if (obj instanceof n0) {
            sb.append(": \"");
            sb.append(r3.a((n0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof n1) {
            sb.append(" {");
            d((n1) obj, sb, i8 + 2);
            sb.append("\n");
            c(i8, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i10 = i8 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i10, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        b(sb, i10, "value", entry.getValue());
        sb.append("\n");
        c(i8, sb);
        sb.append("}");
    }

    private static void c(int i8, StringBuilder sb) {
        while (i8 > 0) {
            int i9 = 80;
            if (i8 <= 80) {
                i9 = i8;
            }
            sb.append(f19674a, 0, i9);
            i8 -= i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(com.google.android.gms.internal.play_billing.r2 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.t2.d(com.google.android.gms.internal.play_billing.r2, java.lang.StringBuilder, int):void");
    }
}

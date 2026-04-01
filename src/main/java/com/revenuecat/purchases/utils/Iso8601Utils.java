package com.revenuecat.purchases.utils;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i8, char c8) {
        return i8 < str.length() && str.charAt(i8) == c8;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i8) {
        while (i8 < str.length()) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < '0' || cCharAt > '9') {
                return i8;
            }
            i8++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i8, int i9) {
        String string = Integer.toString(i8);
        for (int length = i9 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01a0, IndexOutOfBoundsException -> 0x01a2, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01a0, blocks: (B:3:0x0004, B:6:0x0011, B:8:0x001d, B:9:0x001f, B:11:0x002e, B:13:0x0034, B:17:0x0045, B:19:0x0055, B:20:0x0057, B:22:0x0063, B:23:0x0065, B:25:0x006b, B:29:0x0075, B:34:0x0085, B:36:0x008d, B:41:0x00cc, B:43:0x00d2, B:45:0x00d8, B:65:0x0166, B:50:0x00e3, B:51:0x00fe, B:52:0x00ff, B:54:0x010b, B:57:0x0114, B:59:0x0133, B:62:0x0142, B:63:0x0164, B:67:0x0198, B:68:0x019f), top: B:74:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01a0, IndexOutOfBoundsException -> 0x01a2, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01a0, blocks: (B:3:0x0004, B:6:0x0011, B:8:0x001d, B:9:0x001f, B:11:0x002e, B:13:0x0034, B:17:0x0045, B:19:0x0055, B:20:0x0057, B:22:0x0063, B:23:0x0065, B:25:0x006b, B:29:0x0075, B:34:0x0085, B:36:0x008d, B:41:0x00cc, B:43:0x00d2, B:45:0x00d8, B:65:0x0166, B:50:0x00e3, B:51:0x00fe, B:52:0x00ff, B:54:0x010b, B:57:0x0114, B:59:0x0133, B:62:0x0142, B:63:0x0164, B:67:0x0198, B:68:0x019f), top: B:74:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01a0, IndexOutOfBoundsException -> 0x01a2, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01a0, blocks: (B:3:0x0004, B:6:0x0011, B:8:0x001d, B:9:0x001f, B:11:0x002e, B:13:0x0034, B:17:0x0045, B:19:0x0055, B:20:0x0057, B:22:0x0063, B:23:0x0065, B:25:0x006b, B:29:0x0075, B:34:0x0085, B:36:0x008d, B:41:0x00cc, B:43:0x00d2, B:45:0x00d8, B:65:0x0166, B:50:0x00e3, B:51:0x00fe, B:52:0x00ff, B:54:0x010b, B:57:0x0114, B:59:0x0133, B:62:0x0142, B:63:0x0164, B:67:0x0198, B:68:0x019f), top: B:74:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.utils.Iso8601Utils.parse(java.lang.String):java.util.Date");
    }

    private static int parseInt(String str, int i8, int i9) {
        int i10;
        int i11;
        if (i8 < 0 || i9 > str.length() || i8 > i9) {
            throw new NumberFormatException(str);
        }
        if (i8 < i9) {
            i10 = i8 + 1;
            int iDigit = Character.digit(str.charAt(i8), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
            }
            i11 = -iDigit;
        } else {
            i10 = i8;
            i11 = 0;
        }
        while (i10 < i9) {
            int i12 = i10 + 1;
            int iDigit2 = Character.digit(str.charAt(i10), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
            }
            i11 = (i11 * 10) - iDigit2;
            i10 = i12;
        }
        return -i11;
    }
}

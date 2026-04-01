package x4;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f27303a = TimeZone.getTimeZone("UTC");

    public static String a(Date date) {
        return b(date, false, f27303a);
    }

    public static String b(Date date, boolean z7, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z7 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        c(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        c(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        c(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        c(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        c(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        c(sb, gregorianCalendar.get(13), 2);
        if (z7) {
            sb.append('.');
            c(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i8 = offset / 60000;
            int iAbs = Math.abs(i8 / 60);
            int iAbs2 = Math.abs(i8 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            c(sb, iAbs, 2);
            sb.append(':');
            c(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    private static void c(StringBuilder sb, int i8, int i9) {
        String string = Integer.toString(i8);
        for (int length = i9 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }
}

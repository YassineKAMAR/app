package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class sc {
    public static long a(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e8) {
            if ("0".equals(str) || "-1".equals(str)) {
                gc.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            gc.c(e8, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static cb b(qb qbVar) {
        boolean z7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = qbVar.f13386c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i8 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(com.amazon.a.a.o.b.f.f3942a, 0);
            int i9 = 0;
            j8 = 0;
            j9 = 0;
            while (i8 < strArrSplit.length) {
                String strTrim = strArrSplit[i8].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j9 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j8 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i9 = 1;
                }
                i8++;
            }
            i8 = i9;
            z7 = true;
        } else {
            z7 = false;
            j8 = 0;
            j9 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA2 = str3 != null ? a(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z7) {
            j11 = jCurrentTimeMillis + (j9 * 1000);
            if (i8 != 0) {
                j12 = j11;
            } else {
                Long.signum(j8);
                j12 = (j8 * 1000) + j11;
            }
            j10 = j12;
        } else {
            j10 = 0;
            if (jA <= 0 || jA2 < jA) {
                j11 = 0;
            } else {
                j11 = jCurrentTimeMillis + (jA2 - jA);
                j10 = j11;
            }
        }
        cb cbVar = new cb();
        cbVar.f6263a = qbVar.f13385b;
        cbVar.f6264b = str5;
        cbVar.f6268f = j11;
        cbVar.f6267e = j10;
        cbVar.f6265c = jA;
        cbVar.f6266d = jA3;
        cbVar.f6269g = map;
        cbVar.f6270h = qbVar.f13387d;
        return cbVar;
    }

    static String c(long j8) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j8));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}

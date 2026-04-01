package h2;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z1.h[] f22179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22180b;

    public e5(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, z1.u.f27652a);
        String string = typedArrayObtainAttributes.getString(z1.u.f27653b);
        String string2 = typedArrayObtainAttributes.getString(z1.u.f27654c);
        boolean z7 = !TextUtils.isEmpty(string);
        boolean z8 = !TextUtils.isEmpty(string2);
        if (z7 && !z8) {
            this.f22179a = c(string);
        } else {
            if (z7 || !z8) {
                typedArrayObtainAttributes.recycle();
                if (!z7) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f22179a = c(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(z1.u.f27655d);
        this.f22180b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static z1.h[] c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        z1.h[] hVarArr = new z1.h[length];
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            String strTrim = strArrSplit[i8].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    hVarArr[i8] = new z1.h("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                hVarArr[i8] = z1.h.f27624i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                hVarArr[i8] = z1.h.f27626k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                hVarArr[i8] = z1.h.f27625j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                hVarArr[i8] = z1.h.f27627l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                hVarArr[i8] = z1.h.f27628m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                hVarArr[i8] = z1.h.f27630o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                hVarArr[i8] = z1.h.f27629n;
            } else if ("FLUID".equals(strTrim)) {
                hVarArr[i8] = z1.h.f27631p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                hVarArr[i8] = z1.h.f27634s;
            }
        }
        if (length != 0) {
            return hVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String a() {
        return this.f22180b;
    }

    public final z1.h[] b(boolean z7) {
        if (z7 || this.f22179a.length == 1) {
            return this.f22179a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}

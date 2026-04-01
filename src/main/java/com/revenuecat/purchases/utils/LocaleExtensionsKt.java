package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.common.LogUtilsKt;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.jvm.internal.q;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        q.f(locale, "<this>");
        String string = locale.toString();
        q.e(string, "toString()");
        return toLocale(string);
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        q.f(locale, "<this>");
        q.f(locale2, "locale");
        try {
            return q.b(locale.getISO3Language(), locale2.getISO3Language());
        } catch (MissingResourceException e8) {
            LogUtilsKt.errorLog$default("Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e8 + "). Falling back to language.", null, 2, null);
            return q.b(locale.getLanguage(), locale2.getLanguage());
        }
    }

    public static final Locale toLocale(String str) {
        q.f(str, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(v.s(str, "_", "-", false, 4, null));
        q.e(localeForLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return localeForLanguageTag;
    }
}

package t5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import r5.g;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f26506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f26507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    final g.b f26508c;

    class a implements g.b {
        a() {
        }

        @Override // r5.g.b
        public String a(String str, String str2) {
            Context contextCreateConfigurationContext = b.this.f26507b;
            if (str2 != null) {
                Locale localeB = b.b(str2);
                Configuration configuration = new Configuration(b.this.f26507b.getResources().getConfiguration());
                configuration.setLocale(localeB);
                contextCreateConfigurationContext = b.this.f26507b.createConfigurationContext(configuration);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", b.this.f26507b.getPackageName());
            if (identifier != 0) {
                return contextCreateConfigurationContext.getResources().getString(identifier);
            }
            return null;
        }
    }

    public b(Context context, g gVar) {
        a aVar = new a();
        this.f26508c = aVar;
        this.f26507b = context;
        this.f26506a = gVar;
        gVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split("-", -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i8 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i8 = 2;
        }
        if (strArrSplit.length > i8 && strArrSplit[i8].length() >= 2 && strArrSplit[i8].length() <= 3) {
            str4 = strArrSplit[i8];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f26507b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i9 = 0; i9 < size; i9++) {
                Locale locale = locales.get(i9);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale localeLookup = Locale.lookup(arrayList, list);
            if (localeLookup != null) {
                return localeLookup;
            }
        } else if (i8 >= 24) {
            LocaleList locales2 = this.f26507b.getResources().getConfiguration().getLocales();
            for (int i10 = 0; i10 < locales2.size(); i10++) {
                Locale locale2 = locales2.get(i10);
                for (Locale locale3 : list) {
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                for (Locale locale5 : list) {
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        } else {
            Locale locale6 = this.f26507b.getResources().getConfiguration().locale;
            if (locale6 != null) {
                for (Locale locale7 : list) {
                    if (locale6.equals(locale7)) {
                        return locale7;
                    }
                }
                for (Locale locale8 : list) {
                    if (locale6.getLanguage().equals(locale8.toString())) {
                        return locale8;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(locales.get(i8));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f26506a.b(arrayList);
    }
}

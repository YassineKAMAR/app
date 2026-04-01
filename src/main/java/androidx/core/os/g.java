package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class g implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Locale[] f2076c = new Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Locale f2077d = new Locale("en", "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Locale f2078e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Locale f2079f = f.b("en-Latn");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Locale[] f2080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2081b;

    g(Locale... localeArr) {
        String string;
        if (localeArr.length == 0) {
            this.f2080a = f2076c;
            string = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < localeArr.length; i8++) {
                Locale locale = localeArr[i8];
                if (locale == null) {
                    throw new NullPointerException("list[" + i8 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb, locale2);
                    if (i8 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f2080a = (Locale[]) arrayList.toArray(new Locale[0]);
            string = sb.toString();
        }
        this.f2081b = string;
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // androidx.core.os.h
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Locale[] localeArr = ((g) obj).f2080a;
        if (this.f2080a.length != localeArr.length) {
            return false;
        }
        int i8 = 0;
        while (true) {
            Locale[] localeArr2 = this.f2080a;
            if (i8 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i8].equals(localeArr[i8])) {
                return false;
            }
            i8++;
        }
    }

    @Override // androidx.core.os.h
    public Locale get(int i8) {
        if (i8 >= 0) {
            Locale[] localeArr = this.f2080a;
            if (i8 < localeArr.length) {
                return localeArr[i8];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f2080a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.h
    public int size() {
        return this.f2080a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i8 = 0;
        while (true) {
            Locale[] localeArr = this.f2080a;
            if (i8 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i8]);
            if (i8 < this.f2080a.length - 1) {
                sb.append(',');
            }
            i8++;
        }
    }
}

package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f2074b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f2075a;

    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private f(h hVar) {
        this.f2075a = hVar;
    }

    public static f a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? f(a.a(localeArr)) : new f(new g(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static f d() {
        return Build.VERSION.SDK_INT >= 24 ? f(a.c()) : a(Locale.getDefault());
    }

    public static f f(LocaleList localeList) {
        return new f(new i(localeList));
    }

    public Locale c(int i8) {
        return this.f2075a.get(i8);
    }

    public int e() {
        return this.f2075a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f2075a.equals(((f) obj).f2075a);
    }

    public int hashCode() {
        return this.f2075a.hashCode();
    }

    public String toString() {
        return this.f2075a.toString();
    }
}

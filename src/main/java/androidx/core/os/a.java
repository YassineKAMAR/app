package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f2064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f2065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f2066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f2067d;

    /* JADX INFO: renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    private static final class C0025a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f2068a = SdkExtensions.getExtensionVersion(30);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f2069b = SdkExtensions.getExtensionVersion(31);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f2070c = SdkExtensions.getExtensionVersion(33);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f2071d = SdkExtensions.getExtensionVersion(UtilsKt.MICROS_MULTIPLIER);
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        f2064a = i8 >= 30 ? C0025a.f2068a : 0;
        f2065b = i8 >= 30 ? C0025a.f2069b : 0;
        f2066c = i8 >= 30 ? C0025a.f2070c : 0;
        f2067d = i8 >= 30 ? C0025a.f2071d : 0;
    }

    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean c() {
        int i8 = Build.VERSION.SDK_INT;
        return i8 >= 31 || (i8 >= 30 && a("S", Build.VERSION.CODENAME));
    }

    public static boolean d() {
        int i8 = Build.VERSION.SDK_INT;
        return i8 >= 33 || (i8 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}

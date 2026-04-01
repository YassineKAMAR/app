package a3;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p.h<String, String> f16a = new p.h<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Locale f17b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return f3.e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(w2.b.f27097g);
    }

    public static String c(Context context, int i8) {
        return context.getResources().getString(i8 != 1 ? i8 != 2 ? i8 != 3 ? R.string.ok : w2.b.f27091a : w2.b.f27100j : w2.b.f27094d);
    }

    public static String d(Context context, int i8) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i8 == 1) {
            return resources.getString(w2.b.f27095e, strA);
        }
        if (i8 == 2) {
            return e3.i.g(context) ? resources.getString(w2.b.f27104n) : resources.getString(w2.b.f27101k, strA);
        }
        if (i8 == 3) {
            return resources.getString(w2.b.f27092b, strA);
        }
        if (i8 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i8 == 7) {
            return h(context, "common_google_play_services_network_error_text", strA);
        }
        if (i8 == 9) {
            return resources.getString(w2.b.f27099i, strA);
        }
        if (i8 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i8) {
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                return h(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(w2.b.f27103m, strA);
            default:
                return resources.getString(x2.k.f27280a, strA);
        }
    }

    public static String e(Context context, int i8) {
        return (i8 == 6 || i8 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i8);
    }

    public static String f(Context context, int i8) {
        String strI = i8 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i8);
        return strI == null ? context.getResources().getString(w2.b.f27098h) : strI;
    }

    public static String g(Context context, int i8) {
        String string;
        Resources resources = context.getResources();
        switch (i8) {
            case 1:
                return resources.getString(w2.b.f27096f);
            case 2:
                return resources.getString(w2.b.f27102l);
            case 3:
                return resources.getString(w2.b.f27093c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                string = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                string = "Google Play services is invalid. Cannot recover.";
                break;
            case com.revenuecat.purchases_flutter.R.styleable.GradientColor_android_endX /* 10 */:
                string = "Developer error occurred. Please see logs for detailed information";
                break;
            case com.revenuecat.purchases_flutter.R.styleable.GradientColor_android_endY /* 11 */:
                string = "The application is not licensed to the user.";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i8);
                string = sb.toString();
                break;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                string = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", string);
        return null;
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strI = i(context, str);
        if (strI == null) {
            strI = resources.getString(x2.k.f27280a);
        }
        return String.format(resources.getConfiguration().locale, strI, str2);
    }

    private static String i(Context context, String str) {
        p.h<String, String> hVar = f16a;
        synchronized (hVar) {
            Locale localeC = androidx.core.os.b.a(context.getResources().getConfiguration()).c(0);
            if (!localeC.equals(f17b)) {
                hVar.clear();
                f17b = localeC;
            }
            String str2 = hVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesD = x2.h.d(context);
            if (resourcesD == null) {
                return null;
            }
            int identifier = resourcesD.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = resourcesD.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            hVar.put(str, string);
            return string;
        }
    }
}

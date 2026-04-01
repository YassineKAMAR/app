package x2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f27262a = i.f27267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f27263b = new f();

    f() {
    }

    public static f f() {
        return f27263b;
    }

    public int a(Context context) {
        return i.a(context);
    }

    public Intent b(Context context, int i8, String str) {
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && e3.i.g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f27262a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(f3.e.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i8, int i9) {
        return d(context, i8, i9, null);
    }

    public PendingIntent d(Context context, int i8, int i9, String str) {
        Intent intentB = b(context, i8, str);
        if (intentB == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i9, intentB, l3.d.f24382a | 134217728);
    }

    public String e(int i8) {
        return i.b(i8);
    }

    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return h(context, f27262a);
    }

    public int h(Context context, int i8) {
        int iF = i.f(context, i8);
        if (i.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean i(Context context, String str) {
        return i.k(context, str);
    }

    public boolean j(int i8) {
        return i.i(i8);
    }
}

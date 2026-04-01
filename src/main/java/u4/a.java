package u4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import c4.b;
import m4.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f26734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f26735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26736d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f26733a = contextA;
        this.f26734b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f26735c = cVar;
        this.f26736d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f26734b.contains("firebase_data_collection_default_enabled") ? this.f26734b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f26733a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f26733a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z7) {
        if (this.f26736d != z7) {
            this.f26736d = z7;
            this.f26735c.a(new m4.a<>(b.class, new b(z7)));
        }
    }

    public synchronized boolean b() {
        return this.f26736d;
    }

    public synchronized void e(Boolean bool) {
        boolean zEquals;
        if (bool == null) {
            this.f26734b.edit().remove("firebase_data_collection_default_enabled").apply();
            zEquals = d();
        } else {
            zEquals = Boolean.TRUE.equals(bool);
            this.f26734b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
        }
        f(zEquals);
    }
}

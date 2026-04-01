package a3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f164a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f167d;

    public static int a(Context context) {
        b(context);
        return f167d;
    }

    private static void b(Context context) {
        synchronized (f164a) {
            if (f165b) {
                return;
            }
            f165b = true;
            try {
                Bundle bundle = f3.e.a(context).c(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f166c = bundle.getString("com.google.app.id");
                f167d = bundle.getInt("com.google.android.gms.version");
            } catch (PackageManager.NameNotFoundException e8) {
                Log.wtf("MetadataValueReader", "This should never happen.", e8);
            }
        }
    }
}

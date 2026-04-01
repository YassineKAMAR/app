package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.core.content.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f1843c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f1844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f1845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1846c;

        a(String[] strArr, Activity activity, int i8) {
            this.f1844a = strArr;
            this.f1845b = activity;
            this.f1846c = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f1844a.length];
            PackageManager packageManager = this.f1845b.getPackageManager();
            String packageName = this.f1845b.getPackageName();
            int length = this.f1844a.length;
            for (int i8 = 0; i8 < length; i8++) {
                iArr[i8] = packageManager.checkPermission(this.f1844a[i8], packageName);
            }
            ((d) this.f1845b).onRequestPermissionsResult(this.f1846c, this.f1844a, iArr);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class C0020b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i8, Bundle bundle) {
            activity.startActivityForResult(intent, i8, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
        }
    }

    static class c {
        static void a(Object obj) {
            ((SharedElementCallback$OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i8) {
            activity.requestPermissions(strArr, i8);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface d {
        void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr);
    }

    public interface e {
        boolean a(Activity activity, int i8, int i9, Intent intent);

        boolean b(Activity activity, String[] strArr, int i8);
    }

    public interface f {
        void b(int i8);
    }

    public static void p(Activity activity) {
        C0020b.a(activity);
    }

    public static e q() {
        return f1843c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.f.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void s(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.r(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(Activity activity, String[] strArr, int i8) {
        e eVar = f1843c;
        if (eVar == null || !eVar.b(activity, strArr, i8)) {
            HashSet hashSet = new HashSet();
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (TextUtils.isEmpty(strArr[i9])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!androidx.core.os.a.d() && TextUtils.equals(strArr[i9], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i9));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    if (!hashSet.contains(Integer.valueOf(i11))) {
                        strArr2[i10] = strArr[i11];
                        i10++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof f) {
                    ((f) activity).b(i8);
                }
                c.b(activity, strArr, i8);
            } else if (activity instanceof d) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i8));
            }
        }
    }

    public static void u(Activity activity, Intent intent, int i8, Bundle bundle) {
        C0020b.b(activity, intent, i8, bundle);
    }

    public static void v(Activity activity, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        C0020b.c(activity, intentSender, i8, intent, i9, i10, i11, bundle);
    }
}

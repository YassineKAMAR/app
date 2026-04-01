package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b.b f1202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f1203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1204c;

    class a extends a.AbstractBinderC0051a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f1205a = new Handler(Looper.getMainLooper());

        a(b bVar) {
        }

        @Override // b.a
        public void A4(int i8, Bundle bundle) {
        }

        @Override // b.a
        public void b4(String str, Bundle bundle) {
        }

        @Override // b.a
        public Bundle c2(String str, Bundle bundle) {
            return null;
        }

        @Override // b.a
        public void d5(String str, Bundle bundle) {
        }

        @Override // b.a
        public void l5(Bundle bundle) {
        }

        @Override // b.a
        public void r3(int i8, int i9, Bundle bundle) {
        }

        @Override // b.a
        public void s5(int i8, Uri uri, boolean z7, Bundle bundle) {
        }
    }

    c(b.b bVar, ComponentName componentName, Context context) {
        this.f1202a = bVar;
        this.f1203b = componentName;
        this.f1204c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.AbstractBinderC0051a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public static String d(Context context, List<String> list, boolean z7) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z7 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean zE3;
        a.AbstractBinderC0051a abstractBinderC0051aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zE3 = this.f1202a.l4(abstractBinderC0051aB, bundle);
            } else {
                zE3 = this.f1202a.e3(abstractBinderC0051aB);
            }
            if (zE3) {
                return new f(this.f1202a, abstractBinderC0051aB, this.f1203b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j8) {
        try {
            return this.f1202a.M2(j8);
        } catch (RemoteException unused) {
            return false;
        }
    }
}

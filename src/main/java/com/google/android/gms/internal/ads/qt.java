package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.browser.customtabs.f f13757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.c f13758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.browser.customtabs.e f13759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ot f13760d;

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i8 = 0; i8 < listQueryIntentActivities.size(); i8++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i8).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(x84.a(context));
                }
            }
        }
        return false;
    }

    public final androidx.browser.customtabs.f a() {
        androidx.browser.customtabs.c cVar = this.f13758b;
        if (cVar == null) {
            this.f13757a = null;
        } else if (this.f13757a == null) {
            this.f13757a = cVar.e(null);
        }
        return this.f13757a;
    }

    public final void b(Activity activity) {
        String strA;
        if (this.f13758b == null && (strA = x84.a(activity)) != null) {
            y84 y84Var = new y84(this);
            this.f13759c = y84Var;
            androidx.browser.customtabs.c.a(activity, strA, y84Var);
        }
    }

    public final void c(androidx.browser.customtabs.c cVar) {
        this.f13758b = cVar;
        cVar.g(0L);
        ot otVar = this.f13760d;
        if (otVar != null) {
            otVar.j();
        }
    }

    public final void d() {
        this.f13758b = null;
        this.f13757a = null;
    }

    public final void e(ot otVar) {
        this.f13760d = otVar;
    }

    public final void f(Activity activity) {
        androidx.browser.customtabs.e eVar = this.f13759c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f13758b = null;
        this.f13757a = null;
        this.f13759c = null;
    }
}

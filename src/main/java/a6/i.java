package a6;

import a6.a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class i implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f236c;

    interface a {
        String a(Intent intent);
    }

    i(final Context context) {
        this(context, new a() { // from class: a6.h
            @Override // a6.i.a
            public final String a(Intent intent) {
                return i.j(context, intent);
            }
        });
    }

    i(Context context, a aVar) {
        this.f234a = context;
        this.f235b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean g(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L57
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            r0.hashCode()
            r2 = -1
            int r3 = r0.hashCode()
            r4 = 1
            switch(r3) {
                case -1423461112: goto L4a;
                case -1229727188: goto L3f;
                case 785670158: goto L34;
                case 802785917: goto L29;
                default: goto L27;
            }
        L27:
            r1 = -1
            goto L53
        L29:
            java.lang.String r1 = "accept-language"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L27
        L32:
            r1 = 3
            goto L53
        L34:
            java.lang.String r1 = "content-type"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L27
        L3d:
            r1 = 2
            goto L53
        L3f:
            java.lang.String r1 = "content-language"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L27
        L48:
            r1 = 1
            goto L53
        L4a:
            java.lang.String r3 = "accept"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L53
            goto L27
        L53:
            switch(r1) {
                case 0: goto L8;
                case 1: goto L8;
                case 2: goto L8;
                case 3: goto L8;
                default: goto L56;
            }
        L56:
            return r4
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.i.g(java.util.Map):boolean");
    }

    private void h() {
        if (this.f236c == null) {
            throw new a.C0006a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    private static Bundle i(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(Context context, Intent intent) {
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity == null) {
            return null;
        }
        return componentNameResolveActivity.toShortString();
    }

    private static boolean k(Context context, Uri uri, Bundle bundle) {
        androidx.browser.customtabs.d dVarA = new d.b().a();
        dVarA.f1207a.putExtra("com.android.browser.headers", bundle);
        try {
            dVarA.a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // a6.a.b
    public Boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return this.f235b.a(intent) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    @Override // a6.a.b
    public Boolean b(String str, Boolean bool, a.d dVar) {
        h();
        Bundle bundleI = i(dVar.d());
        if (bool.booleanValue() && !g(dVar.d())) {
            if (k(this.f236c, Uri.parse(str), bundleI)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f236c.startActivity(WebViewActivity.a(this.f236c, str, dVar.c().booleanValue(), dVar.b().booleanValue(), bundleI));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // a6.a.b
    public Boolean c() {
        return Boolean.valueOf(androidx.browser.customtabs.c.c(this.f234a, Collections.emptyList()) != null);
    }

    @Override // a6.a.b
    public void d() {
        this.f234a.sendBroadcast(new Intent("close action"));
    }

    @Override // a6.a.b
    public Boolean e(String str, Map<String, String> map) {
        h();
        try {
            this.f236c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", i(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    void l(Activity activity) {
        this.f236c = activity;
    }
}

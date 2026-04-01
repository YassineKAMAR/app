package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import androidx.core.app.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f1207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f1208b;

    private static class a {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<Bundle> f1211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bundle f1212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f1213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray<Bundle> f1214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f1215g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f1209a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a.C0013a f1210b = new a.C0013a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f1216h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f1217i = true;

        public b() {
        }

        public b(f fVar) {
            if (fVar != null) {
                c(fVar);
            }
        }

        private void b() {
            String strA = a.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f1209a.hasExtra("com.android.browser.headers") ? this.f1209a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f1209a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            l.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1209a.putExtras(bundle);
        }

        public d a() {
            if (!this.f1209a.hasExtra("android.support.customtabs.extra.SESSION")) {
                d(null, null);
            }
            ArrayList<Bundle> arrayList = this.f1211c;
            if (arrayList != null) {
                this.f1209a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1213e;
            if (arrayList2 != null) {
                this.f1209a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1209a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1217i);
            this.f1209a.putExtras(this.f1210b.a().a());
            Bundle bundle = this.f1215g;
            if (bundle != null) {
                this.f1209a.putExtras(bundle);
            }
            if (this.f1214f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1214f);
                this.f1209a.putExtras(bundle2);
            }
            this.f1209a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1216h);
            if (Build.VERSION.SDK_INT >= 24) {
                b();
            }
            return new d(this.f1209a, this.f1212d);
        }

        public b c(f fVar) {
            this.f1209a.setPackage(fVar.b().getPackageName());
            d(fVar.a(), fVar.c());
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1207a = intent;
        this.f1208b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1207a.setData(uri);
        androidx.core.content.a.m(context, this.f1207a, this.f1208b);
    }
}

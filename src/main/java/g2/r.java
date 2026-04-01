package g2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.wg0;
import com.google.android.gms.internal.ads.wt;
import h2.r4;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21982c = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21985f;

    public r(Context context, String str) {
        String strConcat;
        this.f21980a = context.getApplicationContext();
        this.f21981b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + f3.e.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            qg0.e("Unable to get package version name for reporting", e8);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f21985f = strConcat;
    }

    public final String a() {
        return this.f21985f;
    }

    public final String b() {
        return this.f21984e;
    }

    public final String c() {
        return this.f21981b;
    }

    public final String d() {
        return this.f21983d;
    }

    public final Map e() {
        return this.f21982c;
    }

    public final void f(r4 r4Var, wg0 wg0Var) {
        this.f21983d = r4Var.f22261j.f22189a;
        Bundle bundle = r4Var.f22264m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) wt.f16943c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f21984e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f21982c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f21982c.put("SDKVersion", wg0Var.f16723a);
        if (((Boolean) wt.f16941a.e()).booleanValue()) {
            Bundle bundleB = j2.e.b(this.f21980a, (String) wt.f16942b.e());
            for (String str3 : bundleB.keySet()) {
                this.f21982c.put(str3, bundleB.get(str3).toString());
            }
        }
    }
}

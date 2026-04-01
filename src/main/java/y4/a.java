package y4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.widget.Toast;
import java.util.Iterator;
import l5.a;
import s5.c;
import s5.j;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class a implements k.c, l5.a, m5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Activity f27445a;

    private static a a(a aVar, c cVar, Activity activity) {
        k kVar = new k(cVar, "launch_review");
        aVar.f27445a = activity;
        kVar.e(aVar);
        return aVar;
    }

    @Override // m5.a
    public void onAttachedToActivity(m5.c cVar) {
        this.f27445a = cVar.g();
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        a(this, bVar.b(), null);
    }

    @Override // m5.a
    public void onDetachedFromActivity() {
    }

    @Override // m5.a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
    }

    @Override // s5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        if (!jVar.f26252a.equals("launch")) {
            dVar.c();
            return;
        }
        String packageName = (String) jVar.a("android_id");
        if (packageName == null) {
            packageName = this.f27445a.getPackageName();
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
        boolean z7 = false;
        Iterator<ResolveInfo> it = this.f27445a.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                ActivityInfo activityInfo = next.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addFlags(268435456);
                intent.addFlags(2097152);
                intent.addFlags(67108864);
                intent.setComponent(componentName);
                Toast.makeText(this.f27445a, "Please Rate Application", 0).show();
                this.f27445a.startActivity(intent);
                z7 = true;
                break;
            }
        }
        if (!z7) {
            try {
                this.f27445a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
            } catch (ActivityNotFoundException unused) {
                this.f27445a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
            }
        }
        dVar.a(null);
    }

    @Override // m5.a
    public void onReattachedToActivityForConfigChanges(m5.c cVar) {
    }
}

package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23134b;

    c0(Context context) {
        b(context);
    }

    private void b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.f23134b = bundle.getString("io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION");
                this.f23133a = applicationInfo.metaData.getString("io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION");
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
    }

    String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flutter-GMA-4.0.0");
        if (this.f23133a != null) {
            sb.append("_");
            sb.append("News");
            sb.append("-");
            sb.append(this.f23133a);
        }
        if (this.f23134b != null) {
            sb.append("_");
            sb.append("Game");
            sb.append("-");
            sb.append(this.f23134b);
        }
        return sb.toString();
    }
}

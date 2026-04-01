package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class wg2 implements oi2, ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f16729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PackageInfo f16730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f16731c;

    wg2(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f16729a = applicationInfo;
        this.f16730b = packageInfo;
        this.f16731c = context;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f16729a.packageName;
        PackageInfo packageInfo = this.f16730b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f16730b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
        try {
            Context context = this.f16731c;
            String str3 = this.f16729a.packageName;
            e53 e53Var = j2.k2.f23991k;
            bundle.putString("dl", String.valueOf(f3.e.a(context).d(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.h(this);
    }
}

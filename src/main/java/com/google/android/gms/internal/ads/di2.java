package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class di2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f6768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wg0 f6770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6771d;

    di2(lg3 lg3Var, Context context, wg0 wg0Var, String str) {
        this.f6768a = lg3Var;
        this.f6769b = context;
        this.f6770c = wg0Var;
        this.f6771d = str;
    }

    final /* synthetic */ ei2 a() {
        boolean zG = f3.e.a(this.f6769b).g();
        g2.t.r();
        boolean zD = j2.k2.d(this.f6769b);
        String str = this.f6770c.f16723a;
        g2.t.r();
        boolean zE = j2.k2.e();
        g2.t.r();
        ApplicationInfo applicationInfo = this.f6769b.getApplicationInfo();
        int i8 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.f6769b;
        return new ei2(zG, zD, str, zE, i8, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.f6771d);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f6768a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.ci2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6356a.a();
            }
        });
    }
}

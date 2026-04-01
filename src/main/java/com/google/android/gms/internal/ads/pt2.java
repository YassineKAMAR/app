package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class pt2 {
    public static void a(Context context, boolean z7) {
        String str;
        if (z7) {
            str = "This request is sent from a test device.";
        } else {
            h2.v.b();
            str = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + jg0.C(context) + "\")) to get test ads on this device.";
        }
        qg0.f(str);
    }

    public static void b(int i8, Throwable th, String str) {
        qg0.f("Ad failed to load : " + i8);
        j2.v1.l(str, th);
        if (i8 == 3) {
            return;
        }
        g2.t.q().t(th, str);
    }
}

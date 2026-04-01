package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class f13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7581a = 2;

    public static void a(Context context) {
        context.registerReceiver(new e13(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (b13.a() != wz2.CTV) {
            return 2;
        }
        return f7581a;
    }
}

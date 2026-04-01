package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f18663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18664b;

    static {
        int i8 = Build.VERSION.SDK_INT;
        f18663a = i8 >= 23 ? 67108864 : 0;
        f18664b = i8 >= 31 ? 33554432 : 0;
    }

    public static PendingIntent a(Context context, int i8, Intent intent, int i9) {
        return PendingIntent.getBroadcast(context, 0, intent, i9);
    }
}

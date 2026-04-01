package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class o53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ClipData f12370b;

    static {
        f12369a = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        f12370b = ClipData.newIntent("", new Intent());
    }

    public static PendingIntent a(Context context, int i8, Intent intent, int i9, int i10) {
        boolean z7 = true;
        l83.f((i9 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        l83.f((i9 & 1) == 0 || b(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        l83.f((i9 & 2) == 0 || b(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        l83.f((i9 & 4) == 0 || b(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        l83.f((i9 & 128) == 0 || b(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        l83.f(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            l83.f(!b(i9, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !b(i9, 67108864)) {
                z7 = false;
            }
            l83.f(z7, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !b(i9, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f12370b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i9);
    }

    private static boolean b(int i8, int i9) {
        return (i8 & i9) == i9;
    }
}

package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserManager f19287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f19288b = !a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f19289c = false;

    private w5() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    @TargetApi(24)
    private static boolean d(Context context) {
        if (f19288b) {
            return true;
        }
        synchronized (w5.class) {
            if (f19288b) {
                return true;
            }
            boolean zE = e(context);
            if (zE) {
                f19288b = zE;
            }
            return zE;
        }
    }

    @TargetApi(24)
    private static boolean e(Context context) {
        boolean z7;
        boolean z8 = true;
        int i8 = 1;
        while (true) {
            z7 = false;
            if (i8 > 2) {
                break;
            }
            if (f19287a == null) {
                f19287a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f19287a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z8 = false;
                }
            } catch (NullPointerException e8) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e8);
                f19287a = null;
                i8++;
            }
        }
        z7 = z8;
        if (z7) {
            f19287a = null;
        }
        return z7;
    }
}

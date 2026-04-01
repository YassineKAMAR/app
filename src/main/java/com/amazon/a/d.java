package com.amazon.a;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f4018a = new com.amazon.a.a.o.c("CrossPlatformPluginUtils");

    public static void a(Activity activity) {
        com.amazon.a.a.o.a.a.a(a.d(), "AppstoreSDK not initialized");
        if (a()) {
            return;
        }
        a.b().c(activity);
        if (com.amazon.a.a.o.c.f3947a) {
            f4018a.a("Notified Visibility for activity:" + activity);
        }
    }

    private static boolean a() {
        if (a.b() != null) {
            return a.b().h();
        }
        return false;
    }
}

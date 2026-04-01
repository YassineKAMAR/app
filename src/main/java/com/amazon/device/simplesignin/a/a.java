package com.amazon.device.simplesignin.a;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4344a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f4345b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b f4346c;

    private a() {
    }

    static a a() {
        return f4345b;
    }

    b a(Context context) {
        String str;
        String str2;
        if (f4346c == null) {
            synchronized (a.class) {
                if (f4346c == null) {
                    if (b(context)) {
                        f4346c = new com.amazon.device.simplesignin.a.c.b();
                        str = f4344a;
                        str2 = "SDK initialized in Sandbox mode.";
                    } else {
                        f4346c = new com.amazon.device.simplesignin.a.a.b();
                        str = f4344a;
                        str2 = "SDK initialized in Production mode.";
                    }
                    com.amazon.device.simplesignin.a.d.a.a(str, str2);
                }
            }
        }
        return f4346c;
    }

    boolean b(Context context) {
        return com.amazon.a.a.a((Application) context.getApplicationContext());
    }
}

package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f4267a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4268b = b.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f4269c;

    private b() {
    }

    public static b a() {
        return f4267a;
    }

    public e a(Context context) {
        if (f4269c == null) {
            synchronized (b.class) {
                if (f4269c == null) {
                    f4269c = com.amazon.a.a.a((Application) context.getApplicationContext()) ? new com.amazon.device.iap.internal.c.e() : new com.amazon.device.iap.internal.a.d();
                }
            }
        }
        return f4269c;
    }
}

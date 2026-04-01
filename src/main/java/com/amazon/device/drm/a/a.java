package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f4169a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f4170b;

    private a() {
    }

    public static a a() {
        return f4169a;
    }

    public c a(Context context) {
        if (f4170b == null) {
            synchronized (a.class) {
                if (f4170b == null) {
                    f4170b = com.amazon.a.a.a((Application) context.getApplicationContext()) ? new com.amazon.device.drm.a.d.c() : new com.amazon.device.drm.a.b.c();
                }
            }
        }
        return f4170b;
    }
}

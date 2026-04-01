package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class h53 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static h53 f8633c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f8635b;

    private h53(Context context) {
        this.f8634a = context.getPackageName();
        this.f8635b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static h53 b(Context context) {
        if (f8633c == null) {
            f8633c = new h53(context);
        }
        return f8633c;
    }

    final long a(String str, long j8) {
        return this.f8635b.getLong(str, -1L);
    }

    final String c(String str, String str2) {
        return this.f8635b.getString(str, null);
    }

    final void d(String str, Object obj) throws IOException {
        SharedPreferences.Editor editorPutBoolean;
        if (obj instanceof String) {
            editorPutBoolean = this.f8635b.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            editorPutBoolean = this.f8635b.edit().putLong(str, ((Long) obj).longValue());
        } else {
            if (!(obj instanceof Boolean)) {
                String str2 = "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.f8634a;
                Log.e("PaidLifecycleSPHandler", str2);
                throw new IllegalArgumentException(str2);
            }
            editorPutBoolean = this.f8635b.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        }
        if (editorPutBoolean.commit()) {
            return;
        }
        String str3 = "Failed to store " + str + " for app " + this.f8634a;
        Log.e("PaidLifecycleSPHandler", str3);
        throw new IOException(str3);
    }

    final void e(String str) throws IOException {
        if (this.f8635b.edit().remove(str).commit()) {
            return;
        }
        String str2 = "Failed to remove " + str + " for app " + this.f8634a;
        Log.e("PaidLifecycleSPHandler", str2);
        throw new IOException(str2);
    }

    final boolean f(String str, boolean z7) {
        return this.f8635b.getBoolean(str, true);
    }

    final boolean g(String str) {
        return this.f8635b.contains(str);
    }
}

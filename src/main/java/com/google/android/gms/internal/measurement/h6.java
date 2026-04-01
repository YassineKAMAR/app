package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class h6 implements c6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static h6 f18770c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentObserver f18772b;

    private h6() {
        this.f18771a = null;
        this.f18772b = null;
    }

    private h6(Context context) {
        this.f18771a = context;
        j6 j6Var = new j6(this, null);
        this.f18772b = j6Var;
        context.getContentResolver().registerContentObserver(r5.f19116a, true, j6Var);
    }

    static h6 b(Context context) {
        h6 h6Var;
        synchronized (h6.class) {
            if (f18770c == null) {
                f18770c = androidx.core.content.k.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new h6(context) : new h6();
            }
            h6Var = f18770c;
        }
        return h6Var;
    }

    static synchronized void c() {
        Context context;
        h6 h6Var = f18770c;
        if (h6Var != null && (context = h6Var.f18771a) != null && h6Var.f18772b != null) {
            context.getContentResolver().unregisterContentObserver(f18770c.f18772b);
        }
        f18770c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.c6
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f18771a;
        if (context != null && !w5.b(context)) {
            try {
                return (String) f6.a(new e6() { // from class: com.google.android.gms.internal.measurement.g6
                    @Override // com.google.android.gms.internal.measurement.e6
                    public final Object j() {
                        return this.f18745a.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e8) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e8);
            }
        }
        return null;
    }

    final /* synthetic */ String d(String str) {
        return r5.a(this.f18771a.getContentResolver(), str, null);
    }
}

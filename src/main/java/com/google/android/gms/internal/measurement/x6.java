package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x6 implements c6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, x6> f19374g = new p.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f19375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f19376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f19377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f19378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Map<String, ?> f19379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<z5> f19380f;

    private x6(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.a7
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f18544a.e(sharedPreferences2, str);
            }
        };
        this.f19377c = onSharedPreferenceChangeListener;
        this.f19378d = new Object();
        this.f19380f = new ArrayList();
        this.f19375a = sharedPreferences;
        this.f19376b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences b(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return context.getSharedPreferences(str, 0);
            }
            if (w5.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return context.getSharedPreferences(str.substring(12), 0);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static x6 c(Context context, String str, Runnable runnable) {
        x6 x6Var;
        if (!((!w5.a() || str.startsWith("direct_boot:")) ? true : w5.c(context))) {
            return null;
        }
        synchronized (x6.class) {
            Map<String, x6> map = f19374g;
            x6Var = map.get(str);
            if (x6Var == null) {
                x6Var = new x6(b(context, str), runnable);
                map.put(str, x6Var);
            }
        }
        return x6Var;
    }

    static synchronized void d() {
        for (x6 x6Var : f19374g.values()) {
            x6Var.f19375a.unregisterOnSharedPreferenceChangeListener(x6Var.f19377c);
        }
        f19374g.clear();
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final Object a(String str) {
        Map<String, ?> map = this.f19379e;
        if (map == null) {
            synchronized (this.f19378d) {
                map = this.f19379e;
                if (map == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f19375a.getAll();
                        this.f19379e = all;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f19378d) {
            this.f19379e = null;
            this.f19376b.run();
        }
        synchronized (this) {
            Iterator<z5> it = this.f19380f.iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        }
    }
}

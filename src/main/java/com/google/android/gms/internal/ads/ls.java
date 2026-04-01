package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ls implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f11033g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11027a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConditionVariable f11028b = new ConditionVariable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f11029c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f11030d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SharedPreferences f11031e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f11032f = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f11034h = new JSONObject();

    private final void f() {
        if (this.f11031e == null) {
            return;
        }
        try {
            this.f11034h = new JSONObject((String) ss.a(new c93() { // from class: com.google.android.gms.internal.ads.js
                @Override // com.google.android.gms.internal.ads.c93
                public final Object j() {
                    return this.f9773a.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object b(final fs fsVar) {
        if (!this.f11028b.block(5000L)) {
            synchronized (this.f11027a) {
                if (!this.f11030d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f11029c || this.f11031e == null) {
            synchronized (this.f11027a) {
                if (this.f11029c && this.f11031e != null) {
                }
                return fsVar.m();
            }
        }
        if (fsVar.e() != 2) {
            return (fsVar.e() == 1 && this.f11034h.has(fsVar.n())) ? fsVar.a(this.f11034h) : ss.a(new c93() { // from class: com.google.android.gms.internal.ads.is
                @Override // com.google.android.gms.internal.ads.c93
                public final Object j() {
                    return this.f9330a.c(fsVar);
                }
            });
        }
        Bundle bundle = this.f11032f;
        return bundle == null ? fsVar.m() : fsVar.b(bundle);
    }

    final /* synthetic */ Object c(fs fsVar) {
        return fsVar.c(this.f11031e);
    }

    final /* synthetic */ String d() {
        return this.f11031e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.f11029c) {
            return;
        }
        synchronized (this.f11027a) {
            if (this.f11029c) {
                return;
            }
            if (!this.f11030d) {
                this.f11030d = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.f11033g = applicationContext;
            try {
                this.f11032f = f3.e.a(applicationContext).c(this.f11033g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context contextC = x2.i.c(context);
                if (contextC != null || (contextC = context.getApplicationContext()) != null) {
                    context = contextC;
                }
                if (context == null) {
                    return;
                }
                h2.y.b();
                SharedPreferences sharedPreferencesA = hs.a(context);
                this.f11031e = sharedPreferencesA;
                if (sharedPreferencesA != null) {
                    sharedPreferencesA.registerOnSharedPreferenceChangeListener(this);
                }
                bv.c(new ks(this));
                f();
                this.f11029c = true;
            } finally {
                this.f11030d = false;
                this.f11028b.open();
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}

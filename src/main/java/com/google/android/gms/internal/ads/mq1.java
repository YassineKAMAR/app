package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class mq1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Context f11511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Executor f11512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final vg0 f11513e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wx2 f11515g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f11509a = (String) cu.f6482b.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map f11510b = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f11518j = new AtomicBoolean();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicReference f11519k = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f11514f = ((Boolean) h2.y.c().b(ns.V1)).booleanValue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f11516h = ((Boolean) h2.y.c().b(ns.Y1)).booleanValue();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f11517i = ((Boolean) h2.y.c().b(ns.X6)).booleanValue();

    protected mq1(Executor executor, vg0 vg0Var, wx2 wx2Var, Context context) {
        this.f11512d = executor;
        this.f11513e = vg0Var;
        this.f11515g = wx2Var;
        this.f11511c = context;
    }

    private final void a(Map map, boolean z7) {
        if (map.isEmpty()) {
            qg0.b("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            qg0.b("Empty or null paramMap.");
        } else {
            if (!this.f11518j.getAndSet(true)) {
                final String str = (String) h2.y.c().b(ns.H9);
                this.f11519k.set(j2.e.a(this.f11511c, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.lq1
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        this.f10945a.d(str, sharedPreferences, str2);
                    }
                }));
            }
            Bundle bundle = (Bundle) this.f11519k.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        final String strA = this.f11515g.a(map);
        j2.v1.k(strA);
        boolean z8 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f11514f) {
            if (!z7 || this.f11516h) {
                if (!z8 || this.f11517i) {
                    this.f11512d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kq1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10235a.f11513e.a(strA);
                        }
                    });
                }
            }
        }
    }

    protected final String b(Map map) {
        return this.f11515g.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.f11510b);
    }

    final /* synthetic */ void d(String str, SharedPreferences sharedPreferences, String str2) {
        this.f11519k.set(j2.e.b(this.f11511c, str));
    }

    public final void e(Map map) {
        a(map, true);
    }

    public final void f(Map map) {
        a(map, false);
    }
}

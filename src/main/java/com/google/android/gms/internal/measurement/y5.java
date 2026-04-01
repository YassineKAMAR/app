package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y5 implements c6 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<Uri, y5> f19392h = new p.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f19393i = {SubscriberAttributeKt.JSON_NAME_KEY, "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f19394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f19395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f19396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentObserver f19397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f19398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Map<String, String> f19399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<z5> f19400g;

    private y5(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        b6 b6Var = new b6(this, null);
        this.f19397d = b6Var;
        this.f19398e = new Object();
        this.f19400g = new ArrayList();
        u3.h.i(contentResolver);
        u3.h.i(uri);
        this.f19394a = contentResolver;
        this.f19395b = uri;
        this.f19396c = runnable;
        contentResolver.registerContentObserver(uri, false, b6Var);
    }

    public static y5 b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        y5 y5Var;
        synchronized (y5.class) {
            Map<Uri, y5> map = f19392h;
            y5Var = map.get(uri);
            if (y5Var == null) {
                try {
                    y5 y5Var2 = new y5(contentResolver, uri, runnable);
                    try {
                        map.put(uri, y5Var2);
                    } catch (SecurityException unused) {
                    }
                    y5Var = y5Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return y5Var;
    }

    static synchronized void e() {
        for (y5 y5Var : f19392h.values()) {
            y5Var.f19394a.unregisterContentObserver(y5Var.f19397d);
        }
        f19392h.clear();
    }

    private final Map<String, String> g() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) f6.a(new e6() { // from class: com.google.android.gms.internal.measurement.x5
                    @Override // com.google.android.gms.internal.measurement.e6
                    public final Object j() {
                        return this.f19373a.d();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final /* synthetic */ Object a(String str) {
        return c().get(str);
    }

    public final Map<String, String> c() {
        Map<String, String> mapG = this.f19399f;
        if (mapG == null) {
            synchronized (this.f19398e) {
                mapG = this.f19399f;
                if (mapG == null) {
                    mapG = g();
                    this.f19399f = mapG;
                }
            }
        }
        return mapG != null ? mapG : Collections.emptyMap();
    }

    final /* synthetic */ Map d() {
        Cursor cursorQuery = this.f19394a.query(this.f19395b, f19393i, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new p.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }

    public final void f() {
        synchronized (this.f19398e) {
            this.f19399f = null;
            this.f19396c.run();
        }
        synchronized (this) {
            Iterator<z5> it = this.f19400g.iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        }
    }
}

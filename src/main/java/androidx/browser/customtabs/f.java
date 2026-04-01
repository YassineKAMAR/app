package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1220a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.b f1221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b.a f1222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f1223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f1224e;

    f(b.b bVar, b.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1221b = bVar;
        this.f1222c = aVar;
        this.f1223d = componentName;
        this.f1224e = pendingIntent;
    }

    IBinder a() {
        return this.f1222c.asBinder();
    }

    ComponentName b() {
        return this.f1223d;
    }

    PendingIntent c() {
        return this.f1224e;
    }
}

package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.l;
import androidx.work.impl.foreground.a;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends l implements a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3179f = j.f("SystemFgService");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static SystemForegroundService f3180g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f3181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.work.impl.foreground.a f3183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    NotificationManager f3184e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f3186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3187c;

        a(int i8, Notification notification, int i9) {
            this.f3185a = i8;
            this.f3186b = notification;
            this.f3187c = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f3185a, this.f3186b, this.f3187c);
            } else {
                SystemForegroundService.this.startForeground(this.f3185a, this.f3186b);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f3190b;

        b(int i8, Notification notification) {
            this.f3189a = i8;
            this.f3190b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f3184e.notify(this.f3189a, this.f3190b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3192a;

        c(int i8) {
            this.f3192a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f3184e.cancel(this.f3192a);
        }
    }

    private void f() {
        this.f3181b = new Handler(Looper.getMainLooper());
        this.f3184e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f3183d = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i8, int i9, Notification notification) {
        this.f3181b.post(new a(i8, notification, i9));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i8, Notification notification) {
        this.f3181b.post(new b(i8, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i8) {
        this.f3181b.post(new c(i8));
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        f3180g = this;
        f();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3183d.k();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        super.onStartCommand(intent, i8, i9);
        if (this.f3182c) {
            j.c().d(f3179f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f3183d.k();
            f();
            this.f3182c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3183d.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f3182c = true;
        j.c().a(f3179f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f3180g = null;
        stopSelf();
    }
}

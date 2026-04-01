package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.l;
import androidx.work.impl.background.systemalarm.e;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends l implements e.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3134d = j.f("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f3135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3136c;

    private void f() {
        e eVar = new e(this);
        this.f3135b = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.f3136c = true;
        j.c().a(f3134d, "All commands completed in dispatcher", new Throwable[0]);
        g1.l.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.f3136c = false;
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3136c = true;
        this.f3135b.j();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        super.onStartCommand(intent, i8, i9);
        if (this.f3136c) {
            j.c().d(f3134d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3135b.j();
            f();
            this.f3136c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3135b.a(intent, i9);
        return 3;
    }
}

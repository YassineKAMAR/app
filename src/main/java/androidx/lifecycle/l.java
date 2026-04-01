package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class l extends Service implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f2670a = new v(this);

    @Override // androidx.lifecycle.i
    public d a() {
        return this.f2670a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.q.f(intent, "intent");
        this.f2670a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2670a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f2670a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i8) {
        this.f2670a.e();
        super.onStart(intent, i8);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        return super.onStartCommand(intent, i8, i9);
    }
}

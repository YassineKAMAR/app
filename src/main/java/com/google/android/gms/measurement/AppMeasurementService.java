package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.aa;
import p3.f0;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private aa<AppMeasurementService> f19755a;

    private final aa<AppMeasurementService> d() {
        if (this.f19755a == null) {
            this.f19755a = new aa<>(this);
        }
        return this.f19755a;
    }

    @Override // p3.f0
    public final void a(Intent intent) {
        d0.a.b(intent);
    }

    @Override // p3.f0
    public final boolean b(int i8) {
        return stopSelfResult(i8);
    }

    @Override // p3.f0
    public final void c(JobParameters jobParameters, boolean z7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return d().b(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().i(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i8, int i9) {
        return d().a(intent, i8, i9);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return d().k(intent);
    }
}

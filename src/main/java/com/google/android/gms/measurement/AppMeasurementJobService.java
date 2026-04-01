package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.aa;
import p3.f0;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private aa<AppMeasurementJobService> f19753a;

    private final aa<AppMeasurementJobService> d() {
        if (this.f19753a == null) {
            this.f19753a = new aa<>(this);
        }
        return this.f19753a;
    }

    @Override // p3.f0
    public final void a(Intent intent) {
    }

    @Override // p3.f0
    public final boolean b(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // p3.f0
    @TargetApi(24)
    public final void c(JobParameters jobParameters, boolean z7) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return d().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return d().k(intent);
    }
}

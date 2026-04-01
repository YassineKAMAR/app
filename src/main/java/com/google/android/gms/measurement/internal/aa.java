package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import p3.f0;

/* JADX INFO: loaded from: classes.dex */
public final class aa<T extends Context & p3.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f19804a;

    public aa(T t7) {
        a3.o.j(t7);
        this.f19804a = t7;
    }

    private final void f(Runnable runnable) {
        va vaVarG = va.g(this.f19804a);
        vaVarG.u().D(new ba(this, vaVarG, runnable));
    }

    private final n4 j() {
        return w5.a(this.f19804a, null, null).t();
    }

    public final int a(final Intent intent, int i8, final int i9) {
        final n4 n4VarT = w5.a(this.f19804a, null, null).t();
        if (intent == null) {
            n4VarT.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        n4VarT.K().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i9), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.ca
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19872a.d(i9, n4VarT, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new a6(va.g(this.f19804a));
        }
        j().L().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        w5.a(this.f19804a, null, null).t().K().a("Local AppMeasurementService is starting up");
    }

    final /* synthetic */ void d(int i8, n4 n4Var, Intent intent) {
        if (this.f19804a.b(i8)) {
            n4Var.K().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i8));
            j().K().a("Completed wakeful intent.");
            this.f19804a.a(intent);
        }
    }

    final /* synthetic */ void e(n4 n4Var, JobParameters jobParameters) {
        n4Var.K().a("AppMeasurementJobService processed last upload request.");
        this.f19804a.c(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean g(final JobParameters jobParameters) {
        final n4 n4VarT = w5.a(this.f19804a, null, null).t();
        String string = jobParameters.getExtras().getString("action");
        n4VarT.K().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new Runnable() { // from class: com.google.android.gms.measurement.internal.z9
            @Override // java.lang.Runnable
            public final void run() {
                this.f20757a.e(n4VarT, jobParameters);
            }
        });
        return true;
    }

    public final void h() {
        w5.a(this.f19804a, null, null).t().K().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
        } else {
            j().K().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().K().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}

package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes.dex */
public final class pa extends ua {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AlarmManager f20377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f20378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f20379f;

    protected pa(va vaVar) {
        super(vaVar);
        this.f20377d = (AlarmManager) j().getSystemService("alarm");
    }

    private final int A() {
        if (this.f20379f == null) {
            this.f20379f = Integer.valueOf(("measurement" + j().getPackageName()).hashCode());
        }
        return this.f20379f.intValue();
    }

    private final PendingIntent B() {
        Context contextJ = j();
        return com.google.android.gms.internal.measurement.e1.a(contextJ, 0, new Intent().setClassName(contextJ, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.e1.f18664b);
    }

    private final u C() {
        if (this.f20378e == null) {
            this.f20378e = new sa(this, this.f20461b.i0());
        }
        return this.f20378e;
    }

    @TargetApi(24)
    private final void D() {
        JobScheduler jobScheduler = (JobScheduler) j().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ pb m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ m n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ i5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ y9 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean x() {
        AlarmManager alarmManager = this.f20377d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        D();
        return false;
    }

    public final void y(long j8) {
        s();
        Context contextJ = j();
        if (!ib.c0(contextJ)) {
            t().F().a("Receiver not registered/enabled");
        }
        if (!ib.d0(contextJ, false)) {
            t().F().a("Service not registered/enabled");
        }
        z();
        t().K().b("Scheduling upload, millis", Long.valueOf(j8));
        long jB = k().b() + j8;
        if (j8 < Math.max(0L, e0.f19973z.a(null).longValue()) && !C().e()) {
            C().b(j8);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f20377d;
            if (alarmManager != null) {
                alarmManager.setInexactRepeating(2, jB, Math.max(e0.f19963u.a(null).longValue(), j8), B());
                return;
            }
            return;
        }
        Context contextJ2 = j();
        ComponentName componentName = new ComponentName(contextJ2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iA = A();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.g1.c(contextJ2, new JobInfo.Builder(iA, componentName).setMinimumLatency(j8).setOverrideDeadline(j8 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void z() {
        s();
        t().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.f20377d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        if (Build.VERSION.SDK_INT >= 24) {
            D();
        }
    }
}

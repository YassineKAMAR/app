package androidx.work.impl.utils;

import a1.k;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.a;
import androidx.work.impl.WorkDatabase;
import f1.n;
import f1.p;
import f1.q;
import g1.h;
import java.util.List;
import java.util.concurrent.TimeUnit;
import x0.g;
import x0.j;
import x0.s;
import y0.f;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3208d = j.f("ForceStopRunnable");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f3209e = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f3211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3212c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f3213a = j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j.c().g(f3213a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f3210a = context.getApplicationContext();
        this.f3211b = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i8) {
        return PendingIntent.getBroadcast(context, -1, c(context), i8);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, a.c() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f3209e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = Build.VERSION.SDK_INT >= 23 ? k.i(this.f3210a, this.f3211b) : false;
        WorkDatabase workDatabaseO = this.f3211b.o();
        q qVarB = workDatabaseO.B();
        n nVarA = workDatabaseO.A();
        workDatabaseO.c();
        try {
            List<p> listH = qVarB.h();
            boolean z7 = (listH == null || listH.isEmpty()) ? false : true;
            if (z7) {
                for (p pVar : listH) {
                    qVarB.k(s.ENQUEUED, pVar.f21651a);
                    qVarB.b(pVar.f21651a, -1L);
                }
            }
            nVarA.c();
            workDatabaseO.r();
            return z7 || zI;
        } finally {
            workDatabaseO.g();
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            j.c().a(f3208d, "Rescheduling Workers.", new Throwable[0]);
            this.f3211b.s();
            this.f3211b.l().c(false);
        } else if (e()) {
            j.c().a(f3208d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f3211b.s();
        } else if (zA) {
            j.c().a(f3208d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f3211b.i(), this.f3211b.o(), this.f3211b.n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            PendingIntent pendingIntentD = d(this.f3210a, a.c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f3210a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i8)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f3210a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e8) {
            j.c().h(f3208d, "Ignoring exception", e8);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a aVarI = this.f3211b.i();
        if (TextUtils.isEmpty(aVarI.c())) {
            j.c().a(f3208d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zB = h.b(this.f3210a, aVarI);
        j.c().a(f3208d, String.format("Is default app process = %s", Boolean.valueOf(zB)), new Throwable[0]);
        return zB;
    }

    boolean h() {
        return this.f3211b.l().a();
    }

    public void i(long j8) {
        try {
            Thread.sleep(j8);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i8;
        try {
            if (f()) {
                while (true) {
                    y0.h.e(this.f3210a);
                    j.c().a(f3208d, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e8) {
                        i8 = this.f3212c + 1;
                        this.f3212c = i8;
                        if (i8 >= 3) {
                            j jVarC = j.c();
                            String str = f3208d;
                            jVarC.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                            g gVarD = this.f3211b.i().d();
                            if (gVarD == null) {
                                throw illegalStateException;
                            }
                            j.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                            gVarD.a(illegalStateException);
                        } else {
                            j.c().a(f3208d, String.format("Retrying after %s", Long.valueOf(((long) i8) * 300)), e8);
                            i(((long) this.f3212c) * 300);
                        }
                    }
                    j.c().a(f3208d, String.format("Retrying after %s", Long.valueOf(((long) i8) * 300)), e8);
                    i(((long) this.f3212c) * 300);
                }
            }
        } finally {
            this.f3211b.r();
        }
    }
}

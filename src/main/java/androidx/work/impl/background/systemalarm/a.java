package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import f1.g;
import f1.h;
import x0.j;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3137a = j.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h hVarY = iVar.o().y();
        g gVarC = hVarY.c(str);
        if (gVarC != null) {
            b(context, str, gVarC.f21629b);
            j.c().a(f3137a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            hVarY.d(str);
        }
    }

    private static void b(Context context, String str, int i8) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i8, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        j.c().a(f3137a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i8)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j8) {
        int iB;
        WorkDatabase workDatabaseO = iVar.o();
        h hVarY = workDatabaseO.y();
        g gVarC = hVarY.c(str);
        if (gVarC != null) {
            b(context, str, gVarC.f21629b);
            iB = gVarC.f21629b;
        } else {
            iB = new g1.d(workDatabaseO).b();
            hVarY.b(new g(str, iB));
        }
        d(context, str, iB, j8);
    }

    private static void d(Context context, String str, int i8, long j8) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i8, b.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j8, service);
        }
    }
}

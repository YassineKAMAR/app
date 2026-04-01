package a1;

import android.app.job.JobInfo;
import android.app.job.JobInfo$TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import f1.p;
import java.util.Iterator;
import x0.c;

/* JADX INFO: loaded from: classes.dex */
class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f2b = x0.j.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f3a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4a;

        static {
            int[] iArr = new int[x0.k.values().length];
            f4a = iArr;
            try {
                iArr[x0.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4a[x0.k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4a[x0.k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4a[x0.k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4a[x0.k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    j(Context context) {
        this.f3a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.job.JobInfo$TriggerContentUri] */
    private static JobInfo$TriggerContentUri b(c.a aVar) {
        boolean zB = aVar.b();
        final Uri uriA = aVar.a();
        final int i8 = zB ? 1 : 0;
        return new Parcelable(uriA, i8) { // from class: android.app.job.JobInfo$TriggerContentUri
            static {
                throw new NoClassDefFoundError();
            }
        };
    }

    static int c(x0.k kVar) {
        int i8 = a.f4a[kVar.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        if (i8 != 4) {
            if (i8 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        x0.j.c().a(f2b, String.format("API version too low. Cannot convert network type value %s", kVar), new Throwable[0]);
        return 1;
    }

    static void d(JobInfo.Builder builder, x0.k kVar) {
        if (Build.VERSION.SDK_INT < 30 || kVar != x0.k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(kVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(p pVar, int i8) {
        x0.b bVar = pVar.f21660j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f21651a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i8, this.f3a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.b());
        if (!bVar.h()) {
            extras.setBackoffCriteria(pVar.f21663m, pVar.f21662l == x0.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.f21667q) {
            extras.setImportantWhileForeground(true);
        }
        if (i9 >= 24 && bVar.e()) {
            Iterator<c.a> it = bVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.c());
            extras.setTriggerContentMaxDelay(bVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z7 = pVar.f21661k > 0;
        if (androidx.core.os.a.c() && pVar.f21667q && !z7) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}

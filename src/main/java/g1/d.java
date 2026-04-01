package g1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f21883a;

    public d(WorkDatabase workDatabase) {
        this.f21883a = workDatabase;
    }

    public static void a(Context context, q0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i8 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i9 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.f();
            try {
                bVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i8)});
                bVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i9)});
                sharedPreferences.edit().clear().apply();
                bVar.B();
            } finally {
                bVar.L();
            }
        }
    }

    private int c(String str) {
        this.f21883a.c();
        try {
            Long lA = this.f21883a.x().a(str);
            int i8 = 0;
            int iIntValue = lA != null ? lA.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i8 = iIntValue + 1;
            }
            e(str, i8);
            this.f21883a.r();
            return iIntValue;
        } finally {
            this.f21883a.g();
        }
    }

    private void e(String str, int i8) {
        this.f21883a.x().b(new f1.d(str, i8));
    }

    public int b() {
        int iC;
        synchronized (d.class) {
            iC = c("next_alarm_manager_id");
        }
        return iC;
    }

    public int d(int i8, int i9) {
        synchronized (d.class) {
            int iC = c("next_job_scheduler_id");
            if (iC < i8 || iC > i9) {
                e("next_job_scheduler_id", i8 + 1);
            } else {
                i8 = iC;
            }
        }
        return i8;
    }
}

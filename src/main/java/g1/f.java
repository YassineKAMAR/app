package g1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f21885a;

    public f(WorkDatabase workDatabase) {
        this.f21885a = workDatabase;
    }

    public static void b(Context context, q0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j8 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j9 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.f();
            try {
                bVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j8)});
                bVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j9)});
                sharedPreferences.edit().clear().apply();
                bVar.B();
            } finally {
                bVar.L();
            }
        }
    }

    public boolean a() {
        Long lA = this.f21885a.x().a("reschedule_needed");
        return lA != null && lA.longValue() == 1;
    }

    public void c(boolean z7) {
        this.f21885a.x().b(new f1.d("reschedule_needed", z7));
    }
}

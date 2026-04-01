package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static n0.a f3118a = new C0047a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static n0.a f3119b = new b(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static n0.a f3120c = new c(4, 5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static n0.a f3121d = new d(6, 7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static n0.a f3122e = new e(7, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static n0.a f3123f = new f(8, 9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static n0.a f3124g = new g(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    class C0047a extends n0.a {
        C0047a(int i8, int i9) {
            super(i8, i9);
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            bVar.n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.n("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.n("DROP TABLE IF EXISTS alarmInfo");
            bVar.n("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    class b extends n0.a {
        b(int i8, int i9) {
            super(i8, i9);
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.n("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    class c extends n0.a {
        c(int i8, int i9) {
            super(i8, i9);
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            bVar.n("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.n("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    class d extends n0.a {
        d(int i8, int i9) {
            super(i8, i9);
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            bVar.n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    class e extends n0.a {
        e(int i8, int i9) {
            super(i8, i9);
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            bVar.n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    class f extends n0.a {
        f(int i8, int i9) {
            super(i8, i9);
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            bVar.n("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    class g extends n0.a {
        g(int i8, int i9) {
            super(i8, i9);
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            bVar.n("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends n0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Context f3125c;

        public h(Context context, int i8, int i9) {
            super(i8, i9);
            this.f3125c = context;
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            if (this.f25048b >= 10) {
                bVar.C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f3125c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class i extends n0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Context f3126c;

        public i(Context context) {
            super(9, 10);
            this.f3126c = context;
        }

        @Override // n0.a
        public void a(q0.b bVar) {
            bVar.n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            g1.f.b(this.f3126c, bVar);
            g1.d.a(this.f3126c, bVar);
        }
    }
}

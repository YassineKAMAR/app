package f1;

import android.database.Cursor;
import f1.p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f21671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.a<p> f21672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0.d f21673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0.d f21674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0.d f21675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m0.d f21676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m0.d f21677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m0.d f21678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m0.d f21679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m0.d f21680j;

    class a extends m0.a<p> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // m0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(q0.f fVar, p pVar) throws Throwable {
            String str = pVar.f21651a;
            if (str == null) {
                fVar.S(1);
            } else {
                fVar.p(1, str);
            }
            fVar.A(2, v.j(pVar.f21652b));
            String str2 = pVar.f21653c;
            if (str2 == null) {
                fVar.S(3);
            } else {
                fVar.p(3, str2);
            }
            String str3 = pVar.f21654d;
            if (str3 == null) {
                fVar.S(4);
            } else {
                fVar.p(4, str3);
            }
            byte[] bArrK = androidx.work.b.k(pVar.f21655e);
            if (bArrK == null) {
                fVar.S(5);
            } else {
                fVar.F(5, bArrK);
            }
            byte[] bArrK2 = androidx.work.b.k(pVar.f21656f);
            if (bArrK2 == null) {
                fVar.S(6);
            } else {
                fVar.F(6, bArrK2);
            }
            fVar.A(7, pVar.f21657g);
            fVar.A(8, pVar.f21658h);
            fVar.A(9, pVar.f21659i);
            fVar.A(10, pVar.f21661k);
            fVar.A(11, v.a(pVar.f21662l));
            fVar.A(12, pVar.f21663m);
            fVar.A(13, pVar.f21664n);
            fVar.A(14, pVar.f21665o);
            fVar.A(15, pVar.f21666p);
            fVar.A(16, pVar.f21667q ? 1L : 0L);
            fVar.A(17, v.i(pVar.f21668r));
            x0.b bVar = pVar.f21660j;
            if (bVar != null) {
                fVar.A(18, v.h(bVar.b()));
                fVar.A(19, bVar.g() ? 1L : 0L);
                fVar.A(20, bVar.h() ? 1L : 0L);
                fVar.A(21, bVar.f() ? 1L : 0L);
                fVar.A(22, bVar.i() ? 1L : 0L);
                fVar.A(23, bVar.c());
                fVar.A(24, bVar.d());
                byte[] bArrC = v.c(bVar.a());
                if (bArrC != null) {
                    fVar.F(25, bArrC);
                    return;
                }
            } else {
                fVar.S(18);
                fVar.S(19);
                fVar.S(20);
                fVar.S(21);
                fVar.S(22);
                fVar.S(23);
                fVar.S(24);
            }
            fVar.S(25);
        }
    }

    class b extends m0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class c extends m0.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class d extends m0.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    class e extends m0.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class f extends m0.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class g extends m0.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class h extends m0.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class i extends m0.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f21671a = hVar;
        this.f21672b = new a(hVar);
        this.f21673c = new b(hVar);
        this.f21674d = new c(hVar);
        this.f21675e = new d(hVar);
        this.f21676f = new e(hVar);
        this.f21677g = new f(hVar);
        this.f21678h = new g(hVar);
        this.f21679i = new h(hVar);
        this.f21680j = new i(hVar);
    }

    @Override // f1.q
    public void a(String str) {
        this.f21671a.b();
        q0.f fVarA = this.f21673c.a();
        if (str == null) {
            fVarA.S(1);
        } else {
            fVarA.p(1, str);
        }
        this.f21671a.c();
        try {
            fVarA.r();
            this.f21671a.r();
        } finally {
            this.f21671a.g();
            this.f21673c.f(fVarA);
        }
    }

    @Override // f1.q
    public int b(String str, long j8) {
        this.f21671a.b();
        q0.f fVarA = this.f21678h.a();
        fVarA.A(1, j8);
        if (str == null) {
            fVarA.S(2);
        } else {
            fVarA.p(2, str);
        }
        this.f21671a.c();
        try {
            int iR = fVarA.r();
            this.f21671a.r();
            return iR;
        } finally {
            this.f21671a.g();
            this.f21678h.f(fVarA);
        }
    }

    @Override // f1.q
    public List<p.b> c(String str) {
        m0.c cVarD = m0.c.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            int iB = o0.b.b(cursorB, "id");
            int iB2 = o0.b.b(cursorB, "state");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f21669a = cursorB.getString(iB);
                bVar.f21670b = v.g(cursorB.getInt(iB2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.q
    public List<p> d(long j8) throws Throwable {
        m0.c cVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        m0.c cVarD = m0.c.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        cVarD.A(1, j8);
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            iB = o0.b.b(cursorB, "required_network_type");
            iB2 = o0.b.b(cursorB, "requires_charging");
            iB3 = o0.b.b(cursorB, "requires_device_idle");
            iB4 = o0.b.b(cursorB, "requires_battery_not_low");
            iB5 = o0.b.b(cursorB, "requires_storage_not_low");
            iB6 = o0.b.b(cursorB, "trigger_content_update_delay");
            iB7 = o0.b.b(cursorB, "trigger_max_content_delay");
            iB8 = o0.b.b(cursorB, "content_uri_triggers");
            iB9 = o0.b.b(cursorB, "id");
            iB10 = o0.b.b(cursorB, "state");
            iB11 = o0.b.b(cursorB, "worker_class_name");
            iB12 = o0.b.b(cursorB, "input_merger_class_name");
            iB13 = o0.b.b(cursorB, "input");
            iB14 = o0.b.b(cursorB, "output");
            cVar = cVarD;
        } catch (Throwable th) {
            th = th;
            cVar = cVarD;
        }
        try {
            int iB15 = o0.b.b(cursorB, "initial_delay");
            int iB16 = o0.b.b(cursorB, "interval_duration");
            int iB17 = o0.b.b(cursorB, "flex_duration");
            int iB18 = o0.b.b(cursorB, "run_attempt_count");
            int iB19 = o0.b.b(cursorB, "backoff_policy");
            int iB20 = o0.b.b(cursorB, "backoff_delay_duration");
            int iB21 = o0.b.b(cursorB, "period_start_time");
            int iB22 = o0.b.b(cursorB, "minimum_retention_duration");
            int iB23 = o0.b.b(cursorB, "schedule_requested_at");
            int iB24 = o0.b.b(cursorB, "run_in_foreground");
            int iB25 = o0.b.b(cursorB, "out_of_quota_policy");
            int i8 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i9 = iB9;
                String string2 = cursorB.getString(iB11);
                int i10 = iB11;
                x0.b bVar = new x0.b();
                int i11 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i12 = iB2;
                int i13 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f21652b = v.g(cursorB.getInt(iB10));
                pVar.f21654d = cursorB.getString(iB12);
                pVar.f21655e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i14 = i8;
                pVar.f21656f = androidx.work.b.g(cursorB.getBlob(i14));
                int i15 = iB15;
                i8 = i14;
                pVar.f21657g = cursorB.getLong(i15);
                int i16 = iB12;
                int i17 = iB16;
                pVar.f21658h = cursorB.getLong(i17);
                int i18 = iB4;
                int i19 = iB17;
                pVar.f21659i = cursorB.getLong(i19);
                int i20 = iB18;
                pVar.f21661k = cursorB.getInt(i20);
                int i21 = iB19;
                pVar.f21662l = v.d(cursorB.getInt(i21));
                iB17 = i19;
                int i22 = iB20;
                pVar.f21663m = cursorB.getLong(i22);
                int i23 = iB21;
                pVar.f21664n = cursorB.getLong(i23);
                iB21 = i23;
                int i24 = iB22;
                pVar.f21665o = cursorB.getLong(i24);
                int i25 = iB23;
                pVar.f21666p = cursorB.getLong(i25);
                int i26 = iB24;
                pVar.f21667q = cursorB.getInt(i26) != 0;
                int i27 = iB25;
                pVar.f21668r = v.f(cursorB.getInt(i27));
                pVar.f21660j = bVar;
                arrayList.add(pVar);
                iB2 = i12;
                iB25 = i27;
                iB12 = i16;
                iB15 = i15;
                iB16 = i17;
                iB18 = i20;
                iB23 = i25;
                iB9 = i9;
                iB11 = i10;
                iB = i11;
                iB24 = i26;
                iB22 = i24;
                iB3 = i13;
                iB20 = i22;
                iB4 = i18;
                iB19 = i21;
            }
            cursorB.close();
            cVar.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            cVar.o();
            throw th;
        }
    }

    @Override // f1.q
    public List<p> e(int i8) throws Throwable {
        m0.c cVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        m0.c cVarD = m0.c.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        cVarD.A(1, i8);
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            iB = o0.b.b(cursorB, "required_network_type");
            iB2 = o0.b.b(cursorB, "requires_charging");
            iB3 = o0.b.b(cursorB, "requires_device_idle");
            iB4 = o0.b.b(cursorB, "requires_battery_not_low");
            iB5 = o0.b.b(cursorB, "requires_storage_not_low");
            iB6 = o0.b.b(cursorB, "trigger_content_update_delay");
            iB7 = o0.b.b(cursorB, "trigger_max_content_delay");
            iB8 = o0.b.b(cursorB, "content_uri_triggers");
            iB9 = o0.b.b(cursorB, "id");
            iB10 = o0.b.b(cursorB, "state");
            iB11 = o0.b.b(cursorB, "worker_class_name");
            iB12 = o0.b.b(cursorB, "input_merger_class_name");
            iB13 = o0.b.b(cursorB, "input");
            iB14 = o0.b.b(cursorB, "output");
            cVar = cVarD;
        } catch (Throwable th) {
            th = th;
            cVar = cVarD;
        }
        try {
            int iB15 = o0.b.b(cursorB, "initial_delay");
            int iB16 = o0.b.b(cursorB, "interval_duration");
            int iB17 = o0.b.b(cursorB, "flex_duration");
            int iB18 = o0.b.b(cursorB, "run_attempt_count");
            int iB19 = o0.b.b(cursorB, "backoff_policy");
            int iB20 = o0.b.b(cursorB, "backoff_delay_duration");
            int iB21 = o0.b.b(cursorB, "period_start_time");
            int iB22 = o0.b.b(cursorB, "minimum_retention_duration");
            int iB23 = o0.b.b(cursorB, "schedule_requested_at");
            int iB24 = o0.b.b(cursorB, "run_in_foreground");
            int iB25 = o0.b.b(cursorB, "out_of_quota_policy");
            int i9 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i10 = iB9;
                String string2 = cursorB.getString(iB11);
                int i11 = iB11;
                x0.b bVar = new x0.b();
                int i12 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i13 = iB2;
                int i14 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f21652b = v.g(cursorB.getInt(iB10));
                pVar.f21654d = cursorB.getString(iB12);
                pVar.f21655e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i15 = i9;
                pVar.f21656f = androidx.work.b.g(cursorB.getBlob(i15));
                i9 = i15;
                int i16 = iB15;
                pVar.f21657g = cursorB.getLong(i16);
                int i17 = iB12;
                int i18 = iB16;
                pVar.f21658h = cursorB.getLong(i18);
                int i19 = iB4;
                int i20 = iB17;
                pVar.f21659i = cursorB.getLong(i20);
                int i21 = iB18;
                pVar.f21661k = cursorB.getInt(i21);
                int i22 = iB19;
                pVar.f21662l = v.d(cursorB.getInt(i22));
                iB17 = i20;
                int i23 = iB20;
                pVar.f21663m = cursorB.getLong(i23);
                int i24 = iB21;
                pVar.f21664n = cursorB.getLong(i24);
                iB21 = i24;
                int i25 = iB22;
                pVar.f21665o = cursorB.getLong(i25);
                int i26 = iB23;
                pVar.f21666p = cursorB.getLong(i26);
                int i27 = iB24;
                pVar.f21667q = cursorB.getInt(i27) != 0;
                int i28 = iB25;
                pVar.f21668r = v.f(cursorB.getInt(i28));
                pVar.f21660j = bVar;
                arrayList.add(pVar);
                iB25 = i28;
                iB2 = i13;
                iB12 = i17;
                iB15 = i16;
                iB16 = i18;
                iB18 = i21;
                iB23 = i26;
                iB9 = i10;
                iB11 = i11;
                iB = i12;
                iB24 = i27;
                iB22 = i25;
                iB3 = i14;
                iB20 = i23;
                iB4 = i19;
                iB19 = i22;
            }
            cursorB.close();
            cVar.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            cVar.o();
            throw th;
        }
    }

    @Override // f1.q
    public List<p> f() throws Throwable {
        m0.c cVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        m0.c cVarD = m0.c.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            iB = o0.b.b(cursorB, "required_network_type");
            iB2 = o0.b.b(cursorB, "requires_charging");
            iB3 = o0.b.b(cursorB, "requires_device_idle");
            iB4 = o0.b.b(cursorB, "requires_battery_not_low");
            iB5 = o0.b.b(cursorB, "requires_storage_not_low");
            iB6 = o0.b.b(cursorB, "trigger_content_update_delay");
            iB7 = o0.b.b(cursorB, "trigger_max_content_delay");
            iB8 = o0.b.b(cursorB, "content_uri_triggers");
            iB9 = o0.b.b(cursorB, "id");
            iB10 = o0.b.b(cursorB, "state");
            iB11 = o0.b.b(cursorB, "worker_class_name");
            iB12 = o0.b.b(cursorB, "input_merger_class_name");
            iB13 = o0.b.b(cursorB, "input");
            iB14 = o0.b.b(cursorB, "output");
            cVar = cVarD;
        } catch (Throwable th) {
            th = th;
            cVar = cVarD;
        }
        try {
            int iB15 = o0.b.b(cursorB, "initial_delay");
            int iB16 = o0.b.b(cursorB, "interval_duration");
            int iB17 = o0.b.b(cursorB, "flex_duration");
            int iB18 = o0.b.b(cursorB, "run_attempt_count");
            int iB19 = o0.b.b(cursorB, "backoff_policy");
            int iB20 = o0.b.b(cursorB, "backoff_delay_duration");
            int iB21 = o0.b.b(cursorB, "period_start_time");
            int iB22 = o0.b.b(cursorB, "minimum_retention_duration");
            int iB23 = o0.b.b(cursorB, "schedule_requested_at");
            int iB24 = o0.b.b(cursorB, "run_in_foreground");
            int iB25 = o0.b.b(cursorB, "out_of_quota_policy");
            int i8 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i9 = iB9;
                String string2 = cursorB.getString(iB11);
                int i10 = iB11;
                x0.b bVar = new x0.b();
                int i11 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i12 = iB2;
                int i13 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f21652b = v.g(cursorB.getInt(iB10));
                pVar.f21654d = cursorB.getString(iB12);
                pVar.f21655e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i14 = i8;
                pVar.f21656f = androidx.work.b.g(cursorB.getBlob(i14));
                i8 = i14;
                int i15 = iB15;
                pVar.f21657g = cursorB.getLong(i15);
                int i16 = iB13;
                int i17 = iB16;
                pVar.f21658h = cursorB.getLong(i17);
                int i18 = iB4;
                int i19 = iB17;
                pVar.f21659i = cursorB.getLong(i19);
                int i20 = iB18;
                pVar.f21661k = cursorB.getInt(i20);
                int i21 = iB19;
                pVar.f21662l = v.d(cursorB.getInt(i21));
                iB17 = i19;
                int i22 = iB20;
                pVar.f21663m = cursorB.getLong(i22);
                int i23 = iB21;
                pVar.f21664n = cursorB.getLong(i23);
                iB21 = i23;
                int i24 = iB22;
                pVar.f21665o = cursorB.getLong(i24);
                int i25 = iB23;
                pVar.f21666p = cursorB.getLong(i25);
                int i26 = iB24;
                pVar.f21667q = cursorB.getInt(i26) != 0;
                int i27 = iB25;
                pVar.f21668r = v.f(cursorB.getInt(i27));
                pVar.f21660j = bVar;
                arrayList.add(pVar);
                iB25 = i27;
                iB2 = i12;
                iB13 = i16;
                iB15 = i15;
                iB16 = i17;
                iB18 = i20;
                iB23 = i25;
                iB9 = i9;
                iB11 = i10;
                iB = i11;
                iB24 = i26;
                iB22 = i24;
                iB3 = i13;
                iB20 = i22;
                iB4 = i18;
                iB19 = i21;
            }
            cursorB.close();
            cVar.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            cVar.o();
            throw th;
        }
    }

    @Override // f1.q
    public void g(String str, androidx.work.b bVar) throws Throwable {
        this.f21671a.b();
        q0.f fVarA = this.f21674d.a();
        byte[] bArrK = androidx.work.b.k(bVar);
        if (bArrK == null) {
            fVarA.S(1);
        } else {
            fVarA.F(1, bArrK);
        }
        if (str == null) {
            fVarA.S(2);
        } else {
            fVarA.p(2, str);
        }
        this.f21671a.c();
        try {
            fVarA.r();
            this.f21671a.r();
        } finally {
            this.f21671a.g();
            this.f21674d.f(fVarA);
        }
    }

    @Override // f1.q
    public List<p> h() throws Throwable {
        m0.c cVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        m0.c cVarD = m0.c.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            iB = o0.b.b(cursorB, "required_network_type");
            iB2 = o0.b.b(cursorB, "requires_charging");
            iB3 = o0.b.b(cursorB, "requires_device_idle");
            iB4 = o0.b.b(cursorB, "requires_battery_not_low");
            iB5 = o0.b.b(cursorB, "requires_storage_not_low");
            iB6 = o0.b.b(cursorB, "trigger_content_update_delay");
            iB7 = o0.b.b(cursorB, "trigger_max_content_delay");
            iB8 = o0.b.b(cursorB, "content_uri_triggers");
            iB9 = o0.b.b(cursorB, "id");
            iB10 = o0.b.b(cursorB, "state");
            iB11 = o0.b.b(cursorB, "worker_class_name");
            iB12 = o0.b.b(cursorB, "input_merger_class_name");
            iB13 = o0.b.b(cursorB, "input");
            iB14 = o0.b.b(cursorB, "output");
            cVar = cVarD;
        } catch (Throwable th) {
            th = th;
            cVar = cVarD;
        }
        try {
            int iB15 = o0.b.b(cursorB, "initial_delay");
            int iB16 = o0.b.b(cursorB, "interval_duration");
            int iB17 = o0.b.b(cursorB, "flex_duration");
            int iB18 = o0.b.b(cursorB, "run_attempt_count");
            int iB19 = o0.b.b(cursorB, "backoff_policy");
            int iB20 = o0.b.b(cursorB, "backoff_delay_duration");
            int iB21 = o0.b.b(cursorB, "period_start_time");
            int iB22 = o0.b.b(cursorB, "minimum_retention_duration");
            int iB23 = o0.b.b(cursorB, "schedule_requested_at");
            int iB24 = o0.b.b(cursorB, "run_in_foreground");
            int iB25 = o0.b.b(cursorB, "out_of_quota_policy");
            int i8 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i9 = iB9;
                String string2 = cursorB.getString(iB11);
                int i10 = iB11;
                x0.b bVar = new x0.b();
                int i11 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i12 = iB2;
                int i13 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f21652b = v.g(cursorB.getInt(iB10));
                pVar.f21654d = cursorB.getString(iB12);
                pVar.f21655e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i14 = i8;
                pVar.f21656f = androidx.work.b.g(cursorB.getBlob(i14));
                i8 = i14;
                int i15 = iB15;
                pVar.f21657g = cursorB.getLong(i15);
                int i16 = iB13;
                int i17 = iB16;
                pVar.f21658h = cursorB.getLong(i17);
                int i18 = iB4;
                int i19 = iB17;
                pVar.f21659i = cursorB.getLong(i19);
                int i20 = iB18;
                pVar.f21661k = cursorB.getInt(i20);
                int i21 = iB19;
                pVar.f21662l = v.d(cursorB.getInt(i21));
                iB17 = i19;
                int i22 = iB20;
                pVar.f21663m = cursorB.getLong(i22);
                int i23 = iB21;
                pVar.f21664n = cursorB.getLong(i23);
                iB21 = i23;
                int i24 = iB22;
                pVar.f21665o = cursorB.getLong(i24);
                int i25 = iB23;
                pVar.f21666p = cursorB.getLong(i25);
                int i26 = iB24;
                pVar.f21667q = cursorB.getInt(i26) != 0;
                int i27 = iB25;
                pVar.f21668r = v.f(cursorB.getInt(i27));
                pVar.f21660j = bVar;
                arrayList.add(pVar);
                iB25 = i27;
                iB2 = i12;
                iB13 = i16;
                iB15 = i15;
                iB16 = i17;
                iB18 = i20;
                iB23 = i25;
                iB9 = i9;
                iB11 = i10;
                iB = i11;
                iB24 = i26;
                iB22 = i24;
                iB3 = i13;
                iB20 = i22;
                iB4 = i18;
                iB19 = i21;
            }
            cursorB.close();
            cVar.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            cVar.o();
            throw th;
        }
    }

    @Override // f1.q
    public boolean i() {
        boolean z7 = false;
        m0.c cVarD = m0.c.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) != 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.q
    public List<String> j(String str) {
        m0.c cVarD = m0.c.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.q
    public int k(x0.s sVar, String... strArr) {
        this.f21671a.b();
        StringBuilder sbB = o0.e.b();
        sbB.append("UPDATE workspec SET state=");
        sbB.append("?");
        sbB.append(" WHERE id IN (");
        o0.e.a(sbB, strArr.length);
        sbB.append(")");
        q0.f fVarD = this.f21671a.d(sbB.toString());
        fVarD.A(1, v.j(sVar));
        int i8 = 2;
        for (String str : strArr) {
            if (str == null) {
                fVarD.S(i8);
            } else {
                fVarD.p(i8, str);
            }
            i8++;
        }
        this.f21671a.c();
        try {
            int iR = fVarD.r();
            this.f21671a.r();
            return iR;
        } finally {
            this.f21671a.g();
        }
    }

    @Override // f1.q
    public x0.s l(String str) {
        m0.c cVarD = m0.c.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            return cursorB.moveToFirst() ? v.g(cursorB.getInt(0)) : null;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.q
    public p m(String str) throws Throwable {
        m0.c cVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        p pVar;
        m0.c cVarD = m0.c.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            iB = o0.b.b(cursorB, "required_network_type");
            iB2 = o0.b.b(cursorB, "requires_charging");
            iB3 = o0.b.b(cursorB, "requires_device_idle");
            iB4 = o0.b.b(cursorB, "requires_battery_not_low");
            iB5 = o0.b.b(cursorB, "requires_storage_not_low");
            iB6 = o0.b.b(cursorB, "trigger_content_update_delay");
            iB7 = o0.b.b(cursorB, "trigger_max_content_delay");
            iB8 = o0.b.b(cursorB, "content_uri_triggers");
            iB9 = o0.b.b(cursorB, "id");
            iB10 = o0.b.b(cursorB, "state");
            iB11 = o0.b.b(cursorB, "worker_class_name");
            iB12 = o0.b.b(cursorB, "input_merger_class_name");
            iB13 = o0.b.b(cursorB, "input");
            iB14 = o0.b.b(cursorB, "output");
            cVar = cVarD;
        } catch (Throwable th) {
            th = th;
            cVar = cVarD;
        }
        try {
            int iB15 = o0.b.b(cursorB, "initial_delay");
            int iB16 = o0.b.b(cursorB, "interval_duration");
            int iB17 = o0.b.b(cursorB, "flex_duration");
            int iB18 = o0.b.b(cursorB, "run_attempt_count");
            int iB19 = o0.b.b(cursorB, "backoff_policy");
            int iB20 = o0.b.b(cursorB, "backoff_delay_duration");
            int iB21 = o0.b.b(cursorB, "period_start_time");
            int iB22 = o0.b.b(cursorB, "minimum_retention_duration");
            int iB23 = o0.b.b(cursorB, "schedule_requested_at");
            int iB24 = o0.b.b(cursorB, "run_in_foreground");
            int iB25 = o0.b.b(cursorB, "out_of_quota_policy");
            if (cursorB.moveToFirst()) {
                String string = cursorB.getString(iB9);
                String string2 = cursorB.getString(iB11);
                x0.b bVar = new x0.b();
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar2 = new p(string, string2);
                pVar2.f21652b = v.g(cursorB.getInt(iB10));
                pVar2.f21654d = cursorB.getString(iB12);
                pVar2.f21655e = androidx.work.b.g(cursorB.getBlob(iB13));
                pVar2.f21656f = androidx.work.b.g(cursorB.getBlob(iB14));
                pVar2.f21657g = cursorB.getLong(iB15);
                pVar2.f21658h = cursorB.getLong(iB16);
                pVar2.f21659i = cursorB.getLong(iB17);
                pVar2.f21661k = cursorB.getInt(iB18);
                pVar2.f21662l = v.d(cursorB.getInt(iB19));
                pVar2.f21663m = cursorB.getLong(iB20);
                pVar2.f21664n = cursorB.getLong(iB21);
                pVar2.f21665o = cursorB.getLong(iB22);
                pVar2.f21666p = cursorB.getLong(iB23);
                pVar2.f21667q = cursorB.getInt(iB24) != 0;
                pVar2.f21668r = v.f(cursorB.getInt(iB25));
                pVar2.f21660j = bVar;
                pVar = pVar2;
            } else {
                pVar = null;
            }
            cursorB.close();
            cVar.o();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            cVar.o();
            throw th;
        }
    }

    @Override // f1.q
    public int n(String str) {
        this.f21671a.b();
        q0.f fVarA = this.f21677g.a();
        if (str == null) {
            fVarA.S(1);
        } else {
            fVarA.p(1, str);
        }
        this.f21671a.c();
        try {
            int iR = fVarA.r();
            this.f21671a.r();
            return iR;
        } finally {
            this.f21671a.g();
            this.f21677g.f(fVarA);
        }
    }

    @Override // f1.q
    public void o(p pVar) {
        this.f21671a.b();
        this.f21671a.c();
        try {
            this.f21672b.h(pVar);
            this.f21671a.r();
        } finally {
            this.f21671a.g();
        }
    }

    @Override // f1.q
    public List<String> p(String str) {
        m0.c cVarD = m0.c.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.q
    public List<androidx.work.b> q(String str) {
        m0.c cVarD = m0.c.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.b.g(cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.q
    public int r(String str) {
        this.f21671a.b();
        q0.f fVarA = this.f21676f.a();
        if (str == null) {
            fVarA.S(1);
        } else {
            fVarA.p(1, str);
        }
        this.f21671a.c();
        try {
            int iR = fVarA.r();
            this.f21671a.r();
            return iR;
        } finally {
            this.f21671a.g();
            this.f21676f.f(fVarA);
        }
    }

    @Override // f1.q
    public void s(String str, long j8) {
        this.f21671a.b();
        q0.f fVarA = this.f21675e.a();
        fVarA.A(1, j8);
        if (str == null) {
            fVarA.S(2);
        } else {
            fVarA.p(2, str);
        }
        this.f21671a.c();
        try {
            fVarA.r();
            this.f21671a.r();
        } finally {
            this.f21671a.g();
            this.f21675e.f(fVarA);
        }
    }

    @Override // f1.q
    public List<p> t(int i8) throws Throwable {
        m0.c cVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        m0.c cVarD = m0.c.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        cVarD.A(1, i8);
        this.f21671a.b();
        Cursor cursorB = o0.c.b(this.f21671a, cVarD, false, null);
        try {
            iB = o0.b.b(cursorB, "required_network_type");
            iB2 = o0.b.b(cursorB, "requires_charging");
            iB3 = o0.b.b(cursorB, "requires_device_idle");
            iB4 = o0.b.b(cursorB, "requires_battery_not_low");
            iB5 = o0.b.b(cursorB, "requires_storage_not_low");
            iB6 = o0.b.b(cursorB, "trigger_content_update_delay");
            iB7 = o0.b.b(cursorB, "trigger_max_content_delay");
            iB8 = o0.b.b(cursorB, "content_uri_triggers");
            iB9 = o0.b.b(cursorB, "id");
            iB10 = o0.b.b(cursorB, "state");
            iB11 = o0.b.b(cursorB, "worker_class_name");
            iB12 = o0.b.b(cursorB, "input_merger_class_name");
            iB13 = o0.b.b(cursorB, "input");
            iB14 = o0.b.b(cursorB, "output");
            cVar = cVarD;
        } catch (Throwable th) {
            th = th;
            cVar = cVarD;
        }
        try {
            int iB15 = o0.b.b(cursorB, "initial_delay");
            int iB16 = o0.b.b(cursorB, "interval_duration");
            int iB17 = o0.b.b(cursorB, "flex_duration");
            int iB18 = o0.b.b(cursorB, "run_attempt_count");
            int iB19 = o0.b.b(cursorB, "backoff_policy");
            int iB20 = o0.b.b(cursorB, "backoff_delay_duration");
            int iB21 = o0.b.b(cursorB, "period_start_time");
            int iB22 = o0.b.b(cursorB, "minimum_retention_duration");
            int iB23 = o0.b.b(cursorB, "schedule_requested_at");
            int iB24 = o0.b.b(cursorB, "run_in_foreground");
            int iB25 = o0.b.b(cursorB, "out_of_quota_policy");
            int i9 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i10 = iB9;
                String string2 = cursorB.getString(iB11);
                int i11 = iB11;
                x0.b bVar = new x0.b();
                int i12 = iB;
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                int i13 = iB2;
                int i14 = iB3;
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar = new p(string, string2);
                pVar.f21652b = v.g(cursorB.getInt(iB10));
                pVar.f21654d = cursorB.getString(iB12);
                pVar.f21655e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i15 = i9;
                pVar.f21656f = androidx.work.b.g(cursorB.getBlob(i15));
                i9 = i15;
                int i16 = iB15;
                pVar.f21657g = cursorB.getLong(i16);
                int i17 = iB12;
                int i18 = iB16;
                pVar.f21658h = cursorB.getLong(i18);
                int i19 = iB4;
                int i20 = iB17;
                pVar.f21659i = cursorB.getLong(i20);
                int i21 = iB18;
                pVar.f21661k = cursorB.getInt(i21);
                int i22 = iB19;
                pVar.f21662l = v.d(cursorB.getInt(i22));
                iB17 = i20;
                int i23 = iB20;
                pVar.f21663m = cursorB.getLong(i23);
                int i24 = iB21;
                pVar.f21664n = cursorB.getLong(i24);
                iB21 = i24;
                int i25 = iB22;
                pVar.f21665o = cursorB.getLong(i25);
                int i26 = iB23;
                pVar.f21666p = cursorB.getLong(i26);
                int i27 = iB24;
                pVar.f21667q = cursorB.getInt(i27) != 0;
                int i28 = iB25;
                pVar.f21668r = v.f(cursorB.getInt(i28));
                pVar.f21660j = bVar;
                arrayList.add(pVar);
                iB25 = i28;
                iB2 = i13;
                iB12 = i17;
                iB15 = i16;
                iB16 = i18;
                iB18 = i21;
                iB23 = i26;
                iB9 = i10;
                iB11 = i11;
                iB = i12;
                iB24 = i27;
                iB22 = i25;
                iB3 = i14;
                iB20 = i23;
                iB4 = i19;
                iB19 = i22;
            }
            cursorB.close();
            cVar.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            cVar.o();
            throw th;
        }
    }

    @Override // f1.q
    public int u() {
        this.f21671a.b();
        q0.f fVarA = this.f21679i.a();
        this.f21671a.c();
        try {
            int iR = fVarA.r();
            this.f21671a.r();
            return iR;
        } finally {
            this.f21671a.g();
            this.f21679i.f(fVarA);
        }
    }
}

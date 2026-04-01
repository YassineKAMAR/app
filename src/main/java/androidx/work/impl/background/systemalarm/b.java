package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import f1.p;
import java.util.HashMap;
import java.util.Map;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public class b implements y0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3138d = j.f("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, y0.b> f3140b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f3141c = new Object();

    b(Context context) {
        this.f3139a = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent c(Context context, String str, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z7);
        return intent;
    }

    static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i8, e eVar) {
        j.c().a(f3138d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f3139a, i8, eVar).a();
    }

    private void i(Intent intent, int i8, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f3141c) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            j jVarC = j.c();
            String str = f3138d;
            jVarC.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f3140b.containsKey(string)) {
                j.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                d dVar = new d(this.f3139a, i8, string, eVar);
                this.f3140b.put(string, dVar);
                dVar.e();
            }
        }
    }

    private void j(Intent intent, int i8) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z7 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        j.c().a(f3138d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i8)), new Throwable[0]);
        d(string, z7);
    }

    private void k(Intent intent, int i8, e eVar) {
        j.c().a(f3138d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i8)), new Throwable[0]);
        eVar.g().s();
    }

    private void l(Intent intent, int i8, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j jVarC = j.c();
        String str = f3138d;
        jVarC.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseO = eVar.g().o();
        workDatabaseO.c();
        try {
            p pVarM = workDatabaseO.B().m(string);
            if (pVarM == null) {
                j.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (pVarM.f21652b.a()) {
                j.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = pVarM.a();
            if (pVarM.b()) {
                j.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                a.c(this.f3139a, eVar.g(), string, jA);
                eVar.k(new e.b(eVar, a(this.f3139a), i8));
            } else {
                j.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                a.c(this.f3139a, eVar.g(), string, jA);
            }
            workDatabaseO.r();
        } finally {
            workDatabaseO.g();
        }
    }

    private void m(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j.c().a(f3138d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().x(string);
        a.a(this.f3139a, eVar.g(), string);
        eVar.d(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // y0.b
    public void d(String str, boolean z7) {
        synchronized (this.f3141c) {
            y0.b bVarRemove = this.f3140b.remove(str);
            if (bVarRemove != null) {
                bVarRemove.d(str, z7);
            }
        }
    }

    boolean o() {
        boolean z7;
        synchronized (this.f3141c) {
            z7 = !this.f3140b.isEmpty();
        }
        return z7;
    }

    void p(Intent intent, int i8, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i8, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i8, eVar);
            return;
        }
        if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            j.c().b(f3138d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i8, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i8, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i8);
        } else {
            j.c().h(f3138d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}

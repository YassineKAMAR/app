package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import b1.c;
import b1.d;
import f1.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import x0.e;
import x0.j;
import y0.i;

/* JADX INFO: loaded from: classes.dex */
public class a implements c, y0.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f3194k = j.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f3196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h1.a f3197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f3198d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f3199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<String, e> f3200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<String, p> f3201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Set<p> f3202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final d f3203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f3204j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0048a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f3205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3206b;

        RunnableC0048a(WorkDatabase workDatabase, String str) {
            this.f3205a = workDatabase;
            this.f3206b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVarM = this.f3205a.B().m(this.f3206b);
            if (pVarM == null || !pVarM.b()) {
                return;
            }
            synchronized (a.this.f3198d) {
                a.this.f3201g.put(this.f3206b, pVarM);
                a.this.f3202h.add(pVarM);
                a aVar = a.this;
                aVar.f3203i.d(aVar.f3202h);
            }
        }
    }

    interface b {
        void c(int i8, int i9, Notification notification);

        void d(int i8, Notification notification);

        void e(int i8);

        void stop();
    }

    a(Context context) {
        this.f3195a = context;
        i iVarK = i.k(context);
        this.f3196b = iVarK;
        h1.a aVarP = iVarK.p();
        this.f3197c = aVarP;
        this.f3199e = null;
        this.f3200f = new LinkedHashMap();
        this.f3202h = new HashSet();
        this.f3201g = new HashMap();
        this.f3203i = new d(this.f3195a, aVarP, this);
        this.f3196b.m().c(this);
    }

    public static Intent a(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        j.c().d(f3194k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f3196b.f(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.c().a(f3194k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f3204j == null) {
            return;
        }
        this.f3200f.put(stringExtra, new e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f3199e)) {
            this.f3199e = stringExtra;
            this.f3204j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f3204j.d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, e>> it = this.f3200f.entrySet().iterator();
        while (it.hasNext()) {
            iA |= it.next().getValue().a();
        }
        e eVar = this.f3200f.get(this.f3199e);
        if (eVar != null) {
            this.f3204j.c(eVar.c(), iA, eVar.b());
        }
    }

    private void i(Intent intent) {
        j.c().d(f3194k, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f3197c.b(new RunnableC0048a(this.f3196b.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // b1.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            j.c().a(f3194k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f3196b.w(str);
        }
    }

    @Override // y0.b
    public void d(String str, boolean z7) {
        Map.Entry<String, e> next;
        synchronized (this.f3198d) {
            p pVarRemove = this.f3201g.remove(str);
            if (pVarRemove != null ? this.f3202h.remove(pVarRemove) : false) {
                this.f3203i.d(this.f3202h);
            }
        }
        e eVarRemove = this.f3200f.remove(str);
        if (str.equals(this.f3199e) && this.f3200f.size() > 0) {
            Iterator<Map.Entry<String, e>> it = this.f3200f.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f3199e = next.getKey();
            if (this.f3204j != null) {
                e value = next.getValue();
                this.f3204j.c(value.c(), value.a(), value.b());
                this.f3204j.e(value.c());
            }
        }
        b bVar = this.f3204j;
        if (eVarRemove == null || bVar == null) {
            return;
        }
        j.c().a(f3194k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(eVarRemove.c()), str, Integer.valueOf(eVarRemove.a())), new Throwable[0]);
        bVar.e(eVarRemove.c());
    }

    @Override // b1.c
    public void f(List<String> list) {
    }

    void j(Intent intent) {
        j.c().d(f3194k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f3204j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void k() {
        this.f3204j = null;
        synchronized (this.f3198d) {
            this.f3203i.e();
        }
        this.f3196b.m().i(this);
    }

    void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                g(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    j(intent);
                    return;
                }
                return;
            }
        }
        h(intent);
    }

    void m(b bVar) {
        if (this.f3204j != null) {
            j.c().b(f3194k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f3204j = bVar;
        }
    }
}

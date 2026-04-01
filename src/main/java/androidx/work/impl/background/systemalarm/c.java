package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import f1.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3142e = j.f("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f3145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b1.d f3146d;

    c(Context context, int i8, e eVar) {
        this.f3143a = context;
        this.f3144b = i8;
        this.f3145c = eVar;
        this.f3146d = new b1.d(context, eVar.f(), null);
    }

    void a() {
        List<p> listF = this.f3145c.g().o().B().f();
        ConstraintProxy.a(this.f3143a, listF);
        this.f3146d.d(listF);
        ArrayList arrayList = new ArrayList(listF.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (p pVar : listF) {
            String str = pVar.f21651a;
            if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || this.f3146d.c(str))) {
                arrayList.add(pVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((p) it.next()).f21651a;
            Intent intentB = b.b(this.f3143a, str2);
            j.c().a(f3142e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f3145c;
            eVar.k(new e.b(eVar, intentB, this.f3144b));
        }
        this.f3146d.e();
    }
}

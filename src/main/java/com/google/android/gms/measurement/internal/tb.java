package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.w4 f20513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f20514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ pb f20516d;

    private tb(pb pbVar) {
        this.f20516d = pbVar;
    }

    final com.google.android.gms.internal.measurement.w4 a(String str, com.google.android.gms.internal.measurement.w4 w4Var) {
        p4 p4VarI;
        String str2;
        Object obj;
        String strA0 = w4Var.a0();
        List<com.google.android.gms.internal.measurement.y4> listB0 = w4Var.b0();
        this.f20516d.l();
        Long l8 = (Long) db.e0(w4Var, "_eid");
        boolean z7 = l8 != null;
        if (z7 && strA0.equals("_ep")) {
            a3.o.j(l8);
            this.f20516d.l();
            strA0 = (String) db.e0(w4Var, "_en");
            if (TextUtils.isEmpty(strA0)) {
                this.f20516d.t().I().b("Extra parameter without an event name. eventId", l8);
                return null;
            }
            if (this.f20513a == null || this.f20514b == null || l8.longValue() != this.f20514b.longValue()) {
                Pair<com.google.android.gms.internal.measurement.w4, Long> pairH = this.f20516d.n().H(str, l8);
                if (pairH == null || (obj = pairH.first) == null) {
                    this.f20516d.t().I().c("Extra parameter without existing main event. eventName, eventId", strA0, l8);
                    return null;
                }
                this.f20513a = (com.google.android.gms.internal.measurement.w4) obj;
                this.f20515c = ((Long) pairH.second).longValue();
                this.f20516d.l();
                this.f20514b = (Long) db.e0(this.f20513a, "_eid");
            }
            long j8 = this.f20515c - 1;
            this.f20515c = j8;
            if (j8 <= 0) {
                m mVarN = this.f20516d.n();
                mVarN.i();
                mVarN.t().K().b("Clearing complex main event info. appId", str);
                try {
                    mVarN.B().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e8) {
                    mVarN.t().G().b("Error clearing complex main event", e8);
                }
            } else {
                this.f20516d.n().j0(str, l8, this.f20515c, this.f20513a);
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.y4 y4Var : this.f20513a.b0()) {
                this.f20516d.l();
                if (db.E(w4Var, y4Var.b0()) == null) {
                    arrayList.add(y4Var);
                }
            }
            if (arrayList.isEmpty()) {
                p4VarI = this.f20516d.t().I();
                str2 = "No unique parameters in main event. eventName";
                p4VarI.b(str2, strA0);
            } else {
                arrayList.addAll(listB0);
                listB0 = arrayList;
            }
        } else if (z7) {
            this.f20514b = l8;
            this.f20513a = w4Var;
            this.f20516d.l();
            Object objE0 = db.e0(w4Var, "_epc");
            long jLongValue = ((Long) (objE0 != null ? objE0 : 0L)).longValue();
            this.f20515c = jLongValue;
            if (jLongValue <= 0) {
                p4VarI = this.f20516d.t().I();
                str2 = "Complex event with zero extra param count. eventName";
                p4VarI.b(str2, strA0);
            } else {
                this.f20516d.n().j0(str, (Long) a3.o.j(l8), this.f20515c, w4Var);
            }
        }
        return (com.google.android.gms.internal.measurement.w4) ((com.google.android.gms.internal.measurement.y8) w4Var.x().A(strA0).F().z(listB0).d());
    }
}

package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vn f7574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i02 f7576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f7577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mx2 f7579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j2.x1 f7580g = g2.t.q().h();

    public f12(Context context, wg0 wg0Var, vn vnVar, i02 i02Var, String str, mx2 mx2Var) {
        this.f7575b = context;
        this.f7577d = wg0Var;
        this.f7574a = vnVar;
        this.f7576c = i02Var;
        this.f7578e = str;
        this.f7579f = mx2Var;
    }

    private static final void c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jS = 0;
        for (int i8 = 0; i8 < size; i8++) {
            hq hqVar = (hq) arrayList.get(i8);
            if (hqVar.k0() == 2 && hqVar.S() > jS) {
                jS = hqVar.S();
            }
        }
        if (jS != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jS));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    final /* synthetic */ Void a(boolean z7, SQLiteDatabase sQLiteDatabase) {
        if (z7) {
            this.f7575b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
            lx2 lx2VarB = lx2.b("oa_upload");
            lx2VarB.a("oa_failed_reqs", String.valueOf(x02.a(sQLiteDatabase, 0)));
            lx2VarB.a("oa_total_reqs", String.valueOf(x02.a(sQLiteDatabase, 1)));
            lx2VarB.a("oa_upload_time", String.valueOf(g2.t.b().a()));
            lx2VarB.a("oa_last_successful_time", String.valueOf(x02.b(sQLiteDatabase, 2)));
            lx2VarB.a("oa_session_id", this.f7580g.F0() ? "" : this.f7578e);
            this.f7579f.a(lx2VarB);
            ArrayList arrayListC = x02.c(sQLiteDatabase);
            c(sQLiteDatabase, arrayListC);
            int size = arrayListC.size();
            for (int i8 = 0; i8 < size; i8++) {
                hq hqVar = (hq) arrayListC.get(i8);
                j2.x1 x1Var = this.f7580g;
                lx2 lx2VarB2 = lx2.b("oa_signals");
                lx2VarB2.a("oa_session_id", x1Var.F0() ? "" : this.f7578e);
                aq aqVarT = hqVar.T();
                String strValueOf = aqVarT.Q() ? String.valueOf(aqVarT.S() - 1) : "-1";
                String string = yb3.b(hqVar.Y(), new z73() { // from class: com.google.android.gms.internal.ads.e12
                    @Override // com.google.android.gms.internal.ads.z73
                    public final Object apply(Object obj) {
                        return ((to) obj).name();
                    }
                }).toString();
                lx2VarB2.a("oa_sig_ts", String.valueOf(hqVar.S()));
                lx2VarB2.a("oa_sig_status", String.valueOf(hqVar.k0() - 1));
                lx2VarB2.a("oa_sig_resp_lat", String.valueOf(hqVar.R()));
                lx2VarB2.a("oa_sig_render_lat", String.valueOf(hqVar.Q()));
                lx2VarB2.a("oa_sig_formats", string);
                lx2VarB2.a("oa_sig_nw_type", strValueOf);
                lx2VarB2.a("oa_sig_wifi", String.valueOf(hqVar.l0() - 1));
                lx2VarB2.a("oa_sig_airplane", String.valueOf(hqVar.h0() - 1));
                lx2VarB2.a("oa_sig_data", String.valueOf(hqVar.i0() - 1));
                lx2VarB2.a("oa_sig_nw_resp", String.valueOf(hqVar.P()));
                lx2VarB2.a("oa_sig_offline", String.valueOf(hqVar.j0() - 1));
                lx2VarB2.a("oa_sig_nw_state", String.valueOf(hqVar.X().j()));
                if (aqVarT.P() && aqVarT.Q() && aqVarT.S() == 2) {
                    lx2VarB2.a("oa_sig_cell_type", String.valueOf(aqVarT.R() - 1));
                }
                this.f7579f.a(lx2VarB2);
            }
        } else {
            ArrayList arrayListC2 = x02.c(sQLiteDatabase);
            Context context = this.f7575b;
            iq iqVarM = mq.M();
            iqVarM.v(context.getPackageName());
            iqVarM.x(Build.MODEL);
            iqVarM.y(x02.a(sQLiteDatabase, 0));
            iqVarM.u(arrayListC2);
            iqVarM.A(x02.a(sQLiteDatabase, 1));
            iqVarM.w(x02.a(sQLiteDatabase, 3));
            iqVarM.B(g2.t.b().a());
            iqVarM.z(x02.b(sQLiteDatabase, 2));
            final mq mqVar = (mq) iqVarM.q();
            c(sQLiteDatabase, arrayListC2);
            this.f7574a.b(new un() { // from class: com.google.android.gms.internal.ads.c12
                @Override // com.google.android.gms.internal.ads.un
                public final void a(lp lpVar) {
                    lpVar.C(mqVar);
                }
            });
            wg0 wg0Var = this.f7577d;
            xq xqVarM = yq.M();
            xqVarM.u(wg0Var.f16724b);
            xqVarM.w(this.f7577d.f16725c);
            xqVarM.v(true == this.f7577d.f16726d ? 0 : 2);
            final yq yqVar = (yq) xqVarM.q();
            this.f7574a.b(new un() { // from class: com.google.android.gms.internal.ads.d12
                @Override // com.google.android.gms.internal.ads.un
                public final void a(lp lpVar) {
                    dp dpVar = (dp) lpVar.v().m();
                    dpVar.v(yqVar);
                    lpVar.A(dpVar);
                }
            });
            this.f7574a.c(10004);
        }
        x02.f(sQLiteDatabase);
        return null;
    }

    public final void b(final boolean z7) {
        try {
            this.f7576c.a(new dw2() { // from class: com.google.android.gms.internal.ads.a12
                @Override // com.google.android.gms.internal.ads.dw2
                public final Object a(Object obj) {
                    this.f4949a.a(z7, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e8) {
            qg0.d("Error in offline signals database startup: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class q12 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f13246b;

    public q12(Context context, lg3 lg3Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) h2.y.c().b(ns.f8)).intValue());
        this.f13245a = context;
        this.f13246b = lg3Var;
    }

    static /* synthetic */ Void c(vg0 vg0Var, SQLiteDatabase sQLiteDatabase) {
        z(sQLiteDatabase, vg0Var);
        return null;
    }

    static /* synthetic */ void o(SQLiteDatabase sQLiteDatabase, String str, vg0 vg0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        z(sQLiteDatabase, vg0Var);
    }

    static final void w(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void z(SQLiteDatabase sQLiteDatabase, vg0 vg0Var) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i8 = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i8] = cursorQuery.getString(columnIndex);
                }
                i8++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i9 = 0; i9 < count; i9++) {
                vg0Var.a(strArr[i9]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    final /* synthetic */ Void a(s12 s12Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(s12Var.f14458a));
        contentValues.put("gws_query_id", s12Var.f14459b);
        contentValues.put("url", s12Var.f14460c);
        contentValues.put("event_state", Integer.valueOf(s12Var.f14461d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        g2.t.r();
        j2.v0 v0VarZ = j2.k2.Z(this.f13245a);
        if (v0VarZ != null) {
            try {
                v0VarZ.zze(g3.b.k3(this.f13245a));
            } catch (RemoteException e8) {
                j2.v1.l("Failed to schedule offline ping sender.", e8);
            }
        }
        return null;
    }

    public final void d(final String str) {
        j(new dw2() { // from class: com.google.android.gms.internal.ads.o12
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                q12.w((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void h(final s12 s12Var) {
        j(new dw2() { // from class: com.google.android.gms.internal.ads.k12
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                this.f9873a.a(s12Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void j(dw2 dw2Var) {
        zf3.r(this.f13246b.Z(new Callable() { // from class: com.google.android.gms.internal.ads.m12
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11120a.getWritableDatabase();
            }
        }), new p12(this, dw2Var), this.f13246b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void q(final SQLiteDatabase sQLiteDatabase, final vg0 vg0Var, final String str) {
        this.f13246b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.n12
            @Override // java.lang.Runnable
            public final void run() {
                q12.o(sQLiteDatabase, str, vg0Var);
            }
        });
    }

    public final void t(final vg0 vg0Var, final String str) {
        j(new dw2() { // from class: com.google.android.gms.internal.ads.l12
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                this.f10419a.q((SQLiteDatabase) obj, vg0Var, str);
                return null;
            }
        });
    }
}

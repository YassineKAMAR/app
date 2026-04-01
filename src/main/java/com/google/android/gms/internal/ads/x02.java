package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x02 {
    public static int a(SQLiteDatabase sQLiteDatabase, int i8) {
        int i9 = 0;
        if (i8 == 2) {
            return 0;
        }
        Cursor cursorH = h(sQLiteDatabase, i8);
        if (cursorH.getCount() > 0) {
            cursorH.moveToNext();
            i9 = cursorH.getInt(cursorH.getColumnIndexOrThrow("value"));
        }
        cursorH.close();
        return i9;
    }

    public static long b(SQLiteDatabase sQLiteDatabase, int i8) {
        long j8;
        Cursor cursorH = h(sQLiteDatabase, 2);
        if (cursorH.getCount() > 0) {
            cursorH.moveToNext();
            j8 = cursorH.getLong(cursorH.getColumnIndexOrThrow("value"));
        } else {
            j8 = 0;
        }
        cursorH.close();
        return j8;
    }

    public static ArrayList c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(hq.W(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (m14 e8) {
                qg0.d("Unable to deserialize proto from offline signals database:");
                qg0.d(e8.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static void d(SQLiteDatabase sQLiteDatabase, long j8, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(j8));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j8)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        i(sQLiteDatabase, "failed_requests", 0);
        i(sQLiteDatabase, "total_requests", 0);
        i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        j(sQLiteDatabase, "failed_requests", 0);
        j(sQLiteDatabase, "total_requests", 0);
        j(sQLiteDatabase, "completed_requests", 0);
    }

    public static void g(SQLiteDatabase sQLiteDatabase, boolean z7, boolean z8) {
        String str;
        if (z8) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
            if (z7) {
                return;
            } else {
                str = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests");
            }
        } else {
            str = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests");
        }
        sQLiteDatabase.execSQL(str);
    }

    private static Cursor h(SQLiteDatabase sQLiteDatabase, int i8) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i8 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i8 == 1) {
            strArr2[0] = "total_requests";
        } else if (i8 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void i(SQLiteDatabase sQLiteDatabase, String str, int i8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    private static void j(SQLiteDatabase sQLiteDatabase, String str, int i8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}

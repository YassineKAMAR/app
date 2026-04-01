package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    static void b(n4 n4Var, SQLiteDatabase sQLiteDatabase) {
        if (n4Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            n4Var.L().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            n4Var.L().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            n4Var.L().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        n4Var.L().a("Failed to turn on database write permission for owner");
    }

    static void c(n4 n4Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (n4Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!d(n4Var, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> setA = a(sQLiteDatabase, str);
            for (String str4 : str3.split(com.amazon.a.a.o.b.f.f3942a)) {
                if (!setA.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                    if (!setA.remove(strArr[i8])) {
                        sQLiteDatabase.execSQL(strArr[i8 + 1]);
                    }
                }
            }
            if (setA.isEmpty()) {
                return;
            }
            n4Var.L().c("Table has extra columns. table, columns", str, TextUtils.join(", ", setA));
        } catch (SQLiteException e8) {
            n4Var.G().b("Failed to verify columns on table that was just created", str);
            throw e8;
        }
    }

    private static boolean d(n4 n4Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (n4Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
                return zMoveToFirst;
            } catch (SQLiteException e8) {
                n4Var.L().c("Error querying for table", str, e8);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}

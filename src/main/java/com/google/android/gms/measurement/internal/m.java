package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.mf;
import com.google.android.gms.internal.measurement.od;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.u3;
import com.google.android.gms.internal.measurement.ud;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.y8;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class m extends ua {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f20236f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f20237g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f20238h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f20239i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f20240j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f20241k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f20242l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f20243m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f20244n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String[] f20245o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f20246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final oa f20247e;

    m(va vaVar) {
        super(vaVar);
        this.f20247e = new oa(k());
        this.f20246d = new s(this, j(), "google_app_measurement.db");
    }

    private final long G(String str, String[] strArr, long j8) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j8;
                }
                long j9 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j9;
            } catch (SQLiteException e8) {
                t().G().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    private final Object M(Cursor cursor, int i8) {
        int type = cursor.getType(i8);
        if (type == 0) {
            t().G().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i8));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i8));
        }
        if (type == 3) {
            return cursor.getString(i8);
        }
        if (type != 4) {
            t().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        t().G().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T N(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.p<T> r5) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.B()     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            boolean r4 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            if (r4 != 0) goto L20
            com.google.android.gms.measurement.internal.n4 r4 = r2.t()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.p4 r4 = r4.K()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r0
        L20:
            java.lang.Object r4 = r5.a(r3)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r4
        L28:
            r4 = move-exception
            goto L2e
        L2a:
            r4 = move-exception
            goto L43
        L2c:
            r4 = move-exception
            r3 = r0
        L2e:
            com.google.android.gms.measurement.internal.n4 r5 = r2.t()     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.p4 r5 = r5.G()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L40
            r3.close()
        L40:
            return r0
        L41:
            r4 = move-exception
            r0 = r3
        L43:
            if (r0 == 0) goto L48
            r0.close()
        L48:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.N(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.p):java.lang.Object");
    }

    private final String P(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e8) {
                t().G().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    private static void T(ContentValues contentValues, String str, Object obj) {
        a3.o.f(str);
        a3.o.j(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final void Y(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseB = B();
            if (contentValues.getAsString(str2) == null) {
                t().H().b("Value of the primary key is not set.", n4.v(str2));
                return;
            }
            if (sQLiteDatabaseB.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && sQLiteDatabaseB.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                t().G().c("Failed to insert/update table (got -1). key", n4.v(str), n4.v(str2));
            }
        } catch (SQLiteException e8) {
            t().G().d("Error storing into table. key", n4.v(str), n4.v(str2), e8);
        }
    }

    private final boolean f0(String str, int i8, com.google.android.gms.internal.measurement.v3 v3Var) {
        s();
        i();
        a3.o.f(str);
        a3.o.j(v3Var);
        if (v3Var.O().isEmpty()) {
            t().L().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", n4.v(str), Integer.valueOf(i8), String.valueOf(v3Var.U() ? Integer.valueOf(v3Var.K()) : null));
            return false;
        }
        byte[] bArrK = v3Var.k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i8));
        contentValues.put("filter_id", v3Var.U() ? Integer.valueOf(v3Var.K()) : null);
        contentValues.put("event_name", v3Var.O());
        contentValues.put("session_scoped", v3Var.V() ? Boolean.valueOf(v3Var.S()) : null);
        contentValues.put("data", bArrK);
        try {
            if (B().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            t().G().b("Failed to insert event filter (got -1). appId", n4.v(str));
            return true;
        } catch (SQLiteException e8) {
            t().G().c("Error storing event filter. appId", n4.v(str), e8);
            return false;
        }
    }

    private final boolean g0(String str, int i8, com.google.android.gms.internal.measurement.y3 y3Var) {
        s();
        i();
        a3.o.f(str);
        a3.o.j(y3Var);
        if (y3Var.K().isEmpty()) {
            t().L().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", n4.v(str), Integer.valueOf(i8), String.valueOf(y3Var.O() ? Integer.valueOf(y3Var.m()) : null));
            return false;
        }
        byte[] bArrK = y3Var.k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i8));
        contentValues.put("filter_id", y3Var.O() ? Integer.valueOf(y3Var.m()) : null);
        contentValues.put("property_name", y3Var.K());
        contentValues.put("session_scoped", y3Var.P() ? Boolean.valueOf(y3Var.N()) : null);
        contentValues.put("data", bArrK);
        try {
            if (B().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            t().G().b("Failed to insert property filter (got -1). appId", n4.v(str));
            return false;
        } catch (SQLiteException e8) {
            t().G().c("Error storing property filter. appId", n4.v(str), e8);
            return false;
        }
    }

    private final boolean u0() {
        return j().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long x0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = B().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j8 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e8) {
                t().G().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean z0(String str, List<Integer> list) {
        a3.o.f(str);
        s();
        i();
        SQLiteDatabase sQLiteDatabaseB = B();
        try {
            long jX0 = x0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, a().s(str, e0.H)));
            if (jX0 <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                Integer num = list.get(i8);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(com.amazon.a.a.o.b.f.f3942a, arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseB.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e8) {
            t().G().c("Database error querying filters. appId", n4.v(str), e8);
            return false;
        }
    }

    public final long A() {
        return G("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d0: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d0 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle A0(java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.A0(java.lang.String):android.os.Bundle");
    }

    final SQLiteDatabase B() {
        i();
        try {
            return this.f20246d.getWritableDatabase();
        } catch (SQLiteException e8) {
            t().L().b("Error opening database", e8);
            throw e8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.d B0(java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.B0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String C() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3b
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.n4 r3 = r6.t()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.C():java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0147: MOVE (r18 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:64:0x0147 */
    public final a0 C0(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursor2;
        Boolean boolValueOf;
        a3.o.f(str);
        a3.o.f(str2);
        i();
        s();
        Cursor cursor3 = null;
        try {
            try {
                cursorQuery = B().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j8 = cursorQuery.getLong(0);
                    long j9 = cursorQuery.getLong(1);
                    long j10 = cursorQuery.getLong(2);
                    long j11 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        } catch (SQLiteException e8) {
                            e = e8;
                        }
                    }
                    cursor2 = cursorQuery;
                    try {
                        a0 a0Var = new a0(str, str2, j8, j9, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j10, j11, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursor2.moveToNext()) {
                            t().G().b("Got multiple records for event aggregates, expected one. appId", n4.v(str));
                        }
                        cursor2.close();
                        return a0Var;
                    } catch (SQLiteException e9) {
                        e = e9;
                        cursorQuery = cursor2;
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor2;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursorQuery;
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
            }
            t().G().d("Error querying events. appId", n4.v(str), c().c(str2), e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cursor3 = cursor;
        }
    }

    public final int D(String str, String str2) {
        a3.o.f(str);
        a3.o.f(str2);
        i();
        s();
        try {
            return B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            t().G().d("Error deleting conditional property", n4.v(str), c().g(str2), e8);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.r5 D0(java.lang.String r42) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.D0(java.lang.String):com.google.android.gms.measurement.internal.r5");
    }

    public final long E(com.google.android.gms.internal.measurement.b5 b5Var) {
        i();
        s();
        a3.o.j(b5Var);
        a3.o.f(b5Var.H3());
        byte[] bArrK = b5Var.k();
        long jA = l().A(bArrK);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b5Var.H3());
        contentValues.put("metadata_fingerprint", Long.valueOf(jA));
        contentValues.put("metadata", bArrK);
        try {
            B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jA;
        } catch (SQLiteException e8) {
            t().G().c("Error storing raw event metadata. appId", n4.v(b5Var.H3()), e8);
            throw e8;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0084: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:28:0x0084 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.o E0(java.lang.String r12) {
        /*
            r11 = this;
            a3.o.f(r12)
            r11.i()
            r11.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.B()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "app_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            r10 = 0
            r5[r10] = r12     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            if (r2 != 0) goto L33
            r1.close()
            return r0
        L33:
            byte[] r2 = r1.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            java.lang.String r3 = r1.getString(r9)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            boolean r5 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            if (r5 == 0) goto L57
            com.google.android.gms.measurement.internal.n4 r5 = r11.t()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            com.google.android.gms.measurement.internal.p4 r5 = r5.G()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.n4.v(r12)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r5.b(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
        L57:
            if (r2 != 0) goto L5d
            r1.close()
            return r0
        L5d:
            com.google.android.gms.measurement.internal.o r5 = new com.google.android.gms.measurement.internal.o     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r5.<init>(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r1.close()
            return r5
        L66:
            r2 = move-exception
            goto L6c
        L68:
            r12 = move-exception
            goto L85
        L6a:
            r2 = move-exception
            r1 = r0
        L6c:
            com.google.android.gms.measurement.internal.n4 r3 = r11.t()     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.n4.v(r12)     // Catch: java.lang.Throwable -> L83
            r3.c(r4, r12, r2)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L82
            r1.close()
        L82:
            return r0
        L83:
            r12 = move-exception
            r0 = r1
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.E0(java.lang.String):com.google.android.gms.measurement.internal.o");
    }

    public final long F(String str) {
        a3.o.f(str);
        i();
        s();
        try {
            return B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(UtilsKt.MICROS_MULTIPLIER, a().s(str, e0.f19957r))))});
        } catch (SQLiteException e8) {
            t().G().c("Error deleting over the limit events. appId", n4.v(str), e8);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.jb F0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            a3.o.f(r19)
            a3.o.f(r20)
            r18.i()
            r18.s()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.B()     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7c
            if (r3 != 0) goto L3d
            r10.close()
            return r9
        L3d:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7c
            r11 = r18
            java.lang.Object r7 = r11.M(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            if (r7 != 0) goto L4d
            r10.close()
            return r9
        L4d:
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.jb r0 = new com.google.android.gms.measurement.internal.jb     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            if (r1 == 0) goto L72
            com.google.android.gms.measurement.internal.n4 r1 = r18.t()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.p4 r1 = r1.G()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.v(r19)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            r1.b(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
        L72:
            r10.close()
            return r0
        L76:
            r0 = move-exception
            goto L88
        L78:
            r0 = move-exception
            r11 = r18
            goto La8
        L7c:
            r0 = move-exception
            r11 = r18
            goto L88
        L80:
            r0 = move-exception
            r11 = r18
            goto La9
        L84:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L88:
            com.google.android.gms.measurement.internal.n4 r1 = r18.t()     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.p4 r1 = r1.G()     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.v(r19)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.m4 r4 = r18.c()     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r4.g(r8)     // Catch: java.lang.Throwable -> La7
            r1.d(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La7
            if (r10 == 0) goto La6
            r10.close()
        La6:
            return r9
        La7:
            r0 = move-exception
        La8:
            r9 = r10
        La9:
            if (r9 == 0) goto Lae
            r9.close()
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.F0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.jb");
    }

    public final v G0(String str) {
        if (!td.a() || !a().q(e0.T0)) {
            return v.f20539f;
        }
        a3.o.j(str);
        i();
        s();
        return v.c(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.w4, java.lang.Long> H(java.lang.String r8, java.lang.Long r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.i()
            r7.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.B()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.n4 r8 = r7.t()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.p4 r8 = r8.K()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.w4$a r4 = com.google.android.gms.internal.measurement.w4.Y()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.pa r2 = com.google.android.gms.measurement.internal.db.F(r4, r2)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.w4$a r2 = (com.google.android.gms.internal.measurement.w4.a) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.ma r2 = r2.d()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.y8 r2 = (com.google.android.gms.internal.measurement.y8) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.w4 r2 = (com.google.android.gms.internal.measurement.w4) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r8
        L5b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r7.t()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.p4 r3 = r3.G()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.v(r8)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r3.d(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L71:
            r8 = move-exception
            goto L77
        L73:
            r8 = move-exception
            goto L8c
        L75:
            r8 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.n4 r9 = r7.t()     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.p4 r9 = r9.G()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            r8 = move-exception
            r0 = r1
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.H(java.lang.String, java.lang.Long):android.util.Pair");
    }

    final Map<Integer, List<com.google.android.gms.internal.measurement.v3>> H0(String str, String str2) {
        s();
        i();
        a3.o.f(str);
        a3.o.f(str2);
        p.a aVar = new p.a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.v3>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.v3 v3Var = (com.google.android.gms.internal.measurement.v3) ((com.google.android.gms.internal.measurement.y8) ((v3.a) db.F(com.google.android.gms.internal.measurement.v3.L(), cursorQuery.getBlob(1))).d());
                        int i8 = cursorQuery.getInt(0);
                        List arrayList = (List) aVar.get(Integer.valueOf(i8));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            aVar.put(Integer.valueOf(i8), arrayList);
                        }
                        arrayList.add(v3Var);
                    } catch (IOException e8) {
                        t().G().c("Failed to merge filter. appId", n4.v(str), e8);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return aVar;
            } catch (SQLiteException e9) {
                t().G().c("Database error querying filters. appId", n4.v(str), e9);
                Map<Integer, List<com.google.android.gms.internal.measurement.v3>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final n I(long j8, String str, long j9, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        a3.o.f(str);
        i();
        s();
        String[] strArr = {str};
        n nVar = new n();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseB = B();
                Cursor cursorQuery = sQLiteDatabaseB.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    t().L().b("Not updating daily counts, app is not known. appId", n4.v(str));
                    cursorQuery.close();
                    return nVar;
                }
                if (cursorQuery.getLong(0) == j8) {
                    nVar.f20271b = cursorQuery.getLong(1);
                    nVar.f20270a = cursorQuery.getLong(2);
                    nVar.f20272c = cursorQuery.getLong(3);
                    nVar.f20273d = cursorQuery.getLong(4);
                    nVar.f20274e = cursorQuery.getLong(5);
                }
                if (z7) {
                    nVar.f20271b += j9;
                }
                if (z8) {
                    nVar.f20270a += j9;
                }
                if (z9) {
                    nVar.f20272c += j9;
                }
                if (z10) {
                    nVar.f20273d += j9;
                }
                if (z11) {
                    nVar.f20274e += j9;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j8));
                contentValues.put("daily_public_events_count", Long.valueOf(nVar.f20270a));
                contentValues.put("daily_events_count", Long.valueOf(nVar.f20271b));
                contentValues.put("daily_conversions_count", Long.valueOf(nVar.f20272c));
                contentValues.put("daily_error_events_count", Long.valueOf(nVar.f20273d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(nVar.f20274e));
                sQLiteDatabaseB.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return nVar;
            } catch (SQLiteException e8) {
                t().G().c("Error updating daily counts. appId", n4.v(str), e8);
                if (0 != 0) {
                    cursor.close();
                }
                return nVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final y6 I0(String str) {
        a3.o.j(str);
        i();
        s();
        if (!td.a() || !a().q(e0.T0)) {
            return y6.e(P("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
        }
        y6 y6Var = (y6) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new p() { // from class: com.google.android.gms.measurement.internal.l
            @Override // com.google.android.gms.measurement.internal.p
            public final Object a(Cursor cursor) {
                return y6.f(cursor.getString(0), cursor.getInt(1));
            }
        });
        return y6Var == null ? y6.f20721c : y6Var;
    }

    public final n J(long j8, String str, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return I(j8, str, 1L, false, false, z9, false, z11);
    }

    final Map<Integer, List<com.google.android.gms.internal.measurement.y3>> J0(String str, String str2) {
        s();
        i();
        a3.o.f(str);
        a3.o.f(str2);
        p.a aVar = new p.a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = B().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.y3>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.y3 y3Var = (com.google.android.gms.internal.measurement.y3) ((com.google.android.gms.internal.measurement.y8) ((y3.a) db.F(com.google.android.gms.internal.measurement.y3.I(), cursorQuery.getBlob(1))).d());
                        int i8 = cursorQuery.getInt(0);
                        List arrayList = (List) aVar.get(Integer.valueOf(i8));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            aVar.put(Integer.valueOf(i8), arrayList);
                        }
                        arrayList.add(y3Var);
                    } catch (IOException e8) {
                        t().G().c("Failed to merge filter", n4.v(str), e8);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return aVar;
            } catch (SQLiteException e9) {
                t().G().c("Database error querying filters. appId", n4.v(str), e9);
                Map<Integer, List<com.google.android.gms.internal.measurement.y3>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.na> K0(java.lang.String r14) {
        /*
            r13 = this;
            a3.o.f(r14)
            r13.i()
            r13.s()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.B()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            java.lang.String r3 = "trigger_uris"
            java.lang.String r4 = "trigger_uri"
            java.lang.String r5 = "timestamp_millis"
            java.lang.String r6 = "source"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            r12 = 0
            r6[r12] = r14     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            r10 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            if (r2 != 0) goto L3a
            r1.close()
            return r0
        L3a:
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            if (r2 != 0) goto L42
            java.lang.String r2 = ""
        L42:
            long r3 = r1.getLong(r11)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            r5 = 2
            int r5 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            com.google.android.gms.measurement.internal.na r6 = new com.google.android.gms.measurement.internal.na     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            r6.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            r0.add(r6)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L5f
            if (r2 != 0) goto L3a
            r1.close()
            return r0
        L5d:
            r14 = move-exception
            goto L7b
        L5f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r2 = r13.t()     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.measurement.internal.p4 r2 = r2.G()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = "Error querying trigger uris. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.n4.v(r14)     // Catch: java.lang.Throwable -> L5d
            r2.c(r3, r14, r0)     // Catch: java.lang.Throwable -> L5d
            java.util.List r14 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L7a
            r1.close()
        L7a:
            return r14
        L7b:
            if (r1 == 0) goto L80
            r1.close()
        L80:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.K0(java.lang.String):java.util.List");
    }

    public final void L0(String str, String str2) {
        a3.o.f(str);
        a3.o.f(str2);
        i();
        s();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            t().G().d("Error deleting user property. appId", n4.v(str), c().g(str2), e8);
        }
    }

    public final List<jb> M0(String str) {
        a3.o.f(str);
        i();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = B().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j8 = cursorQuery.getLong(2);
                    Object objM = M(cursorQuery, 3);
                    if (objM == null) {
                        t().G().b("Read invalid user property value, ignoring it. appId", n4.v(str));
                    } else {
                        arrayList.add(new jb(str, str2, string, j8, objM));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e8) {
                t().G().c("Error querying user properties. appId", n4.v(str), e8);
                List<jb> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    final Map<Integer, com.google.android.gms.internal.measurement.d5> N0(String str) {
        s();
        i();
        a3.o.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = B().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, com.google.android.gms.internal.measurement.d5> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                p.a aVar = new p.a();
                do {
                    int i8 = cursorQuery.getInt(0);
                    try {
                        aVar.put(Integer.valueOf(i8), (com.google.android.gms.internal.measurement.d5) ((com.google.android.gms.internal.measurement.y8) ((d5.a) db.F(com.google.android.gms.internal.measurement.d5.U(), cursorQuery.getBlob(1))).d()));
                    } catch (IOException e8) {
                        t().G().d("Failed to merge filter results. appId, audienceId, error", n4.v(str), Integer.valueOf(i8), e8);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return aVar;
            } catch (SQLiteException e9) {
                t().G().c("Database error querying filter results. appId", n4.v(str), e9);
                Map<Integer, com.google.android.gms.internal.measurement.d5> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String O(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r4.i()
            r4.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.B()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.n4 r6 = r4.t()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.p4 r6 = r6.K()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r6
        L3a:
            r6 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L55
        L3e:
            r6 = move-exception
            r5 = r0
        L40:
            com.google.android.gms.measurement.internal.n4 r1 = r4.t()     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.p4 r1 = r1.G()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.O(long):java.lang.String");
    }

    final Map<Integer, List<com.google.android.gms.internal.measurement.v3>> O0(String str) {
        a3.o.f(str);
        p.a aVar = new p.a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<com.google.android.gms.internal.measurement.v3>> mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.v3 v3Var = (com.google.android.gms.internal.measurement.v3) ((com.google.android.gms.internal.measurement.y8) ((v3.a) db.F(com.google.android.gms.internal.measurement.v3.L(), cursorQuery.getBlob(1))).d());
                        if (v3Var.T()) {
                            int i8 = cursorQuery.getInt(0);
                            List arrayList = (List) aVar.get(Integer.valueOf(i8));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                aVar.put(Integer.valueOf(i8), arrayList);
                            }
                            arrayList.add(v3Var);
                        }
                    } catch (IOException e8) {
                        t().G().c("Failed to merge filter. appId", n4.v(str), e8);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return aVar;
            } catch (SQLiteException e9) {
                t().G().c("Database error querying filters. appId", n4.v(str), e9);
                Map<Integer, List<com.google.android.gms.internal.measurement.v3>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final Map<Integer, List<Integer>> P0(String str) {
        s();
        i();
        a3.o.f(str);
        p.a aVar = new p.a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = B().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> mapEmptyMap = Collections.emptyMap();
                    cursorRawQuery.close();
                    return mapEmptyMap;
                }
                do {
                    int i8 = cursorRawQuery.getInt(0);
                    List arrayList = (List) aVar.get(Integer.valueOf(i8));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        aVar.put(Integer.valueOf(i8), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return aVar;
            } catch (SQLiteException e8) {
                t().G().c("Database error querying scoped filters. appId", n4.v(str), e8);
                Map<Integer, List<Integer>> mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f A[EDGE_INSN: B:91:0x017f->B:73:0x017f BREAK  A[LOOP:0: B:17:0x0054->B:72:0x017c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.b5, java.lang.Long>> Q(java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.Q(java.lang.String, int, int):java.util.List");
    }

    public final void Q0() {
        s();
        B().beginTransaction();
    }

    public final List<d> R(String str, String str2, String str3) {
        a3.o.f(str);
        i();
        s();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return S(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void R0() {
        s();
        B().endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        t().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.d> S(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.S(java.lang.String, java.lang.String[]):java.util.List");
    }

    final void S0() {
        int iDelete;
        i();
        s();
        if (u0()) {
            long jA = q().f20734e.a();
            long jB = k().b();
            if (Math.abs(jB - jA) > e0.A.a(null).longValue()) {
                q().f20734e.b(jB);
                i();
                s();
                if (!u0() || (iDelete = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(k().a()), String.valueOf(f.M())})) <= 0) {
                    return;
                }
                t().K().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final void T0() {
        s();
        B().setTransactionSuccessful();
    }

    public final void U(a0 a0Var) {
        a3.o.j(a0Var);
        i();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a0Var.f19768a);
        contentValues.put("name", a0Var.f19769b);
        contentValues.put("lifetime_count", Long.valueOf(a0Var.f19770c));
        contentValues.put("current_bundle_count", Long.valueOf(a0Var.f19771d));
        contentValues.put("last_fire_timestamp", Long.valueOf(a0Var.f19773f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(a0Var.f19774g));
        contentValues.put("last_bundled_day", a0Var.f19775h);
        contentValues.put("last_sampled_complex_event_id", a0Var.f19776i);
        contentValues.put("last_sampling_rate", a0Var.f19777j);
        contentValues.put("current_session_count", Long.valueOf(a0Var.f19772e));
        Boolean bool = a0Var.f19778k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (B().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                t().G().b("Failed to insert/update event aggregates (got -1). appId", n4.v(a0Var.f19768a));
            }
        } catch (SQLiteException e8) {
            t().G().c("Error storing event aggregates. appId", n4.v(a0Var.f19768a), e8);
        }
    }

    public final boolean U0() {
        return x0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final void V(r5 r5Var) {
        a3.o.j(r5Var);
        i();
        s();
        String strT0 = r5Var.t0();
        a3.o.j(strT0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strT0);
        contentValues.put("app_instance_id", r5Var.u0());
        contentValues.put("gmp_app_id", r5Var.j());
        contentValues.put("resettable_device_id_hash", r5Var.l());
        contentValues.put("last_bundle_index", Long.valueOf(r5Var.k0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(r5Var.m0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(r5Var.i0()));
        contentValues.put("app_version", r5Var.h());
        contentValues.put("app_store", r5Var.v0());
        contentValues.put("gmp_version", Long.valueOf(r5Var.g0()));
        contentValues.put("dev_cert_hash", Long.valueOf(r5Var.a0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(r5Var.r()));
        contentValues.put("day", Long.valueOf(r5Var.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(r5Var.T()));
        contentValues.put("daily_events_count", Long.valueOf(r5Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(r5Var.K()));
        contentValues.put("config_fetched_time", Long.valueOf(r5Var.H()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(r5Var.e0()));
        contentValues.put("app_version_int", Long.valueOf(r5Var.z()));
        contentValues.put("firebase_instance_id", r5Var.i());
        contentValues.put("daily_error_events_count", Long.valueOf(r5Var.N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(r5Var.W()));
        contentValues.put("health_monitor_sample", r5Var.k());
        contentValues.put("android_id", Long.valueOf(r5Var.v()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(r5Var.q()));
        contentValues.put("admob_app_id", r5Var.r0());
        contentValues.put("dynamite_version", Long.valueOf(r5Var.c0()));
        contentValues.put("session_stitching_token", r5Var.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(r5Var.t()));
        contentValues.put("target_os_version", Long.valueOf(r5Var.p0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(r5Var.o0()));
        if (mf.a() && a().B(strT0, e0.L0)) {
            contentValues.put("ad_services_version", Integer.valueOf(r5Var.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(r5Var.D()));
        }
        if (od.a() && a().B(strT0, e0.Y0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(r5Var.u()));
        }
        List<String> listN = r5Var.n();
        if (listN != null) {
            if (listN.isEmpty()) {
                t().L().b("Safelisted events should not be an empty list. appId", strT0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(com.amazon.a.a.o.b.f.f3942a, listN));
            }
        }
        if (ud.a() && a().q(e0.f19964u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (td.a() && a().B(strT0, e0.T0)) {
            contentValues.put("npa_metadata_value", r5Var.q0());
        }
        try {
            SQLiteDatabase sQLiteDatabaseB = B();
            if (sQLiteDatabaseB.update("apps", contentValues, "app_id = ?", new String[]{strT0}) == 0 && sQLiteDatabaseB.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                t().G().b("Failed to insert/update app (got -1). appId", n4.v(strT0));
            }
        } catch (SQLiteException e8) {
            t().G().c("Error storing app. appId", n4.v(strT0), e8);
        }
    }

    public final boolean V0() {
        return x0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void W(String str, v vVar) {
        if (td.a() && a().q(e0.T0)) {
            a3.o.j(str);
            a3.o.j(vVar);
            i();
            s();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", vVar.i());
            Y("consent_settings", "app_id", contentValues);
        }
    }

    public final boolean W0() {
        return x0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final void X(String str, y6 y6Var) {
        a3.o.j(str);
        a3.o.j(y6Var);
        i();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", y6Var.v());
        if (td.a() && a().q(e0.T0)) {
            contentValues.put("consent_source", Integer.valueOf(y6Var.b()));
            Y("consent_settings", "app_id", contentValues);
            return;
        }
        try {
            if (B().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                t().G().b("Failed to insert/update consent setting (got -1). appId", n4.v(str));
            }
        } catch (SQLiteException e8) {
            t().G().c("Error storing consent setting. appId, error", n4.v(str), e8);
        }
    }

    final void Z(String str, List<com.google.android.gms.internal.measurement.u3> list) {
        boolean z7;
        p4 p4VarL;
        String str2;
        Object objV;
        Integer numValueOf;
        boolean z8;
        a3.o.j(list);
        for (int i8 = 0; i8 < list.size(); i8++) {
            u3.a aVarX = list.get(i8).x();
            if (aVarX.s() != 0) {
                for (int i9 = 0; i9 < aVarX.s(); i9++) {
                    v3.a aVarX2 = aVarX.v(i9).x();
                    v3.a aVar = (v3.a) ((y8.b) aVarX2.clone());
                    String strB = p3.r.b(aVarX2.w());
                    if (strB != null) {
                        aVar.u(strB);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    for (int i10 = 0; i10 < aVarX2.s(); i10++) {
                        com.google.android.gms.internal.measurement.w3 w3VarV = aVarX2.v(i10);
                        String strA = p3.t.a(w3VarV.L());
                        if (strA != null) {
                            aVar.t(i10, (com.google.android.gms.internal.measurement.w3) ((com.google.android.gms.internal.measurement.y8) w3VarV.x().s(strA).d()));
                            z8 = true;
                        }
                    }
                    if (z8) {
                        aVarX = aVarX.t(i9, aVar);
                        list.set(i8, (com.google.android.gms.internal.measurement.u3) ((com.google.android.gms.internal.measurement.y8) aVarX.d()));
                    }
                }
            }
            if (aVarX.w() != 0) {
                for (int i11 = 0; i11 < aVarX.w(); i11++) {
                    com.google.android.gms.internal.measurement.y3 y3VarX = aVarX.x(i11);
                    String strA2 = p3.s.a(y3VarX.K());
                    if (strA2 != null) {
                        aVarX = aVarX.u(i11, y3VarX.x().s(strA2));
                        list.set(i8, (com.google.android.gms.internal.measurement.u3) ((com.google.android.gms.internal.measurement.y8) aVarX.d()));
                    }
                }
            }
        }
        s();
        i();
        a3.o.f(str);
        a3.o.j(list);
        SQLiteDatabase sQLiteDatabaseB = B();
        sQLiteDatabaseB.beginTransaction();
        try {
            s();
            i();
            a3.o.f(str);
            SQLiteDatabase sQLiteDatabaseB2 = B();
            sQLiteDatabaseB2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseB2.delete("event_filters", "app_id=?", new String[]{str});
            for (com.google.android.gms.internal.measurement.u3 u3Var : list) {
                s();
                i();
                a3.o.f(str);
                a3.o.j(u3Var);
                if (u3Var.Q()) {
                    int iM = u3Var.m();
                    Iterator<com.google.android.gms.internal.measurement.v3> it = u3Var.O().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().U()) {
                                p4VarL = t().L();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                objV = n4.v(str);
                                numValueOf = Integer.valueOf(iM);
                                break;
                            }
                        } else {
                            Iterator<com.google.android.gms.internal.measurement.y3> it2 = u3Var.P().iterator();
                            while (it2.hasNext()) {
                                if (!it2.next().O()) {
                                    p4VarL = t().L();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    objV = n4.v(str);
                                    numValueOf = Integer.valueOf(iM);
                                }
                            }
                            Iterator<com.google.android.gms.internal.measurement.v3> it3 = u3Var.O().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!f0(str, iM, it3.next())) {
                                        z7 = false;
                                        break;
                                    }
                                } else {
                                    z7 = true;
                                    break;
                                }
                            }
                            if (z7) {
                                Iterator<com.google.android.gms.internal.measurement.y3> it4 = u3Var.P().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (!g0(str, iM, it4.next())) {
                                            z7 = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z7) {
                                s();
                                i();
                                a3.o.f(str);
                                SQLiteDatabase sQLiteDatabaseB3 = B();
                                sQLiteDatabaseB3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM)});
                                sQLiteDatabaseB3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM)});
                            }
                        }
                    }
                    p4VarL.c(str2, objV, numValueOf);
                    break;
                }
                t().L().b("Audience with no ID. appId", n4.v(str));
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.u3 u3Var2 : list) {
                arrayList.add(u3Var2.Q() ? Integer.valueOf(u3Var2.m()) : null);
            }
            z0(str, arrayList);
            sQLiteDatabaseB.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    final void a0(List<Long> list) {
        i();
        s();
        a3.o.j(list);
        a3.o.l(list.size());
        if (u0()) {
            String str = "(" + TextUtils.join(com.amazon.a.a.o.b.f.f3942a, list) + ")";
            if (x0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                t().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e8) {
                t().G().b("Error incrementing retry count. error", e8);
            }
        }
    }

    public final boolean b0(com.google.android.gms.internal.measurement.b5 b5Var, boolean z7) {
        p4 p4VarG;
        Object objV;
        String str;
        i();
        s();
        a3.o.j(b5Var);
        a3.o.f(b5Var.H3());
        a3.o.m(b5Var.X0());
        S0();
        long jA = k().a();
        if (b5Var.b3() < jA - f.M() || b5Var.b3() > f.M() + jA) {
            t().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", n4.v(b5Var.H3()), Long.valueOf(jA), Long.valueOf(b5Var.b3()));
        }
        try {
            byte[] bArrG0 = l().g0(b5Var.k());
            t().K().b("Saving bundle, size", Integer.valueOf(bArrG0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", b5Var.H3());
            contentValues.put("bundle_end_timestamp", Long.valueOf(b5Var.b3()));
            contentValues.put("data", bArrG0);
            contentValues.put("has_realtime", Integer.valueOf(z7 ? 1 : 0));
            if (b5Var.e1()) {
                contentValues.put("retry_count", Integer.valueOf(b5Var.i2()));
            }
            try {
                if (B().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                t().G().b("Failed to insert bundle (got -1). appId", n4.v(b5Var.H3()));
                return false;
            } catch (SQLiteException e8) {
                e = e8;
                p4VarG = t().G();
                objV = n4.v(b5Var.H3());
                str = "Error storing bundle. appId";
                p4VarG.c(str, objV, e);
                return false;
            }
        } catch (IOException e9) {
            e = e9;
            p4VarG = t().G();
            objV = n4.v(b5Var.H3());
            str = "Data loss. Failed to serialize bundle. appId";
        }
    }

    public final boolean c0(d dVar) {
        a3.o.j(dVar);
        i();
        s();
        String str = dVar.f19877a;
        a3.o.j(str);
        if (F0(str, dVar.f19879c.f20071b) == null && x0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dVar.f19878b);
        contentValues.put("name", dVar.f19879c.f20071b);
        T(contentValues, "value", a3.o.j(dVar.f19879c.g()));
        contentValues.put("active", Boolean.valueOf(dVar.f19881e));
        contentValues.put("trigger_event_name", dVar.f19882f);
        contentValues.put("trigger_timeout", Long.valueOf(dVar.f19884h));
        f();
        contentValues.put("timed_out_event", ib.p0(dVar.f19883g));
        contentValues.put("creation_timestamp", Long.valueOf(dVar.f19880d));
        f();
        contentValues.put("triggered_event", ib.p0(dVar.f19885i));
        contentValues.put("triggered_timestamp", Long.valueOf(dVar.f19879c.f20072c));
        contentValues.put("time_to_live", Long.valueOf(dVar.f19886j));
        f();
        contentValues.put("expired_event", ib.p0(dVar.f19887k));
        try {
            if (B().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                t().G().b("Failed to insert/update conditional user property (got -1)", n4.v(str));
            }
        } catch (SQLiteException e8) {
            t().G().c("Error storing conditional user property", n4.v(str), e8);
        }
        return true;
    }

    public final boolean d0(w wVar, long j8, boolean z7) {
        i();
        s();
        a3.o.j(wVar);
        a3.o.f(wVar.f20604a);
        byte[] bArrK = l().D(wVar).k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", wVar.f20604a);
        contentValues.put("name", wVar.f20605b);
        contentValues.put(DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(wVar.f20607d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j8));
        contentValues.put("data", bArrK);
        contentValues.put("realtime", Integer.valueOf(z7 ? 1 : 0));
        try {
            if (B().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            t().G().b("Failed to insert raw event (got -1). appId", n4.v(wVar.f20604a));
            return false;
        } catch (SQLiteException e8) {
            t().G().c("Error storing raw event. appId", n4.v(wVar.f20604a), e8);
            return false;
        }
    }

    public final boolean e0(jb jbVar) {
        a3.o.j(jbVar);
        i();
        s();
        if (F0(jbVar.f20162a, jbVar.f20164c) == null) {
            if (ib.J0(jbVar.f20164c)) {
                if (x0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{jbVar.f20162a}) >= a().n(jbVar.f20162a, e0.I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(jbVar.f20164c) && x0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{jbVar.f20162a, jbVar.f20163b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", jbVar.f20162a);
        contentValues.put("origin", jbVar.f20163b);
        contentValues.put("name", jbVar.f20164c);
        contentValues.put("set_timestamp", Long.valueOf(jbVar.f20165d));
        T(contentValues, "value", jbVar.f20166e);
        try {
            if (B().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                t().G().b("Failed to insert/update user property (got -1). appId", n4.v(jbVar.f20162a));
            }
        } catch (SQLiteException e8) {
            t().G().c("Error storing user property. appId", n4.v(jbVar.f20162a), e8);
        }
        return true;
    }

    final boolean h0(String str, Bundle bundle) {
        i();
        s();
        byte[] bArrK = l().D(new w(this.f20556a, "", str, "dep", 0L, 0L, bundle)).k();
        t().K().c("Saving default event parameters, appId, data size", c().c(str), Integer.valueOf(bArrK.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrK);
        try {
            if (B().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            t().G().b("Failed to insert default event parameters (got -1). appId", n4.v(str));
            return false;
        } catch (SQLiteException e8) {
            t().G().c("Error storing default event parameters. appId", n4.v(str), e8);
            return false;
        }
    }

    public final boolean i0(String str, na naVar) {
        i();
        s();
        a3.o.j(naVar);
        a3.o.f(str);
        long jA = k().a();
        if (naVar.f20303b < jA - f.M() || naVar.f20303b > f.M() + jA) {
            t().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", n4.v(str), Long.valueOf(jA), Long.valueOf(naVar.f20303b));
        }
        t().K().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", naVar.f20302a);
        contentValues.put("source", Integer.valueOf(naVar.f20304c));
        contentValues.put("timestamp_millis", Long.valueOf(naVar.f20303b));
        try {
            if (B().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            t().G().b("Failed to insert trigger URI (got -1). appId", n4.v(str));
            return false;
        } catch (SQLiteException e8) {
            t().G().c("Error storing trigger URI. appId", n4.v(str), e8);
            return false;
        }
    }

    public final boolean j0(String str, Long l8, long j8, com.google.android.gms.internal.measurement.w4 w4Var) {
        i();
        s();
        a3.o.j(w4Var);
        a3.o.f(str);
        a3.o.j(l8);
        byte[] bArrK = w4Var.k();
        t().K().c("Saving complex main event, appId, data size", c().c(str), Integer.valueOf(bArrK.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l8);
        contentValues.put("children_to_process", Long.valueOf(j8));
        contentValues.put("main_event", bArrK);
        try {
            if (B().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            t().G().b("Failed to insert complex main event (got -1). appId", n4.v(str));
            return false;
        } catch (SQLiteException e8) {
            t().G().c("Error storing complex main event. appId", n4.v(str), e8);
            return false;
        }
    }

    public final long v0(String str) {
        a3.o.f(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    protected final long w0(String str, String str2) throws Throwable {
        long jG;
        a3.o.f(str);
        a3.o.f(str2);
        i();
        s();
        SQLiteDatabase sQLiteDatabaseB = B();
        sQLiteDatabaseB.beginTransaction();
        long j8 = 0;
        try {
        } catch (SQLiteException e8) {
            e = e8;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                jG = G("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
            } catch (SQLiteException e9) {
                e = e9;
            }
            if (jG == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (sQLiteDatabaseB.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    t().G().c("Failed to insert column (got -1). appId", n4.v(str), str2);
                    sQLiteDatabaseB.endTransaction();
                    return -1L;
                }
                jG = 0;
                t().G().d("Error inserting column. appId", n4.v(str), str2, e);
                sQLiteDatabaseB.endTransaction();
                return j8;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + jG));
                if (sQLiteDatabaseB.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    t().G().c("Failed to update column (got 0). appId", n4.v(str), str2);
                    sQLiteDatabaseB.endTransaction();
                    return -1L;
                }
                sQLiteDatabaseB.setTransactionSuccessful();
                sQLiteDatabaseB.endTransaction();
                return jG;
            } catch (SQLiteException e10) {
                e = e10;
                j8 = jG;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseB.endTransaction();
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean x() {
        return false;
    }

    public final long y() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j8 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e8) {
                t().G().b("Error querying raw events", e8);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        t().G().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.jb> y0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.y0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long z() {
        return G("select max(bundle_end_timestamp) from queue", null, 0L);
    }
}

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k4 f20191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20192d;

    l4(w5 w5Var) {
        super(w5Var);
        this.f20191c = new k4(this, j(), "google_app_measurement_local.db");
    }

    private static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j8 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j8;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5 A[PHI: r6 r9
  0x00f5: PHI (r6v3 int) = (r6v1 int), (r6v4 int) binds: [B:71:0x0110, B:64:0x00f3] A[DONT_GENERATE, DONT_INLINE]
  0x00f5: PHI (r9v7 android.database.sqlite.SQLiteDatabase) = (r9v6 android.database.sqlite.SQLiteDatabase), (r9v8 android.database.sqlite.SQLiteDatabase) binds: [B:71:0x0110, B:64:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean D(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l4.D(int, byte[]):boolean");
    }

    private final SQLiteDatabase K() {
        if (this.f20192d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f20191c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f20192d = true;
        return null;
    }

    private final boolean L() {
        return j().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean A() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c0 A[PHI: r8 r15
  0x01c0: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:119:0x01ae, B:134:0x01d9, B:127:0x01be] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r15v6 android.database.sqlite.SQLiteDatabase) = 
  (r15v4 android.database.sqlite.SQLiteDatabase)
  (r15v5 android.database.sqlite.SQLiteDatabase)
  (r15v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:119:0x01ae, B:134:0x01d9, B:127:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<b3.a> C(int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l4.C(int):java.util.List");
    }

    public final boolean E(d dVar) {
        f();
        byte[] bArrP0 = ib.p0(dVar);
        if (bArrP0.length <= 131072) {
            return D(2, bArrP0);
        }
        t().I().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean F(d0 d0Var) {
        Parcel parcelObtain = Parcel.obtain();
        d0Var.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return D(0, bArrMarshall);
        }
        t().I().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean G(hb hbVar) {
        Parcel parcelObtain = Parcel.obtain();
        hbVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return D(1, bArrMarshall);
        }
        t().I().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void H() {
        int iDelete;
        i();
        try {
            SQLiteDatabase sQLiteDatabaseK = K();
            if (sQLiteDatabaseK == null || (iDelete = sQLiteDatabaseK.delete("messages", null, null) + 0) <= 0) {
                return;
            }
            t().K().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e8) {
            t().G().b("Error resetting local analytics data. error", e8);
        }
    }

    public final boolean I() {
        return D(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[PHI: r4
  0x006a: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:29:0x0061, B:36:0x007c, B:32:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.i()
            boolean r1 = r11.f20192d
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            boolean r1 = r11.L()
            if (r1 != 0) goto L12
            return r2
        L12:
            r1 = 5
            r3 = 0
            r4 = 5
        L15:
            if (r3 >= r1) goto L88
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r11.K()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            if (r5 != 0) goto L27
            r11.f20192d = r6     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            if (r5 == 0) goto L26
            r5.close()
        L26:
            return r2
        L27:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            r9[r2] = r10     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            r5.endTransaction()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46 android.database.sqlite.SQLiteDatabaseLockedException -> L62 android.database.sqlite.SQLiteFullException -> L6e
            r5.close()
            return r6
        L44:
            r0 = move-exception
            goto L82
        L46:
            r7 = move-exception
            if (r5 == 0) goto L52
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L44
            if (r8 == 0) goto L52
            r5.endTransaction()     // Catch: java.lang.Throwable -> L44
        L52:
            com.google.android.gms.measurement.internal.n4 r8 = r11.t()     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.measurement.internal.p4 r8 = r8.G()     // Catch: java.lang.Throwable -> L44
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L44
            r11.f20192d = r6     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L7f
            goto L6a
        L62:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L44
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L44
            int r4 = r4 + 20
            if (r5 == 0) goto L7f
        L6a:
            r5.close()
            goto L7f
        L6e:
            r7 = move-exception
            com.google.android.gms.measurement.internal.n4 r8 = r11.t()     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.measurement.internal.p4 r8 = r8.G()     // Catch: java.lang.Throwable -> L44
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L44
            r11.f20192d = r6     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L7f
            goto L6a
        L7f:
            int r3 = r3 + 1
            goto L15
        L82:
            if (r5 == 0) goto L87
            r5.close()
        L87:
            throw r0
        L88:
            com.google.android.gms.measurement.internal.n4 r0 = r11.t()
            com.google.android.gms.measurement.internal.p4 r0 = r0.L()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l4.J():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ o8 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ v8 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ da s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }
}

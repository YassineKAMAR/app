package b5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Boolean f3327n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f3328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f3329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f3330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f3331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Context f3332e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f3335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    SQLiteDatabase f3336i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f3339l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<d5.g> f3333f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<Integer, t> f3334g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3337j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3338k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f3340m = 0;

    class a implements DatabaseErrorHandler {
        a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    i(Context context, String str, int i8, boolean z7, int i9) {
        this.f3332e = context;
        this.f3329b = str;
        this.f3328a = z7;
        this.f3330c = i8;
        this.f3331d = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cursor G(d0 d0Var, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        d0Var.a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(d5.e eVar) {
        Boolean boolI = eVar.i();
        boolean z7 = Boolean.TRUE.equals(boolI) && eVar.g();
        if (z7) {
            int i8 = this.f3338k + 1;
            this.f3338k = i8;
            this.f3339l = Integer.valueOf(i8);
        }
        if (!w(eVar)) {
            if (z7) {
                this.f3339l = null;
            }
        } else if (z7) {
            HashMap map = new HashMap();
            map.put("transactionId", this.f3339l);
            eVar.a(map);
        } else {
            if (Boolean.FALSE.equals(boolI)) {
                this.f3339l = null;
            }
            eVar.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        while (!this.f3333f.isEmpty() && this.f3339l == null) {
            this.f3333f.get(0).a();
            this.f3333f.remove(0);
        }
    }

    private void S(d5.e eVar, Runnable runnable) {
        Integer numF = eVar.f();
        Integer num = this.f3339l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (numF == null || !(numF.equals(num) || numF.intValue() == -1)) {
            this.f3333f.add(new d5.g(eVar, runnable));
            return;
        }
        runnable.run();
        if (this.f3339l != null || this.f3333f.isEmpty()) {
            return;
        }
        this.f3335h.a(this, new Runnable() { // from class: b5.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f3326a.Q();
            }
        });
    }

    protected static boolean i(Context context, String str, boolean z7) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : y(context, packageName, 128)).metaData.getBoolean(str, z7);
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    protected static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    private void l(int i8) {
        t tVar = this.f3334g.get(Integer.valueOf(i8));
        if (tVar != null) {
            m(tVar);
        }
    }

    private void m(t tVar) {
        try {
            int i8 = tVar.f3367a;
            if (r.c(this.f3331d)) {
                Log.d("Sqflite", A() + "closing cursor " + i8);
            }
            this.f3334g.remove(Integer.valueOf(i8));
            tVar.f3369c.close();
        } catch (Exception unused) {
        }
    }

    private Map<String, Object> n(Cursor cursor, Integer num) {
        HashMap map = null;
        ArrayList arrayList = null;
        int columnCount = 0;
        while (cursor.moveToNext()) {
            if (map == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap map2 = new HashMap();
                columnCount = cursor.getColumnCount();
                map2.put("columns", Arrays.asList(cursor.getColumnNames()));
                map2.put("rows", arrayList2);
                arrayList = arrayList2;
                map = map2;
            }
            arrayList.add(e0.a(cursor, columnCount));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    private boolean p(d5.e eVar) {
        if (!w(eVar)) {
            return false;
        }
        eVar.a(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean I(d5.e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.i.I(d5.e):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [d5.e, d5.f] */
    /* JADX WARN: Type inference failed for: r1v0, types: [b5.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [b5.i] */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean J(d5.e eVar) throws Throwable {
        Integer num = (Integer) eVar.c("cursorPageSize");
        final ?? D = eVar.d();
        if (r.b(this.f3331d)) {
            Log.d("Sqflite", A() + D);
        }
        t tVar = null;
        try {
            try {
                D = z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: b5.f
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        return i.G(D, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    }
                }, D.c(), b5.a.f3287a, null);
                try {
                    Map<String, Object> mapN = n(D, num);
                    if ((num == null || D.isLast() || D.isAfterLast()) ? false : true) {
                        int i8 = this.f3340m + 1;
                        this.f3340m = i8;
                        mapN.put("cursorId", Integer.valueOf(i8));
                        t tVar2 = new t(i8, num.intValue(), D);
                        try {
                            this.f3334g.put(Integer.valueOf(i8), tVar2);
                            tVar = tVar2;
                        } catch (Exception e8) {
                            e = e8;
                            tVar = tVar2;
                            D(e, eVar);
                            if (tVar != null) {
                                m(tVar);
                            }
                            if (tVar == null && D != 0) {
                                D.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            tVar = tVar2;
                            if (tVar == null && D != 0) {
                                D.close();
                            }
                            throw th;
                        }
                    }
                    eVar.a(mapN);
                    if (tVar == null && D != 0) {
                        D.close();
                    }
                    return true;
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Exception e10) {
                e = e10;
                D = 0;
            } catch (Throwable th2) {
                th = th2;
                D = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean K(d5.e eVar) throws Throwable {
        boolean z7;
        int iIntValue = ((Integer) eVar.c("cursorId")).intValue();
        boolean zEquals = Boolean.TRUE.equals(eVar.c("cancel"));
        if (r.c(this.f3331d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A());
            sb.append("cursor ");
            sb.append(iIntValue);
            sb.append(zEquals ? " cancel" : " next");
            Log.d("Sqflite", sb.toString());
        }
        t tVar = null;
        if (zEquals) {
            l(iIntValue);
            eVar.a(null);
            return true;
        }
        t tVar2 = this.f3334g.get(Integer.valueOf(iIntValue));
        boolean z8 = false;
        try {
            if (tVar2 == null) {
                throw new IllegalStateException("Cursor " + iIntValue + " not found");
            }
            Cursor cursor = tVar2.f3369c;
            Map<String, Object> mapN = n(cursor, Integer.valueOf(tVar2.f3368b));
            z7 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
            if (z7) {
                try {
                    try {
                        mapN.put("cursorId", Integer.valueOf(iIntValue));
                    } catch (Throwable th) {
                        th = th;
                        z8 = z7;
                        if (!z8 && tVar2 != null) {
                            m(tVar2);
                        }
                        throw th;
                    }
                } catch (Exception e8) {
                    e = e8;
                    D(e, eVar);
                    if (tVar2 != null) {
                        m(tVar2);
                    } else {
                        tVar = tVar2;
                    }
                    if (!z7 && tVar != null) {
                        m(tVar);
                    }
                    return false;
                }
            }
            eVar.a(mapN);
            if (!z7) {
                m(tVar2);
            }
            return true;
        } catch (Exception e9) {
            e = e9;
            z7 = false;
        } catch (Throwable th2) {
            th = th2;
            if (!z8) {
                m(tVar2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean L(d5.e eVar) throws Throwable {
        if (!w(eVar)) {
            return false;
        }
        Cursor cursor = null;
        if (eVar.e()) {
            eVar.a(null);
            return true;
        }
        try {
            try {
                Cursor cursorRawQuery = C().rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i8 = cursorRawQuery.getInt(0);
                            if (r.b(this.f3331d)) {
                                Log.d("Sqflite", A() + "changed " + i8);
                            }
                            eVar.a(Integer.valueOf(i8));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        cursor = cursorRawQuery;
                        D(e, eVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", A() + "fail to read changes for Update/Delete");
                eVar.a(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    private boolean w(d5.e eVar) {
        d0 d0VarD = eVar.d();
        if (r.b(this.f3331d)) {
            Log.d("Sqflite", A() + d0VarD);
        }
        Boolean boolI = eVar.i();
        try {
            C().execSQL(d0VarD.c(), d0VarD.d());
            u(boolI);
            return true;
        } catch (Exception e8) {
            D(e8, eVar);
            return false;
        }
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    static ApplicationInfo y(Context context, String str, int i8) {
        return context.getPackageManager().getApplicationInfo(str, i8);
    }

    String A() {
        return "[" + B() + "] ";
    }

    String B() {
        Thread threadCurrentThread = Thread.currentThread();
        return "" + this.f3330c + com.amazon.a.a.o.b.f.f3942a + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.f3336i;
    }

    void D(Exception exc, d5.e eVar) {
        String message;
        Map<String, Object> mapA;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + this.f3329b;
            mapA = null;
        } else {
            boolean z7 = exc instanceof SQLException;
            message = exc.getMessage();
            mapA = d5.h.a(eVar);
        }
        eVar.b("sqlite_error", message, mapA);
    }

    public void E(final d5.e eVar) {
        S(eVar, new Runnable() { // from class: b5.d
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f3317a.I(eVar);
            }
        });
    }

    synchronized boolean F() {
        return this.f3337j > 0;
    }

    public void M() {
        if (f3327n == null) {
            Boolean boolValueOf = Boolean.valueOf(j(this.f3332e));
            f3327n = boolValueOf;
            if (boolValueOf.booleanValue() && r.c(this.f3331d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.f3336i = SQLiteDatabase.openDatabase(this.f3329b, null, f3327n.booleanValue() ? 805306368 : 268435456);
    }

    public void N() {
        this.f3336i = SQLiteDatabase.openDatabase(this.f3329b, null, 1, new a());
    }

    public void O(final d5.e eVar) {
        S(eVar, new Runnable() { // from class: b5.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f3321a.J(eVar);
            }
        });
    }

    public void P(final d5.e eVar) {
        S(eVar, new Runnable() { // from class: b5.b
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f3291a.K(eVar);
            }
        });
    }

    public void R(final d5.e eVar) {
        S(eVar, new Runnable() { // from class: b5.g
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f3324a.L(eVar);
            }
        });
    }

    void h(s5.j jVar, k.d dVar) {
        d5.c cVar;
        String method;
        d5.d dVar2 = new d5.d(jVar, dVar);
        boolean zE = dVar2.e();
        boolean zK = dVar2.k();
        List list = (List) dVar2.c("operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cVar = new d5.c((Map) it.next(), zE);
            method = cVar.getMethod();
            method.hashCode();
            switch (method) {
                case "execute":
                    if (!p(cVar)) {
                        if (!zK) {
                            cVar.q(dVar);
                            break;
                        }
                        cVar.r(arrayList);
                        break;
                    } else {
                        cVar.s(arrayList);
                        break;
                    }
                    break;
                case "insert":
                    if (!I(cVar)) {
                        if (!zK) {
                            cVar.q(dVar);
                            break;
                        }
                        cVar.r(arrayList);
                        break;
                    } else {
                        cVar.s(arrayList);
                        break;
                    }
                    break;
                case "update":
                    if (!L(cVar)) {
                        if (!zK) {
                            cVar.q(dVar);
                            break;
                        }
                        cVar.r(arrayList);
                        break;
                    } else {
                        cVar.s(arrayList);
                        break;
                    }
                    break;
                case "query":
                    if (!J(cVar)) {
                        if (!zK) {
                            cVar.q(dVar);
                            break;
                        }
                        cVar.r(arrayList);
                        break;
                    } else {
                        cVar.s(arrayList);
                        break;
                    }
                    break;
                default:
                    dVar.b("bad_param", "Batch method '" + method + "' not supported", null);
                    break;
            }
            return;
        }
        if (zE) {
            dVar.a(null);
        } else {
            dVar.a(arrayList);
        }
    }

    public void k() {
        if (!this.f3334g.isEmpty() && r.b(this.f3331d)) {
            Log.d("Sqflite", A() + this.f3334g.size() + " cursor(s) are left opened");
        }
        this.f3336i.close();
    }

    synchronized void u(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f3337j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f3337j--;
        }
    }

    public void v(final d5.e eVar) {
        S(eVar, new Runnable() { // from class: b5.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f3296a.H(eVar);
            }
        });
    }

    public SQLiteDatabase z() {
        return this.f3336i;
    }
}

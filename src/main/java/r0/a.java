package r0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
class a implements q0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f25840b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f25841c = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f25842a;

    /* JADX INFO: renamed from: r0.a$a, reason: collision with other inner class name */
    class C0161a implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0.e f25843a;

        C0161a(q0.e eVar) {
            this.f25843a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f25843a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    class b implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0.e f25845a;

        b(q0.e eVar) {
            this.f25845a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f25845a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f25842a = sQLiteDatabase;
    }

    @Override // q0.b
    public void B() {
        this.f25842a.setTransactionSuccessful();
    }

    @Override // q0.b
    public void C(String str, Object[] objArr) {
        this.f25842a.execSQL(str, objArr);
    }

    @Override // q0.b
    public Cursor I(String str) {
        return T(new q0.a(str));
    }

    @Override // q0.b
    public void L() {
        this.f25842a.endTransaction();
    }

    @Override // q0.b
    public Cursor O(q0.e eVar, CancellationSignal cancellationSignal) {
        return this.f25842a.rawQueryWithFactory(new b(eVar), eVar.c(), f25841c, null, cancellationSignal);
    }

    @Override // q0.b
    public Cursor T(q0.e eVar) {
        return this.f25842a.rawQueryWithFactory(new C0161a(eVar), eVar.c(), f25841c, null);
    }

    @Override // q0.b
    public String U() {
        return this.f25842a.getPath();
    }

    @Override // q0.b
    public boolean V() {
        return this.f25842a.inTransaction();
    }

    boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f25842a == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25842a.close();
    }

    @Override // q0.b
    public void f() {
        this.f25842a.beginTransaction();
    }

    @Override // q0.b
    public boolean isOpen() {
        return this.f25842a.isOpen();
    }

    @Override // q0.b
    public List<Pair<String, String>> m() {
        return this.f25842a.getAttachedDbs();
    }

    @Override // q0.b
    public void n(String str) {
        this.f25842a.execSQL(str);
    }

    @Override // q0.b
    public f s(String str) {
        return new e(this.f25842a.compileStatement(str));
    }
}

package r0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import q0.c;

/* JADX INFO: loaded from: classes.dex */
class b implements q0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f25849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f25851e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f25852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f25853g;

    static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r0.a[] f25854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c.a f25855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f25856c;

        /* JADX INFO: renamed from: r0.b$a$a, reason: collision with other inner class name */
        class C0162a implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f25857a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r0.a[] f25858b;

            C0162a(c.a aVar, r0.a[] aVarArr) {
                this.f25857a = aVar;
                this.f25858b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f25857a.c(a.c(this.f25858b, sQLiteDatabase));
            }
        }

        a(Context context, String str, r0.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f25739a, new C0162a(aVar, aVarArr));
            this.f25855b = aVar;
            this.f25854a = aVarArr;
        }

        static r0.a c(r0.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            r0.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new r0.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        r0.a a(SQLiteDatabase sQLiteDatabase) {
            return c(this.f25854a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f25854a[0] = null;
        }

        synchronized q0.b d() {
            this.f25856c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f25856c) {
                return a(writableDatabase);
            }
            close();
            return d();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f25855b.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f25855b.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
            this.f25856c = true;
            this.f25855b.e(a(sQLiteDatabase), i8, i9);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f25856c) {
                return;
            }
            this.f25855b.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
            this.f25856c = true;
            this.f25855b.g(a(sQLiteDatabase), i8, i9);
        }
    }

    b(Context context, String str, c.a aVar, boolean z7) {
        this.f25847a = context;
        this.f25848b = str;
        this.f25849c = aVar;
        this.f25850d = z7;
    }

    private a a() {
        a aVar;
        synchronized (this.f25851e) {
            if (this.f25852f == null) {
                r0.a[] aVarArr = new r0.a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f25848b == null || !this.f25850d) {
                    this.f25852f = new a(this.f25847a, this.f25848b, aVarArr, this.f25849c);
                } else {
                    this.f25852f = new a(this.f25847a, new File(this.f25847a.getNoBackupFilesDir(), this.f25848b).getAbsolutePath(), aVarArr, this.f25849c);
                }
                this.f25852f.setWriteAheadLoggingEnabled(this.f25853g);
            }
            aVar = this.f25852f;
        }
        return aVar;
    }

    @Override // q0.c
    public q0.b H() {
        return a().d();
    }

    @Override // q0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // q0.c
    public String getDatabaseName() {
        return this.f25848b;
    }

    @Override // q0.c
    public void setWriteAheadLoggingEnabled(boolean z7) {
        synchronized (this.f25851e) {
            a aVar = this.f25852f;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z7);
            }
            this.f25853g = z7;
        }
    }
}

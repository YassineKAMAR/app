package r0;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
class d implements q0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f25859a;

    d(SQLiteProgram sQLiteProgram) {
        this.f25859a = sQLiteProgram;
    }

    @Override // q0.d
    public void A(int i8, long j8) {
        this.f25859a.bindLong(i8, j8);
    }

    @Override // q0.d
    public void F(int i8, byte[] bArr) {
        this.f25859a.bindBlob(i8, bArr);
    }

    @Override // q0.d
    public void S(int i8) {
        this.f25859a.bindNull(i8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25859a.close();
    }

    @Override // q0.d
    public void p(int i8, String str) {
        this.f25859a.bindString(i8, str);
    }

    @Override // q0.d
    public void v(int i8, double d8) {
        this.f25859a.bindDouble(i8, d8);
    }
}

package r0;

import android.database.sqlite.SQLiteStatement;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
class e extends d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f25860b;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f25860b = sQLiteStatement;
    }

    @Override // q0.f
    public long c0() {
        return this.f25860b.executeInsert();
    }

    @Override // q0.f
    public int r() {
        return this.f25860b.executeUpdateDelete();
    }
}

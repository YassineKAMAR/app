package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import q0.c;

/* JADX INFO: loaded from: classes.dex */
public class i extends c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.room.a f2896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f2897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f2899e;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2900a;

        public a(int i8) {
            this.f2900a = i8;
        }

        protected abstract void a(q0.b bVar);

        protected abstract void b(q0.b bVar);

        protected abstract void c(q0.b bVar);

        protected abstract void d(q0.b bVar);

        protected abstract void e(q0.b bVar);

        protected abstract void f(q0.b bVar);

        protected abstract b g(q0.b bVar);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2902b;

        public b(boolean z7, String str) {
            this.f2901a = z7;
            this.f2902b = str;
        }
    }

    public i(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f2900a);
        this.f2896b = aVar;
        this.f2897c = aVar2;
        this.f2898d = str;
        this.f2899e = str2;
    }

    private void h(q0.b bVar) {
        if (!k(bVar)) {
            b bVarG = this.f2897c.g(bVar);
            if (bVarG.f2901a) {
                this.f2897c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f2902b);
            }
        }
        Cursor cursorT = bVar.T(new q0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorT.moveToFirst() ? cursorT.getString(0) : null;
            cursorT.close();
            if (!this.f2898d.equals(string) && !this.f2899e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorT.close();
            throw th;
        }
    }

    private void i(q0.b bVar) {
        bVar.n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(q0.b bVar) {
        Cursor cursorI = bVar.I("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z7 = false;
            if (cursorI.moveToFirst()) {
                if (cursorI.getInt(0) == 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            cursorI.close();
        }
    }

    private static boolean k(q0.b bVar) {
        Cursor cursorI = bVar.I("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z7 = false;
            if (cursorI.moveToFirst()) {
                if (cursorI.getInt(0) != 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            cursorI.close();
        }
    }

    private void l(q0.b bVar) {
        i(bVar);
        bVar.n(m0.b.a(this.f2898d));
    }

    @Override // q0.c.a
    public void b(q0.b bVar) {
        super.b(bVar);
    }

    @Override // q0.c.a
    public void d(q0.b bVar) {
        boolean zJ = j(bVar);
        this.f2897c.a(bVar);
        if (!zJ) {
            b bVarG = this.f2897c.g(bVar);
            if (!bVarG.f2901a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f2902b);
            }
        }
        l(bVar);
        this.f2897c.c(bVar);
    }

    @Override // q0.c.a
    public void e(q0.b bVar, int i8, int i9) {
        g(bVar, i8, i9);
    }

    @Override // q0.c.a
    public void f(q0.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f2897c.d(bVar);
        this.f2896b = null;
    }

    @Override // q0.c.a
    public void g(q0.b bVar, int i8, int i9) {
        boolean z7;
        List<n0.a> listC;
        androidx.room.a aVar = this.f2896b;
        if (aVar == null || (listC = aVar.f2802d.c(i8, i9)) == null) {
            z7 = false;
        } else {
            this.f2897c.f(bVar);
            Iterator<n0.a> it = listC.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
            b bVarG = this.f2897c.g(bVar);
            if (!bVarG.f2901a) {
                throw new IllegalStateException("Migration didn't properly handle: " + bVarG.f2902b);
            }
            this.f2897c.e(bVar);
            l(bVar);
            z7 = true;
        }
        if (z7) {
            return;
        }
        androidx.room.a aVar2 = this.f2896b;
        if (aVar2 != null && !aVar2.a(i8, i9)) {
            this.f2897c.b(bVar);
            this.f2897c.a(bVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i8 + " to " + i9 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}

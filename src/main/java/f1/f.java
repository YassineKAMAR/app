package f1;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f21625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.a<d> f21626b;

    class a extends m0.a<d> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // m0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(q0.f fVar, d dVar) {
            String str = dVar.f21623a;
            if (str == null) {
                fVar.S(1);
            } else {
                fVar.p(1, str);
            }
            Long l8 = dVar.f21624b;
            if (l8 == null) {
                fVar.S(2);
            } else {
                fVar.A(2, l8.longValue());
            }
        }
    }

    public f(androidx.room.h hVar) {
        this.f21625a = hVar;
        this.f21626b = new a(hVar);
    }

    @Override // f1.e
    public Long a(String str) {
        m0.c cVarD = m0.c.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21625a.b();
        Long lValueOf = null;
        Cursor cursorB = o0.c.b(this.f21625a, cVarD, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.e
    public void b(d dVar) {
        this.f21625a.b();
        this.f21625a.c();
        try {
            this.f21626b.h(dVar);
            this.f21625a.r();
        } finally {
            this.f21625a.g();
        }
    }
}

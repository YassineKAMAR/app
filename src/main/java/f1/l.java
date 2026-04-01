package f1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f21637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.a<j> f21638b;

    class a extends m0.a<j> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // m0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(q0.f fVar, j jVar) {
            String str = jVar.f21635a;
            if (str == null) {
                fVar.S(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = jVar.f21636b;
            if (str2 == null) {
                fVar.S(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public l(androidx.room.h hVar) {
        this.f21637a = hVar;
        this.f21638b = new a(hVar);
    }

    @Override // f1.k
    public void a(j jVar) {
        this.f21637a.b();
        this.f21637a.c();
        try {
            this.f21638b.h(jVar);
            this.f21637a.r();
        } finally {
            this.f21637a.g();
        }
    }

    @Override // f1.k
    public List<String> b(String str) {
        m0.c cVarD = m0.c.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21637a.b();
        Cursor cursorB = o0.c.b(this.f21637a, cVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }
}

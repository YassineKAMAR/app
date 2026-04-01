package f1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f21630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.a<g> f21631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0.d f21632c;

    class a extends m0.a<g> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // m0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(q0.f fVar, g gVar) {
            String str = gVar.f21628a;
            if (str == null) {
                fVar.S(1);
            } else {
                fVar.p(1, str);
            }
            fVar.A(2, gVar.f21629b);
        }
    }

    class b extends m0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.h hVar) {
        this.f21630a = hVar;
        this.f21631b = new a(hVar);
        this.f21632c = new b(hVar);
    }

    @Override // f1.h
    public List<String> a() {
        m0.c cVarD = m0.c.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f21630a.b();
        Cursor cursorB = o0.c.b(this.f21630a, cVarD, false, null);
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

    @Override // f1.h
    public void b(g gVar) {
        this.f21630a.b();
        this.f21630a.c();
        try {
            this.f21631b.h(gVar);
            this.f21630a.r();
        } finally {
            this.f21630a.g();
        }
    }

    @Override // f1.h
    public g c(String str) {
        m0.c cVarD = m0.c.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21630a.b();
        Cursor cursorB = o0.c.b(this.f21630a, cVarD, false, null);
        try {
            return cursorB.moveToFirst() ? new g(cursorB.getString(o0.b.b(cursorB, "work_spec_id")), cursorB.getInt(o0.b.b(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.h
    public void d(String str) {
        this.f21630a.b();
        q0.f fVarA = this.f21632c.a();
        if (str == null) {
            fVarA.S(1);
        } else {
            fVarA.p(1, str);
        }
        this.f21630a.c();
        try {
            fVarA.r();
            this.f21630a.r();
        } finally {
            this.f21630a.g();
            this.f21632c.f(fVarA);
        }
    }
}

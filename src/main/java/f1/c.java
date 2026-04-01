package f1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f21620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.a<f1.a> f21621b;

    class a extends m0.a<f1.a> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // m0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(q0.f fVar, f1.a aVar) {
            String str = aVar.f21618a;
            if (str == null) {
                fVar.S(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = aVar.f21619b;
            if (str2 == null) {
                fVar.S(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public c(androidx.room.h hVar) {
        this.f21620a = hVar;
        this.f21621b = new a(hVar);
    }

    @Override // f1.b
    public List<String> a(String str) {
        m0.c cVarD = m0.c.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21620a.b();
        Cursor cursorB = o0.c.b(this.f21620a, cVarD, false, null);
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

    @Override // f1.b
    public boolean b(String str) {
        m0.c cVarD = m0.c.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21620a.b();
        boolean z7 = false;
        Cursor cursorB = o0.c.b(this.f21620a, cVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z7 = cursorB.getInt(0) != 0;
            }
            return z7;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.b
    public boolean c(String str) {
        m0.c cVarD = m0.c.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21620a.b();
        boolean z7 = false;
        Cursor cursorB = o0.c.b(this.f21620a, cVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z7 = cursorB.getInt(0) != 0;
            }
            return z7;
        } finally {
            cursorB.close();
            cVarD.o();
        }
    }

    @Override // f1.b
    public void d(f1.a aVar) {
        this.f21620a.b();
        this.f21620a.c();
        try {
            this.f21621b.h(aVar);
            this.f21620a.r();
        } finally {
            this.f21620a.g();
        }
    }
}

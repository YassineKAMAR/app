package f1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f21692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.a<s> f21693b;

    class a extends m0.a<s> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // m0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(q0.f fVar, s sVar) {
            String str = sVar.f21690a;
            if (str == null) {
                fVar.S(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = sVar.f21691b;
            if (str2 == null) {
                fVar.S(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public u(androidx.room.h hVar) {
        this.f21692a = hVar;
        this.f21693b = new a(hVar);
    }

    @Override // f1.t
    public List<String> a(String str) {
        m0.c cVarD = m0.c.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            cVarD.S(1);
        } else {
            cVarD.p(1, str);
        }
        this.f21692a.b();
        Cursor cursorB = o0.c.b(this.f21692a, cVarD, false, null);
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

    @Override // f1.t
    public void b(s sVar) {
        this.f21692a.b();
        this.f21692a.c();
        try {
            this.f21693b.h(sVar);
            this.f21692a.r();
        } finally {
            this.f21692a.g();
        }
    }
}

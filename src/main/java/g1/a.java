package g1;

import androidx.work.impl.WorkDatabase;
import f1.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import x0.m;
import x0.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0.c f21872a = new y0.c();

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    class C0109a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0.i f21873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f21874c;

        C0109a(y0.i iVar, UUID uuid) {
            this.f21873b = iVar;
            this.f21874c = uuid;
        }

        @Override // g1.a
        void h() {
            WorkDatabase workDatabaseO = this.f21873b.o();
            workDatabaseO.c();
            try {
                a(this.f21873b, this.f21874c.toString());
                workDatabaseO.r();
                workDatabaseO.g();
                g(this.f21873b);
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0.i f21875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21876c;

        b(y0.i iVar, String str) {
            this.f21875b = iVar;
            this.f21876c = str;
        }

        @Override // g1.a
        void h() {
            WorkDatabase workDatabaseO = this.f21875b.o();
            workDatabaseO.c();
            try {
                Iterator<String> it = workDatabaseO.B().p(this.f21876c).iterator();
                while (it.hasNext()) {
                    a(this.f21875b, it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                g(this.f21875b);
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0.i f21877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f21879d;

        c(y0.i iVar, String str, boolean z7) {
            this.f21877b = iVar;
            this.f21878c = str;
            this.f21879d = z7;
        }

        @Override // g1.a
        void h() {
            WorkDatabase workDatabaseO = this.f21877b.o();
            workDatabaseO.c();
            try {
                Iterator<String> it = workDatabaseO.B().j(this.f21878c).iterator();
                while (it.hasNext()) {
                    a(this.f21877b, it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                if (this.f21879d) {
                    g(this.f21877b);
                }
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, y0.i iVar) {
        return new C0109a(iVar, uuid);
    }

    public static a c(String str, y0.i iVar, boolean z7) {
        return new c(iVar, str, z7);
    }

    public static a d(String str, y0.i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q qVarB = workDatabase.B();
        f1.b bVarT = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            s sVarL = qVarB.l(str2);
            if (sVarL != s.SUCCEEDED && sVarL != s.FAILED) {
                qVarB.k(s.CANCELLED, str2);
            }
            linkedList.addAll(bVarT.a(str2));
        }
    }

    void a(y0.i iVar, String str) {
        f(iVar.o(), str);
        iVar.m().l(str);
        Iterator<y0.e> it = iVar.n().iterator();
        while (it.hasNext()) {
            it.next().e(str);
        }
    }

    public x0.m e() {
        return this.f21872a;
    }

    void g(y0.i iVar) {
        y0.f.b(iVar.i(), iVar.o(), iVar.n());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f21872a.a(x0.m.f27206a);
        } catch (Throwable th) {
            this.f21872a.a(new m.b.a(th));
        }
    }
}

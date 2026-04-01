package u;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f26605g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26607b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f26609d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<t.e> f26606a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f26608c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<a> f26610e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26611f = -1;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<t.e> f26612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f26617f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f26618g;

        public a(t.e eVar, q.d dVar, int i8) {
            this.f26612a = new WeakReference<>(eVar);
            this.f26613b = dVar.x(eVar.O);
            this.f26614c = dVar.x(eVar.P);
            this.f26615d = dVar.x(eVar.Q);
            this.f26616e = dVar.x(eVar.R);
            this.f26617f = dVar.x(eVar.S);
            this.f26618g = i8;
        }
    }

    public o(int i8) {
        int i9 = f26605g;
        f26605g = i9 + 1;
        this.f26607b = i9;
        this.f26609d = i8;
    }

    private String e() {
        int i8 = this.f26609d;
        return i8 == 0 ? "Horizontal" : i8 == 1 ? "Vertical" : i8 == 2 ? "Both" : "Unknown";
    }

    private int j(q.d dVar, ArrayList<t.e> arrayList, int i8) {
        int iX;
        t.d dVar2;
        t.f fVar = (t.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            arrayList.get(i9).g(dVar, false);
        }
        if (i8 == 0 && fVar.W0 > 0) {
            t.b.b(fVar, dVar, arrayList, 0);
        }
        if (i8 == 1 && fVar.X0 > 0) {
            t.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        this.f26610e = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f26610e.add(new a(arrayList.get(i10), dVar, i8));
        }
        if (i8 == 0) {
            iX = dVar.x(fVar.O);
            dVar2 = fVar.Q;
        } else {
            iX = dVar.x(fVar.P);
            dVar2 = fVar.R;
        }
        int iX2 = dVar.x(dVar2);
        dVar.D();
        return iX2 - iX;
    }

    public boolean a(t.e eVar) {
        if (this.f26606a.contains(eVar)) {
            return false;
        }
        this.f26606a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f26606a.size();
        if (this.f26611f != -1 && size > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                o oVar = arrayList.get(i8);
                if (this.f26611f == oVar.f26607b) {
                    g(this.f26609d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f26607b;
    }

    public int d() {
        return this.f26609d;
    }

    public int f(q.d dVar, int i8) {
        if (this.f26606a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f26606a, i8);
    }

    public void g(int i8, o oVar) {
        for (t.e eVar : this.f26606a) {
            oVar.a(eVar);
            int iC = oVar.c();
            if (i8 == 0) {
                eVar.I0 = iC;
            } else {
                eVar.J0 = iC;
            }
        }
        this.f26611f = oVar.f26607b;
    }

    public void h(boolean z7) {
        this.f26608c = z7;
    }

    public void i(int i8) {
        this.f26609d = i8;
    }

    public String toString() {
        String str = e() + " [" + this.f26607b + "] <";
        Iterator<t.e> it = this.f26606a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}

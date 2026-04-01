package q;

import java.util.ArrayList;
import q.d;
import q.i;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f25655e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f25651a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f25652b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f25653c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<i> f25654d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f25656f = false;

    public interface a {
        void a(i iVar, float f8);

        int b();

        i c(int i8);

        void clear();

        float d(i iVar, boolean z7);

        boolean e(i iVar);

        void f();

        float g(int i8);

        void h(i iVar, float f8, boolean z7);

        float i(i iVar);

        float j(b bVar, boolean z7);

        void k(float f8);
    }

    public b() {
    }

    public b(c cVar) {
        this.f25655e = new q.a(this, cVar);
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f25712m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iB = this.f25655e.b();
        i iVar2 = null;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < iB; i8++) {
            float fG = this.f25655e.g(i8);
            if (fG < 0.0f) {
                i iVarC = this.f25655e.c(i8);
                if ((zArr == null || !zArr[iVarC.f25702c]) && iVarC != iVar && (((aVar = iVarC.f25709j) == i.a.SLACK || aVar == i.a.ERROR) && fG < f8)) {
                    f8 = fG;
                    iVar2 = iVarC;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z7) {
        if (iVar == null || !iVar.f25706g) {
            return;
        }
        this.f25652b += iVar.f25705f * this.f25655e.i(iVar);
        this.f25655e.d(iVar, z7);
        if (z7) {
            iVar.e(this);
        }
        if (d.f25663t && this.f25655e.b() == 0) {
            this.f25656f = true;
            dVar.f25669a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z7) {
        this.f25652b += bVar.f25652b * this.f25655e.j(bVar, z7);
        if (z7) {
            bVar.f25651a.e(this);
        }
        if (d.f25663t && this.f25651a != null && this.f25655e.b() == 0) {
            this.f25656f = true;
            dVar.f25669a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z7) {
        if (iVar == null || !iVar.f25713n) {
            return;
        }
        float fI = this.f25655e.i(iVar);
        this.f25652b += iVar.f25715p * fI;
        this.f25655e.d(iVar, z7);
        if (z7) {
            iVar.e(this);
        }
        this.f25655e.h(dVar.f25682n.f25660d[iVar.f25714o], fI, z7);
        if (d.f25663t && this.f25655e.b() == 0) {
            this.f25656f = true;
            dVar.f25669a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f25675g.length == 0) {
            return;
        }
        boolean z7 = false;
        while (!z7) {
            int iB = this.f25655e.b();
            for (int i8 = 0; i8 < iB; i8++) {
                i iVarC = this.f25655e.c(i8);
                if (iVarC.f25703d != -1 || iVarC.f25706g || iVarC.f25713n) {
                    this.f25654d.add(iVarC);
                }
            }
            int size = this.f25654d.size();
            if (size > 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    i iVar = this.f25654d.get(i9);
                    if (iVar.f25706g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f25713n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f25675g[iVar.f25703d], true);
                    }
                }
                this.f25654d.clear();
            } else {
                z7 = true;
            }
        }
        if (d.f25663t && this.f25651a != null && this.f25655e.b() == 0) {
            this.f25656f = true;
            dVar.f25669a = true;
        }
    }

    @Override // q.d.a
    public i a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // q.d.a
    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f25651a = null;
            this.f25655e.clear();
            for (int i8 = 0; i8 < bVar.f25655e.b(); i8++) {
                this.f25655e.h(bVar.f25655e.c(i8), bVar.f25655e.g(i8), true);
            }
        }
    }

    @Override // q.d.a
    public void c(i iVar) {
        int i8 = iVar.f25704e;
        float f8 = 1.0f;
        if (i8 != 1) {
            if (i8 == 2) {
                f8 = 1000.0f;
            } else if (i8 == 3) {
                f8 = 1000000.0f;
            } else if (i8 == 4) {
                f8 = 1.0E9f;
            } else if (i8 == 5) {
                f8 = 1.0E12f;
            }
        }
        this.f25655e.a(iVar, f8);
    }

    @Override // q.d.a
    public void clear() {
        this.f25655e.clear();
        this.f25651a = null;
        this.f25652b = 0.0f;
    }

    public b d(d dVar, int i8) {
        this.f25655e.a(dVar.o(i8, "ep"), 1.0f);
        this.f25655e.a(dVar.o(i8, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i8) {
        this.f25655e.a(iVar, i8);
        return this;
    }

    boolean f(d dVar) {
        boolean z7;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z7 = true;
        } else {
            x(iVarG);
            z7 = false;
        }
        if (this.f25655e.b() == 0) {
            this.f25656f = true;
        }
        return z7;
    }

    i g(d dVar) {
        int iB = this.f25655e.b();
        i iVar = null;
        i iVar2 = null;
        boolean zU = false;
        boolean zU2 = false;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i8 = 0; i8 < iB; i8++) {
            float fG = this.f25655e.g(i8);
            i iVarC = this.f25655e.c(i8);
            if (iVarC.f25709j == i.a.UNRESTRICTED) {
                if (iVar == null || f8 > fG) {
                    zU = u(iVarC, dVar);
                    f8 = fG;
                    iVar = iVarC;
                } else if (!zU && u(iVarC, dVar)) {
                    f8 = fG;
                    iVar = iVarC;
                    zU = true;
                }
            } else if (iVar == null && fG < 0.0f) {
                if (iVar2 == null || f9 > fG) {
                    zU2 = u(iVarC, dVar);
                    f9 = fG;
                    iVar2 = iVarC;
                } else if (!zU2 && u(iVarC, dVar)) {
                    f9 = fG;
                    iVar2 = iVarC;
                    zU2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // q.d.a
    public i getKey() {
        return this.f25651a;
    }

    b h(i iVar, i iVar2, int i8, float f8, i iVar3, i iVar4, int i9) {
        float f9;
        int i10;
        if (iVar2 == iVar3) {
            this.f25655e.a(iVar, 1.0f);
            this.f25655e.a(iVar4, 1.0f);
            this.f25655e.a(iVar2, -2.0f);
            return this;
        }
        if (f8 == 0.5f) {
            this.f25655e.a(iVar, 1.0f);
            this.f25655e.a(iVar2, -1.0f);
            this.f25655e.a(iVar3, -1.0f);
            this.f25655e.a(iVar4, 1.0f);
            if (i8 > 0 || i9 > 0) {
                i10 = (-i8) + i9;
                f9 = i10;
            }
            return this;
        }
        if (f8 <= 0.0f) {
            this.f25655e.a(iVar, -1.0f);
            this.f25655e.a(iVar2, 1.0f);
            f9 = i8;
        } else {
            if (f8 < 1.0f) {
                float f10 = 1.0f - f8;
                this.f25655e.a(iVar, f10 * 1.0f);
                this.f25655e.a(iVar2, f10 * (-1.0f));
                this.f25655e.a(iVar3, (-1.0f) * f8);
                this.f25655e.a(iVar4, 1.0f * f8);
                if (i8 > 0 || i9 > 0) {
                    f9 = ((-i8) * f10) + (i9 * f8);
                }
                return this;
            }
            this.f25655e.a(iVar4, -1.0f);
            this.f25655e.a(iVar3, 1.0f);
            i10 = -i9;
            f9 = i10;
        }
        this.f25652b = f9;
        return this;
    }

    b i(i iVar, int i8) {
        this.f25651a = iVar;
        float f8 = i8;
        iVar.f25705f = f8;
        this.f25652b = f8;
        this.f25656f = true;
        return this;
    }

    @Override // q.d.a
    public boolean isEmpty() {
        return this.f25651a == null && this.f25652b == 0.0f && this.f25655e.b() == 0;
    }

    b j(i iVar, i iVar2, float f8) {
        this.f25655e.a(iVar, -1.0f);
        this.f25655e.a(iVar2, f8);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f8) {
        this.f25655e.a(iVar, -1.0f);
        this.f25655e.a(iVar2, 1.0f);
        this.f25655e.a(iVar3, f8);
        this.f25655e.a(iVar4, -f8);
        return this;
    }

    public b l(float f8, float f9, float f10, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f25652b = 0.0f;
        if (f9 == 0.0f || f8 == f10) {
            this.f25655e.a(iVar, 1.0f);
            this.f25655e.a(iVar2, -1.0f);
            this.f25655e.a(iVar4, 1.0f);
            this.f25655e.a(iVar3, -1.0f);
        } else if (f8 == 0.0f) {
            this.f25655e.a(iVar, 1.0f);
            this.f25655e.a(iVar2, -1.0f);
        } else if (f10 == 0.0f) {
            this.f25655e.a(iVar3, 1.0f);
            this.f25655e.a(iVar4, -1.0f);
        } else {
            float f11 = (f8 / f9) / (f10 / f9);
            this.f25655e.a(iVar, 1.0f);
            this.f25655e.a(iVar2, -1.0f);
            this.f25655e.a(iVar4, f11);
            this.f25655e.a(iVar3, -f11);
        }
        return this;
    }

    public b m(i iVar, int i8) {
        a aVar;
        float f8;
        if (i8 < 0) {
            this.f25652b = i8 * (-1);
            aVar = this.f25655e;
            f8 = 1.0f;
        } else {
            this.f25652b = i8;
            aVar = this.f25655e;
            f8 = -1.0f;
        }
        aVar.a(iVar, f8);
        return this;
    }

    public b n(i iVar, i iVar2, int i8) {
        boolean z7 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            }
            this.f25652b = i8;
        }
        if (z7) {
            this.f25655e.a(iVar, 1.0f);
            this.f25655e.a(iVar2, -1.0f);
        } else {
            this.f25655e.a(iVar, -1.0f);
            this.f25655e.a(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i8) {
        boolean z7 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            }
            this.f25652b = i8;
        }
        if (z7) {
            this.f25655e.a(iVar, 1.0f);
            this.f25655e.a(iVar2, -1.0f);
            this.f25655e.a(iVar3, -1.0f);
        } else {
            this.f25655e.a(iVar, -1.0f);
            this.f25655e.a(iVar2, 1.0f);
            this.f25655e.a(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i8) {
        boolean z7 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            }
            this.f25652b = i8;
        }
        if (z7) {
            this.f25655e.a(iVar, 1.0f);
            this.f25655e.a(iVar2, -1.0f);
            this.f25655e.a(iVar3, 1.0f);
        } else {
            this.f25655e.a(iVar, -1.0f);
            this.f25655e.a(iVar2, 1.0f);
            this.f25655e.a(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f8) {
        this.f25655e.a(iVar3, 0.5f);
        this.f25655e.a(iVar4, 0.5f);
        this.f25655e.a(iVar, -0.5f);
        this.f25655e.a(iVar2, -0.5f);
        this.f25652b = -f8;
        return this;
    }

    void r() {
        float f8 = this.f25652b;
        if (f8 < 0.0f) {
            this.f25652b = f8 * (-1.0f);
            this.f25655e.f();
        }
    }

    boolean s() {
        i iVar = this.f25651a;
        return iVar != null && (iVar.f25709j == i.a.UNRESTRICTED || this.f25652b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f25655e.e(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f25651a;
        if (iVar2 != null) {
            this.f25655e.a(iVar2, -1.0f);
            this.f25651a.f25703d = -1;
            this.f25651a = null;
        }
        float fD = this.f25655e.d(iVar, true) * (-1.0f);
        this.f25651a = iVar;
        if (fD == 1.0f) {
            return;
        }
        this.f25652b /= fD;
        this.f25655e.k(fD);
    }

    public void y() {
        this.f25651a = null;
        this.f25655e.clear();
        this.f25652b = 0.0f;
        this.f25656f = false;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String z() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b.z():java.lang.String");
    }
}

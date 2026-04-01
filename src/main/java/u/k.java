package u;

import java.util.Iterator;
import u.f;

/* JADX INFO: loaded from: classes.dex */
class k extends p {
    public k(t.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f26627h.f26577k.add(fVar);
        fVar.f26578l.add(this.f26627h);
    }

    @Override // u.p, u.d
    public void a(d dVar) {
        t.a aVar = (t.a) this.f26621b;
        int iS1 = aVar.s1();
        Iterator<f> it = this.f26627h.f26578l.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = it.next().f26573g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (iS1 == 0 || iS1 == 2) {
            this.f26627h.d(i9 + aVar.t1());
        } else {
            this.f26627h.d(i8 + aVar.t1());
        }
    }

    @Override // u.p
    void d() {
        p pVar;
        t.e eVar = this.f26621b;
        if (eVar instanceof t.a) {
            this.f26627h.f26568b = true;
            t.a aVar = (t.a) eVar;
            int iS1 = aVar.s1();
            boolean zR1 = aVar.r1();
            int i8 = 0;
            if (iS1 == 0) {
                this.f26627h.f26571e = f.a.LEFT;
                while (i8 < aVar.M0) {
                    t.e eVar2 = aVar.L0[i8];
                    if (zR1 || eVar2.T() != 8) {
                        f fVar = eVar2.f26390e.f26627h;
                        fVar.f26577k.add(this.f26627h);
                        this.f26627h.f26578l.add(fVar);
                    }
                    i8++;
                }
            } else {
                if (iS1 != 1) {
                    if (iS1 == 2) {
                        this.f26627h.f26571e = f.a.TOP;
                        while (i8 < aVar.M0) {
                            t.e eVar3 = aVar.L0[i8];
                            if (zR1 || eVar3.T() != 8) {
                                f fVar2 = eVar3.f26392f.f26627h;
                                fVar2.f26577k.add(this.f26627h);
                                this.f26627h.f26578l.add(fVar2);
                            }
                            i8++;
                        }
                    } else {
                        if (iS1 != 3) {
                            return;
                        }
                        this.f26627h.f26571e = f.a.BOTTOM;
                        while (i8 < aVar.M0) {
                            t.e eVar4 = aVar.L0[i8];
                            if (zR1 || eVar4.T() != 8) {
                                f fVar3 = eVar4.f26392f.f26628i;
                                fVar3.f26577k.add(this.f26627h);
                                this.f26627h.f26578l.add(fVar3);
                            }
                            i8++;
                        }
                    }
                    q(this.f26621b.f26392f.f26627h);
                    pVar = this.f26621b.f26392f;
                    q(pVar.f26628i);
                }
                this.f26627h.f26571e = f.a.RIGHT;
                while (i8 < aVar.M0) {
                    t.e eVar5 = aVar.L0[i8];
                    if (zR1 || eVar5.T() != 8) {
                        f fVar4 = eVar5.f26390e.f26628i;
                        fVar4.f26577k.add(this.f26627h);
                        this.f26627h.f26578l.add(fVar4);
                    }
                    i8++;
                }
            }
            q(this.f26621b.f26390e.f26627h);
            pVar = this.f26621b.f26390e;
            q(pVar.f26628i);
        }
    }

    @Override // u.p
    public void e() {
        t.e eVar = this.f26621b;
        if (eVar instanceof t.a) {
            int iS1 = ((t.a) eVar).s1();
            if (iS1 == 0 || iS1 == 1) {
                this.f26621b.j1(this.f26627h.f26573g);
            } else {
                this.f26621b.k1(this.f26627h.f26573g);
            }
        }
    }

    @Override // u.p
    void f() {
        this.f26622c = null;
        this.f26627h.c();
    }

    @Override // u.p
    boolean m() {
        return false;
    }
}

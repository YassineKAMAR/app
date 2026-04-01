package u;

/* JADX INFO: loaded from: classes.dex */
class j extends p {
    public j(t.e eVar) {
        super(eVar);
        eVar.f26390e.f();
        eVar.f26392f.f();
        this.f26625f = ((t.g) eVar).p1();
    }

    private void q(f fVar) {
        this.f26627h.f26577k.add(fVar);
        fVar.f26578l.add(this.f26627h);
    }

    @Override // u.p, u.d
    public void a(d dVar) {
        f fVar = this.f26627h;
        if (fVar.f26569c && !fVar.f26576j) {
            this.f26627h.d((int) ((fVar.f26578l.get(0).f26573g * ((t.g) this.f26621b).s1()) + 0.5f));
        }
    }

    @Override // u.p
    void d() {
        f fVar;
        p pVar;
        f fVar2;
        t.g gVar = (t.g) this.f26621b;
        int iQ1 = gVar.q1();
        int iR1 = gVar.r1();
        gVar.s1();
        if (gVar.p1() == 1) {
            f fVar3 = this.f26627h;
            if (iQ1 != -1) {
                fVar3.f26578l.add(this.f26621b.f26383a0.f26390e.f26627h);
                this.f26621b.f26383a0.f26390e.f26627h.f26577k.add(this.f26627h);
                fVar2 = this.f26627h;
            } else if (iR1 != -1) {
                fVar3.f26578l.add(this.f26621b.f26383a0.f26390e.f26628i);
                this.f26621b.f26383a0.f26390e.f26628i.f26577k.add(this.f26627h);
                fVar2 = this.f26627h;
                iQ1 = -iR1;
            } else {
                fVar3.f26568b = true;
                fVar3.f26578l.add(this.f26621b.f26383a0.f26390e.f26628i);
                this.f26621b.f26383a0.f26390e.f26628i.f26577k.add(this.f26627h);
                q(this.f26621b.f26390e.f26627h);
                pVar = this.f26621b.f26390e;
            }
            fVar2.f26572f = iQ1;
            q(this.f26621b.f26390e.f26627h);
            pVar = this.f26621b.f26390e;
        } else {
            f fVar4 = this.f26627h;
            if (iQ1 != -1) {
                fVar4.f26578l.add(this.f26621b.f26383a0.f26392f.f26627h);
                this.f26621b.f26383a0.f26392f.f26627h.f26577k.add(this.f26627h);
                fVar = this.f26627h;
            } else if (iR1 != -1) {
                fVar4.f26578l.add(this.f26621b.f26383a0.f26392f.f26628i);
                this.f26621b.f26383a0.f26392f.f26628i.f26577k.add(this.f26627h);
                fVar = this.f26627h;
                iQ1 = -iR1;
            } else {
                fVar4.f26568b = true;
                fVar4.f26578l.add(this.f26621b.f26383a0.f26392f.f26628i);
                this.f26621b.f26383a0.f26392f.f26628i.f26577k.add(this.f26627h);
                q(this.f26621b.f26392f.f26627h);
                pVar = this.f26621b.f26392f;
            }
            fVar.f26572f = iQ1;
            q(this.f26621b.f26392f.f26627h);
            pVar = this.f26621b.f26392f;
        }
        q(pVar.f26628i);
    }

    @Override // u.p
    public void e() {
        if (((t.g) this.f26621b).p1() == 1) {
            this.f26621b.j1(this.f26627h.f26573g);
        } else {
            this.f26621b.k1(this.f26627h.f26573g);
        }
    }

    @Override // u.p
    void f() {
        this.f26627h.c();
    }

    @Override // u.p
    boolean m() {
        return false;
    }
}

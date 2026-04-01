package u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.e;
import u.b;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t.f f26558a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t.f f26561d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26559b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26560c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<p> f26562e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<m> f26563f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.InterfaceC0178b f26564g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.a f26565h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<m> f26566i = new ArrayList<>();

    public e(t.f fVar) {
        this.f26558a = fVar;
        this.f26561d = fVar;
    }

    private void a(f fVar, int i8, int i9, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f26570d;
        if (pVar.f26622c == null) {
            t.f fVar3 = this.f26558a;
            if (pVar == fVar3.f26390e || pVar == fVar3.f26392f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i9);
                arrayList.add(mVar);
            }
            pVar.f26622c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f26627h.f26577k) {
                if (dVar instanceof f) {
                    a((f) dVar, i8, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f26628i.f26577k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i8, 1, fVar2, arrayList, mVar);
                }
            }
            if (i8 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f26602k.f26577k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i8, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f26627h.f26578l) {
                if (fVar4 == fVar2) {
                    mVar.f26596b = true;
                }
                a(fVar4, i8, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f26628i.f26578l) {
                if (fVar5 == fVar2) {
                    mVar.f26596b = true;
                }
                a(fVar5, i8, 1, fVar2, arrayList, mVar);
            }
            if (i8 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f26602k.f26578l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i8, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(t.f r17) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.b(t.f):boolean");
    }

    private int e(t.f fVar, int i8) {
        int size = this.f26566i.size();
        long jMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            jMax = Math.max(jMax, this.f26566i.get(i9).b(fVar, i8));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i8, ArrayList<m> arrayList) {
        for (d dVar : pVar.f26627h.f26577k) {
            if (dVar instanceof f) {
                a((f) dVar, i8, 0, pVar.f26628i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f26627h, i8, 0, pVar.f26628i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f26628i.f26577k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i8, 1, pVar.f26627h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f26628i, i8, 1, pVar.f26627h, arrayList, null);
            }
        }
        if (i8 == 1) {
            for (d dVar3 : ((n) pVar).f26602k.f26577k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i8, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(t.e eVar, e.b bVar, int i8, e.b bVar2, int i9) {
        b.a aVar = this.f26565h;
        aVar.f26546a = bVar;
        aVar.f26547b = bVar2;
        aVar.f26548c = i8;
        aVar.f26549d = i9;
        this.f26564g.a(eVar, aVar);
        eVar.h1(this.f26565h.f26550e);
        eVar.I0(this.f26565h.f26551f);
        eVar.H0(this.f26565h.f26553h);
        eVar.x0(this.f26565h.f26552g);
    }

    public void c() {
        d(this.f26562e);
        this.f26566i.clear();
        m.f26594h = 0;
        i(this.f26558a.f26390e, 0, this.f26566i);
        i(this.f26558a.f26392f, 1, this.f26566i);
        this.f26559b = false;
    }

    public void d(ArrayList<p> arrayList) {
        p jVar;
        arrayList.clear();
        this.f26561d.f26390e.f();
        this.f26561d.f26392f.f();
        arrayList.add(this.f26561d.f26390e);
        arrayList.add(this.f26561d.f26392f);
        HashSet hashSet = null;
        for (t.e eVar : this.f26561d.L0) {
            if (eVar instanceof t.g) {
                jVar = new j(eVar);
            } else {
                if (eVar.g0()) {
                    if (eVar.f26386c == null) {
                        eVar.f26386c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f26386c);
                } else {
                    arrayList.add(eVar.f26390e);
                }
                if (eVar.i0()) {
                    if (eVar.f26388d == null) {
                        eVar.f26388d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f26388d);
                } else {
                    arrayList.add(eVar.f26392f);
                }
                if (eVar instanceof t.i) {
                    jVar = new k(eVar);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (p pVar : arrayList) {
            if (pVar.f26621b != this.f26561d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z7) {
        boolean z8;
        boolean z9 = true;
        boolean z10 = z7 & true;
        if (this.f26559b || this.f26560c) {
            for (t.e eVar : this.f26558a.L0) {
                eVar.l();
                eVar.f26382a = false;
                eVar.f26390e.r();
                eVar.f26392f.q();
            }
            this.f26558a.l();
            t.f fVar = this.f26558a;
            fVar.f26382a = false;
            fVar.f26390e.r();
            this.f26558a.f26392f.q();
            this.f26560c = false;
        }
        if (b(this.f26561d)) {
            return false;
        }
        this.f26558a.j1(0);
        this.f26558a.k1(0);
        e.b bVarS = this.f26558a.s(0);
        e.b bVarS2 = this.f26558a.s(1);
        if (this.f26559b) {
            c();
        }
        int iV = this.f26558a.V();
        int iW = this.f26558a.W();
        this.f26558a.f26390e.f26627h.d(iV);
        this.f26558a.f26392f.f26627h.d(iW);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z10) {
                Iterator<p> it = this.f26562e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!it.next().m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarS == e.b.WRAP_CONTENT) {
                this.f26558a.M0(e.b.FIXED);
                t.f fVar2 = this.f26558a;
                fVar2.h1(e(fVar2, 0));
                t.f fVar3 = this.f26558a;
                fVar3.f26390e.f26624e.d(fVar3.U());
            }
            if (z10 && bVarS2 == e.b.WRAP_CONTENT) {
                this.f26558a.d1(e.b.FIXED);
                t.f fVar4 = this.f26558a;
                fVar4.I0(e(fVar4, 1));
                t.f fVar5 = this.f26558a;
                fVar5.f26392f.f26624e.d(fVar5.v());
            }
        }
        t.f fVar6 = this.f26558a;
        e.b bVar2 = fVar6.Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int iU = fVar6.U() + iV;
            this.f26558a.f26390e.f26628i.d(iU);
            this.f26558a.f26390e.f26624e.d(iU - iV);
            m();
            t.f fVar7 = this.f26558a;
            e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int iV2 = fVar7.v() + iW;
                this.f26558a.f26392f.f26628i.d(iV2);
                this.f26558a.f26392f.f26624e.d(iV2 - iW);
            }
            m();
            z8 = true;
        } else {
            z8 = false;
        }
        for (p pVar : this.f26562e) {
            if (pVar.f26621b != this.f26558a || pVar.f26626g) {
                pVar.e();
            }
        }
        for (p pVar2 : this.f26562e) {
            if (z8 || pVar2.f26621b != this.f26558a) {
                if (!pVar2.f26627h.f26576j || ((!pVar2.f26628i.f26576j && !(pVar2 instanceof j)) || (!pVar2.f26624e.f26576j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    z9 = false;
                    break;
                }
            }
        }
        this.f26558a.M0(bVarS);
        this.f26558a.d1(bVarS2);
        return z9;
    }

    public boolean g(boolean z7) {
        if (this.f26559b) {
            for (t.e eVar : this.f26558a.L0) {
                eVar.l();
                eVar.f26382a = false;
                l lVar = eVar.f26390e;
                lVar.f26624e.f26576j = false;
                lVar.f26626g = false;
                lVar.r();
                n nVar = eVar.f26392f;
                nVar.f26624e.f26576j = false;
                nVar.f26626g = false;
                nVar.q();
            }
            this.f26558a.l();
            t.f fVar = this.f26558a;
            fVar.f26382a = false;
            l lVar2 = fVar.f26390e;
            lVar2.f26624e.f26576j = false;
            lVar2.f26626g = false;
            lVar2.r();
            n nVar2 = this.f26558a.f26392f;
            nVar2.f26624e.f26576j = false;
            nVar2.f26626g = false;
            nVar2.q();
            c();
        }
        if (b(this.f26561d)) {
            return false;
        }
        this.f26558a.j1(0);
        this.f26558a.k1(0);
        this.f26558a.f26390e.f26627h.d(0);
        this.f26558a.f26392f.f26627h.d(0);
        return true;
    }

    public boolean h(boolean z7, int i8) {
        boolean z8;
        e.b bVar;
        g gVar;
        int iV;
        boolean z9 = true;
        boolean z10 = z7 & true;
        e.b bVarS = this.f26558a.s(0);
        e.b bVarS2 = this.f26558a.s(1);
        int iV2 = this.f26558a.V();
        int iW = this.f26558a.W();
        if (z10 && (bVarS == (bVar = e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            Iterator<p> it = this.f26562e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f26625f == i8 && !next.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i8 == 0) {
                if (z10 && bVarS == e.b.WRAP_CONTENT) {
                    this.f26558a.M0(e.b.FIXED);
                    t.f fVar = this.f26558a;
                    fVar.h1(e(fVar, 0));
                    t.f fVar2 = this.f26558a;
                    gVar = fVar2.f26390e.f26624e;
                    iV = fVar2.U();
                    gVar.d(iV);
                }
            } else if (z10 && bVarS2 == e.b.WRAP_CONTENT) {
                this.f26558a.d1(e.b.FIXED);
                t.f fVar3 = this.f26558a;
                fVar3.I0(e(fVar3, 1));
                t.f fVar4 = this.f26558a;
                gVar = fVar4.f26392f.f26624e;
                iV = fVar4.v();
                gVar.d(iV);
            }
        }
        t.f fVar5 = this.f26558a;
        if (i8 == 0) {
            e.b bVar2 = fVar5.Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iU = fVar5.U() + iV2;
                this.f26558a.f26390e.f26628i.d(iU);
                this.f26558a.f26390e.f26624e.d(iU - iV2);
                z8 = true;
            }
            z8 = false;
        } else {
            e.b bVar3 = fVar5.Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iV3 = fVar5.v() + iW;
                this.f26558a.f26392f.f26628i.d(iV3);
                this.f26558a.f26392f.f26624e.d(iV3 - iW);
                z8 = true;
            }
            z8 = false;
        }
        m();
        for (p pVar : this.f26562e) {
            if (pVar.f26625f == i8 && (pVar.f26621b != this.f26558a || pVar.f26626g)) {
                pVar.e();
            }
        }
        for (p pVar2 : this.f26562e) {
            if (pVar2.f26625f == i8 && (z8 || pVar2.f26621b != this.f26558a)) {
                if (!pVar2.f26627h.f26576j || !pVar2.f26628i.f26576j || (!(pVar2 instanceof c) && !pVar2.f26624e.f26576j)) {
                    z9 = false;
                    break;
                }
            }
        }
        this.f26558a.M0(bVarS);
        this.f26558a.d1(bVarS2);
        return z9;
    }

    public void j() {
        this.f26559b = true;
    }

    public void k() {
        this.f26560c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r12 = this;
            t.f r0 = r12.f26558a
            java.util.ArrayList<t.e> r0 = r0.L0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            t.e r1 = (t.e) r1
            boolean r2 = r1.f26382a
            if (r2 == 0) goto L19
            goto L8
        L19:
            t.e$b[] r2 = r1.Z
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f26426w
            int r4 = r1.f26428x
            t.e$b r6 = t.e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            t.e$b r5 = t.e.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            if (r10 == r6) goto L3b
            t.e$b r5 = t.e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = 1
        L3c:
            u.l r4 = r1.f26390e
            u.g r4 = r4.f26624e
            boolean r5 = r4.f26576j
            u.n r7 = r1.f26392f
            u.g r7 = r7.f26624e
            boolean r11 = r7.f26576j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            t.e$b r6 = t.e.b.FIXED
            int r5 = r4.f26573g
            int r7 = r7.f26573g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.f26382a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            t.e$b r5 = t.e.b.FIXED
            int r8 = r4.f26573g
            int r7 = r7.f26573g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            t.e$b r2 = t.e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            u.n r2 = r1.f26392f
            u.g r2 = r2.f26624e
            int r3 = r1.v()
        L78:
            r2.f26588m = r3
            goto Lae
        L7b:
            u.n r2 = r1.f26392f
            u.g r2 = r2.f26624e
            int r3 = r1.v()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f26573g
            t.e$b r10 = t.e.b.FIXED
            int r7 = r7.f26573g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            t.e$b r2 = t.e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            u.l r2 = r1.f26390e
            u.g r2 = r2.f26624e
            int r3 = r1.U()
            goto L78
        La5:
            u.l r2 = r1.f26390e
            u.g r2 = r2.f26624e
            int r3 = r1.U()
            goto L83
        Lae:
            boolean r2 = r1.f26382a
            if (r2 == 0) goto L8
            u.n r2 = r1.f26392f
            u.g r2 = r2.f26603l
            if (r2 == 0) goto L8
            int r1 = r1.n()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.m():void");
    }

    public void n(b.InterfaceC0178b interfaceC0178b) {
        this.f26564g = interfaceC0178b;
    }
}

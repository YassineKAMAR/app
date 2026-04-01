package u;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f26594h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p f26597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f26598d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f26600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f26601g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26595a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26596b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<p> f26599e = new ArrayList<>();

    public m(p pVar, int i8) {
        this.f26597c = null;
        this.f26598d = null;
        int i9 = f26594h;
        this.f26600f = i9;
        f26594h = i9 + 1;
        this.f26597c = pVar;
        this.f26598d = pVar;
        this.f26601g = i8;
    }

    private long c(f fVar, long j8) {
        p pVar = fVar.f26570d;
        if (pVar instanceof k) {
            return j8;
        }
        int size = fVar.f26577k.size();
        long jMin = j8;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = fVar.f26577k.get(i8);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f26570d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f26572f) + j8));
                }
            }
        }
        if (fVar != pVar.f26628i) {
            return jMin;
        }
        long j9 = j8 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f26627h, j9)), j9 - ((long) pVar.f26627h.f26572f));
    }

    private long d(f fVar, long j8) {
        p pVar = fVar.f26570d;
        if (pVar instanceof k) {
            return j8;
        }
        int size = fVar.f26577k.size();
        long jMax = j8;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = fVar.f26577k.get(i8);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f26570d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f26572f) + j8));
                }
            }
        }
        if (fVar != pVar.f26627h) {
            return jMax;
        }
        long j9 = j8 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f26628i, j9)), j9 - ((long) pVar.f26628i.f26572f));
    }

    public void a(p pVar) {
        this.f26599e.add(pVar);
        this.f26598d = pVar;
    }

    public long b(t.f fVar, int i8) {
        long j8;
        p pVar;
        long j9;
        long jD;
        p pVar2 = this.f26597c;
        if (pVar2 instanceof c) {
            if (((c) pVar2).f26625f != i8) {
                return 0L;
            }
        } else if (i8 == 0) {
            if (!(pVar2 instanceof l)) {
                return 0L;
            }
        } else if (!(pVar2 instanceof n)) {
            return 0L;
        }
        f fVar2 = (i8 == 0 ? fVar.f26390e : fVar.f26392f).f26627h;
        f fVar3 = (i8 == 0 ? fVar.f26390e : fVar.f26392f).f26628i;
        boolean zContains = pVar2.f26627h.f26578l.contains(fVar2);
        boolean zContains2 = this.f26597c.f26628i.f26578l.contains(fVar3);
        long j10 = this.f26597c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                jD = d(this.f26597c.f26627h, r13.f26572f);
                j9 = ((long) this.f26597c.f26627h.f26572f) + j10;
            } else if (zContains2) {
                long jC = c(this.f26597c.f26628i, r13.f26572f);
                j9 = ((long) (-this.f26597c.f26628i.f26572f)) + j10;
                jD = -jC;
            } else {
                p pVar3 = this.f26597c;
                j8 = ((long) pVar3.f26627h.f26572f) + pVar3.j();
                pVar = this.f26597c;
            }
            return Math.max(jD, j9);
        }
        long jD2 = d(this.f26597c.f26627h, 0L);
        long jC2 = c(this.f26597c.f26628i, 0L);
        long j11 = jD2 - j10;
        p pVar4 = this.f26597c;
        int i9 = pVar4.f26628i.f26572f;
        if (j11 >= (-i9)) {
            j11 += (long) i9;
        }
        int i10 = pVar4.f26627h.f26572f;
        long j12 = ((-jC2) - j10) - ((long) i10);
        if (j12 >= i10) {
            j12 -= (long) i10;
        }
        float fO = pVar4.f26621b.o(i8);
        float f8 = fO > 0.0f ? (long) ((j12 / fO) + (j11 / (1.0f - fO))) : 0L;
        long j13 = ((long) ((f8 * fO) + 0.5f)) + j10 + ((long) ((f8 * (1.0f - fO)) + 0.5f));
        pVar = this.f26597c;
        j8 = ((long) pVar.f26627h.f26572f) + j13;
        return j8 - ((long) pVar.f26628i.f26572f);
    }
}

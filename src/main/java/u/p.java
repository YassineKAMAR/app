package u;

import t.d;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    t.e f26621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f26622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e.b f26623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f26624e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26625f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f26626g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f26627h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f26628i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f26629j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26630a;

        static {
            int[] iArr = new int[d.b.values().length];
            f26630a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26630a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26630a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26630a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26630a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(t.e eVar) {
        this.f26621b = eVar;
    }

    private void l(int i8, int i9) {
        g gVar;
        int iG;
        int i10 = this.f26620a;
        if (i10 == 0) {
            gVar = this.f26624e;
            iG = g(i9, i8);
        } else if (i10 == 1) {
            int iG2 = g(this.f26624e.f26588m, i8);
            gVar = this.f26624e;
            iG = Math.min(iG2, i9);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                t.e eVar = this.f26621b;
                p pVar = eVar.f26390e;
                e.b bVar = pVar.f26623d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f26620a == 3) {
                    n nVar = eVar.f26392f;
                    if (nVar.f26623d == bVar2 && nVar.f26620a == 3) {
                        return;
                    }
                }
                if (i8 == 0) {
                    pVar = eVar.f26392f;
                }
                if (pVar.f26624e.f26576j) {
                    float fT = eVar.t();
                    this.f26624e.d(i8 == 1 ? (int) ((pVar.f26624e.f26573g / fT) + 0.5f) : (int) ((fT * pVar.f26624e.f26573g) + 0.5f));
                    return;
                }
                return;
            }
            t.e eVarI = this.f26621b.I();
            if (eVarI == null) {
                return;
            }
            if (!(i8 == 0 ? eVarI.f26390e : eVarI.f26392f).f26624e.f26576j) {
                return;
            }
            t.e eVar2 = this.f26621b;
            i9 = (int) ((r9.f26573g * (i8 == 0 ? eVar2.B : eVar2.E)) + 0.5f);
            gVar = this.f26624e;
            iG = g(i9, i8);
        }
        gVar.d(iG);
    }

    @Override // u.d
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i8) {
        fVar.f26578l.add(fVar2);
        fVar.f26572f = i8;
        fVar2.f26577k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i8, g gVar) {
        fVar.f26578l.add(fVar2);
        fVar.f26578l.add(this.f26624e);
        fVar.f26574h = i8;
        fVar.f26575i = gVar;
        fVar2.f26577k.add(fVar);
        gVar.f26577k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i8, int i9) {
        int iMax;
        if (i9 == 0) {
            t.e eVar = this.f26621b;
            int i10 = eVar.A;
            iMax = Math.max(eVar.f26432z, i8);
            if (i10 > 0) {
                iMax = Math.min(i10, i8);
            }
            if (iMax == i8) {
                return i8;
            }
        } else {
            t.e eVar2 = this.f26621b;
            int i11 = eVar2.D;
            iMax = Math.max(eVar2.C, i8);
            if (i11 > 0) {
                iMax = Math.min(i11, i8);
            }
            if (iMax == i8) {
                return i8;
            }
        }
        return iMax;
    }

    protected final f h(t.d dVar) {
        p pVar;
        p pVar2;
        t.d dVar2 = dVar.f26367f;
        if (dVar2 == null) {
            return null;
        }
        t.e eVar = dVar2.f26365d;
        int i8 = a.f26630a[dVar2.f26366e.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                pVar2 = eVar.f26390e;
            } else if (i8 == 3) {
                pVar = eVar.f26392f;
            } else {
                if (i8 == 4) {
                    return eVar.f26392f.f26602k;
                }
                if (i8 != 5) {
                    return null;
                }
                pVar2 = eVar.f26392f;
            }
            return pVar2.f26628i;
        }
        pVar = eVar.f26390e;
        return pVar.f26627h;
    }

    protected final f i(t.d dVar, int i8) {
        t.d dVar2 = dVar.f26367f;
        if (dVar2 == null) {
            return null;
        }
        t.e eVar = dVar2.f26365d;
        p pVar = i8 == 0 ? eVar.f26390e : eVar.f26392f;
        int i9 = a.f26630a[dVar2.f26366e.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f26628i;
        }
        return pVar.f26627h;
    }

    public long j() {
        if (this.f26624e.f26576j) {
            return r0.f26573g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f26626g;
    }

    abstract boolean m();

    protected void n(d dVar, t.d dVar2, t.d dVar3, int i8) {
        f fVar;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f26576j && fVarH2.f26576j) {
            int iE = fVarH.f26573g + dVar2.e();
            int iE2 = fVarH2.f26573g - dVar3.e();
            int i9 = iE2 - iE;
            if (!this.f26624e.f26576j && this.f26623d == e.b.MATCH_CONSTRAINT) {
                l(i8, i9);
            }
            g gVar = this.f26624e;
            if (gVar.f26576j) {
                if (gVar.f26573g == i9) {
                    this.f26627h.d(iE);
                    fVar = this.f26628i;
                } else {
                    t.e eVar = this.f26621b;
                    float fW = i8 == 0 ? eVar.w() : eVar.P();
                    if (fVarH == fVarH2) {
                        iE = fVarH.f26573g;
                        iE2 = fVarH2.f26573g;
                        fW = 0.5f;
                    }
                    this.f26627h.d((int) (iE + 0.5f + (((iE2 - iE) - this.f26624e.f26573g) * fW)));
                    fVar = this.f26628i;
                    iE2 = this.f26627h.f26573g + this.f26624e.f26573g;
                }
                fVar.d(iE2);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}

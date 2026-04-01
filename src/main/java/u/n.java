package u;

import t.e;
import u.f;
import u.p;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f26602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f26603l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26604a;

        static {
            int[] iArr = new int[p.b.values().length];
            f26604a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26604a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26604a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(t.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f26602k = fVar;
        this.f26603l = null;
        this.f26627h.f26571e = f.a.TOP;
        this.f26628i.f26571e = f.a.BOTTOM;
        fVar.f26571e = f.a.BASELINE;
        this.f26625f = 1;
    }

    @Override // u.p, u.d
    public void a(d dVar) {
        int i8;
        float fT;
        int i9 = a.f26604a[this.f26629j.ordinal()];
        if (i9 == 1) {
            p(dVar);
        } else if (i9 == 2) {
            o(dVar);
        } else if (i9 == 3) {
            t.e eVar = this.f26621b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f26624e;
        if (gVar.f26569c && !gVar.f26576j && this.f26623d == e.b.MATCH_CONSTRAINT) {
            t.e eVar2 = this.f26621b;
            int i10 = eVar2.f26428x;
            if (i10 == 2) {
                t.e eVarI = eVar2.I();
                if (eVarI != null) {
                    if (eVarI.f26392f.f26624e.f26576j) {
                        i8 = (int) ((r7.f26573g * this.f26621b.E) + 0.5f);
                        this.f26624e.d(i8);
                    }
                }
            } else if (i10 == 3 && eVar2.f26390e.f26624e.f26576j) {
                int iU = eVar2.u();
                if (iU == -1) {
                    fT = r7.f26390e.f26624e.f26573g / this.f26621b.t();
                    i8 = (int) (fT + 0.5f);
                    this.f26624e.d(i8);
                } else if (iU != 0) {
                    if (iU != 1) {
                        i8 = 0;
                        this.f26624e.d(i8);
                    }
                    fT = r7.f26390e.f26624e.f26573g / this.f26621b.t();
                    i8 = (int) (fT + 0.5f);
                    this.f26624e.d(i8);
                } else {
                    fT = r7.f26390e.f26624e.f26573g * this.f26621b.t();
                    i8 = (int) (fT + 0.5f);
                    this.f26624e.d(i8);
                }
            }
        }
        f fVar = this.f26627h;
        if (fVar.f26569c) {
            f fVar2 = this.f26628i;
            if (fVar2.f26569c) {
                if (fVar.f26576j && fVar2.f26576j && this.f26624e.f26576j) {
                    return;
                }
                if (!this.f26624e.f26576j && this.f26623d == e.b.MATCH_CONSTRAINT) {
                    t.e eVar3 = this.f26621b;
                    if (eVar3.f26426w == 0 && !eVar3.i0()) {
                        f fVar3 = this.f26627h.f26578l.get(0);
                        f fVar4 = this.f26628i.f26578l.get(0);
                        int i11 = fVar3.f26573g;
                        f fVar5 = this.f26627h;
                        int i12 = i11 + fVar5.f26572f;
                        int i13 = fVar4.f26573g + this.f26628i.f26572f;
                        fVar5.d(i12);
                        this.f26628i.d(i13);
                        this.f26624e.d(i13 - i12);
                        return;
                    }
                }
                if (!this.f26624e.f26576j && this.f26623d == e.b.MATCH_CONSTRAINT && this.f26620a == 1 && this.f26627h.f26578l.size() > 0 && this.f26628i.f26578l.size() > 0) {
                    f fVar6 = this.f26627h.f26578l.get(0);
                    int i14 = (this.f26628i.f26578l.get(0).f26573g + this.f26628i.f26572f) - (fVar6.f26573g + this.f26627h.f26572f);
                    g gVar2 = this.f26624e;
                    int i15 = gVar2.f26588m;
                    if (i14 < i15) {
                        gVar2.d(i14);
                    } else {
                        gVar2.d(i15);
                    }
                }
                if (this.f26624e.f26576j && this.f26627h.f26578l.size() > 0 && this.f26628i.f26578l.size() > 0) {
                    f fVar7 = this.f26627h.f26578l.get(0);
                    f fVar8 = this.f26628i.f26578l.get(0);
                    int i16 = fVar7.f26573g + this.f26627h.f26572f;
                    int i17 = fVar8.f26573g + this.f26628i.f26572f;
                    float fP = this.f26621b.P();
                    if (fVar7 == fVar8) {
                        i16 = fVar7.f26573g;
                        i17 = fVar8.f26573g;
                        fP = 0.5f;
                    }
                    this.f26627h.d((int) (i16 + 0.5f + (((i17 - i16) - this.f26624e.f26573g) * fP)));
                    this.f26628i.d(this.f26627h.f26573g + this.f26624e.f26573g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02dd, code lost:
    
        if (r10.f26621b.X() != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02df, code lost:
    
        r0 = r10.f26602k;
        r1 = r10.f26627h;
        r2 = r10.f26603l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0362, code lost:
    
        if (r10.f26621b.X() != false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03d9 A[PHI: r0
  0x03d9: PHI (r0v32 u.l) = (r0v23 u.l), (r0v47 u.l) binds: [B:155:0x03d7, B:129:0x0332] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    @Override // u.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d() {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.n.d():void");
    }

    @Override // u.p
    public void e() {
        f fVar = this.f26627h;
        if (fVar.f26576j) {
            this.f26621b.k1(fVar.f26573g);
        }
    }

    @Override // u.p
    void f() {
        this.f26622c = null;
        this.f26627h.c();
        this.f26628i.c();
        this.f26602k.c();
        this.f26624e.c();
        this.f26626g = false;
    }

    @Override // u.p
    boolean m() {
        return this.f26623d != e.b.MATCH_CONSTRAINT || this.f26621b.f26428x == 0;
    }

    void q() {
        this.f26626g = false;
        this.f26627h.c();
        this.f26627h.f26576j = false;
        this.f26628i.c();
        this.f26628i.f26576j = false;
        this.f26602k.c();
        this.f26602k.f26576j = false;
        this.f26624e.f26576j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f26621b.r();
    }
}

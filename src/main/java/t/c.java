package t;

import java.util.ArrayList;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f26340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f26341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f26342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f26343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f26344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f26345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f26346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f26347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f26348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f26349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f26350k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f26351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f26352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f26353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f26354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f26355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f26356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f26357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f26358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f26359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f26360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f26361v;

    public c(e eVar, int i8, boolean z7) {
        this.f26340a = eVar;
        this.f26355p = i8;
        this.f26356q = z7;
    }

    private void b() {
        int i8 = this.f26355p * 2;
        e eVar = this.f26340a;
        this.f26354o = true;
        e eVar2 = eVar;
        boolean z7 = false;
        while (!z7) {
            this.f26348i++;
            e[] eVarArr = eVar.F0;
            int i9 = this.f26355p;
            e eVar3 = null;
            eVarArr[i9] = null;
            eVar.E0[i9] = null;
            if (eVar.T() != 8) {
                this.f26351l++;
                e.b bVarS = eVar.s(this.f26355p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f26352m += eVar.C(this.f26355p);
                }
                int iE = this.f26352m + eVar.W[i8].e();
                this.f26352m = iE;
                int i10 = i8 + 1;
                this.f26352m = iE + eVar.W[i10].e();
                int iE2 = this.f26353n + eVar.W[i8].e();
                this.f26353n = iE2;
                this.f26353n = iE2 + eVar.W[i10].e();
                if (this.f26341b == null) {
                    this.f26341b = eVar;
                }
                this.f26343d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i11 = this.f26355p;
                if (bVarArr[i11] == bVar) {
                    int i12 = eVar.f26430y[i11];
                    if (i12 == 0 || i12 == 3 || i12 == 2) {
                        this.f26349j++;
                        float f8 = eVar.D0[i11];
                        if (f8 > 0.0f) {
                            this.f26350k += f8;
                        }
                        if (c(eVar, i11)) {
                            if (f8 < 0.0f) {
                                this.f26357r = true;
                            } else {
                                this.f26358s = true;
                            }
                            if (this.f26347h == null) {
                                this.f26347h = new ArrayList<>();
                            }
                            this.f26347h.add(eVar);
                        }
                        if (this.f26345f == null) {
                            this.f26345f = eVar;
                        }
                        e eVar4 = this.f26346g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f26355p] = eVar;
                        }
                        this.f26346g = eVar;
                    }
                    if (this.f26355p != 0 ? !(eVar.f26428x == 0 && eVar.C == 0 && eVar.D == 0) : !(eVar.f26426w == 0 && eVar.f26432z == 0 && eVar.A == 0)) {
                        this.f26354o = false;
                    }
                    if (eVar.f26389d0 != 0.0f) {
                        this.f26354o = false;
                        this.f26360u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f26355p] = eVar;
            }
            d dVar = eVar.W[i8 + 1].f26367f;
            if (dVar != null) {
                e eVar5 = dVar.f26365d;
                d dVar2 = eVar5.W[i8].f26367f;
                if (dVar2 != null && dVar2.f26365d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z7 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f26341b;
        if (eVar6 != null) {
            this.f26352m -= eVar6.W[i8].e();
        }
        e eVar7 = this.f26343d;
        if (eVar7 != null) {
            this.f26352m -= eVar7.W[i8 + 1].e();
        }
        this.f26342c = eVar;
        if (this.f26355p == 0 && this.f26356q) {
            this.f26344e = eVar;
        } else {
            this.f26344e = this.f26340a;
        }
        this.f26359t = this.f26358s && this.f26357r;
    }

    private static boolean c(e eVar, int i8) {
        int i9;
        return eVar.T() != 8 && eVar.Z[i8] == e.b.MATCH_CONSTRAINT && ((i9 = eVar.f26430y[i8]) == 0 || i9 == 3);
    }

    public void a() {
        if (!this.f26361v) {
            b();
        }
        this.f26361v = true;
    }
}

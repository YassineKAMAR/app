package t;

import t.d;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private d P0 = this.P;
    private int Q0 = 0;
    private int R0 = 0;
    private boolean S0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26457a;

        static {
            int[] iArr = new int[d.b.values().length];
            f26457a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26457a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26457a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26457a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26457a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26457a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26457a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26457a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26457a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.W[i8] = this.P0;
        }
    }

    @Override // t.e
    public void g(q.d dVar, boolean z7) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d dVarM = fVar.m(d.b.LEFT);
        d dVarM2 = fVar.m(d.b.RIGHT);
        e eVar = this.f26383a0;
        boolean z8 = eVar != null && eVar.Z[0] == e.b.WRAP_CONTENT;
        if (this.Q0 == 0) {
            dVarM = fVar.m(d.b.TOP);
            dVarM2 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.f26383a0;
            z8 = eVar2 != null && eVar2.Z[1] == e.b.WRAP_CONTENT;
        }
        if (this.S0 && this.P0.m()) {
            q.i iVarQ = dVar.q(this.P0);
            dVar.f(iVarQ, this.P0.d());
            if (this.M0 != -1) {
                if (z8) {
                    dVar.h(dVar.q(dVarM2), iVarQ, 0, 5);
                }
            } else if (this.N0 != -1 && z8) {
                q.i iVarQ2 = dVar.q(dVarM2);
                dVar.h(iVarQ, dVar.q(dVarM), 0, 5);
                dVar.h(iVarQ2, iVarQ, 0, 5);
            }
            this.S0 = false;
            return;
        }
        if (this.M0 != -1) {
            q.i iVarQ3 = dVar.q(this.P0);
            dVar.e(iVarQ3, dVar.q(dVarM), this.M0, 8);
            if (z8) {
                dVar.h(dVar.q(dVarM2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.N0 == -1) {
            if (this.L0 != -1.0f) {
                dVar.d(q.d.s(dVar, dVar.q(this.P0), dVar.q(dVarM2), this.L0));
                return;
            }
            return;
        }
        q.i iVarQ4 = dVar.q(this.P0);
        q.i iVarQ5 = dVar.q(dVarM2);
        dVar.e(iVarQ4, iVarQ5, -this.N0, 8);
        if (z8) {
            dVar.h(iVarQ4, dVar.q(dVarM), 0, 5);
            dVar.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override // t.e
    public boolean h() {
        return true;
    }

    @Override // t.e
    public boolean l0() {
        return this.S0;
    }

    @Override // t.e
    public d m(d.b bVar) {
        int i8 = a.f26457a[bVar.ordinal()];
        if (i8 == 1 || i8 == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        }
        if ((i8 == 3 || i8 == 4) && this.Q0 == 0) {
            return this.P0;
        }
        return null;
    }

    @Override // t.e
    public boolean m0() {
        return this.S0;
    }

    @Override // t.e
    public void n1(q.d dVar, boolean z7) {
        if (I() == null) {
            return;
        }
        int iX = dVar.x(this.P0);
        if (this.Q0 == 1) {
            j1(iX);
            k1(0);
            I0(I().v());
            h1(0);
            return;
        }
        j1(0);
        k1(iX);
        h1(I().U());
        I0(0);
    }

    public d o1() {
        return this.P0;
    }

    public int p1() {
        return this.Q0;
    }

    public int q1() {
        return this.M0;
    }

    public int r1() {
        return this.N0;
    }

    public float s1() {
        return this.L0;
    }

    public void t1(int i8) {
        this.P0.s(i8);
        this.S0 = true;
    }

    public void u1(int i8) {
        if (i8 > -1) {
            this.L0 = -1.0f;
            this.M0 = i8;
            this.N0 = -1;
        }
    }

    public void v1(int i8) {
        if (i8 > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i8;
        }
    }

    public void w1(float f8) {
        if (f8 > -1.0f) {
            this.L0 = f8;
            this.M0 = -1;
            this.N0 = -1;
        }
    }

    public void x1(int i8) {
        if (this.Q0 == i8) {
            return;
        }
        this.Q0 = i8;
        this.X.clear();
        this.P0 = this.Q0 == 1 ? this.O : this.P;
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.W[i9] = this.P0;
        }
    }
}

package t;

import t.d;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    @Override // t.e
    public void g(q.d dVar, boolean z7) {
        d[] dVarArr;
        boolean z8;
        q.i iVar;
        d dVar2;
        int i8;
        int i9;
        int i10;
        q.i iVar2;
        int i11;
        d[] dVarArr2 = this.W;
        dVarArr2[0] = this.O;
        dVarArr2[2] = this.P;
        dVarArr2[1] = this.Q;
        dVarArr2[3] = this.R;
        int i12 = 0;
        while (true) {
            dVarArr = this.W;
            if (i12 >= dVarArr.length) {
                break;
            }
            d dVar3 = dVarArr[i12];
            dVar3.f26370i = dVar.q(dVar3);
            i12++;
        }
        int i13 = this.N0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        d dVar4 = dVarArr[i13];
        if (!this.Q0) {
            q1();
        }
        if (this.Q0) {
            this.Q0 = false;
            int i14 = this.N0;
            if (i14 == 0 || i14 == 1) {
                dVar.f(this.O.f26370i, this.f26393f0);
                iVar2 = this.Q.f26370i;
                i11 = this.f26393f0;
            } else {
                if (i14 != 2 && i14 != 3) {
                    return;
                }
                dVar.f(this.P.f26370i, this.f26395g0);
                iVar2 = this.R.f26370i;
                i11 = this.f26395g0;
            }
            dVar.f(iVar2, i11);
            return;
        }
        for (int i15 = 0; i15 < this.M0; i15++) {
            e eVar = this.L0[i15];
            if ((this.O0 || eVar.h()) && ((((i9 = this.N0) == 0 || i9 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.O.f26367f != null && eVar.Q.f26367f != null) || (((i10 = this.N0) == 2 || i10 == 3) && eVar.R() == e.b.MATCH_CONSTRAINT && eVar.P.f26367f != null && eVar.R.f26367f != null))) {
                z8 = true;
                break;
            }
        }
        z8 = false;
        boolean z9 = this.O.k() || this.Q.k();
        boolean z10 = this.P.k() || this.R.k();
        int i16 = !z8 && (((i8 = this.N0) == 0 && z9) || ((i8 == 2 && z10) || ((i8 == 1 && z9) || (i8 == 3 && z10)))) ? 5 : 4;
        for (int i17 = 0; i17 < this.M0; i17++) {
            e eVar2 = this.L0[i17];
            if (this.O0 || eVar2.h()) {
                q.i iVarQ = dVar.q(eVar2.W[this.N0]);
                d[] dVarArr3 = eVar2.W;
                int i18 = this.N0;
                d dVar5 = dVarArr3[i18];
                dVar5.f26370i = iVarQ;
                d dVar6 = dVar5.f26367f;
                int i19 = (dVar6 == null || dVar6.f26365d != this) ? 0 : dVar5.f26368g + 0;
                if (i18 == 0 || i18 == 2) {
                    dVar.i(dVar4.f26370i, iVarQ, this.P0 - i19, z8);
                } else {
                    dVar.g(dVar4.f26370i, iVarQ, this.P0 + i19, z8);
                }
                dVar.e(dVar4.f26370i, iVarQ, this.P0 + i19, i16);
            }
        }
        int i20 = this.N0;
        if (i20 == 0) {
            dVar.e(this.Q.f26370i, this.O.f26370i, 0, 8);
            dVar.e(this.O.f26370i, this.f26383a0.Q.f26370i, 0, 4);
            iVar = this.O.f26370i;
            dVar2 = this.f26383a0.O;
        } else if (i20 == 1) {
            dVar.e(this.O.f26370i, this.Q.f26370i, 0, 8);
            dVar.e(this.O.f26370i, this.f26383a0.O.f26370i, 0, 4);
            iVar = this.O.f26370i;
            dVar2 = this.f26383a0.Q;
        } else if (i20 == 2) {
            dVar.e(this.R.f26370i, this.P.f26370i, 0, 8);
            dVar.e(this.P.f26370i, this.f26383a0.R.f26370i, 0, 4);
            iVar = this.P.f26370i;
            dVar2 = this.f26383a0.P;
        } else {
            if (i20 != 3) {
                return;
            }
            dVar.e(this.P.f26370i, this.R.f26370i, 0, 8);
            dVar.e(this.P.f26370i, this.f26383a0.P.f26370i, 0, 4);
            iVar = this.P.f26370i;
            dVar2 = this.f26383a0.R;
        }
        dVar.e(iVar, dVar2.f26370i, 0, 0);
    }

    @Override // t.e
    public boolean h() {
        return true;
    }

    @Override // t.e
    public boolean l0() {
        return this.Q0;
    }

    @Override // t.e
    public boolean m0() {
        return this.Q0;
    }

    public boolean q1() {
        int i8;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i9;
        int i10;
        int i11 = 0;
        boolean z7 = true;
        while (true) {
            i8 = this.M0;
            if (i11 >= i8) {
                break;
            }
            e eVar = this.L0[i11];
            if ((this.O0 || eVar.h()) && ((((i9 = this.N0) == 0 || i9 == 1) && !eVar.l0()) || (((i10 = this.N0) == 2 || i10 == 3) && !eVar.m0()))) {
                z7 = false;
            }
            i11++;
        }
        if (!z7 || i8 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z8 = false;
        for (int i12 = 0; i12 < this.M0; i12++) {
            e eVar2 = this.L0[i12];
            if (this.O0 || eVar2.h()) {
                if (!z8) {
                    int i13 = this.N0;
                    if (i13 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i13 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i13 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i13 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z8 = true;
                    }
                    iMax = eVar2.m(bVar3).d();
                    z8 = true;
                }
                int i14 = this.N0;
                if (i14 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i14 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i14 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i14 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    iMax = Math.max(iMax, eVar2.m(bVar).d());
                }
                iMax = Math.min(iMax, eVar2.m(bVar2).d());
            }
        }
        int i15 = iMax + this.P0;
        int i16 = this.N0;
        if (i16 == 0 || i16 == 1) {
            C0(i15, i15);
        } else {
            F0(i15, i15);
        }
        this.Q0 = true;
        return true;
    }

    public boolean r1() {
        return this.O0;
    }

    public int s1() {
        return this.N0;
    }

    public int t1() {
        return this.P0;
    }

    @Override // t.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i8 = 0; i8 < this.M0; i8++) {
            e eVar = this.L0[i8];
            if (i8 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }

    public int u1() {
        int i8 = this.N0;
        if (i8 == 0 || i8 == 1) {
            return 0;
        }
        return (i8 == 2 || i8 == 3) ? 1 : -1;
    }

    protected void v1() {
        for (int i8 = 0; i8 < this.M0; i8++) {
            e eVar = this.L0[i8];
            if (this.O0 || eVar.h()) {
                int i9 = this.N0;
                if (i9 == 0 || i9 == 1) {
                    eVar.P0(0, true);
                } else if (i9 == 2 || i9 == 3) {
                    eVar.P0(1, true);
                }
            }
        }
    }

    public void w1(boolean z7) {
        this.O0 = z7;
    }

    public void x1(int i8) {
        this.N0 = i8;
    }

    public void y1(int i8) {
        this.P0 = i8;
    }
}

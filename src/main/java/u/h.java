package u;

import java.util.ArrayList;
import java.util.Iterator;
import t.d;
import t.e;
import u.b;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b.a f26589a = new b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26590b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26591c = 0;

    private static boolean a(int i8, t.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b bVarY = eVar.y();
        e.b bVarR = eVar.R();
        t.f fVar = eVar.I() != null ? (t.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.R();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z7 = bVarY == bVar5 || eVar.l0() || bVarY == e.b.WRAP_CONTENT || (bVarY == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f26426w == 0 && eVar.f26389d0 == 0.0f && eVar.Y(0)) || (bVarY == bVar2 && eVar.f26426w == 1 && eVar.b0(0, eVar.U()));
        boolean z8 = bVarR == bVar5 || eVar.m0() || bVarR == e.b.WRAP_CONTENT || (bVarR == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f26428x == 0 && eVar.f26389d0 == 0.0f && eVar.Y(1)) || (bVarR == bVar && eVar.f26428x == 1 && eVar.b0(1, eVar.v()));
        if (eVar.f26389d0 <= 0.0f || !(z7 || z8)) {
            return z7 && z8;
        }
        return true;
    }

    private static void b(int i8, t.e eVar, b.InterfaceC0178b interfaceC0178b, boolean z7) {
        t.d dVar;
        t.d dVar2;
        t.d dVar3;
        t.d dVar4;
        if (eVar.e0()) {
            return;
        }
        f26590b++;
        if (!(eVar instanceof t.f) && eVar.k0()) {
            int i9 = i8 + 1;
            if (a(i9, eVar)) {
                t.f.O1(i9, eVar, interfaceC0178b, new b.a(), b.a.f26543k);
            }
        }
        t.d dVarM = eVar.m(d.b.LEFT);
        t.d dVarM2 = eVar.m(d.b.RIGHT);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator<t.d> it = dVarM.c().iterator();
            while (it.hasNext()) {
                t.d next = it.next();
                t.e eVar2 = next.f26365d;
                int i10 = i8 + 1;
                boolean zA = a(i10, eVar2);
                if (eVar2.k0() && zA) {
                    t.f.O1(i10, eVar2, interfaceC0178b, new b.a(), b.a.f26543k);
                }
                boolean z8 = (next == eVar2.O && (dVar4 = eVar2.Q.f26367f) != null && dVar4.m()) || (next == eVar2.Q && (dVar3 = eVar2.O.f26367f) != null && dVar3.m());
                e.b bVarY = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarY != bVar || zA) {
                    if (!eVar2.k0()) {
                        t.d dVar5 = eVar2.O;
                        if (next == dVar5 && eVar2.Q.f26367f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.C0(iE, eVar2.U() + iE);
                        } else {
                            t.d dVar6 = eVar2.Q;
                            if (next == dVar6 && dVar5.f26367f == null) {
                                int iE2 = iD - dVar6.e();
                                eVar2.C0(iE2 - eVar2.U(), iE2);
                            } else if (z8 && !eVar2.g0()) {
                                d(i10, interfaceC0178b, eVar2, z7);
                            }
                        }
                        b(i10, eVar2, interfaceC0178b, z7);
                    }
                } else if (eVar2.y() == bVar && eVar2.A >= 0 && eVar2.f26432z >= 0 && ((eVar2.T() == 8 || (eVar2.f26426w == 0 && eVar2.t() == 0.0f)) && !eVar2.g0() && !eVar2.j0() && z8 && !eVar2.g0())) {
                    e(i10, eVar, interfaceC0178b, eVar2, z7);
                }
            }
        }
        if (eVar instanceof t.g) {
            return;
        }
        if (dVarM2.c() != null && dVarM2.m()) {
            Iterator<t.d> it2 = dVarM2.c().iterator();
            while (it2.hasNext()) {
                t.d next2 = it2.next();
                t.e eVar3 = next2.f26365d;
                int i11 = i8 + 1;
                boolean zA2 = a(i11, eVar3);
                if (eVar3.k0() && zA2) {
                    t.f.O1(i11, eVar3, interfaceC0178b, new b.a(), b.a.f26543k);
                }
                boolean z9 = (next2 == eVar3.O && (dVar2 = eVar3.Q.f26367f) != null && dVar2.m()) || (next2 == eVar3.Q && (dVar = eVar3.O.f26367f) != null && dVar.m());
                e.b bVarY2 = eVar3.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarY2 != bVar2 || zA2) {
                    if (!eVar3.k0()) {
                        t.d dVar7 = eVar3.O;
                        if (next2 == dVar7 && eVar3.Q.f26367f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.C0(iE3, eVar3.U() + iE3);
                        } else {
                            t.d dVar8 = eVar3.Q;
                            if (next2 == dVar8 && dVar7.f26367f == null) {
                                int iE4 = iD2 - dVar8.e();
                                eVar3.C0(iE4 - eVar3.U(), iE4);
                            } else if (z9 && !eVar3.g0()) {
                                d(i11, interfaceC0178b, eVar3, z7);
                            }
                        }
                        b(i11, eVar3, interfaceC0178b, z7);
                    }
                } else if (eVar3.y() == bVar2 && eVar3.A >= 0 && eVar3.f26432z >= 0 && (eVar3.T() == 8 || (eVar3.f26426w == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.g0() && !eVar3.j0() && z9 && !eVar3.g0()) {
                        e(i11, eVar, interfaceC0178b, eVar3, z7);
                    }
                }
            }
        }
        eVar.o0();
    }

    private static void c(int i8, t.a aVar, b.InterfaceC0178b interfaceC0178b, int i9, boolean z7) {
        if (aVar.q1()) {
            int i10 = i8 + 1;
            if (i9 == 0) {
                b(i10, aVar, interfaceC0178b, z7);
            } else {
                i(i10, aVar, interfaceC0178b);
            }
        }
    }

    private static void d(int i8, b.InterfaceC0178b interfaceC0178b, t.e eVar, boolean z7) {
        float fW = eVar.w();
        int iD = eVar.O.f26367f.d();
        int iD2 = eVar.Q.f26367f.d();
        int iE = eVar.O.e() + iD;
        int iE2 = iD2 - eVar.Q.e();
        if (iD == iD2) {
            fW = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iU = eVar.U();
        int i9 = (iD2 - iD) - iU;
        if (iD > iD2) {
            i9 = (iD - iD2) - iU;
        }
        int i10 = ((int) (i9 > 0 ? (fW * i9) + 0.5f : fW * i9)) + iD;
        int i11 = i10 + iU;
        if (iD > iD2) {
            i11 = i10 - iU;
        }
        eVar.C0(i10, i11);
        b(i8 + 1, eVar, interfaceC0178b, z7);
    }

    private static void e(int i8, t.e eVar, b.InterfaceC0178b interfaceC0178b, t.e eVar2, boolean z7) {
        float fW = eVar2.w();
        int iD = eVar2.O.f26367f.d() + eVar2.O.e();
        int iD2 = eVar2.Q.f26367f.d() - eVar2.Q.e();
        if (iD2 >= iD) {
            int iU = eVar2.U();
            if (eVar2.T() != 8) {
                int i9 = eVar2.f26426w;
                if (i9 == 2) {
                    if (!(eVar instanceof t.f)) {
                        eVar = eVar.I();
                    }
                    iU = (int) (eVar2.w() * 0.5f * eVar.U());
                } else if (i9 == 0) {
                    iU = iD2 - iD;
                }
                iU = Math.max(eVar2.f26432z, iU);
                int i10 = eVar2.A;
                if (i10 > 0) {
                    iU = Math.min(i10, iU);
                }
            }
            int i11 = iD + ((int) ((fW * ((iD2 - iD) - iU)) + 0.5f));
            eVar2.C0(i11, iU + i11);
            b(i8 + 1, eVar2, interfaceC0178b, z7);
        }
    }

    private static void f(int i8, b.InterfaceC0178b interfaceC0178b, t.e eVar) {
        float fP = eVar.P();
        int iD = eVar.P.f26367f.d();
        int iD2 = eVar.R.f26367f.d();
        int iE = eVar.P.e() + iD;
        int iE2 = iD2 - eVar.R.e();
        if (iD == iD2) {
            fP = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iV = eVar.v();
        int i9 = (iD2 - iD) - iV;
        if (iD > iD2) {
            i9 = (iD - iD2) - iV;
        }
        int i10 = (int) (i9 > 0 ? (fP * i9) + 0.5f : fP * i9);
        int i11 = iD + i10;
        int i12 = i11 + iV;
        if (iD > iD2) {
            i11 = iD - i10;
            i12 = i11 - iV;
        }
        eVar.F0(i11, i12);
        i(i8 + 1, eVar, interfaceC0178b);
    }

    private static void g(int i8, t.e eVar, b.InterfaceC0178b interfaceC0178b, t.e eVar2) {
        float fP = eVar2.P();
        int iD = eVar2.P.f26367f.d() + eVar2.P.e();
        int iD2 = eVar2.R.f26367f.d() - eVar2.R.e();
        if (iD2 >= iD) {
            int iV = eVar2.v();
            if (eVar2.T() != 8) {
                int i9 = eVar2.f26428x;
                if (i9 == 2) {
                    if (!(eVar instanceof t.f)) {
                        eVar = eVar.I();
                    }
                    iV = (int) (fP * 0.5f * eVar.v());
                } else if (i9 == 0) {
                    iV = iD2 - iD;
                }
                iV = Math.max(eVar2.C, iV);
                int i10 = eVar2.D;
                if (i10 > 0) {
                    iV = Math.min(i10, iV);
                }
            }
            int i11 = iD + ((int) ((fP * ((iD2 - iD) - iV)) + 0.5f));
            eVar2.F0(i11, iV + i11);
            i(i8 + 1, eVar2, interfaceC0178b);
        }
    }

    public static void h(t.f fVar, b.InterfaceC0178b interfaceC0178b) {
        int iS1;
        int iS12;
        e.b bVarY = fVar.y();
        e.b bVarR = fVar.R();
        f26590b = 0;
        f26591c = 0;
        fVar.s0();
        ArrayList<t.e> arrayListO1 = fVar.o1();
        int size = arrayListO1.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayListO1.get(i8).s0();
        }
        boolean zL1 = fVar.L1();
        if (bVarY == e.b.FIXED) {
            fVar.C0(0, fVar.U());
        } else {
            fVar.D0(0);
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            t.e eVar = arrayListO1.get(i9);
            if (eVar instanceof t.g) {
                t.g gVar = (t.g) eVar;
                if (gVar.p1() == 1) {
                    if (gVar.q1() != -1) {
                        iS12 = gVar.q1();
                    } else if (gVar.r1() == -1 || !fVar.l0()) {
                        if (fVar.l0()) {
                            iS12 = (int) ((gVar.s1() * fVar.U()) + 0.5f);
                        }
                        z7 = true;
                    } else {
                        iS12 = fVar.U() - gVar.r1();
                    }
                    gVar.t1(iS12);
                    z7 = true;
                }
            } else if ((eVar instanceof t.a) && ((t.a) eVar).u1() == 0) {
                z8 = true;
            }
        }
        if (z7) {
            for (int i10 = 0; i10 < size; i10++) {
                t.e eVar2 = arrayListO1.get(i10);
                if (eVar2 instanceof t.g) {
                    t.g gVar2 = (t.g) eVar2;
                    if (gVar2.p1() == 1) {
                        b(0, gVar2, interfaceC0178b, zL1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0178b, zL1);
        if (z8) {
            for (int i11 = 0; i11 < size; i11++) {
                t.e eVar3 = arrayListO1.get(i11);
                if (eVar3 instanceof t.a) {
                    t.a aVar = (t.a) eVar3;
                    if (aVar.u1() == 0) {
                        c(0, aVar, interfaceC0178b, 0, zL1);
                    }
                }
            }
        }
        if (bVarR == e.b.FIXED) {
            fVar.F0(0, fVar.v());
        } else {
            fVar.E0(0);
        }
        boolean z9 = false;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            t.e eVar4 = arrayListO1.get(i12);
            if (eVar4 instanceof t.g) {
                t.g gVar3 = (t.g) eVar4;
                if (gVar3.p1() == 0) {
                    if (gVar3.q1() != -1) {
                        iS1 = gVar3.q1();
                    } else if (gVar3.r1() == -1 || !fVar.m0()) {
                        if (fVar.m0()) {
                            iS1 = (int) ((gVar3.s1() * fVar.v()) + 0.5f);
                        }
                        z9 = true;
                    } else {
                        iS1 = fVar.v() - gVar3.r1();
                    }
                    gVar3.t1(iS1);
                    z9 = true;
                }
            } else if ((eVar4 instanceof t.a) && ((t.a) eVar4).u1() == 1) {
                z10 = true;
            }
        }
        if (z9) {
            for (int i13 = 0; i13 < size; i13++) {
                t.e eVar5 = arrayListO1.get(i13);
                if (eVar5 instanceof t.g) {
                    t.g gVar4 = (t.g) eVar5;
                    if (gVar4.p1() == 0) {
                        i(1, gVar4, interfaceC0178b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0178b);
        if (z10) {
            for (int i14 = 0; i14 < size; i14++) {
                t.e eVar6 = arrayListO1.get(i14);
                if (eVar6 instanceof t.a) {
                    t.a aVar2 = (t.a) eVar6;
                    if (aVar2.u1() == 1) {
                        c(0, aVar2, interfaceC0178b, 1, zL1);
                    }
                }
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            t.e eVar7 = arrayListO1.get(i15);
            if (eVar7.k0() && a(0, eVar7)) {
                t.f.O1(0, eVar7, interfaceC0178b, f26589a, b.a.f26543k);
                if (!(eVar7 instanceof t.g)) {
                    b(0, eVar7, interfaceC0178b, zL1);
                } else if (((t.g) eVar7).p1() != 0) {
                    b(0, eVar7, interfaceC0178b, zL1);
                }
                i(0, eVar7, interfaceC0178b);
            }
        }
    }

    private static void i(int i8, t.e eVar, b.InterfaceC0178b interfaceC0178b) {
        t.d dVar;
        t.d dVar2;
        t.d dVar3;
        t.d dVar4;
        if (eVar.n0()) {
            return;
        }
        f26591c++;
        if (!(eVar instanceof t.f) && eVar.k0()) {
            int i9 = i8 + 1;
            if (a(i9, eVar)) {
                t.f.O1(i9, eVar, interfaceC0178b, new b.a(), b.a.f26543k);
            }
        }
        t.d dVarM = eVar.m(d.b.TOP);
        t.d dVarM2 = eVar.m(d.b.BOTTOM);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator<t.d> it = dVarM.c().iterator();
            while (it.hasNext()) {
                t.d next = it.next();
                t.e eVar2 = next.f26365d;
                int i10 = i8 + 1;
                boolean zA = a(i10, eVar2);
                if (eVar2.k0() && zA) {
                    t.f.O1(i10, eVar2, interfaceC0178b, new b.a(), b.a.f26543k);
                }
                boolean z7 = (next == eVar2.P && (dVar4 = eVar2.R.f26367f) != null && dVar4.m()) || (next == eVar2.R && (dVar3 = eVar2.P.f26367f) != null && dVar3.m());
                e.b bVarR = eVar2.R();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarR != bVar || zA) {
                    if (!eVar2.k0()) {
                        t.d dVar5 = eVar2.P;
                        if (next == dVar5 && eVar2.R.f26367f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.F0(iE, eVar2.v() + iE);
                        } else {
                            t.d dVar6 = eVar2.R;
                            if (next == dVar6 && dVar5.f26367f == null) {
                                int iE2 = iD - dVar6.e();
                                eVar2.F0(iE2 - eVar2.v(), iE2);
                            } else if (z7 && !eVar2.i0()) {
                                f(i10, interfaceC0178b, eVar2);
                            }
                        }
                        i(i10, eVar2, interfaceC0178b);
                    }
                } else if (eVar2.R() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && (eVar2.T() == 8 || (eVar2.f26428x == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.i0() && !eVar2.j0() && z7 && !eVar2.i0()) {
                        g(i10, eVar, interfaceC0178b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof t.g) {
            return;
        }
        if (dVarM2.c() != null && dVarM2.m()) {
            Iterator<t.d> it2 = dVarM2.c().iterator();
            while (it2.hasNext()) {
                t.d next2 = it2.next();
                t.e eVar3 = next2.f26365d;
                int i11 = i8 + 1;
                boolean zA2 = a(i11, eVar3);
                if (eVar3.k0() && zA2) {
                    t.f.O1(i11, eVar3, interfaceC0178b, new b.a(), b.a.f26543k);
                }
                boolean z8 = (next2 == eVar3.P && (dVar2 = eVar3.R.f26367f) != null && dVar2.m()) || (next2 == eVar3.R && (dVar = eVar3.P.f26367f) != null && dVar.m());
                e.b bVarR2 = eVar3.R();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarR2 != bVar2 || zA2) {
                    if (!eVar3.k0()) {
                        t.d dVar7 = eVar3.P;
                        if (next2 == dVar7 && eVar3.R.f26367f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.F0(iE3, eVar3.v() + iE3);
                        } else {
                            t.d dVar8 = eVar3.R;
                            if (next2 == dVar8 && dVar7.f26367f == null) {
                                int iE4 = iD2 - dVar8.e();
                                eVar3.F0(iE4 - eVar3.v(), iE4);
                            } else if (z8 && !eVar3.i0()) {
                                f(i11, interfaceC0178b, eVar3);
                            }
                        }
                        i(i11, eVar3, interfaceC0178b);
                    }
                } else if (eVar3.R() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.T() == 8 || (eVar3.f26428x == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.j0() && z8 && !eVar3.i0()) {
                        g(i11, eVar, interfaceC0178b, eVar3);
                    }
                }
            }
        }
        t.d dVarM3 = eVar.m(d.b.BASELINE);
        if (dVarM3.c() != null && dVarM3.m()) {
            int iD3 = dVarM3.d();
            for (t.d dVar9 : dVarM3.c()) {
                t.e eVar4 = dVar9.f26365d;
                int i12 = i8 + 1;
                boolean zA3 = a(i12, eVar4);
                if (eVar4.k0() && zA3) {
                    t.f.O1(i12, eVar4, interfaceC0178b, new b.a(), b.a.f26543k);
                }
                if (eVar4.R() != e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.k0() && dVar9 == eVar4.S) {
                        eVar4.B0(dVar9.e() + iD3);
                        i(i12, eVar4, interfaceC0178b);
                    }
                }
            }
        }
        eVar.p0();
    }
}

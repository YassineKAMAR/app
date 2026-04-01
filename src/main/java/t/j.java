package t;

import t.e;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f26458a = new boolean[3];

    static void a(f fVar, q.d dVar, e eVar) {
        eVar.f26420t = -1;
        eVar.f26422u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i8 = eVar.O.f26368g;
            int iU = fVar.U() - eVar.Q.f26368g;
            d dVar2 = eVar.O;
            dVar2.f26370i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f26370i = dVar.q(dVar3);
            dVar.f(eVar.O.f26370i, i8);
            dVar.f(eVar.Q.f26370i, iU);
            eVar.f26420t = 2;
            eVar.L0(i8, iU);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i9 = eVar.P.f26368g;
        int iV = fVar.v() - eVar.R.f26368g;
        d dVar4 = eVar.P;
        dVar4.f26370i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f26370i = dVar.q(dVar5);
        dVar.f(eVar.P.f26370i, i9);
        dVar.f(eVar.R.f26370i, iV);
        if (eVar.f26405l0 > 0 || eVar.T() == 8) {
            d dVar6 = eVar.S;
            dVar6.f26370i = dVar.q(dVar6);
            dVar.f(eVar.S.f26370i, eVar.f26405l0 + i9);
        }
        eVar.f26422u = 2;
        eVar.c1(i9, iV);
    }

    public static final boolean b(int i8, int i9) {
        return (i8 & i9) == i9;
    }
}

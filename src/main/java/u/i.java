package u;

import java.util.ArrayList;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static o a(t.e eVar, int i8, ArrayList<o> arrayList, o oVar) {
        t.d dVar;
        int iP1;
        int i9 = i8 == 0 ? eVar.I0 : eVar.J0;
        if (i9 != -1 && (oVar == null || i9 != oVar.f26607b)) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i10);
                if (oVar2.c() == i9) {
                    if (oVar != null) {
                        oVar.g(i8, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i10++;
                }
            }
        } else if (i9 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof t.i) && (iP1 = ((t.i) eVar).p1(i8)) != -1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i11);
                    if (oVar3.c() == iP1) {
                        oVar = oVar3;
                        break;
                    }
                    i11++;
                }
            }
            if (oVar == null) {
                oVar = new o(i8);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof t.g) {
                t.g gVar = (t.g) eVar;
                gVar.o1().b(gVar.p1() == 0 ? 1 : 0, arrayList, oVar);
            }
            int iC = oVar.c();
            if (i8 == 0) {
                eVar.I0 = iC;
                eVar.O.b(i8, arrayList, oVar);
                dVar = eVar.Q;
            } else {
                eVar.J0 = iC;
                eVar.P.b(i8, arrayList, oVar);
                eVar.S.b(i8, arrayList, oVar);
                dVar = eVar.R;
            }
            dVar.b(i8, arrayList, oVar);
            eVar.V.b(i8, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i8) {
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            o oVar = arrayList.get(i9);
            if (i8 == oVar.f26607b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(t.f r16, u.b.InterfaceC0178b r17) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.i.c(t.f, u.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}

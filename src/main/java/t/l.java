package t;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l extends e {
    public ArrayList<e> L0 = new ArrayList<>();

    public void c(e eVar) {
        this.L0.add(eVar);
        if (eVar.I() != null) {
            ((l) eVar.I()).q1(eVar);
        }
        eVar.Z0(this);
    }

    public ArrayList<e> o1() {
        return this.L0;
    }

    public void p1() {
        ArrayList<e> arrayList = this.L0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = this.L0.get(i8);
            if (eVar instanceof l) {
                ((l) eVar).p1();
            }
        }
    }

    public void q1(e eVar) {
        this.L0.remove(eVar);
        eVar.r0();
    }

    @Override // t.e
    public void r0() {
        this.L0.clear();
        super.r0();
    }

    public void r1() {
        this.L0.clear();
    }

    @Override // t.e
    public void t0(q.c cVar) {
        super.t0(cVar);
        int size = this.L0.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.L0.get(i8).t0(cVar);
        }
    }
}

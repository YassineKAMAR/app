package t;

import java.util.ArrayList;
import java.util.Arrays;
import u.o;

/* JADX INFO: loaded from: classes.dex */
public class i extends e implements h {
    public e[] L0 = new e[4];
    public int M0 = 0;

    @Override // t.h
    public void a(f fVar) {
    }

    @Override // t.h
    public void b() {
        this.M0 = 0;
        Arrays.fill(this.L0, (Object) null);
    }

    @Override // t.h
    public void c(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i8 = this.M0 + 1;
        e[] eVarArr = this.L0;
        if (i8 > eVarArr.length) {
            this.L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.L0;
        int i9 = this.M0;
        eVarArr2[i9] = eVar;
        this.M0 = i9 + 1;
    }

    public void o1(ArrayList<o> arrayList, int i8, o oVar) {
        for (int i9 = 0; i9 < this.M0; i9++) {
            oVar.a(this.L0[i9]);
        }
        for (int i10 = 0; i10 < this.M0; i10++) {
            u.i.a(this.L0[i10], i8, arrayList, oVar);
        }
    }

    public int p1(int i8) {
        int i9;
        int i10;
        for (int i11 = 0; i11 < this.M0; i11++) {
            e eVar = this.L0[i11];
            if (i8 == 0 && (i10 = eVar.I0) != -1) {
                return i10;
            }
            if (i8 == 1 && (i9 = eVar.J0) != -1) {
                return i9;
            }
        }
        return -1;
    }
}

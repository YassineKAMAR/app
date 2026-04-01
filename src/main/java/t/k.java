package t;

import java.util.HashSet;
import u.b;

/* JADX INFO: loaded from: classes.dex */
public class k extends i {
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private int R0 = 0;
    private int S0 = 0;
    private int T0 = 0;
    private int U0 = 0;
    private boolean V0 = false;
    private int W0 = 0;
    private int X0 = 0;
    protected b.a Y0 = new b.a();
    b.InterfaceC0178b Z0 = null;

    @Override // t.i, t.h
    public void a(f fVar) {
        q1();
    }

    public void q1() {
        for (int i8 = 0; i8 < this.M0; i8++) {
            e eVar = this.L0[i8];
            if (eVar != null) {
                eVar.R0(true);
            }
        }
    }

    public boolean r1(HashSet<e> hashSet) {
        for (int i8 = 0; i8 < this.M0; i8++) {
            if (hashSet.contains(this.L0[i8])) {
                return true;
            }
        }
        return false;
    }

    public boolean s1() {
        return this.V0;
    }
}

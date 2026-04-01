package t;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t.e;
import u.b;

/* JADX INFO: loaded from: classes.dex */
public class f extends l {
    private int O0;
    int S0;
    int T0;
    int U0;
    int V0;
    u.b M0 = new u.b(this);
    public u.e N0 = new u.e(this);
    protected b.InterfaceC0178b P0 = null;
    private boolean Q0 = false;
    protected q.d R0 = new q.d();
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f26441a1 = false;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f26442b1 = false;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f26443c1 = false;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f26444d1 = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f26445e1 = 0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f26446f1 = 257;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f26447g1 = false;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private boolean f26448h1 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private boolean f26449i1 = false;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    int f26450j1 = 0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private WeakReference<d> f26451k1 = null;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private WeakReference<d> f26452l1 = null;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private WeakReference<d> f26453m1 = null;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private WeakReference<d> f26454n1 = null;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    HashSet<e> f26455o1 = new HashSet<>();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public b.a f26456p1 = new b.a();

    public static boolean O1(int i8, e eVar, b.InterfaceC0178b interfaceC0178b, b.a aVar, int i9) {
        int i10;
        int i11;
        if (interfaceC0178b == null) {
            return false;
        }
        if (eVar.T() == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f26550e = 0;
            aVar.f26551f = 0;
            return false;
        }
        aVar.f26546a = eVar.y();
        aVar.f26547b = eVar.R();
        aVar.f26548c = eVar.U();
        aVar.f26549d = eVar.v();
        aVar.f26554i = false;
        aVar.f26555j = i9;
        e.b bVar = aVar.f26546a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f26547b == bVar2;
        boolean z9 = z7 && eVar.f26389d0 > 0.0f;
        boolean z10 = z8 && eVar.f26389d0 > 0.0f;
        if (z7 && eVar.Y(0) && eVar.f26426w == 0 && !z9) {
            aVar.f26546a = e.b.WRAP_CONTENT;
            if (z8 && eVar.f26428x == 0) {
                aVar.f26546a = e.b.FIXED;
            }
            z7 = false;
        }
        if (z8 && eVar.Y(1) && eVar.f26428x == 0 && !z10) {
            aVar.f26547b = e.b.WRAP_CONTENT;
            if (z7 && eVar.f26426w == 0) {
                aVar.f26547b = e.b.FIXED;
            }
            z8 = false;
        }
        if (eVar.l0()) {
            aVar.f26546a = e.b.FIXED;
            z7 = false;
        }
        if (eVar.m0()) {
            aVar.f26547b = e.b.FIXED;
            z8 = false;
        }
        if (z9) {
            if (eVar.f26430y[0] == 4) {
                aVar.f26546a = e.b.FIXED;
            } else if (!z8) {
                e.b bVar3 = aVar.f26547b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i11 = aVar.f26549d;
                } else {
                    aVar.f26546a = e.b.WRAP_CONTENT;
                    interfaceC0178b.a(eVar, aVar);
                    i11 = aVar.f26551f;
                }
                aVar.f26546a = bVar4;
                aVar.f26548c = (int) (eVar.t() * i11);
            }
        }
        if (z10) {
            if (eVar.f26430y[1] == 4) {
                aVar.f26547b = e.b.FIXED;
            } else if (!z7) {
                e.b bVar5 = aVar.f26546a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i10 = aVar.f26548c;
                } else {
                    aVar.f26547b = e.b.WRAP_CONTENT;
                    interfaceC0178b.a(eVar, aVar);
                    i10 = aVar.f26550e;
                }
                aVar.f26547b = bVar6;
                aVar.f26549d = eVar.u() == -1 ? (int) (i10 / eVar.t()) : (int) (eVar.t() * i10);
            }
        }
        interfaceC0178b.a(eVar, aVar);
        eVar.h1(aVar.f26550e);
        eVar.I0(aVar.f26551f);
        eVar.H0(aVar.f26553h);
        eVar.x0(aVar.f26552g);
        aVar.f26555j = b.a.f26543k;
        return aVar.f26554i;
    }

    private void Q1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void u1(e eVar) {
        int i8 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i8 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, L1());
        this.W0++;
    }

    private void x1(d dVar, q.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void y1(d dVar, q.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void z1(e eVar) {
        int i8 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i8 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, L1());
        this.X0++;
    }

    void A1(d dVar) {
        WeakReference<d> weakReference = this.f26453m1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f26453m1.get().d()) {
            this.f26453m1 = new WeakReference<>(dVar);
        }
    }

    void B1(d dVar) {
        WeakReference<d> weakReference = this.f26451k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f26451k1.get().d()) {
            this.f26451k1 = new WeakReference<>(dVar);
        }
    }

    public boolean C1(boolean z7) {
        return this.N0.f(z7);
    }

    public boolean D1(boolean z7) {
        return this.N0.g(z7);
    }

    public boolean E1(boolean z7, int i8) {
        return this.N0.h(z7, i8);
    }

    public b.InterfaceC0178b F1() {
        return this.P0;
    }

    public int G1() {
        return this.f26446f1;
    }

    public q.d H1() {
        return this.R0;
    }

    public void I1() {
        this.N0.j();
    }

    public void J1() {
        this.N0.k();
    }

    public boolean K1() {
        return this.f26449i1;
    }

    public boolean L1() {
        return this.Q0;
    }

    @Override // t.e
    public void M(StringBuilder sb) {
        sb.append(this.f26410o + ":{\n");
        sb.append("  actualWidth:" + this.f26385b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f26387c0);
        sb.append("\n");
        Iterator<e> it = o1().iterator();
        while (it.hasNext()) {
            it.next().M(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean M1() {
        return this.f26448h1;
    }

    public long N1(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.S0 = i15;
        this.T0 = i16;
        return this.M0.d(this, i8, i15, i16, i9, i10, i11, i12, i13, i14);
    }

    public boolean P1(int i8) {
        return (this.f26446f1 & i8) == i8;
    }

    public void R1(b.InterfaceC0178b interfaceC0178b) {
        this.P0 = interfaceC0178b;
        this.N0.n(interfaceC0178b);
    }

    public void S1(int i8) {
        this.f26446f1 = i8;
        q.d.f25661r = P1(512);
    }

    public void T1(int i8) {
        this.O0 = i8;
    }

    public void U1(boolean z7) {
        this.Q0 = z7;
    }

    public boolean V1(q.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zP1 = P1(64);
        n1(dVar, zP1);
        int size = this.L0.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = this.L0.get(i8);
            eVar.n1(dVar, zP1);
            if (eVar.a0()) {
                z7 = true;
            }
        }
        return z7;
    }

    public void W1() {
        this.M0.e(this);
    }

    @Override // t.e
    public void m1(boolean z7, boolean z8) {
        super.m1(z7, z8);
        int size = this.L0.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.L0.get(i8).m1(z7, z8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0307 A[PHI: r2 r16
  0x0307: PHI (r2v14 boolean) = (r2v13 boolean), (r2v18 boolean), (r2v18 boolean), (r2v18 boolean) binds: [B:140:0x02c8, B:148:0x02ed, B:149:0x02ef, B:151:0x02f5] A[DONT_GENERATE, DONT_INLINE]
  0x0307: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:140:0x02c8, B:148:0x02ed, B:149:0x02ef, B:151:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // t.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p1() {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.f.p1():void");
    }

    @Override // t.l, t.e
    public void r0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f26447g1 = false;
        super.r0();
    }

    void s1(e eVar, int i8) {
        if (i8 == 0) {
            u1(eVar);
        } else if (i8 == 1) {
            z1(eVar);
        }
    }

    public boolean t1(q.d dVar) {
        boolean zP1 = P1(64);
        g(dVar, zP1);
        int size = this.L0.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = this.L0.get(i8);
            eVar.P0(0, false);
            eVar.P0(1, false);
            if (eVar instanceof a) {
                z7 = true;
            }
        }
        if (z7) {
            for (int i9 = 0; i9 < size; i9++) {
                e eVar2 = this.L0.get(i9);
                if (eVar2 instanceof a) {
                    ((a) eVar2).v1();
                }
            }
        }
        this.f26455o1.clear();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar3 = this.L0.get(i10);
            if (eVar3.f()) {
                if (eVar3 instanceof k) {
                    this.f26455o1.add(eVar3);
                } else {
                    eVar3.g(dVar, zP1);
                }
            }
        }
        while (this.f26455o1.size() > 0) {
            int size2 = this.f26455o1.size();
            Iterator<e> it = this.f26455o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                if (kVar.r1(this.f26455o1)) {
                    kVar.g(dVar, zP1);
                    this.f26455o1.remove(kVar);
                    break;
                }
            }
            if (size2 == this.f26455o1.size()) {
                Iterator<e> it2 = this.f26455o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, zP1);
                }
                this.f26455o1.clear();
            }
        }
        if (q.d.f25661r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar4 = this.L0.get(i11);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar5 : hashSet) {
                j.a(this, dVar, eVar5);
                eVar5.g(dVar, zP1);
            }
        } else {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar6 = this.L0.get(i12);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.M0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.d1(e.b.FIXED);
                    }
                    eVar6.g(dVar, zP1);
                    if (bVar == bVar3) {
                        eVar6.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.d1(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, zP1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.X0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    public void v1(d dVar) {
        WeakReference<d> weakReference = this.f26454n1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f26454n1.get().d()) {
            this.f26454n1 = new WeakReference<>(dVar);
        }
    }

    public void w1(d dVar) {
        WeakReference<d> weakReference = this.f26452l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f26452l1.get().d()) {
            this.f26452l1 = new WeakReference<>(dVar);
        }
    }
}

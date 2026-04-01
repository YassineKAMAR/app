package u;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList<p> f26556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26557l;

    public c(t.e eVar, int i8) {
        super(eVar);
        this.f26556k = new ArrayList<>();
        this.f26625f = i8;
        q();
    }

    private void q() {
        t.e eVar;
        t.e eVarJ = this.f26621b;
        do {
            eVar = eVarJ;
            eVarJ = eVarJ.J(this.f26625f);
        } while (eVarJ != null);
        this.f26621b = eVar;
        this.f26556k.add(eVar.L(this.f26625f));
        t.e eVarH = eVar.H(this.f26625f);
        while (eVarH != null) {
            this.f26556k.add(eVarH.L(this.f26625f));
            eVarH = eVarH.H(this.f26625f);
        }
        for (p pVar : this.f26556k) {
            int i8 = this.f26625f;
            if (i8 == 0) {
                pVar.f26621b.f26386c = this;
            } else if (i8 == 1) {
                pVar.f26621b.f26388d = this;
            }
        }
        if ((this.f26625f == 0 && ((t.f) this.f26621b.I()).L1()) && this.f26556k.size() > 1) {
            ArrayList<p> arrayList = this.f26556k;
            this.f26621b = arrayList.get(arrayList.size() - 1).f26621b;
        }
        this.f26557l = this.f26625f == 0 ? this.f26621b.x() : this.f26621b.Q();
    }

    private t.e r() {
        for (int i8 = 0; i8 < this.f26556k.size(); i8++) {
            p pVar = this.f26556k.get(i8);
            if (pVar.f26621b.T() != 8) {
                return pVar.f26621b;
            }
        }
        return null;
    }

    private t.e s() {
        for (int size = this.f26556k.size() - 1; size >= 0; size--) {
            p pVar = this.f26556k.get(size);
            if (pVar.f26621b.T() != 8) {
                return pVar.f26621b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // u.p, u.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(u.d r27) {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.a(u.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[PHI: r0 r1
  0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r1v3 u.f) = (r1v2 u.f), (r1v7 u.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // u.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d() {
        /*
            r5 = this;
            java.util.ArrayList<u.p> r0 = r5.f26556k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            u.p r1 = (u.p) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList<u.p> r0 = r5.f26556k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<u.p> r2 = r5.f26556k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            u.p r2 = (u.p) r2
            t.e r2 = r2.f26621b
            java.util.ArrayList<u.p> r4 = r5.f26556k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            u.p r0 = (u.p) r0
            t.e r0 = r0.f26621b
            int r4 = r5.f26625f
            if (r4 != 0) goto L70
            t.d r1 = r2.O
            t.d r0 = r0.Q
            u.f r2 = r5.i(r1, r3)
            int r1 = r1.e()
            t.e r4 = r5.r()
            if (r4 == 0) goto L52
            t.d r1 = r4.O
            int r1 = r1.e()
        L52:
            if (r2 == 0) goto L59
            u.f r4 = r5.f26627h
            r5.b(r4, r2, r1)
        L59:
            u.f r1 = r5.i(r0, r3)
            int r0 = r0.e()
            t.e r2 = r5.s()
            if (r2 == 0) goto L6d
            t.d r0 = r2.Q
            int r0 = r0.e()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            t.d r2 = r2.P
            t.d r0 = r0.R
            u.f r3 = r5.i(r2, r1)
            int r2 = r2.e()
            t.e r4 = r5.r()
            if (r4 == 0) goto L88
            t.d r2 = r4.P
            int r2 = r2.e()
        L88:
            if (r3 == 0) goto L8f
            u.f r4 = r5.f26627h
            r5.b(r4, r3, r2)
        L8f:
            u.f r1 = r5.i(r0, r1)
            int r0 = r0.e()
            t.e r2 = r5.s()
            if (r2 == 0) goto La3
            t.d r0 = r2.R
            int r0 = r0.e()
        La3:
            if (r1 == 0) goto Lab
        La5:
            u.f r2 = r5.f26628i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            u.f r0 = r5.f26627h
            r0.f26567a = r5
            u.f r0 = r5.f26628i
            r0.f26567a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.d():void");
    }

    @Override // u.p
    public void e() {
        for (int i8 = 0; i8 < this.f26556k.size(); i8++) {
            this.f26556k.get(i8).e();
        }
    }

    @Override // u.p
    void f() {
        this.f26622c = null;
        Iterator<p> it = this.f26556k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // u.p
    public long j() {
        int size = this.f26556k.size();
        long j8 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            p pVar = this.f26556k.get(i8);
            j8 = j8 + ((long) pVar.f26627h.f26572f) + pVar.j() + ((long) pVar.f26628i.f26572f);
        }
        return j8;
    }

    @Override // u.p
    boolean m() {
        int size = this.f26556k.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!this.f26556k.get(i8).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f26625f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f26556k) {
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}

package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class i2 implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p2 f19574b = new g2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p2 f19575a;

    public i2() {
        p2 p2Var;
        p2[] p2VarArr = new p2[2];
        p2VarArr[0] = j1.a();
        try {
            p2Var = (p2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            p2Var = f19574b;
        }
        p2VarArr[1] = p2Var;
        h2 h2Var = new h2(p2VarArr);
        byte[] bArr = s1.f19671d;
        this.f19575a = h2Var;
    }

    private static boolean b(n2 n2Var) {
        return n2Var.l() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    public final b3 a(Class cls) {
        w2 w2VarA;
        e2 e2VarC;
        t3 t3VarS;
        b1 b1VarA;
        l2 l2VarA;
        t3 t3VarS2;
        b1 b1VarA2;
        d3.w(cls);
        n2 n2VarB = this.f19575a.b(cls);
        if (n2VarB.k()) {
            if (n1.class.isAssignableFrom(cls)) {
                t3VarS2 = d3.t();
                b1VarA2 = d1.b();
            } else {
                t3VarS2 = d3.s();
                b1VarA2 = d1.a();
            }
            return v2.i(t3VarS2, b1VarA2, n2VarB.j());
        }
        if (n1.class.isAssignableFrom(cls)) {
            boolean zB = b(n2VarB);
            w2VarA = x2.b();
            e2VarC = e2.d();
            t3VarS = d3.t();
            b1VarA = zB ? d1.b() : null;
            l2VarA = m2.b();
        } else {
            boolean zB2 = b(n2VarB);
            w2VarA = x2.a();
            e2VarC = e2.c();
            t3VarS = d3.s();
            b1VarA = zB2 ? d1.a() : null;
            l2VarA = m2.a();
        }
        return u2.A(cls, n2VarB, w2VarA, e2VarC, t3VarS, b1VarA, l2VarA);
    }
}

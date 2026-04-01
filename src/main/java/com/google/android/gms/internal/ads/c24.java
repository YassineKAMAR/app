package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class c24 implements f34 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i24 f6119b = new z14();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i24 f6120a;

    public c24() {
        i24 i24Var;
        i24[] i24VarArr = new i24[2];
        i24VarArr[0] = v04.a();
        try {
            i24Var = (i24) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            i24Var = f6119b;
        }
        i24VarArr[1] = i24Var;
        b24 b24Var = new b24(i24VarArr);
        byte[] bArr = k14.f9887d;
        this.f6120a = b24Var;
    }

    private static boolean b(h24 h24Var) {
        return h24Var.l() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.f34
    public final e34 a(Class cls) {
        p24 p24VarA;
        x14 x14VarD;
        v34 v34VarT;
        n04 n04VarA;
        f24 f24VarA;
        v34 v34VarT2;
        n04 n04VarA2;
        g34.y(cls);
        h24 h24VarB = this.f6120a.b(cls);
        if (h24VarB.k()) {
            if (z04.class.isAssignableFrom(cls)) {
                v34VarT2 = g34.u();
                n04VarA2 = p04.b();
            } else {
                v34VarT2 = g34.t();
                n04VarA2 = p04.a();
            }
            return o24.j(v34VarT2, n04VarA2, h24VarB.j());
        }
        if (z04.class.isAssignableFrom(cls)) {
            boolean zB = b(h24VarB);
            p24VarA = q24.b();
            x14VarD = x14.e();
            v34VarT = g34.u();
            n04VarA = zB ? p04.b() : null;
            f24VarA = g24.b();
        } else {
            boolean zB2 = b(h24VarB);
            p24VarA = q24.a();
            x14VarD = x14.d();
            v34VarT = g34.t();
            n04VarA = zB2 ? p04.a() : null;
            f24VarA = g24.a();
        }
        return n24.G(cls, h24VarB, p24VarA, x14VarD, v34VarT, n04VarA, f24VarA);
    }
}

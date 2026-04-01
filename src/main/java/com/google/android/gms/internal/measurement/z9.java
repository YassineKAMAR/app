package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class z9 implements gb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final na f19435b = new da();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final na f19436a;

    public z9() {
        this(new fa(z8.c(), b()));
    }

    private z9(na naVar) {
        this.f19436a = (na) a9.f(naVar, "messageInfoFactory");
    }

    private static na b() {
        try {
            return (na) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f19435b;
        }
    }

    private static boolean c(ka kaVar) {
        return ba.f18592a[kaVar.k().ordinal()] != 1;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final <T> eb<T> a(Class<T> cls) {
        fb.o(cls);
        ka kaVarA = this.f19436a.a(cls);
        if (kaVarA.l()) {
            return y8.class.isAssignableFrom(cls) ? sa.i(fb.u(), o8.b(), kaVarA.j()) : sa.i(fb.f(), o8.a(), kaVarA.j());
        }
        if (y8.class.isAssignableFrom(cls)) {
            boolean zC = c(kaVarA);
            ta taVarB = va.b();
            u9 u9VarC = u9.c();
            dc<?, ?> dcVarU = fb.u();
            return zC ? qa.n(cls, kaVarA, taVarB, u9VarC, dcVarU, o8.b(), la.b()) : qa.n(cls, kaVarA, taVarB, u9VarC, dcVarU, null, la.b());
        }
        boolean zC2 = c(kaVarA);
        ta taVarA = va.a();
        u9 u9VarA = u9.a();
        dc<?, ?> dcVarF = fb.f();
        return zC2 ? qa.n(cls, kaVarA, taVarA, u9VarA, dcVarF, o8.a(), la.a()) : qa.n(cls, kaVarA, taVarA, u9VarA, dcVarF, null, la.a());
    }
}

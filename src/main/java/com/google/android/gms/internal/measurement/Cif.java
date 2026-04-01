package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.if, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class Cif implements jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Double> f18814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Long> f18815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o6<Long> f18816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o6<String> f18817e;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18813a = w6VarE.d("measurement.test.boolean_flag", false);
        f18814b = w6VarE.a("measurement.test.double_flag", -3.0d);
        f18815c = w6VarE.b("measurement.test.int_flag", -2L);
        f18816d = w6VarE.b("measurement.test.long_flag", -1L);
        f18817e = w6VarE.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final double j() {
        return f18814b.e().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final long k() {
        return f18815c.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final long l() {
        return f18816d.e().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final boolean m() {
        return f18813a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final String p() {
        return f18817e.e();
    }
}

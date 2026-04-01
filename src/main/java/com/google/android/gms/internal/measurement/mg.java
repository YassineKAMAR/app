package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class mg implements jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f18970b;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18969a = w6VarE.d("measurement.sgtm.client.dev", false);
        f18970b = w6VarE.d("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final boolean k() {
        return f18969a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final boolean l() {
        return f18970b.e().booleanValue();
    }
}

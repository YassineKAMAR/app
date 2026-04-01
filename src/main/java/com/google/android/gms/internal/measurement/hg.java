package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class hg implements ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f18791b;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18790a = w6VarE.d("measurement.sfmc.client", true);
        f18791b = w6VarE.d("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.ig
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ig
    public final boolean k() {
        return f18790a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ig
    public final boolean l() {
        return f18791b.e().booleanValue();
    }
}

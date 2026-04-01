package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class qd implements rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Long> f19105b;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19104a = w6VarE.d("measurement.service.deferred_first_open", false);
        f19105b = w6VarE.b("measurement.id.service.deferred_first_open", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final boolean k() {
        return f19104a.e().booleanValue();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class af implements xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f18572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Long> f18573c;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18571a = w6VarE.d("measurement.item_scoped_custom_parameters.client", true);
        f18572b = w6VarE.d("measurement.item_scoped_custom_parameters.service", false);
        f18573c = w6VarE.b("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.xe
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.xe
    public final boolean k() {
        return f18571a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xe
    public final boolean l() {
        return f18572b.e().booleanValue();
    }
}

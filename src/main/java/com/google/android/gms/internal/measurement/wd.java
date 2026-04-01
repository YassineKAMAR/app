package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class wd implements xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f19302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f19303c;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19301a = w6VarE.d("measurement.collection.event_safelist", true);
        f19302b = w6VarE.d("measurement.service.store_null_safelist", true);
        f19303c = w6VarE.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final boolean k() {
        return f19302b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.xd
    public final boolean l() {
        return f19303c.e().booleanValue();
    }
}

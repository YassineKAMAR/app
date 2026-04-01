package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class uf implements vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Long> f19262b;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f19261a = w6VarE.d("measurement.remove_app_background.client", false);
        f19262b = w6VarE.b("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.vf
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.vf
    public final boolean k() {
        return f19261a.e().booleanValue();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class hf implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Long> f18787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o6<Boolean> f18788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o6<Boolean> f18789c;

    static {
        w6 w6VarE = new w6(l6.a("com.google.android.gms.measurement")).f().e();
        f18787a = w6VarE.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f18788b = w6VarE.d("measurement.lifecycle.app_backgrounded_tracking", true);
        f18789c = w6VarE.d("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // com.google.android.gms.internal.measurement.df
    public final boolean j() {
        return f18789c.e().booleanValue();
    }
}

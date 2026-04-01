package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class be implements yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f18605a = new w6(l6.a("com.google.android.gms.measurement")).f().e().d("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.yd
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final boolean k() {
        return f18605a.e().booleanValue();
    }
}

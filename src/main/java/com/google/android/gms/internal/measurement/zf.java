package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zf implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o6<Boolean> f19445a = new w6(l6.a("com.google.android.gms.measurement")).f().e().d("measurement.sessionid.enable_client_session_id", true);

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean k() {
        return f19445a.e().booleanValue();
    }
}

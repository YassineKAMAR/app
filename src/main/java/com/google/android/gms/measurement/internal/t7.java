package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class t7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f20506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20507b;

    t7(b7 b7Var, Bundle bundle) {
        this.f20507b = b7Var;
        this.f20506a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7 b7Var = this.f20507b;
        Bundle bundle = this.f20506a;
        b7Var.i();
        b7Var.v();
        a3.o.j(bundle);
        String strF = a3.o.f(bundle.getString("name"));
        if (!b7Var.f20556a.m()) {
            b7Var.t().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            b7Var.r().H(new d(bundle.getString("app_id"), "", new hb(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), b7Var.f().G(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}

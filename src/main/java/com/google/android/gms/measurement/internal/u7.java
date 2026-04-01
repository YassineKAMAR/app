package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class u7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f20530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20531b;

    u7(b7 b7Var, Bundle bundle) {
        this.f20531b = b7Var;
        this.f20530a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b7 b7Var = this.f20531b;
        Bundle bundle = this.f20530a;
        b7Var.i();
        b7Var.v();
        a3.o.j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        a3.o.f(string);
        a3.o.f(string2);
        a3.o.j(bundle.get("value"));
        if (!b7Var.f20556a.m()) {
            b7Var.t().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        hb hbVar = new hb(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            d0 d0VarG = b7Var.f().G(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            b7Var.r().H(new d(bundle.getString("app_id"), string2, hbVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), b7Var.f().G(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), d0VarG, bundle.getLong("time_to_live"), b7Var.f().G(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}

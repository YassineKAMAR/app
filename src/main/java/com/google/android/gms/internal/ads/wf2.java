package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class wf2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16717e;

    public wf2(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f16713a = str;
        this.f16714b = z7;
        this.f16715c = z8;
        this.f16716d = z9;
        this.f16717e = z10;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f16713a.isEmpty()) {
            bundle.putString("inspector_extras", this.f16713a);
        }
        bundle.putInt("test_mode", this.f16714b ? 1 : 0);
        bundle.putInt("linked_device", this.f16715c ? 1 : 0);
        if (this.f16714b || this.f16715c) {
            if (((Boolean) h2.y.c().b(ns.V8)).booleanValue()) {
                bundle.putInt("risd", !this.f16716d ? 1 : 0);
            }
            if (((Boolean) h2.y.c().b(ns.Z8)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f16717e);
            }
        }
    }
}

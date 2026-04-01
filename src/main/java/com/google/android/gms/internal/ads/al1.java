package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class al1 implements kv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5324a = "_videoMediaView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bl1 f5325b;

    al1(bl1 bl1Var, String str) {
        this.f5325b = bl1Var;
    }

    @Override // com.google.android.gms.internal.ads.kv
    public final void a(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.kv
    public final JSONObject j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kv
    public final JSONObject k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kv
    public final void l() {
        bl1 bl1Var = this.f5325b;
        if (bl1Var.f5870d != null) {
            bl1Var.f5870d.k(this.f5324a);
        }
    }
}

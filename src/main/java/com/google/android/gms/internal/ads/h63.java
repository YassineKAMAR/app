package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class h63 extends a73 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o63 f8650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r63 f8651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ s3.i f8652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ l63 f8653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h63(l63 l63Var, s3.i iVar, o63 o63Var, r63 r63Var, s3.i iVar2) {
        super(iVar);
        this.f8653e = l63Var;
        this.f8650b = o63Var;
        this.f8651c = r63Var;
        this.f8652d = iVar2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.w63] */
    @Override // com.google.android.gms.internal.ads.a73
    protected final void a() {
        try {
            ?? E = this.f8653e.f10476a.e();
            l63 l63Var = this.f8653e;
            String str = l63Var.f10477b;
            o63 o63Var = this.f8650b;
            String str2 = l63Var.f10477b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", o63Var.e());
            bundle.putString("adFieldEnifd", o63Var.f());
            bundle.putInt("layoutGravity", o63Var.c());
            bundle.putFloat("layoutVerticalMargin", o63Var.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", o63Var.d());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str2);
            if (o63Var.g() != null) {
                bundle.putString("appId", o63Var.g());
            }
            E.j2(str, bundle, new k63(this.f8653e, this.f8651c));
        } catch (RemoteException e8) {
            l63.f10474c.b(e8, "show overlay display from: %s", this.f8653e.f10477b);
            this.f8652d.d(new RuntimeException(e8));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class gj2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f8369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f8370b;

    /* synthetic */ gj2(String str, int i8, fj2 fj2Var) {
        this.f8369a = str;
        this.f8370b = i8;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) h2.y.c().b(ns.C9)).booleanValue()) {
            if (!TextUtils.isEmpty(this.f8369a)) {
                bundle.putString("topics", this.f8369a);
            }
            int i8 = this.f8370b;
            if (i8 != -1) {
                bundle.putInt("atps", i8);
            }
        }
    }
}

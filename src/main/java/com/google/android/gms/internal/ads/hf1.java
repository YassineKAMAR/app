package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class hf1 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f8738a;

    /* synthetic */ hf1(mf1 mf1Var, gf1 gf1Var) {
        this.f8738a = new WeakReference(mf1Var);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        mf1 mf1Var = (mf1) this.f8738a.get();
        if (mf1Var != null && "_ac".equals((String) map.get("eventName"))) {
            mf1Var.f11258h.Z();
            if (((Boolean) h2.y.c().b(ns.U9)).booleanValue()) {
                mf1Var.f11259i.f0();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                mf1Var.f11259i.C();
            }
        }
    }
}
